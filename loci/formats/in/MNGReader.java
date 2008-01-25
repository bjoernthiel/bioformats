//
// MNGReader.java
//

/*
LOCI Bio-Formats package for reading and converting biological file formats.
Copyright (C) 2005-@year@ Melissa Linkert, Curtis Rueden, Chris Allan,
Eric Kjellman and Brian Loranger.

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU Library General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Library General Public License for more details.

You should have received a copy of the GNU Library General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package loci.formats.in;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Vector;
import javax.imageio.ImageIO;
import loci.formats.*;
import loci.formats.meta.MetadataStore;

/**
 * MNGReader is the file format reader for Multiple Network Graphics (MNG)
 * files.  Does not support JNG (JPEG Network Graphics).
 *
 * <dl><dt><b>Source code:</b></dt>
 * <dd><a href="https://skyking.microscopy.wisc.edu/trac/java/browser/trunk/loci/formats/in/MNGReader.java">Trac</a>,
 * <a href="https://skyking.microscopy.wisc.edu/svn/java/trunk/loci/formats/in/MNGReader.java">SVN</a></dd></dl>
 */
public class MNGReader extends FormatReader {

  // -- Fields --

  /** Offsets to each plane. */
  private Vector offsets;

  /** Length (in bytes) of each plane. */
  private Vector lengths;

  // -- Constructor --

  /** Constructs a new MNG reader. */
  public MNGReader() { super("Multiple Network Graphics", "mng"); }

  // -- IFormatReader API methods --

  /* @see loci.formats.IFormatReader#isThisType(byte[]) */
  public boolean isThisType(byte[] block) {
    if (block.length < 8) return false;
    return block[0] == 0x8a && block[1] == 0x4d && block[2] == 0x4e &&
      block[3] == 0x47 && block[4] == 0x0d && block[5] == 0x0a &&
      block[6] == 0x1a && block[7] == 0x0a;
  }

  /**
   * @see loci.formats.IFormatReader#openBytes(int, byte[], int, int, int, int)
   */
  public byte[] openBytes(int no, byte[] buf, int x, int y, int w, int h)
    throws FormatException, IOException
  {
    buf = ImageTools.getBytes(openImage(no, x, y, w, h), true, core.sizeC[0]);
    return buf;
  }

  /* @see loci.formats.IFormatReader#openImage(int, int, int, int, int) */
  public BufferedImage openImage(int no, int x, int y, int w, int h)
    throws FormatException, IOException
  {
    FormatTools.assertId(currentId, true, 1);
    FormatTools.checkPlaneNumber(this, no);

    long offset = ((Long) offsets.get(no)).longValue();
    in.seek(offset);
    long end = ((Long) lengths.get(no)).longValue();
    byte[] b = new byte[(int) (end - offset + 8)];
    in.read(b, 8, b.length - 8);
    b[0] = (byte) 0x89;
    b[1] = 0x50;
    b[2] = 0x4e;
    b[3] = 0x47;
    b[4] = 0x0d;
    b[5] = 0x0a;
    b[6] = 0x1a;
    b[7] = 0x0a;

    return ImageIO.read(new ByteArrayInputStream(b)).getSubimage(x, y, w, h);
  }

  // -- IFormatHandler API methods --

  /* @see loci.formats.IFormatHandler#close() */
  public void close() throws IOException {
    super.close();
    offsets = lengths = null;
  }

  // -- Internal FormatReader API methods --

  /* @see loci.formats.FormatReader#initFile(String) */
  protected void initFile(String id) throws FormatException, IOException {
    if (debug) debug("MNGReader.initFile(" + id + ")");
    super.initFile(id);
    in = new RandomAccessStream(id);
    in.order(false);

    status("Verifying MNG format");

    offsets = new Vector();
    lengths = new Vector();

    in.skipBytes(12);

    if (!"MHDR".equals(in.readString(4))) {
      throw new FormatException("Invalid MNG file.");
    }

    status("Reading dimensions");

    core.sizeX[0] = in.readInt();
    core.sizeY[0] = in.readInt();
    in.skipBytes(24);

    Vector stack = new Vector();
    int maxIterations = 0;
    int currentIteration = 0;

    status("Finding image offsets");

    while (in.getFilePointer() < in.length()) {
      int len = in.readInt();
      String code = in.readString(4);

      long fp = in.getFilePointer();

      if (code.equals("IHDR")) {
        offsets.add(new Long(in.getFilePointer() - 8));
        core.imageCount[0]++;
      }
      else if (code.equals("IEND")) {
        lengths.add(new Long(fp + len + 4));
      }
      else if (code.equals("LOOP")) {
        stack.add(new Long(in.getFilePointer() + len + 4));
        in.skipBytes(1);
        maxIterations = in.readInt();
      }
      else if (code.equals("ENDL")) {
        int seek = ((Integer) stack.get(stack.size() - 1)).intValue();
        if (currentIteration < maxIterations) {
          in.seek(seek);
          currentIteration++;
        }
        else {
          stack.remove(stack.size() - 1);
          maxIterations = 0;
          currentIteration = 0;
        }
      }

      in.seek(fp + len + 4);
    }

    status("Populating metadata");

    core.sizeZ[0] = 1;

    long offset = ((Long) offsets.get(0)).longValue();
    in.seek(offset);
    long end = ((Long) lengths.get(0)).longValue();
    byte[] b = new byte[(int) (end - offset + 8)];
    in.read(b, 8, b.length - 8);
    b[0] = (byte) 0x89;
    b[1] = 0x50;
    b[2] = 0x4e;
    b[3] = 0x47;
    b[4] = 0x0d;
    b[5] = 0x0a;
    b[6] = 0x1a;
    b[7] = 0x0a;

    core.sizeC[0] =
      ImageIO.read(new ByteArrayInputStream(b)).getRaster().getNumBands();

    core.sizeT[0] = core.imageCount[0];
    core.currentOrder[0] = "XYCZT";
    core.pixelType[0] = FormatTools.UINT8;
    core.rgb[0] = core.sizeC[0] > 1;
    core.interleaved[0] = false;
    core.littleEndian[0] = false;
    core.metadataComplete[0] = true;
    core.indexed[0] = false;
    core.falseColor[0] = false;

    MetadataStore store = getMetadataStore();
    store.setImageName("", 0);
    store.setImageCreationDate(
      DataTools.convertDate(System.currentTimeMillis(), DataTools.UNIX), 0);
    MetadataTools.populatePixels(store, this);
    // CTR CHECK
//    for (int i=0; i<core.sizeC[0]; i++) {
//      store.setLogicalChannel(i, null, null, null, null, null, null, null, null,
//        null, null, null, null, null, null, null, null, null, null, null, null,
//        null, null, null, null);
//    }
  }

}
