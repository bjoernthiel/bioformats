/*
 * ome.xml.r200706.ome.FilterSetNode
 *
 *-----------------------------------------------------------------------------
 *
 *  Copyright (C) 2007 Open Microscopy Environment
 *      Massachusetts Institute of Technology,
 *      National Institutes of Health,
 *      University of Dundee,
 *      University of Wisconsin-Madison
 *
 *
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 2.1 of the License, or (at your option) any later version.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with this library; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *-----------------------------------------------------------------------------
 */

/*-----------------------------------------------------------------------------
 *
 * THIS IS AUTOMATICALLY GENERATED CODE.  DO NOT MODIFY.
 * Created by curtis via xsd-fu on 2008-10-16 06:18:36-0500
 *
 *-----------------------------------------------------------------------------
 */

package ome.xml.r200706.ome;

import ome.xml.DOMUtil;
import ome.xml.OMEXMLNode;
import ome.xml.r200706.ome.*;
import ome.xml.r200706.spw.*;

import org.w3c.dom.Element;

public class FilterSetNode extends FilterSpecNode
{

	// -- Constructors --

	/** Constructs a FilterSet node with an associated DOM element. */
	public FilterSetNode(Element element)
	{
		super(element);
	}

	/**
	 * Constructs a FilterSet node with an associated DOM element beneath
	 * a given parent.
	 */
	public FilterSetNode(OMEXMLNode parent)
	{
		this(parent, true);
	}

	/**
	 * Constructs a FilterSet node with an associated DOM element beneath
	 * a given parent.
	 */
	public FilterSetNode(OMEXMLNode parent, boolean attach)
	{
		super(DOMUtil.createChild(parent.getDOMElement(),
		                          "FilterSet", attach));
	}

	// -- FilterSet API methods --

	// Attribute which is an OME XML "ID"
	public FilterNode getExFilterRefNode()
	{
		return (FilterNode)
			getAttrReferencedNode("Filter", "ExFilterRef");
	}

	public String getExFilterRef()
	{
		return getStringAttribute("ExFilterRef");
	}

	public void setExFilterRef(String exFilterRef)
	{
		setAttribute("ExFilterRef", exFilterRef);
	}

	// Attribute which is an OME XML "ID"
	public FilterNode getEmFilterRefNode()
	{
		return (FilterNode)
			getAttrReferencedNode("Filter", "EmFilterRef");
	}

	public String getEmFilterRef()
	{
		return getStringAttribute("EmFilterRef");
	}

	public void setEmFilterRef(String emFilterRef)
	{
		setAttribute("EmFilterRef", emFilterRef);
	}

	// Virtual, inferred back reference OTF_BackReference
	public int getReferringOTFCount()
	{
		return getReferringCount("OTF");
	}

	public java.util.List getReferringOTFList()
	{
		return getReferringNodes("OTF");
	}

	// Attribute which is an OME XML "ID"
	public DichroicNode getDichroicRefNode()
	{
		return (DichroicNode)
			getAttrReferencedNode("Dichroic", "DichroicRef");
	}

	public String getDichroicRef()
	{
		return getStringAttribute("DichroicRef");
	}

	public void setDichroicRef(String dichroicRef)
	{
		setAttribute("DichroicRef", dichroicRef);
	}

	// Virtual, inferred back reference LogicalChannel_BackReference
	public int getReferringLogicalChannelCount()
	{
		return getReferringCount("LogicalChannel");
	}

	public java.util.List getReferringLogicalChannelList()
	{
		return getReferringNodes("LogicalChannel");
	}

	// *** WARNING *** Unhandled or skipped property ID

	// -- OMEXMLNode API methods --

	public boolean hasID()
	{
		return true;
	}

}
