// **********************************************************************
//
// Copyright (c) 2003-2009 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.3.1

package loci.ice.formats;

public interface IMetadataPrx extends Ice.ObjectPrx
{
    public String getOMEXML();
    public String getOMEXML(java.util.Map<String, String> __ctx);

    public int getChannelComponentCount(int imageIndex, int logicalChannelIndex);
    public int getChannelComponentCount(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public int getDatasetCount();
    public int getDatasetCount(java.util.Map<String, String> __ctx);

    public int getDatasetRefCount(int imageIndex);
    public int getDatasetRefCount(int imageIndex, java.util.Map<String, String> __ctx);

    public int getDetectorCount(int instrumentIndex);
    public int getDetectorCount(int instrumentIndex, java.util.Map<String, String> __ctx);

    public int getDichroicCount(int instrumentIndex);
    public int getDichroicCount(int instrumentIndex, java.util.Map<String, String> __ctx);

    public int getExperimentCount();
    public int getExperimentCount(java.util.Map<String, String> __ctx);

    public int getExperimenterCount();
    public int getExperimenterCount(java.util.Map<String, String> __ctx);

    public int getExperimenterMembershipCount(int experimenterIndex);
    public int getExperimenterMembershipCount(int experimenterIndex, java.util.Map<String, String> __ctx);

    public int getFilterCount(int instrumentIndex);
    public int getFilterCount(int instrumentIndex, java.util.Map<String, String> __ctx);

    public int getFilterSetCount(int instrumentIndex);
    public int getFilterSetCount(int instrumentIndex, java.util.Map<String, String> __ctx);

    public int getGroupCount();
    public int getGroupCount(java.util.Map<String, String> __ctx);

    public int getGroupRefCount(int experimenterIndex);
    public int getGroupRefCount(int experimenterIndex, java.util.Map<String, String> __ctx);

    public int getImageCount();
    public int getImageCount(java.util.Map<String, String> __ctx);

    public int getInstrumentCount();
    public int getInstrumentCount(java.util.Map<String, String> __ctx);

    public int getLightSourceCount(int instrumentIndex);
    public int getLightSourceCount(int instrumentIndex, java.util.Map<String, String> __ctx);

    public int getLightSourceRefCount(int imageIndex, int microbeamManipulationIndex);
    public int getLightSourceRefCount(int imageIndex, int microbeamManipulationIndex, java.util.Map<String, String> __ctx);

    public int getLogicalChannelCount(int imageIndex);
    public int getLogicalChannelCount(int imageIndex, java.util.Map<String, String> __ctx);

    public int getMicrobeamManipulationCount(int imageIndex);
    public int getMicrobeamManipulationCount(int imageIndex, java.util.Map<String, String> __ctx);

    public int getMicrobeamManipulationRefCount(int experimentIndex);
    public int getMicrobeamManipulationRefCount(int experimentIndex, java.util.Map<String, String> __ctx);

    public int getOTFCount(int instrumentIndex);
    public int getOTFCount(int instrumentIndex, java.util.Map<String, String> __ctx);

    public int getObjectiveCount(int instrumentIndex);
    public int getObjectiveCount(int instrumentIndex, java.util.Map<String, String> __ctx);

    public int getPixelsCount(int imageIndex);
    public int getPixelsCount(int imageIndex, java.util.Map<String, String> __ctx);

    public int getPlaneCount(int imageIndex, int pixelsIndex);
    public int getPlaneCount(int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public int getPlateCount();
    public int getPlateCount(java.util.Map<String, String> __ctx);

    public int getPlateRefCount(int screenIndex);
    public int getPlateRefCount(int screenIndex, java.util.Map<String, String> __ctx);

    public int getProjectCount();
    public int getProjectCount(java.util.Map<String, String> __ctx);

    public int getProjectRefCount(int datasetIndex);
    public int getProjectRefCount(int datasetIndex, java.util.Map<String, String> __ctx);

    public int getROICount(int imageIndex);
    public int getROICount(int imageIndex, java.util.Map<String, String> __ctx);

    public int getROIRefCount(int imageIndex, int microbeamManipulationIndex);
    public int getROIRefCount(int imageIndex, int microbeamManipulationIndex, java.util.Map<String, String> __ctx);

    public int getReagentCount(int screenIndex);
    public int getReagentCount(int screenIndex, java.util.Map<String, String> __ctx);

    public int getRegionCount(int imageIndex);
    public int getRegionCount(int imageIndex, java.util.Map<String, String> __ctx);

    public int getRoiLinkCount(int imageIndex, int roiIndex);
    public int getRoiLinkCount(int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public int getScreenCount();
    public int getScreenCount(java.util.Map<String, String> __ctx);

    public int getScreenAcquisitionCount(int screenIndex);
    public int getScreenAcquisitionCount(int screenIndex, java.util.Map<String, String> __ctx);

    public int getScreenRefCount(int plateIndex);
    public int getScreenRefCount(int plateIndex, java.util.Map<String, String> __ctx);

    public int getShapeCount(int imageIndex, int roiIndex);
    public int getShapeCount(int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public int getTiffDataCount(int imageIndex, int pixelsIndex);
    public int getTiffDataCount(int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public int getWellCount(int plateIndex);
    public int getWellCount(int plateIndex, java.util.Map<String, String> __ctx);

    public int getWellSampleCount(int plateIndex, int wellIndex);
    public int getWellSampleCount(int plateIndex, int wellIndex, java.util.Map<String, String> __ctx);

    public int getWellSampleRefCount(int screenIndex, int screenAcquisitionIndex);
    public int getWellSampleRefCount(int screenIndex, int screenAcquisitionIndex, java.util.Map<String, String> __ctx);

    public String getUUID();
    public String getUUID(java.util.Map<String, String> __ctx);

    public String getArcType(int instrumentIndex, int lightSourceIndex);
    public String getArcType(int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public String getChannelComponentColorDomain(int imageIndex, int logicalChannelIndex, int channelComponentIndex);
    public String getChannelComponentColorDomain(int imageIndex, int logicalChannelIndex, int channelComponentIndex, java.util.Map<String, String> __ctx);

    public int getChannelComponentIndex(int imageIndex, int logicalChannelIndex, int channelComponentIndex);
    public int getChannelComponentIndex(int imageIndex, int logicalChannelIndex, int channelComponentIndex, java.util.Map<String, String> __ctx);

    public String getChannelComponentPixels(int imageIndex, int logicalChannelIndex, int channelComponentIndex);
    public String getChannelComponentPixels(int imageIndex, int logicalChannelIndex, int channelComponentIndex, java.util.Map<String, String> __ctx);

    public String getCircleCx(int imageIndex, int roiIndex, int shapeIndex);
    public String getCircleCx(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getCircleCy(int imageIndex, int roiIndex, int shapeIndex);
    public String getCircleCy(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getCircleID(int imageIndex, int roiIndex, int shapeIndex);
    public String getCircleID(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getCircleR(int imageIndex, int roiIndex, int shapeIndex);
    public String getCircleR(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getCircleTransform(int imageIndex, int roiIndex, int shapeIndex);
    public String getCircleTransform(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getContactExperimenter(int groupIndex);
    public String getContactExperimenter(int groupIndex, java.util.Map<String, String> __ctx);

    public String getDatasetDescription(int datasetIndex);
    public String getDatasetDescription(int datasetIndex, java.util.Map<String, String> __ctx);

    public String getDatasetExperimenterRef(int datasetIndex);
    public String getDatasetExperimenterRef(int datasetIndex, java.util.Map<String, String> __ctx);

    public String getDatasetGroupRef(int datasetIndex);
    public String getDatasetGroupRef(int datasetIndex, java.util.Map<String, String> __ctx);

    public String getDatasetID(int datasetIndex);
    public String getDatasetID(int datasetIndex, java.util.Map<String, String> __ctx);

    public boolean getDatasetLocked(int datasetIndex);
    public boolean getDatasetLocked(int datasetIndex, java.util.Map<String, String> __ctx);

    public String getDatasetName(int datasetIndex);
    public String getDatasetName(int datasetIndex, java.util.Map<String, String> __ctx);

    public String getDatasetRefID(int imageIndex, int datasetRefIndex);
    public String getDatasetRefID(int imageIndex, int datasetRefIndex, java.util.Map<String, String> __ctx);

    public float getDetectorAmplificationGain(int instrumentIndex, int detectorIndex);
    public float getDetectorAmplificationGain(int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public float getDetectorGain(int instrumentIndex, int detectorIndex);
    public float getDetectorGain(int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public String getDetectorID(int instrumentIndex, int detectorIndex);
    public String getDetectorID(int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public String getDetectorManufacturer(int instrumentIndex, int detectorIndex);
    public String getDetectorManufacturer(int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public String getDetectorModel(int instrumentIndex, int detectorIndex);
    public String getDetectorModel(int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public float getDetectorOffset(int instrumentIndex, int detectorIndex);
    public float getDetectorOffset(int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public String getDetectorSerialNumber(int instrumentIndex, int detectorIndex);
    public String getDetectorSerialNumber(int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public String getDetectorType(int instrumentIndex, int detectorIndex);
    public String getDetectorType(int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public float getDetectorVoltage(int instrumentIndex, int detectorIndex);
    public float getDetectorVoltage(int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public float getDetectorZoom(int instrumentIndex, int detectorIndex);
    public float getDetectorZoom(int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public String getDetectorSettingsBinning(int imageIndex, int logicalChannelIndex);
    public String getDetectorSettingsBinning(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public String getDetectorSettingsDetector(int imageIndex, int logicalChannelIndex);
    public String getDetectorSettingsDetector(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public float getDetectorSettingsGain(int imageIndex, int logicalChannelIndex);
    public float getDetectorSettingsGain(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public float getDetectorSettingsOffset(int imageIndex, int logicalChannelIndex);
    public float getDetectorSettingsOffset(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public float getDetectorSettingsReadOutRate(int imageIndex, int logicalChannelIndex);
    public float getDetectorSettingsReadOutRate(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public float getDetectorSettingsVoltage(int imageIndex, int logicalChannelIndex);
    public float getDetectorSettingsVoltage(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public String getDichroicID(int instrumentIndex, int dichroicIndex);
    public String getDichroicID(int instrumentIndex, int dichroicIndex, java.util.Map<String, String> __ctx);

    public String getDichroicLotNumber(int instrumentIndex, int dichroicIndex);
    public String getDichroicLotNumber(int instrumentIndex, int dichroicIndex, java.util.Map<String, String> __ctx);

    public String getDichroicManufacturer(int instrumentIndex, int dichroicIndex);
    public String getDichroicManufacturer(int instrumentIndex, int dichroicIndex, java.util.Map<String, String> __ctx);

    public String getDichroicModel(int instrumentIndex, int dichroicIndex);
    public String getDichroicModel(int instrumentIndex, int dichroicIndex, java.util.Map<String, String> __ctx);

    public float getDimensionsPhysicalSizeX(int imageIndex, int pixelsIndex);
    public float getDimensionsPhysicalSizeX(int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public float getDimensionsPhysicalSizeY(int imageIndex, int pixelsIndex);
    public float getDimensionsPhysicalSizeY(int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public float getDimensionsPhysicalSizeZ(int imageIndex, int pixelsIndex);
    public float getDimensionsPhysicalSizeZ(int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public float getDimensionsTimeIncrement(int imageIndex, int pixelsIndex);
    public float getDimensionsTimeIncrement(int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public int getDimensionsWaveIncrement(int imageIndex, int pixelsIndex);
    public int getDimensionsWaveIncrement(int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public int getDimensionsWaveStart(int imageIndex, int pixelsIndex);
    public int getDimensionsWaveStart(int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public String getDisplayOptionsDisplay(int imageIndex);
    public String getDisplayOptionsDisplay(int imageIndex, java.util.Map<String, String> __ctx);

    public String getDisplayOptionsID(int imageIndex);
    public String getDisplayOptionsID(int imageIndex, java.util.Map<String, String> __ctx);

    public float getDisplayOptionsZoom(int imageIndex);
    public float getDisplayOptionsZoom(int imageIndex, java.util.Map<String, String> __ctx);

    public String getEllipseCx(int imageIndex, int roiIndex, int shapeIndex);
    public String getEllipseCx(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getEllipseCy(int imageIndex, int roiIndex, int shapeIndex);
    public String getEllipseCy(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getEllipseID(int imageIndex, int roiIndex, int shapeIndex);
    public String getEllipseID(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getEllipseRx(int imageIndex, int roiIndex, int shapeIndex);
    public String getEllipseRx(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getEllipseRy(int imageIndex, int roiIndex, int shapeIndex);
    public String getEllipseRy(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getEllipseTransform(int imageIndex, int roiIndex, int shapeIndex);
    public String getEllipseTransform(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getEmFilterLotNumber(int instrumentIndex, int filterIndex);
    public String getEmFilterLotNumber(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public String getEmFilterManufacturer(int instrumentIndex, int filterIndex);
    public String getEmFilterManufacturer(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public String getEmFilterModel(int instrumentIndex, int filterIndex);
    public String getEmFilterModel(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public String getEmFilterType(int instrumentIndex, int filterIndex);
    public String getEmFilterType(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public String getExFilterLotNumber(int instrumentIndex, int filterIndex);
    public String getExFilterLotNumber(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public String getExFilterManufacturer(int instrumentIndex, int filterIndex);
    public String getExFilterManufacturer(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public String getExFilterModel(int instrumentIndex, int filterIndex);
    public String getExFilterModel(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public String getExFilterType(int instrumentIndex, int filterIndex);
    public String getExFilterType(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public String getExperimentDescription(int experimentIndex);
    public String getExperimentDescription(int experimentIndex, java.util.Map<String, String> __ctx);

    public String getExperimentExperimenterRef(int experimentIndex);
    public String getExperimentExperimenterRef(int experimentIndex, java.util.Map<String, String> __ctx);

    public String getExperimentID(int experimentIndex);
    public String getExperimentID(int experimentIndex, java.util.Map<String, String> __ctx);

    public String getExperimentType(int experimentIndex);
    public String getExperimentType(int experimentIndex, java.util.Map<String, String> __ctx);

    public String getExperimenterEmail(int experimenterIndex);
    public String getExperimenterEmail(int experimenterIndex, java.util.Map<String, String> __ctx);

    public String getExperimenterFirstName(int experimenterIndex);
    public String getExperimenterFirstName(int experimenterIndex, java.util.Map<String, String> __ctx);

    public String getExperimenterID(int experimenterIndex);
    public String getExperimenterID(int experimenterIndex, java.util.Map<String, String> __ctx);

    public String getExperimenterInstitution(int experimenterIndex);
    public String getExperimenterInstitution(int experimenterIndex, java.util.Map<String, String> __ctx);

    public String getExperimenterLastName(int experimenterIndex);
    public String getExperimenterLastName(int experimenterIndex, java.util.Map<String, String> __ctx);

    public String getExperimenterOMEName(int experimenterIndex);
    public String getExperimenterOMEName(int experimenterIndex, java.util.Map<String, String> __ctx);

    public String getExperimenterMembershipGroup(int experimenterIndex, int groupRefIndex);
    public String getExperimenterMembershipGroup(int experimenterIndex, int groupRefIndex, java.util.Map<String, String> __ctx);

    public String getFilamentType(int instrumentIndex, int lightSourceIndex);
    public String getFilamentType(int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public String getFilterFilterWheel(int instrumentIndex, int filterIndex);
    public String getFilterFilterWheel(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public String getFilterID(int instrumentIndex, int filterIndex);
    public String getFilterID(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public String getFilterLotNumber(int instrumentIndex, int filterIndex);
    public String getFilterLotNumber(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public String getFilterManufacturer(int instrumentIndex, int filterIndex);
    public String getFilterManufacturer(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public String getFilterModel(int instrumentIndex, int filterIndex);
    public String getFilterModel(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public String getFilterType(int instrumentIndex, int filterIndex);
    public String getFilterType(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public String getFilterSetDichroic(int instrumentIndex, int filterSetIndex);
    public String getFilterSetDichroic(int instrumentIndex, int filterSetIndex, java.util.Map<String, String> __ctx);

    public String getFilterSetEmFilter(int instrumentIndex, int filterSetIndex);
    public String getFilterSetEmFilter(int instrumentIndex, int filterSetIndex, java.util.Map<String, String> __ctx);

    public String getFilterSetExFilter(int instrumentIndex, int filterSetIndex);
    public String getFilterSetExFilter(int instrumentIndex, int filterSetIndex, java.util.Map<String, String> __ctx);

    public String getFilterSetID(int instrumentIndex, int filterSetIndex);
    public String getFilterSetID(int instrumentIndex, int filterSetIndex, java.util.Map<String, String> __ctx);

    public String getFilterSetLotNumber(int instrumentIndex, int filterSetIndex);
    public String getFilterSetLotNumber(int instrumentIndex, int filterSetIndex, java.util.Map<String, String> __ctx);

    public String getFilterSetManufacturer(int instrumentIndex, int filterSetIndex);
    public String getFilterSetManufacturer(int instrumentIndex, int filterSetIndex, java.util.Map<String, String> __ctx);

    public String getFilterSetModel(int instrumentIndex, int filterSetIndex);
    public String getFilterSetModel(int instrumentIndex, int filterSetIndex, java.util.Map<String, String> __ctx);

    public String getGroupID(int groupIndex);
    public String getGroupID(int groupIndex, java.util.Map<String, String> __ctx);

    public String getGroupName(int groupIndex);
    public String getGroupName(int groupIndex, java.util.Map<String, String> __ctx);

    public String getImageAcquiredPixels(int imageIndex);
    public String getImageAcquiredPixels(int imageIndex, java.util.Map<String, String> __ctx);

    public String getImageCreationDate(int imageIndex);
    public String getImageCreationDate(int imageIndex, java.util.Map<String, String> __ctx);

    public String getImageDefaultPixels(int imageIndex);
    public String getImageDefaultPixels(int imageIndex, java.util.Map<String, String> __ctx);

    public String getImageDescription(int imageIndex);
    public String getImageDescription(int imageIndex, java.util.Map<String, String> __ctx);

    public String getImageExperimentRef(int imageIndex);
    public String getImageExperimentRef(int imageIndex, java.util.Map<String, String> __ctx);

    public String getImageExperimenterRef(int imageIndex);
    public String getImageExperimenterRef(int imageIndex, java.util.Map<String, String> __ctx);

    public String getImageGroupRef(int imageIndex);
    public String getImageGroupRef(int imageIndex, java.util.Map<String, String> __ctx);

    public String getImageID(int imageIndex);
    public String getImageID(int imageIndex, java.util.Map<String, String> __ctx);

    public String getImageInstrumentRef(int imageIndex);
    public String getImageInstrumentRef(int imageIndex, java.util.Map<String, String> __ctx);

    public String getImageName(int imageIndex);
    public String getImageName(int imageIndex, java.util.Map<String, String> __ctx);

    public float getImagingEnvironmentAirPressure(int imageIndex);
    public float getImagingEnvironmentAirPressure(int imageIndex, java.util.Map<String, String> __ctx);

    public float getImagingEnvironmentCO2Percent(int imageIndex);
    public float getImagingEnvironmentCO2Percent(int imageIndex, java.util.Map<String, String> __ctx);

    public float getImagingEnvironmentHumidity(int imageIndex);
    public float getImagingEnvironmentHumidity(int imageIndex, java.util.Map<String, String> __ctx);

    public float getImagingEnvironmentTemperature(int imageIndex);
    public float getImagingEnvironmentTemperature(int imageIndex, java.util.Map<String, String> __ctx);

    public String getInstrumentID(int instrumentIndex);
    public String getInstrumentID(int instrumentIndex, java.util.Map<String, String> __ctx);

    public int getLaserFrequencyMultiplication(int instrumentIndex, int lightSourceIndex);
    public int getLaserFrequencyMultiplication(int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public String getLaserLaserMedium(int instrumentIndex, int lightSourceIndex);
    public String getLaserLaserMedium(int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public boolean getLaserPockelCell(int instrumentIndex, int lightSourceIndex);
    public boolean getLaserPockelCell(int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public String getLaserPulse(int instrumentIndex, int lightSourceIndex);
    public String getLaserPulse(int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public boolean getLaserRepetitionRate(int instrumentIndex, int lightSourceIndex);
    public boolean getLaserRepetitionRate(int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public boolean getLaserTuneable(int instrumentIndex, int lightSourceIndex);
    public boolean getLaserTuneable(int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public String getLaserType(int instrumentIndex, int lightSourceIndex);
    public String getLaserType(int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public int getLaserWavelength(int instrumentIndex, int lightSourceIndex);
    public int getLaserWavelength(int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public String getLightSourceID(int instrumentIndex, int lightSourceIndex);
    public String getLightSourceID(int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public String getLightSourceManufacturer(int instrumentIndex, int lightSourceIndex);
    public String getLightSourceManufacturer(int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public String getLightSourceModel(int instrumentIndex, int lightSourceIndex);
    public String getLightSourceModel(int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public float getLightSourcePower(int instrumentIndex, int lightSourceIndex);
    public float getLightSourcePower(int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public String getLightSourceSerialNumber(int instrumentIndex, int lightSourceIndex);
    public String getLightSourceSerialNumber(int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public float getLightSourceRefAttenuation(int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex);
    public float getLightSourceRefAttenuation(int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex, java.util.Map<String, String> __ctx);

    public String getLightSourceRefLightSource(int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex);
    public String getLightSourceRefLightSource(int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex, java.util.Map<String, String> __ctx);

    public int getLightSourceRefWavelength(int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex);
    public int getLightSourceRefWavelength(int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex, java.util.Map<String, String> __ctx);

    public float getLightSourceSettingsAttenuation(int imageIndex, int logicalChannelIndex);
    public float getLightSourceSettingsAttenuation(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public String getLightSourceSettingsLightSource(int imageIndex, int logicalChannelIndex);
    public String getLightSourceSettingsLightSource(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public int getLightSourceSettingsWavelength(int imageIndex, int logicalChannelIndex);
    public int getLightSourceSettingsWavelength(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public String getLineID(int imageIndex, int roiIndex, int shapeIndex);
    public String getLineID(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getLineTransform(int imageIndex, int roiIndex, int shapeIndex);
    public String getLineTransform(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getLineX1(int imageIndex, int roiIndex, int shapeIndex);
    public String getLineX1(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getLineX2(int imageIndex, int roiIndex, int shapeIndex);
    public String getLineX2(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getLineY1(int imageIndex, int roiIndex, int shapeIndex);
    public String getLineY1(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getLineY2(int imageIndex, int roiIndex, int shapeIndex);
    public String getLineY2(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getLogicalChannelContrastMethod(int imageIndex, int logicalChannelIndex);
    public String getLogicalChannelContrastMethod(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public String getLogicalChannelDetector(int imageIndex, int logicalChannelIndex);
    public String getLogicalChannelDetector(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public int getLogicalChannelEmWave(int imageIndex, int logicalChannelIndex);
    public int getLogicalChannelEmWave(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public int getLogicalChannelExWave(int imageIndex, int logicalChannelIndex);
    public int getLogicalChannelExWave(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public String getLogicalChannelFilterSet(int imageIndex, int logicalChannelIndex);
    public String getLogicalChannelFilterSet(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public String getLogicalChannelFluor(int imageIndex, int logicalChannelIndex);
    public String getLogicalChannelFluor(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public String getLogicalChannelID(int imageIndex, int logicalChannelIndex);
    public String getLogicalChannelID(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public String getLogicalChannelIlluminationType(int imageIndex, int logicalChannelIndex);
    public String getLogicalChannelIlluminationType(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public String getLogicalChannelLightSource(int imageIndex, int logicalChannelIndex);
    public String getLogicalChannelLightSource(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public String getLogicalChannelMode(int imageIndex, int logicalChannelIndex);
    public String getLogicalChannelMode(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public String getLogicalChannelName(int imageIndex, int logicalChannelIndex);
    public String getLogicalChannelName(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public float getLogicalChannelNdFilter(int imageIndex, int logicalChannelIndex);
    public float getLogicalChannelNdFilter(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public String getLogicalChannelOTF(int imageIndex, int logicalChannelIndex);
    public String getLogicalChannelOTF(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public String getLogicalChannelPhotometricInterpretation(int imageIndex, int logicalChannelIndex);
    public String getLogicalChannelPhotometricInterpretation(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public float getLogicalChannelPinholeSize(int imageIndex, int logicalChannelIndex);
    public float getLogicalChannelPinholeSize(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public int getLogicalChannelPockelCellSetting(int imageIndex, int logicalChannelIndex);
    public int getLogicalChannelPockelCellSetting(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public int getLogicalChannelSamplesPerPixel(int imageIndex, int logicalChannelIndex);
    public int getLogicalChannelSamplesPerPixel(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public String getLogicalChannelSecondaryEmissionFilter(int imageIndex, int logicalChannelIndex);
    public String getLogicalChannelSecondaryEmissionFilter(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public String getLogicalChannelSecondaryExcitationFilter(int imageIndex, int logicalChannelIndex);
    public String getLogicalChannelSecondaryExcitationFilter(int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public String getMaskHeight(int imageIndex, int roiIndex, int shapeIndex);
    public String getMaskHeight(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getMaskID(int imageIndex, int roiIndex, int shapeIndex);
    public String getMaskID(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getMaskTransform(int imageIndex, int roiIndex, int shapeIndex);
    public String getMaskTransform(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getMaskWidth(int imageIndex, int roiIndex, int shapeIndex);
    public String getMaskWidth(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getMaskX(int imageIndex, int roiIndex, int shapeIndex);
    public String getMaskX(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getMaskY(int imageIndex, int roiIndex, int shapeIndex);
    public String getMaskY(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public boolean getMaskPixelsBigEndian(int imageIndex, int roiIndex, int shapeIndex);
    public boolean getMaskPixelsBigEndian(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public byte[] getMaskPixelsBinData(int imageIndex, int roiIndex, int shapeIndex);
    public byte[] getMaskPixelsBinData(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getMaskPixelsExtendedPixelType(int imageIndex, int roiIndex, int shapeIndex);
    public String getMaskPixelsExtendedPixelType(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getMaskPixelsID(int imageIndex, int roiIndex, int shapeIndex);
    public String getMaskPixelsID(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public int getMaskPixelsSizeX(int imageIndex, int roiIndex, int shapeIndex);
    public int getMaskPixelsSizeX(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public int getMaskPixelsSizeY(int imageIndex, int roiIndex, int shapeIndex);
    public int getMaskPixelsSizeY(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getMicrobeamManipulationExperimenterRef(int imageIndex, int microbeamManipulationIndex);
    public String getMicrobeamManipulationExperimenterRef(int imageIndex, int microbeamManipulationIndex, java.util.Map<String, String> __ctx);

    public String getMicrobeamManipulationID(int imageIndex, int microbeamManipulationIndex);
    public String getMicrobeamManipulationID(int imageIndex, int microbeamManipulationIndex, java.util.Map<String, String> __ctx);

    public String getMicrobeamManipulationType(int imageIndex, int microbeamManipulationIndex);
    public String getMicrobeamManipulationType(int imageIndex, int microbeamManipulationIndex, java.util.Map<String, String> __ctx);

    public String getMicrobeamManipulationRefID(int experimentIndex, int microbeamManipulationRefIndex);
    public String getMicrobeamManipulationRefID(int experimentIndex, int microbeamManipulationRefIndex, java.util.Map<String, String> __ctx);

    public String getMicroscopeID(int instrumentIndex);
    public String getMicroscopeID(int instrumentIndex, java.util.Map<String, String> __ctx);

    public String getMicroscopeManufacturer(int instrumentIndex);
    public String getMicroscopeManufacturer(int instrumentIndex, java.util.Map<String, String> __ctx);

    public String getMicroscopeModel(int instrumentIndex);
    public String getMicroscopeModel(int instrumentIndex, java.util.Map<String, String> __ctx);

    public String getMicroscopeSerialNumber(int instrumentIndex);
    public String getMicroscopeSerialNumber(int instrumentIndex, java.util.Map<String, String> __ctx);

    public String getMicroscopeType(int instrumentIndex);
    public String getMicroscopeType(int instrumentIndex, java.util.Map<String, String> __ctx);

    public String getOTFBinaryFile(int instrumentIndex, int otfIndex);
    public String getOTFBinaryFile(int instrumentIndex, int otfIndex, java.util.Map<String, String> __ctx);

    public String getOTFID(int instrumentIndex, int otfIndex);
    public String getOTFID(int instrumentIndex, int otfIndex, java.util.Map<String, String> __ctx);

    public String getOTFObjective(int instrumentIndex, int otfIndex);
    public String getOTFObjective(int instrumentIndex, int otfIndex, java.util.Map<String, String> __ctx);

    public boolean getOTFOpticalAxisAveraged(int instrumentIndex, int otfIndex);
    public boolean getOTFOpticalAxisAveraged(int instrumentIndex, int otfIndex, java.util.Map<String, String> __ctx);

    public String getOTFPixelType(int instrumentIndex, int otfIndex);
    public String getOTFPixelType(int instrumentIndex, int otfIndex, java.util.Map<String, String> __ctx);

    public int getOTFSizeX(int instrumentIndex, int otfIndex);
    public int getOTFSizeX(int instrumentIndex, int otfIndex, java.util.Map<String, String> __ctx);

    public int getOTFSizeY(int instrumentIndex, int otfIndex);
    public int getOTFSizeY(int instrumentIndex, int otfIndex, java.util.Map<String, String> __ctx);

    public float getObjectiveCalibratedMagnification(int instrumentIndex, int objectiveIndex);
    public float getObjectiveCalibratedMagnification(int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public String getObjectiveCorrection(int instrumentIndex, int objectiveIndex);
    public String getObjectiveCorrection(int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public String getObjectiveID(int instrumentIndex, int objectiveIndex);
    public String getObjectiveID(int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public String getObjectiveImmersion(int instrumentIndex, int objectiveIndex);
    public String getObjectiveImmersion(int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public boolean getObjectiveIris(int instrumentIndex, int objectiveIndex);
    public boolean getObjectiveIris(int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public float getObjectiveLensNA(int instrumentIndex, int objectiveIndex);
    public float getObjectiveLensNA(int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public String getObjectiveManufacturer(int instrumentIndex, int objectiveIndex);
    public String getObjectiveManufacturer(int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public String getObjectiveModel(int instrumentIndex, int objectiveIndex);
    public String getObjectiveModel(int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public int getObjectiveNominalMagnification(int instrumentIndex, int objectiveIndex);
    public int getObjectiveNominalMagnification(int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public String getObjectiveSerialNumber(int instrumentIndex, int objectiveIndex);
    public String getObjectiveSerialNumber(int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public float getObjectiveWorkingDistance(int instrumentIndex, int objectiveIndex);
    public float getObjectiveWorkingDistance(int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public float getObjectiveSettingsCorrectionCollar(int imageIndex);
    public float getObjectiveSettingsCorrectionCollar(int imageIndex, java.util.Map<String, String> __ctx);

    public String getObjectiveSettingsMedium(int imageIndex);
    public String getObjectiveSettingsMedium(int imageIndex, java.util.Map<String, String> __ctx);

    public String getObjectiveSettingsObjective(int imageIndex);
    public String getObjectiveSettingsObjective(int imageIndex, java.util.Map<String, String> __ctx);

    public float getObjectiveSettingsRefractiveIndex(int imageIndex);
    public float getObjectiveSettingsRefractiveIndex(int imageIndex, java.util.Map<String, String> __ctx);

    public String getPathD(int imageIndex, int roiIndex, int shapeIndex);
    public String getPathD(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getPathID(int imageIndex, int roiIndex, int shapeIndex);
    public String getPathID(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public boolean getPixelsBigEndian(int imageIndex, int pixelsIndex);
    public boolean getPixelsBigEndian(int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public String getPixelsDimensionOrder(int imageIndex, int pixelsIndex);
    public String getPixelsDimensionOrder(int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public String getPixelsID(int imageIndex, int pixelsIndex);
    public String getPixelsID(int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public String getPixelsPixelType(int imageIndex, int pixelsIndex);
    public String getPixelsPixelType(int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public int getPixelsSizeC(int imageIndex, int pixelsIndex);
    public int getPixelsSizeC(int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public int getPixelsSizeT(int imageIndex, int pixelsIndex);
    public int getPixelsSizeT(int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public int getPixelsSizeX(int imageIndex, int pixelsIndex);
    public int getPixelsSizeX(int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public int getPixelsSizeY(int imageIndex, int pixelsIndex);
    public int getPixelsSizeY(int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public int getPixelsSizeZ(int imageIndex, int pixelsIndex);
    public int getPixelsSizeZ(int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public String getPlaneHashSHA1(int imageIndex, int pixelsIndex, int planeIndex);
    public String getPlaneHashSHA1(int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public String getPlaneID(int imageIndex, int pixelsIndex, int planeIndex);
    public String getPlaneID(int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public int getPlaneTheC(int imageIndex, int pixelsIndex, int planeIndex);
    public int getPlaneTheC(int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public int getPlaneTheT(int imageIndex, int pixelsIndex, int planeIndex);
    public int getPlaneTheT(int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public int getPlaneTheZ(int imageIndex, int pixelsIndex, int planeIndex);
    public int getPlaneTheZ(int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public float getPlaneTimingDeltaT(int imageIndex, int pixelsIndex, int planeIndex);
    public float getPlaneTimingDeltaT(int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public float getPlaneTimingExposureTime(int imageIndex, int pixelsIndex, int planeIndex);
    public float getPlaneTimingExposureTime(int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public String getPlateColumnNamingConvention(int plateIndex);
    public String getPlateColumnNamingConvention(int plateIndex, java.util.Map<String, String> __ctx);

    public String getPlateDescription(int plateIndex);
    public String getPlateDescription(int plateIndex, java.util.Map<String, String> __ctx);

    public String getPlateExternalIdentifier(int plateIndex);
    public String getPlateExternalIdentifier(int plateIndex, java.util.Map<String, String> __ctx);

    public String getPlateID(int plateIndex);
    public String getPlateID(int plateIndex, java.util.Map<String, String> __ctx);

    public String getPlateName(int plateIndex);
    public String getPlateName(int plateIndex, java.util.Map<String, String> __ctx);

    public String getPlateRowNamingConvention(int plateIndex);
    public String getPlateRowNamingConvention(int plateIndex, java.util.Map<String, String> __ctx);

    public String getPlateStatus(int plateIndex);
    public String getPlateStatus(int plateIndex, java.util.Map<String, String> __ctx);

    public double getPlateWellOriginX(int plateIndex);
    public double getPlateWellOriginX(int plateIndex, java.util.Map<String, String> __ctx);

    public double getPlateWellOriginY(int plateIndex);
    public double getPlateWellOriginY(int plateIndex, java.util.Map<String, String> __ctx);

    public String getPlateRefID(int screenIndex, int plateRefIndex);
    public String getPlateRefID(int screenIndex, int plateRefIndex, java.util.Map<String, String> __ctx);

    public int getPlateRefSample(int screenIndex, int plateRefIndex);
    public int getPlateRefSample(int screenIndex, int plateRefIndex, java.util.Map<String, String> __ctx);

    public String getPlateRefWell(int screenIndex, int plateRefIndex);
    public String getPlateRefWell(int screenIndex, int plateRefIndex, java.util.Map<String, String> __ctx);

    public String getPointCx(int imageIndex, int roiIndex, int shapeIndex);
    public String getPointCx(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getPointCy(int imageIndex, int roiIndex, int shapeIndex);
    public String getPointCy(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getPointID(int imageIndex, int roiIndex, int shapeIndex);
    public String getPointID(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getPointR(int imageIndex, int roiIndex, int shapeIndex);
    public String getPointR(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getPointTransform(int imageIndex, int roiIndex, int shapeIndex);
    public String getPointTransform(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getPolygonID(int imageIndex, int roiIndex, int shapeIndex);
    public String getPolygonID(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getPolygonPoints(int imageIndex, int roiIndex, int shapeIndex);
    public String getPolygonPoints(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getPolygonTransform(int imageIndex, int roiIndex, int shapeIndex);
    public String getPolygonTransform(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getPolylineID(int imageIndex, int roiIndex, int shapeIndex);
    public String getPolylineID(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getPolylinePoints(int imageIndex, int roiIndex, int shapeIndex);
    public String getPolylinePoints(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getPolylineTransform(int imageIndex, int roiIndex, int shapeIndex);
    public String getPolylineTransform(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getProjectDescription(int projectIndex);
    public String getProjectDescription(int projectIndex, java.util.Map<String, String> __ctx);

    public String getProjectExperimenterRef(int projectIndex);
    public String getProjectExperimenterRef(int projectIndex, java.util.Map<String, String> __ctx);

    public String getProjectGroupRef(int projectIndex);
    public String getProjectGroupRef(int projectIndex, java.util.Map<String, String> __ctx);

    public String getProjectID(int projectIndex);
    public String getProjectID(int projectIndex, java.util.Map<String, String> __ctx);

    public String getProjectName(int projectIndex);
    public String getProjectName(int projectIndex, java.util.Map<String, String> __ctx);

    public String getProjectRefID(int datasetIndex, int projectRefIndex);
    public String getProjectRefID(int datasetIndex, int projectRefIndex, java.util.Map<String, String> __ctx);

    public String getPumpLightSource(int instrumentIndex, int lightSourceIndex);
    public String getPumpLightSource(int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public String getROIID(int imageIndex, int roiIndex);
    public String getROIID(int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public int getROIT0(int imageIndex, int roiIndex);
    public int getROIT0(int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public int getROIT1(int imageIndex, int roiIndex);
    public int getROIT1(int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public int getROIX0(int imageIndex, int roiIndex);
    public int getROIX0(int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public int getROIX1(int imageIndex, int roiIndex);
    public int getROIX1(int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public int getROIY0(int imageIndex, int roiIndex);
    public int getROIY0(int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public int getROIY1(int imageIndex, int roiIndex);
    public int getROIY1(int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public int getROIZ0(int imageIndex, int roiIndex);
    public int getROIZ0(int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public int getROIZ1(int imageIndex, int roiIndex);
    public int getROIZ1(int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public String getROIRefID(int imageIndex, int microbeamManipulationIndex, int roiRefIndex);
    public String getROIRefID(int imageIndex, int microbeamManipulationIndex, int roiRefIndex, java.util.Map<String, String> __ctx);

    public String getReagentDescription(int screenIndex, int reagentIndex);
    public String getReagentDescription(int screenIndex, int reagentIndex, java.util.Map<String, String> __ctx);

    public String getReagentID(int screenIndex, int reagentIndex);
    public String getReagentID(int screenIndex, int reagentIndex, java.util.Map<String, String> __ctx);

    public String getReagentName(int screenIndex, int reagentIndex);
    public String getReagentName(int screenIndex, int reagentIndex, java.util.Map<String, String> __ctx);

    public String getReagentReagentIdentifier(int screenIndex, int reagentIndex);
    public String getReagentReagentIdentifier(int screenIndex, int reagentIndex, java.util.Map<String, String> __ctx);

    public String getRectHeight(int imageIndex, int roiIndex, int shapeIndex);
    public String getRectHeight(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getRectID(int imageIndex, int roiIndex, int shapeIndex);
    public String getRectID(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getRectTransform(int imageIndex, int roiIndex, int shapeIndex);
    public String getRectTransform(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getRectWidth(int imageIndex, int roiIndex, int shapeIndex);
    public String getRectWidth(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getRectX(int imageIndex, int roiIndex, int shapeIndex);
    public String getRectX(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getRectY(int imageIndex, int roiIndex, int shapeIndex);
    public String getRectY(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getRegionID(int imageIndex, int regionIndex);
    public String getRegionID(int imageIndex, int regionIndex, java.util.Map<String, String> __ctx);

    public String getRegionName(int imageIndex, int regionIndex);
    public String getRegionName(int imageIndex, int regionIndex, java.util.Map<String, String> __ctx);

    public String getRegionTag(int imageIndex, int regionIndex);
    public String getRegionTag(int imageIndex, int regionIndex, java.util.Map<String, String> __ctx);

    public String getRoiLinkDirection(int imageIndex, int roiIndex, int roiLinkIndex);
    public String getRoiLinkDirection(int imageIndex, int roiIndex, int roiLinkIndex, java.util.Map<String, String> __ctx);

    public String getRoiLinkName(int imageIndex, int roiIndex, int roiLinkIndex);
    public String getRoiLinkName(int imageIndex, int roiIndex, int roiLinkIndex, java.util.Map<String, String> __ctx);

    public String getRoiLinkRef(int imageIndex, int roiIndex, int roiLinkIndex);
    public String getRoiLinkRef(int imageIndex, int roiIndex, int roiLinkIndex, java.util.Map<String, String> __ctx);

    public String getScreenDescription(int screenIndex);
    public String getScreenDescription(int screenIndex, java.util.Map<String, String> __ctx);

    public String getScreenExtern(int screenIndex);
    public String getScreenExtern(int screenIndex, java.util.Map<String, String> __ctx);

    public String getScreenID(int screenIndex);
    public String getScreenID(int screenIndex, java.util.Map<String, String> __ctx);

    public String getScreenName(int screenIndex);
    public String getScreenName(int screenIndex, java.util.Map<String, String> __ctx);

    public String getScreenProtocolDescription(int screenIndex);
    public String getScreenProtocolDescription(int screenIndex, java.util.Map<String, String> __ctx);

    public String getScreenProtocolIdentifier(int screenIndex);
    public String getScreenProtocolIdentifier(int screenIndex, java.util.Map<String, String> __ctx);

    public String getScreenReagentSetDescription(int screenIndex);
    public String getScreenReagentSetDescription(int screenIndex, java.util.Map<String, String> __ctx);

    public String getScreenReagentSetIdentifier(int screenIndex);
    public String getScreenReagentSetIdentifier(int screenIndex, java.util.Map<String, String> __ctx);

    public String getScreenType(int screenIndex);
    public String getScreenType(int screenIndex, java.util.Map<String, String> __ctx);

    public String getScreenAcquisitionEndTime(int screenIndex, int screenAcquisitionIndex);
    public String getScreenAcquisitionEndTime(int screenIndex, int screenAcquisitionIndex, java.util.Map<String, String> __ctx);

    public String getScreenAcquisitionID(int screenIndex, int screenAcquisitionIndex);
    public String getScreenAcquisitionID(int screenIndex, int screenAcquisitionIndex, java.util.Map<String, String> __ctx);

    public String getScreenAcquisitionStartTime(int screenIndex, int screenAcquisitionIndex);
    public String getScreenAcquisitionStartTime(int screenIndex, int screenAcquisitionIndex, java.util.Map<String, String> __ctx);

    public String getScreenRefID(int plateIndex, int screenRefIndex);
    public String getScreenRefID(int plateIndex, int screenRefIndex, java.util.Map<String, String> __ctx);

    public String getShapeBaselineShift(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeBaselineShift(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeDirection(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeDirection(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeFillColor(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeFillColor(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeFillOpacity(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeFillOpacity(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeFillRule(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeFillRule(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeFontFamily(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeFontFamily(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public int getShapeFontSize(int imageIndex, int roiIndex, int shapeIndex);
    public int getShapeFontSize(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeFontStretch(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeFontStretch(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeFontStyle(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeFontStyle(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeFontVariant(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeFontVariant(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeFontWeight(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeFontWeight(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeG(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeG(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public int getShapeGlyphOrientationVertical(int imageIndex, int roiIndex, int shapeIndex);
    public int getShapeGlyphOrientationVertical(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeID(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeID(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public boolean getShapeLocked(int imageIndex, int roiIndex, int shapeIndex);
    public boolean getShapeLocked(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeStrokeAttribute(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeStrokeAttribute(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeStrokeColor(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeStrokeColor(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeStrokeDashArray(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeStrokeDashArray(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeStrokeLineCap(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeStrokeLineCap(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeStrokeLineJoin(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeStrokeLineJoin(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public int getShapeStrokeMiterLimit(int imageIndex, int roiIndex, int shapeIndex);
    public int getShapeStrokeMiterLimit(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public float getShapeStrokeOpacity(int imageIndex, int roiIndex, int shapeIndex);
    public float getShapeStrokeOpacity(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public int getShapeStrokeWidth(int imageIndex, int roiIndex, int shapeIndex);
    public int getShapeStrokeWidth(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeText(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeText(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeTextAnchor(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeTextAnchor(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeTextDecoration(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeTextDecoration(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeTextFill(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeTextFill(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeTextStroke(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeTextStroke(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public int getShapeTheT(int imageIndex, int roiIndex, int shapeIndex);
    public int getShapeTheT(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public int getShapeTheZ(int imageIndex, int roiIndex, int shapeIndex);
    public int getShapeTheZ(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeVectorEffect(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeVectorEffect(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public boolean getShapeVisibility(int imageIndex, int roiIndex, int shapeIndex);
    public boolean getShapeVisibility(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getShapeWritingMode(int imageIndex, int roiIndex, int shapeIndex);
    public String getShapeWritingMode(int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public String getStageLabelName(int imageIndex);
    public String getStageLabelName(int imageIndex, java.util.Map<String, String> __ctx);

    public float getStageLabelX(int imageIndex);
    public float getStageLabelX(int imageIndex, java.util.Map<String, String> __ctx);

    public float getStageLabelY(int imageIndex);
    public float getStageLabelY(int imageIndex, java.util.Map<String, String> __ctx);

    public float getStageLabelZ(int imageIndex);
    public float getStageLabelZ(int imageIndex, java.util.Map<String, String> __ctx);

    public float getStagePositionPositionX(int imageIndex, int pixelsIndex, int planeIndex);
    public float getStagePositionPositionX(int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public float getStagePositionPositionY(int imageIndex, int pixelsIndex, int planeIndex);
    public float getStagePositionPositionY(int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public float getStagePositionPositionZ(int imageIndex, int pixelsIndex, int planeIndex);
    public float getStagePositionPositionZ(int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public String getThumbnailHref(int imageIndex);
    public String getThumbnailHref(int imageIndex, java.util.Map<String, String> __ctx);

    public String getThumbnailID(int imageIndex);
    public String getThumbnailID(int imageIndex, java.util.Map<String, String> __ctx);

    public String getThumbnailMIMEtype(int imageIndex);
    public String getThumbnailMIMEtype(int imageIndex, java.util.Map<String, String> __ctx);

    public String getTiffDataFileName(int imageIndex, int pixelsIndex, int tiffDataIndex);
    public String getTiffDataFileName(int imageIndex, int pixelsIndex, int tiffDataIndex, java.util.Map<String, String> __ctx);

    public int getTiffDataFirstC(int imageIndex, int pixelsIndex, int tiffDataIndex);
    public int getTiffDataFirstC(int imageIndex, int pixelsIndex, int tiffDataIndex, java.util.Map<String, String> __ctx);

    public int getTiffDataFirstT(int imageIndex, int pixelsIndex, int tiffDataIndex);
    public int getTiffDataFirstT(int imageIndex, int pixelsIndex, int tiffDataIndex, java.util.Map<String, String> __ctx);

    public int getTiffDataFirstZ(int imageIndex, int pixelsIndex, int tiffDataIndex);
    public int getTiffDataFirstZ(int imageIndex, int pixelsIndex, int tiffDataIndex, java.util.Map<String, String> __ctx);

    public int getTiffDataIFD(int imageIndex, int pixelsIndex, int tiffDataIndex);
    public int getTiffDataIFD(int imageIndex, int pixelsIndex, int tiffDataIndex, java.util.Map<String, String> __ctx);

    public int getTiffDataNumPlanes(int imageIndex, int pixelsIndex, int tiffDataIndex);
    public int getTiffDataNumPlanes(int imageIndex, int pixelsIndex, int tiffDataIndex, java.util.Map<String, String> __ctx);

    public String getTiffDataUUID(int imageIndex, int pixelsIndex, int tiffDataIndex);
    public String getTiffDataUUID(int imageIndex, int pixelsIndex, int tiffDataIndex, java.util.Map<String, String> __ctx);

    public int getTransmittanceRangeCutIn(int instrumentIndex, int filterIndex);
    public int getTransmittanceRangeCutIn(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public int getTransmittanceRangeCutInTolerance(int instrumentIndex, int filterIndex);
    public int getTransmittanceRangeCutInTolerance(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public int getTransmittanceRangeCutOut(int instrumentIndex, int filterIndex);
    public int getTransmittanceRangeCutOut(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public int getTransmittanceRangeCutOutTolerance(int instrumentIndex, int filterIndex);
    public int getTransmittanceRangeCutOutTolerance(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public int getTransmittanceRangeTransmittance(int instrumentIndex, int filterIndex);
    public int getTransmittanceRangeTransmittance(int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public int getWellColumn(int plateIndex, int wellIndex);
    public int getWellColumn(int plateIndex, int wellIndex, java.util.Map<String, String> __ctx);

    public String getWellExternalDescription(int plateIndex, int wellIndex);
    public String getWellExternalDescription(int plateIndex, int wellIndex, java.util.Map<String, String> __ctx);

    public String getWellExternalIdentifier(int plateIndex, int wellIndex);
    public String getWellExternalIdentifier(int plateIndex, int wellIndex, java.util.Map<String, String> __ctx);

    public String getWellID(int plateIndex, int wellIndex);
    public String getWellID(int plateIndex, int wellIndex, java.util.Map<String, String> __ctx);

    public String getWellReagent(int plateIndex, int wellIndex);
    public String getWellReagent(int plateIndex, int wellIndex, java.util.Map<String, String> __ctx);

    public int getWellRow(int plateIndex, int wellIndex);
    public int getWellRow(int plateIndex, int wellIndex, java.util.Map<String, String> __ctx);

    public String getWellType(int plateIndex, int wellIndex);
    public String getWellType(int plateIndex, int wellIndex, java.util.Map<String, String> __ctx);

    public String getWellSampleID(int plateIndex, int wellIndex, int wellSampleIndex);
    public String getWellSampleID(int plateIndex, int wellIndex, int wellSampleIndex, java.util.Map<String, String> __ctx);

    public String getWellSampleImageRef(int plateIndex, int wellIndex, int wellSampleIndex);
    public String getWellSampleImageRef(int plateIndex, int wellIndex, int wellSampleIndex, java.util.Map<String, String> __ctx);

    public int getWellSampleIndex(int plateIndex, int wellIndex, int wellSampleIndex);
    public int getWellSampleIndex(int plateIndex, int wellIndex, int wellSampleIndex, java.util.Map<String, String> __ctx);

    public float getWellSamplePosX(int plateIndex, int wellIndex, int wellSampleIndex);
    public float getWellSamplePosX(int plateIndex, int wellIndex, int wellSampleIndex, java.util.Map<String, String> __ctx);

    public float getWellSamplePosY(int plateIndex, int wellIndex, int wellSampleIndex);
    public float getWellSamplePosY(int plateIndex, int wellIndex, int wellSampleIndex, java.util.Map<String, String> __ctx);

    public int getWellSampleTimepoint(int plateIndex, int wellIndex, int wellSampleIndex);
    public int getWellSampleTimepoint(int plateIndex, int wellIndex, int wellSampleIndex, java.util.Map<String, String> __ctx);

    public String getWellSampleRefID(int screenIndex, int screenAcquisitionIndex, int wellSampleRefIndex);
    public String getWellSampleRefID(int screenIndex, int screenAcquisitionIndex, int wellSampleRefIndex, java.util.Map<String, String> __ctx);

    public void createRoot();
    public void createRoot(java.util.Map<String, String> __ctx);

    public void setUUID(String uuid);
    public void setUUID(String uuid, java.util.Map<String, String> __ctx);

    public void setArcType(String type, int instrumentIndex, int lightSourceIndex);
    public void setArcType(String type, int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public void setChannelComponentColorDomain(String colorDomain, int imageIndex, int logicalChannelIndex, int channelComponentIndex);
    public void setChannelComponentColorDomain(String colorDomain, int imageIndex, int logicalChannelIndex, int channelComponentIndex, java.util.Map<String, String> __ctx);

    public void setChannelComponentIndex(int index, int imageIndex, int logicalChannelIndex, int channelComponentIndex);
    public void setChannelComponentIndex(int index, int imageIndex, int logicalChannelIndex, int channelComponentIndex, java.util.Map<String, String> __ctx);

    public void setChannelComponentPixels(String pixels, int imageIndex, int logicalChannelIndex, int channelComponentIndex);
    public void setChannelComponentPixels(String pixels, int imageIndex, int logicalChannelIndex, int channelComponentIndex, java.util.Map<String, String> __ctx);

    public void setCircleCx(String cx, int imageIndex, int roiIndex, int shapeIndex);
    public void setCircleCx(String cx, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setCircleCy(String cy, int imageIndex, int roiIndex, int shapeIndex);
    public void setCircleCy(String cy, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setCircleID(String id, int imageIndex, int roiIndex, int shapeIndex);
    public void setCircleID(String id, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setCircleR(String r, int imageIndex, int roiIndex, int shapeIndex);
    public void setCircleR(String r, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setCircleTransform(String transform, int imageIndex, int roiIndex, int shapeIndex);
    public void setCircleTransform(String transform, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setContactExperimenter(String experimenter, int groupIndex);
    public void setContactExperimenter(String experimenter, int groupIndex, java.util.Map<String, String> __ctx);

    public void setDatasetDescription(String description, int datasetIndex);
    public void setDatasetDescription(String description, int datasetIndex, java.util.Map<String, String> __ctx);

    public void setDatasetExperimenterRef(String experimenterRef, int datasetIndex);
    public void setDatasetExperimenterRef(String experimenterRef, int datasetIndex, java.util.Map<String, String> __ctx);

    public void setDatasetGroupRef(String groupRef, int datasetIndex);
    public void setDatasetGroupRef(String groupRef, int datasetIndex, java.util.Map<String, String> __ctx);

    public void setDatasetID(String id, int datasetIndex);
    public void setDatasetID(String id, int datasetIndex, java.util.Map<String, String> __ctx);

    public void setDatasetLocked(boolean locked, int datasetIndex);
    public void setDatasetLocked(boolean locked, int datasetIndex, java.util.Map<String, String> __ctx);

    public void setDatasetName(String name, int datasetIndex);
    public void setDatasetName(String name, int datasetIndex, java.util.Map<String, String> __ctx);

    public void setDatasetRefID(String id, int imageIndex, int datasetRefIndex);
    public void setDatasetRefID(String id, int imageIndex, int datasetRefIndex, java.util.Map<String, String> __ctx);

    public void setDetectorAmplificationGain(float amplificationGain, int instrumentIndex, int detectorIndex);
    public void setDetectorAmplificationGain(float amplificationGain, int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public void setDetectorGain(float gain, int instrumentIndex, int detectorIndex);
    public void setDetectorGain(float gain, int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public void setDetectorID(String id, int instrumentIndex, int detectorIndex);
    public void setDetectorID(String id, int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public void setDetectorManufacturer(String manufacturer, int instrumentIndex, int detectorIndex);
    public void setDetectorManufacturer(String manufacturer, int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public void setDetectorModel(String model, int instrumentIndex, int detectorIndex);
    public void setDetectorModel(String model, int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public void setDetectorOffset(float offset, int instrumentIndex, int detectorIndex);
    public void setDetectorOffset(float offset, int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public void setDetectorSerialNumber(String serialNumber, int instrumentIndex, int detectorIndex);
    public void setDetectorSerialNumber(String serialNumber, int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public void setDetectorType(String type, int instrumentIndex, int detectorIndex);
    public void setDetectorType(String type, int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public void setDetectorVoltage(float voltage, int instrumentIndex, int detectorIndex);
    public void setDetectorVoltage(float voltage, int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public void setDetectorZoom(float zoom, int instrumentIndex, int detectorIndex);
    public void setDetectorZoom(float zoom, int instrumentIndex, int detectorIndex, java.util.Map<String, String> __ctx);

    public void setDetectorSettingsBinning(String binning, int imageIndex, int logicalChannelIndex);
    public void setDetectorSettingsBinning(String binning, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setDetectorSettingsDetector(String detector, int imageIndex, int logicalChannelIndex);
    public void setDetectorSettingsDetector(String detector, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setDetectorSettingsGain(float gain, int imageIndex, int logicalChannelIndex);
    public void setDetectorSettingsGain(float gain, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setDetectorSettingsOffset(float offset, int imageIndex, int logicalChannelIndex);
    public void setDetectorSettingsOffset(float offset, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setDetectorSettingsReadOutRate(float readOutRate, int imageIndex, int logicalChannelIndex);
    public void setDetectorSettingsReadOutRate(float readOutRate, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setDetectorSettingsVoltage(float voltage, int imageIndex, int logicalChannelIndex);
    public void setDetectorSettingsVoltage(float voltage, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setDichroicID(String id, int instrumentIndex, int dichroicIndex);
    public void setDichroicID(String id, int instrumentIndex, int dichroicIndex, java.util.Map<String, String> __ctx);

    public void setDichroicLotNumber(String lotNumber, int instrumentIndex, int dichroicIndex);
    public void setDichroicLotNumber(String lotNumber, int instrumentIndex, int dichroicIndex, java.util.Map<String, String> __ctx);

    public void setDichroicManufacturer(String manufacturer, int instrumentIndex, int dichroicIndex);
    public void setDichroicManufacturer(String manufacturer, int instrumentIndex, int dichroicIndex, java.util.Map<String, String> __ctx);

    public void setDichroicModel(String model, int instrumentIndex, int dichroicIndex);
    public void setDichroicModel(String model, int instrumentIndex, int dichroicIndex, java.util.Map<String, String> __ctx);

    public void setDimensionsPhysicalSizeX(float physicalSizeX, int imageIndex, int pixelsIndex);
    public void setDimensionsPhysicalSizeX(float physicalSizeX, int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public void setDimensionsPhysicalSizeY(float physicalSizeY, int imageIndex, int pixelsIndex);
    public void setDimensionsPhysicalSizeY(float physicalSizeY, int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public void setDimensionsPhysicalSizeZ(float physicalSizeZ, int imageIndex, int pixelsIndex);
    public void setDimensionsPhysicalSizeZ(float physicalSizeZ, int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public void setDimensionsTimeIncrement(float timeIncrement, int imageIndex, int pixelsIndex);
    public void setDimensionsTimeIncrement(float timeIncrement, int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public void setDimensionsWaveIncrement(int waveIncrement, int imageIndex, int pixelsIndex);
    public void setDimensionsWaveIncrement(int waveIncrement, int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public void setDimensionsWaveStart(int waveStart, int imageIndex, int pixelsIndex);
    public void setDimensionsWaveStart(int waveStart, int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public void setDisplayOptionsDisplay(String display, int imageIndex);
    public void setDisplayOptionsDisplay(String display, int imageIndex, java.util.Map<String, String> __ctx);

    public void setDisplayOptionsID(String id, int imageIndex);
    public void setDisplayOptionsID(String id, int imageIndex, java.util.Map<String, String> __ctx);

    public void setDisplayOptionsZoom(float zoom, int imageIndex);
    public void setDisplayOptionsZoom(float zoom, int imageIndex, java.util.Map<String, String> __ctx);

    public void setEllipseCx(String cx, int imageIndex, int roiIndex, int shapeIndex);
    public void setEllipseCx(String cx, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setEllipseCy(String cy, int imageIndex, int roiIndex, int shapeIndex);
    public void setEllipseCy(String cy, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setEllipseID(String id, int imageIndex, int roiIndex, int shapeIndex);
    public void setEllipseID(String id, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setEllipseRx(String rx, int imageIndex, int roiIndex, int shapeIndex);
    public void setEllipseRx(String rx, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setEllipseRy(String ry, int imageIndex, int roiIndex, int shapeIndex);
    public void setEllipseRy(String ry, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setEllipseTransform(String transform, int imageIndex, int roiIndex, int shapeIndex);
    public void setEllipseTransform(String transform, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setEmFilterLotNumber(String lotNumber, int instrumentIndex, int filterIndex);
    public void setEmFilterLotNumber(String lotNumber, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setEmFilterManufacturer(String manufacturer, int instrumentIndex, int filterIndex);
    public void setEmFilterManufacturer(String manufacturer, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setEmFilterModel(String model, int instrumentIndex, int filterIndex);
    public void setEmFilterModel(String model, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setEmFilterType(String type, int instrumentIndex, int filterIndex);
    public void setEmFilterType(String type, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setExFilterLotNumber(String lotNumber, int instrumentIndex, int filterIndex);
    public void setExFilterLotNumber(String lotNumber, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setExFilterManufacturer(String manufacturer, int instrumentIndex, int filterIndex);
    public void setExFilterManufacturer(String manufacturer, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setExFilterModel(String model, int instrumentIndex, int filterIndex);
    public void setExFilterModel(String model, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setExFilterType(String type, int instrumentIndex, int filterIndex);
    public void setExFilterType(String type, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setExperimentDescription(String description, int experimentIndex);
    public void setExperimentDescription(String description, int experimentIndex, java.util.Map<String, String> __ctx);

    public void setExperimentExperimenterRef(String experimenterRef, int experimentIndex);
    public void setExperimentExperimenterRef(String experimenterRef, int experimentIndex, java.util.Map<String, String> __ctx);

    public void setExperimentID(String id, int experimentIndex);
    public void setExperimentID(String id, int experimentIndex, java.util.Map<String, String> __ctx);

    public void setExperimentType(String type, int experimentIndex);
    public void setExperimentType(String type, int experimentIndex, java.util.Map<String, String> __ctx);

    public void setExperimenterEmail(String email, int experimenterIndex);
    public void setExperimenterEmail(String email, int experimenterIndex, java.util.Map<String, String> __ctx);

    public void setExperimenterFirstName(String firstName, int experimenterIndex);
    public void setExperimenterFirstName(String firstName, int experimenterIndex, java.util.Map<String, String> __ctx);

    public void setExperimenterID(String id, int experimenterIndex);
    public void setExperimenterID(String id, int experimenterIndex, java.util.Map<String, String> __ctx);

    public void setExperimenterInstitution(String institution, int experimenterIndex);
    public void setExperimenterInstitution(String institution, int experimenterIndex, java.util.Map<String, String> __ctx);

    public void setExperimenterLastName(String lastName, int experimenterIndex);
    public void setExperimenterLastName(String lastName, int experimenterIndex, java.util.Map<String, String> __ctx);

    public void setExperimenterOMEName(String omeName, int experimenterIndex);
    public void setExperimenterOMEName(String omeName, int experimenterIndex, java.util.Map<String, String> __ctx);

    public void setExperimenterMembershipGroup(String group, int experimenterIndex, int groupRefIndex);
    public void setExperimenterMembershipGroup(String group, int experimenterIndex, int groupRefIndex, java.util.Map<String, String> __ctx);

    public void setFilamentType(String type, int instrumentIndex, int lightSourceIndex);
    public void setFilamentType(String type, int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public void setFilterFilterWheel(String filterWheel, int instrumentIndex, int filterIndex);
    public void setFilterFilterWheel(String filterWheel, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setFilterID(String id, int instrumentIndex, int filterIndex);
    public void setFilterID(String id, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setFilterLotNumber(String lotNumber, int instrumentIndex, int filterIndex);
    public void setFilterLotNumber(String lotNumber, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setFilterManufacturer(String manufacturer, int instrumentIndex, int filterIndex);
    public void setFilterManufacturer(String manufacturer, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setFilterModel(String model, int instrumentIndex, int filterIndex);
    public void setFilterModel(String model, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setFilterType(String type, int instrumentIndex, int filterIndex);
    public void setFilterType(String type, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setFilterSetDichroic(String dichroic, int instrumentIndex, int filterSetIndex);
    public void setFilterSetDichroic(String dichroic, int instrumentIndex, int filterSetIndex, java.util.Map<String, String> __ctx);

    public void setFilterSetEmFilter(String emFilter, int instrumentIndex, int filterSetIndex);
    public void setFilterSetEmFilter(String emFilter, int instrumentIndex, int filterSetIndex, java.util.Map<String, String> __ctx);

    public void setFilterSetExFilter(String exFilter, int instrumentIndex, int filterSetIndex);
    public void setFilterSetExFilter(String exFilter, int instrumentIndex, int filterSetIndex, java.util.Map<String, String> __ctx);

    public void setFilterSetID(String id, int instrumentIndex, int filterSetIndex);
    public void setFilterSetID(String id, int instrumentIndex, int filterSetIndex, java.util.Map<String, String> __ctx);

    public void setFilterSetLotNumber(String lotNumber, int instrumentIndex, int filterSetIndex);
    public void setFilterSetLotNumber(String lotNumber, int instrumentIndex, int filterSetIndex, java.util.Map<String, String> __ctx);

    public void setFilterSetManufacturer(String manufacturer, int instrumentIndex, int filterSetIndex);
    public void setFilterSetManufacturer(String manufacturer, int instrumentIndex, int filterSetIndex, java.util.Map<String, String> __ctx);

    public void setFilterSetModel(String model, int instrumentIndex, int filterSetIndex);
    public void setFilterSetModel(String model, int instrumentIndex, int filterSetIndex, java.util.Map<String, String> __ctx);

    public void setGroupID(String id, int groupIndex);
    public void setGroupID(String id, int groupIndex, java.util.Map<String, String> __ctx);

    public void setGroupName(String name, int groupIndex);
    public void setGroupName(String name, int groupIndex, java.util.Map<String, String> __ctx);

    public void setImageAcquiredPixels(String acquiredPixels, int imageIndex);
    public void setImageAcquiredPixels(String acquiredPixels, int imageIndex, java.util.Map<String, String> __ctx);

    public void setImageCreationDate(String creationDate, int imageIndex);
    public void setImageCreationDate(String creationDate, int imageIndex, java.util.Map<String, String> __ctx);

    public void setImageDefaultPixels(String defaultPixels, int imageIndex);
    public void setImageDefaultPixels(String defaultPixels, int imageIndex, java.util.Map<String, String> __ctx);

    public void setImageDescription(String description, int imageIndex);
    public void setImageDescription(String description, int imageIndex, java.util.Map<String, String> __ctx);

    public void setImageExperimentRef(String experimentRef, int imageIndex);
    public void setImageExperimentRef(String experimentRef, int imageIndex, java.util.Map<String, String> __ctx);

    public void setImageExperimenterRef(String experimenterRef, int imageIndex);
    public void setImageExperimenterRef(String experimenterRef, int imageIndex, java.util.Map<String, String> __ctx);

    public void setImageGroupRef(String groupRef, int imageIndex);
    public void setImageGroupRef(String groupRef, int imageIndex, java.util.Map<String, String> __ctx);

    public void setImageID(String id, int imageIndex);
    public void setImageID(String id, int imageIndex, java.util.Map<String, String> __ctx);

    public void setImageInstrumentRef(String instrumentRef, int imageIndex);
    public void setImageInstrumentRef(String instrumentRef, int imageIndex, java.util.Map<String, String> __ctx);

    public void setImageName(String name, int imageIndex);
    public void setImageName(String name, int imageIndex, java.util.Map<String, String> __ctx);

    public void setImagingEnvironmentAirPressure(float airPressure, int imageIndex);
    public void setImagingEnvironmentAirPressure(float airPressure, int imageIndex, java.util.Map<String, String> __ctx);

    public void setImagingEnvironmentCO2Percent(float cO2Percent, int imageIndex);
    public void setImagingEnvironmentCO2Percent(float cO2Percent, int imageIndex, java.util.Map<String, String> __ctx);

    public void setImagingEnvironmentHumidity(float humidity, int imageIndex);
    public void setImagingEnvironmentHumidity(float humidity, int imageIndex, java.util.Map<String, String> __ctx);

    public void setImagingEnvironmentTemperature(float temperature, int imageIndex);
    public void setImagingEnvironmentTemperature(float temperature, int imageIndex, java.util.Map<String, String> __ctx);

    public void setInstrumentID(String id, int instrumentIndex);
    public void setInstrumentID(String id, int instrumentIndex, java.util.Map<String, String> __ctx);

    public void setLaserFrequencyMultiplication(int frequencyMultiplication, int instrumentIndex, int lightSourceIndex);
    public void setLaserFrequencyMultiplication(int frequencyMultiplication, int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public void setLaserLaserMedium(String laserMedium, int instrumentIndex, int lightSourceIndex);
    public void setLaserLaserMedium(String laserMedium, int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public void setLaserPockelCell(boolean pockelCell, int instrumentIndex, int lightSourceIndex);
    public void setLaserPockelCell(boolean pockelCell, int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public void setLaserPulse(String pulse, int instrumentIndex, int lightSourceIndex);
    public void setLaserPulse(String pulse, int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public void setLaserRepetitionRate(boolean repetitionRate, int instrumentIndex, int lightSourceIndex);
    public void setLaserRepetitionRate(boolean repetitionRate, int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public void setLaserTuneable(boolean tuneable, int instrumentIndex, int lightSourceIndex);
    public void setLaserTuneable(boolean tuneable, int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public void setLaserType(String type, int instrumentIndex, int lightSourceIndex);
    public void setLaserType(String type, int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public void setLaserWavelength(int wavelength, int instrumentIndex, int lightSourceIndex);
    public void setLaserWavelength(int wavelength, int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public void setLightSourceID(String id, int instrumentIndex, int lightSourceIndex);
    public void setLightSourceID(String id, int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public void setLightSourceManufacturer(String manufacturer, int instrumentIndex, int lightSourceIndex);
    public void setLightSourceManufacturer(String manufacturer, int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public void setLightSourceModel(String model, int instrumentIndex, int lightSourceIndex);
    public void setLightSourceModel(String model, int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public void setLightSourcePower(float power, int instrumentIndex, int lightSourceIndex);
    public void setLightSourcePower(float power, int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public void setLightSourceSerialNumber(String serialNumber, int instrumentIndex, int lightSourceIndex);
    public void setLightSourceSerialNumber(String serialNumber, int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public void setLightSourceRefAttenuation(float attenuation, int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex);
    public void setLightSourceRefAttenuation(float attenuation, int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex, java.util.Map<String, String> __ctx);

    public void setLightSourceRefLightSource(String lightSource, int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex);
    public void setLightSourceRefLightSource(String lightSource, int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex, java.util.Map<String, String> __ctx);

    public void setLightSourceRefWavelength(int wavelength, int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex);
    public void setLightSourceRefWavelength(int wavelength, int imageIndex, int microbeamManipulationIndex, int lightSourceRefIndex, java.util.Map<String, String> __ctx);

    public void setLightSourceSettingsAttenuation(float attenuation, int imageIndex, int logicalChannelIndex);
    public void setLightSourceSettingsAttenuation(float attenuation, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLightSourceSettingsLightSource(String lightSource, int imageIndex, int logicalChannelIndex);
    public void setLightSourceSettingsLightSource(String lightSource, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLightSourceSettingsWavelength(int wavelength, int imageIndex, int logicalChannelIndex);
    public void setLightSourceSettingsWavelength(int wavelength, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLineID(String id, int imageIndex, int roiIndex, int shapeIndex);
    public void setLineID(String id, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setLineTransform(String transform, int imageIndex, int roiIndex, int shapeIndex);
    public void setLineTransform(String transform, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setLineX1(String x1, int imageIndex, int roiIndex, int shapeIndex);
    public void setLineX1(String x1, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setLineX2(String x2, int imageIndex, int roiIndex, int shapeIndex);
    public void setLineX2(String x2, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setLineY1(String y1, int imageIndex, int roiIndex, int shapeIndex);
    public void setLineY1(String y1, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setLineY2(String y2, int imageIndex, int roiIndex, int shapeIndex);
    public void setLineY2(String y2, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelContrastMethod(String contrastMethod, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelContrastMethod(String contrastMethod, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelDetector(String detector, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelDetector(String detector, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelEmWave(int emWave, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelEmWave(int emWave, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelExWave(int exWave, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelExWave(int exWave, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelFilterSet(String filterSet, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelFilterSet(String filterSet, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelFluor(String fluor, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelFluor(String fluor, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelID(String id, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelID(String id, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelIlluminationType(String illuminationType, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelIlluminationType(String illuminationType, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelLightSource(String lightSource, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelLightSource(String lightSource, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelMode(String mode, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelMode(String mode, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelName(String name, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelName(String name, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelNdFilter(float ndFilter, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelNdFilter(float ndFilter, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelOTF(String otf, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelOTF(String otf, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelPhotometricInterpretation(String photometricInterpretation, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelPhotometricInterpretation(String photometricInterpretation, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelPinholeSize(float pinholeSize, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelPinholeSize(float pinholeSize, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelPockelCellSetting(int pockelCellSetting, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelPockelCellSetting(int pockelCellSetting, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelSamplesPerPixel(int samplesPerPixel, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelSamplesPerPixel(int samplesPerPixel, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelSecondaryEmissionFilter(String secondaryEmissionFilter, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelSecondaryEmissionFilter(String secondaryEmissionFilter, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setLogicalChannelSecondaryExcitationFilter(String secondaryExcitationFilter, int imageIndex, int logicalChannelIndex);
    public void setLogicalChannelSecondaryExcitationFilter(String secondaryExcitationFilter, int imageIndex, int logicalChannelIndex, java.util.Map<String, String> __ctx);

    public void setMaskHeight(String height, int imageIndex, int roiIndex, int shapeIndex);
    public void setMaskHeight(String height, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setMaskID(String id, int imageIndex, int roiIndex, int shapeIndex);
    public void setMaskID(String id, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setMaskTransform(String transform, int imageIndex, int roiIndex, int shapeIndex);
    public void setMaskTransform(String transform, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setMaskWidth(String width, int imageIndex, int roiIndex, int shapeIndex);
    public void setMaskWidth(String width, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setMaskX(String x, int imageIndex, int roiIndex, int shapeIndex);
    public void setMaskX(String x, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setMaskY(String y, int imageIndex, int roiIndex, int shapeIndex);
    public void setMaskY(String y, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setMaskPixelsBigEndian(boolean bigEndian, int imageIndex, int roiIndex, int shapeIndex);
    public void setMaskPixelsBigEndian(boolean bigEndian, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setMaskPixelsBinData(byte[] binData, int imageIndex, int roiIndex, int shapeIndex);
    public void setMaskPixelsBinData(byte[] binData, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setMaskPixelsExtendedPixelType(String extendedPixelType, int imageIndex, int roiIndex, int shapeIndex);
    public void setMaskPixelsExtendedPixelType(String extendedPixelType, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setMaskPixelsID(String id, int imageIndex, int roiIndex, int shapeIndex);
    public void setMaskPixelsID(String id, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setMaskPixelsSizeX(int sizeX, int imageIndex, int roiIndex, int shapeIndex);
    public void setMaskPixelsSizeX(int sizeX, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setMaskPixelsSizeY(int sizeY, int imageIndex, int roiIndex, int shapeIndex);
    public void setMaskPixelsSizeY(int sizeY, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setMicrobeamManipulationExperimenterRef(String experimenterRef, int imageIndex, int microbeamManipulationIndex);
    public void setMicrobeamManipulationExperimenterRef(String experimenterRef, int imageIndex, int microbeamManipulationIndex, java.util.Map<String, String> __ctx);

    public void setMicrobeamManipulationID(String id, int imageIndex, int microbeamManipulationIndex);
    public void setMicrobeamManipulationID(String id, int imageIndex, int microbeamManipulationIndex, java.util.Map<String, String> __ctx);

    public void setMicrobeamManipulationType(String type, int imageIndex, int microbeamManipulationIndex);
    public void setMicrobeamManipulationType(String type, int imageIndex, int microbeamManipulationIndex, java.util.Map<String, String> __ctx);

    public void setMicrobeamManipulationRefID(String id, int experimentIndex, int microbeamManipulationRefIndex);
    public void setMicrobeamManipulationRefID(String id, int experimentIndex, int microbeamManipulationRefIndex, java.util.Map<String, String> __ctx);

    public void setMicroscopeID(String id, int instrumentIndex);
    public void setMicroscopeID(String id, int instrumentIndex, java.util.Map<String, String> __ctx);

    public void setMicroscopeManufacturer(String manufacturer, int instrumentIndex);
    public void setMicroscopeManufacturer(String manufacturer, int instrumentIndex, java.util.Map<String, String> __ctx);

    public void setMicroscopeModel(String model, int instrumentIndex);
    public void setMicroscopeModel(String model, int instrumentIndex, java.util.Map<String, String> __ctx);

    public void setMicroscopeSerialNumber(String serialNumber, int instrumentIndex);
    public void setMicroscopeSerialNumber(String serialNumber, int instrumentIndex, java.util.Map<String, String> __ctx);

    public void setMicroscopeType(String type, int instrumentIndex);
    public void setMicroscopeType(String type, int instrumentIndex, java.util.Map<String, String> __ctx);

    public void setOTFBinaryFile(String binaryFile, int instrumentIndex, int otfIndex);
    public void setOTFBinaryFile(String binaryFile, int instrumentIndex, int otfIndex, java.util.Map<String, String> __ctx);

    public void setOTFID(String id, int instrumentIndex, int otfIndex);
    public void setOTFID(String id, int instrumentIndex, int otfIndex, java.util.Map<String, String> __ctx);

    public void setOTFObjective(String objective, int instrumentIndex, int otfIndex);
    public void setOTFObjective(String objective, int instrumentIndex, int otfIndex, java.util.Map<String, String> __ctx);

    public void setOTFOpticalAxisAveraged(boolean opticalAxisAveraged, int instrumentIndex, int otfIndex);
    public void setOTFOpticalAxisAveraged(boolean opticalAxisAveraged, int instrumentIndex, int otfIndex, java.util.Map<String, String> __ctx);

    public void setOTFPixelType(String pixelType, int instrumentIndex, int otfIndex);
    public void setOTFPixelType(String pixelType, int instrumentIndex, int otfIndex, java.util.Map<String, String> __ctx);

    public void setOTFSizeX(int sizeX, int instrumentIndex, int otfIndex);
    public void setOTFSizeX(int sizeX, int instrumentIndex, int otfIndex, java.util.Map<String, String> __ctx);

    public void setOTFSizeY(int sizeY, int instrumentIndex, int otfIndex);
    public void setOTFSizeY(int sizeY, int instrumentIndex, int otfIndex, java.util.Map<String, String> __ctx);

    public void setObjectiveCalibratedMagnification(float calibratedMagnification, int instrumentIndex, int objectiveIndex);
    public void setObjectiveCalibratedMagnification(float calibratedMagnification, int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public void setObjectiveCorrection(String correction, int instrumentIndex, int objectiveIndex);
    public void setObjectiveCorrection(String correction, int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public void setObjectiveID(String id, int instrumentIndex, int objectiveIndex);
    public void setObjectiveID(String id, int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public void setObjectiveImmersion(String immersion, int instrumentIndex, int objectiveIndex);
    public void setObjectiveImmersion(String immersion, int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public void setObjectiveIris(boolean iris, int instrumentIndex, int objectiveIndex);
    public void setObjectiveIris(boolean iris, int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public void setObjectiveLensNA(float lensNA, int instrumentIndex, int objectiveIndex);
    public void setObjectiveLensNA(float lensNA, int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public void setObjectiveManufacturer(String manufacturer, int instrumentIndex, int objectiveIndex);
    public void setObjectiveManufacturer(String manufacturer, int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public void setObjectiveModel(String model, int instrumentIndex, int objectiveIndex);
    public void setObjectiveModel(String model, int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public void setObjectiveNominalMagnification(int nominalMagnification, int instrumentIndex, int objectiveIndex);
    public void setObjectiveNominalMagnification(int nominalMagnification, int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public void setObjectiveSerialNumber(String serialNumber, int instrumentIndex, int objectiveIndex);
    public void setObjectiveSerialNumber(String serialNumber, int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public void setObjectiveWorkingDistance(float workingDistance, int instrumentIndex, int objectiveIndex);
    public void setObjectiveWorkingDistance(float workingDistance, int instrumentIndex, int objectiveIndex, java.util.Map<String, String> __ctx);

    public void setObjectiveSettingsCorrectionCollar(float correctionCollar, int imageIndex);
    public void setObjectiveSettingsCorrectionCollar(float correctionCollar, int imageIndex, java.util.Map<String, String> __ctx);

    public void setObjectiveSettingsMedium(String medium, int imageIndex);
    public void setObjectiveSettingsMedium(String medium, int imageIndex, java.util.Map<String, String> __ctx);

    public void setObjectiveSettingsObjective(String objective, int imageIndex);
    public void setObjectiveSettingsObjective(String objective, int imageIndex, java.util.Map<String, String> __ctx);

    public void setObjectiveSettingsRefractiveIndex(float refractiveIndex, int imageIndex);
    public void setObjectiveSettingsRefractiveIndex(float refractiveIndex, int imageIndex, java.util.Map<String, String> __ctx);

    public void setPathD(String d, int imageIndex, int roiIndex, int shapeIndex);
    public void setPathD(String d, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setPathID(String id, int imageIndex, int roiIndex, int shapeIndex);
    public void setPathID(String id, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setPixelsBigEndian(boolean bigEndian, int imageIndex, int pixelsIndex);
    public void setPixelsBigEndian(boolean bigEndian, int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public void setPixelsDimensionOrder(String dimensionOrder, int imageIndex, int pixelsIndex);
    public void setPixelsDimensionOrder(String dimensionOrder, int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public void setPixelsID(String id, int imageIndex, int pixelsIndex);
    public void setPixelsID(String id, int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public void setPixelsPixelType(String pixelType, int imageIndex, int pixelsIndex);
    public void setPixelsPixelType(String pixelType, int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public void setPixelsSizeC(int sizeC, int imageIndex, int pixelsIndex);
    public void setPixelsSizeC(int sizeC, int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public void setPixelsSizeT(int sizeT, int imageIndex, int pixelsIndex);
    public void setPixelsSizeT(int sizeT, int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public void setPixelsSizeX(int sizeX, int imageIndex, int pixelsIndex);
    public void setPixelsSizeX(int sizeX, int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public void setPixelsSizeY(int sizeY, int imageIndex, int pixelsIndex);
    public void setPixelsSizeY(int sizeY, int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public void setPixelsSizeZ(int sizeZ, int imageIndex, int pixelsIndex);
    public void setPixelsSizeZ(int sizeZ, int imageIndex, int pixelsIndex, java.util.Map<String, String> __ctx);

    public void setPlaneHashSHA1(String hashSHA1, int imageIndex, int pixelsIndex, int planeIndex);
    public void setPlaneHashSHA1(String hashSHA1, int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public void setPlaneID(String id, int imageIndex, int pixelsIndex, int planeIndex);
    public void setPlaneID(String id, int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public void setPlaneTheC(int theC, int imageIndex, int pixelsIndex, int planeIndex);
    public void setPlaneTheC(int theC, int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public void setPlaneTheT(int theT, int imageIndex, int pixelsIndex, int planeIndex);
    public void setPlaneTheT(int theT, int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public void setPlaneTheZ(int theZ, int imageIndex, int pixelsIndex, int planeIndex);
    public void setPlaneTheZ(int theZ, int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public void setPlaneTimingDeltaT(float deltaT, int imageIndex, int pixelsIndex, int planeIndex);
    public void setPlaneTimingDeltaT(float deltaT, int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public void setPlaneTimingExposureTime(float exposureTime, int imageIndex, int pixelsIndex, int planeIndex);
    public void setPlaneTimingExposureTime(float exposureTime, int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public void setPlateColumnNamingConvention(String columnNamingConvention, int plateIndex);
    public void setPlateColumnNamingConvention(String columnNamingConvention, int plateIndex, java.util.Map<String, String> __ctx);

    public void setPlateDescription(String description, int plateIndex);
    public void setPlateDescription(String description, int plateIndex, java.util.Map<String, String> __ctx);

    public void setPlateExternalIdentifier(String externalIdentifier, int plateIndex);
    public void setPlateExternalIdentifier(String externalIdentifier, int plateIndex, java.util.Map<String, String> __ctx);

    public void setPlateID(String id, int plateIndex);
    public void setPlateID(String id, int plateIndex, java.util.Map<String, String> __ctx);

    public void setPlateName(String name, int plateIndex);
    public void setPlateName(String name, int plateIndex, java.util.Map<String, String> __ctx);

    public void setPlateRowNamingConvention(String rowNamingConvention, int plateIndex);
    public void setPlateRowNamingConvention(String rowNamingConvention, int plateIndex, java.util.Map<String, String> __ctx);

    public void setPlateStatus(String status, int plateIndex);
    public void setPlateStatus(String status, int plateIndex, java.util.Map<String, String> __ctx);

    public void setPlateWellOriginX(double wellOriginX, int plateIndex);
    public void setPlateWellOriginX(double wellOriginX, int plateIndex, java.util.Map<String, String> __ctx);

    public void setPlateWellOriginY(double wellOriginY, int plateIndex);
    public void setPlateWellOriginY(double wellOriginY, int plateIndex, java.util.Map<String, String> __ctx);

    public void setPlateRefID(String id, int screenIndex, int plateRefIndex);
    public void setPlateRefID(String id, int screenIndex, int plateRefIndex, java.util.Map<String, String> __ctx);

    public void setPlateRefSample(int sample, int screenIndex, int plateRefIndex);
    public void setPlateRefSample(int sample, int screenIndex, int plateRefIndex, java.util.Map<String, String> __ctx);

    public void setPlateRefWell(String well, int screenIndex, int plateRefIndex);
    public void setPlateRefWell(String well, int screenIndex, int plateRefIndex, java.util.Map<String, String> __ctx);

    public void setPointCx(String cx, int imageIndex, int roiIndex, int shapeIndex);
    public void setPointCx(String cx, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setPointCy(String cy, int imageIndex, int roiIndex, int shapeIndex);
    public void setPointCy(String cy, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setPointID(String id, int imageIndex, int roiIndex, int shapeIndex);
    public void setPointID(String id, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setPointR(String r, int imageIndex, int roiIndex, int shapeIndex);
    public void setPointR(String r, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setPointTransform(String transform, int imageIndex, int roiIndex, int shapeIndex);
    public void setPointTransform(String transform, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setPolygonID(String id, int imageIndex, int roiIndex, int shapeIndex);
    public void setPolygonID(String id, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setPolygonPoints(String points, int imageIndex, int roiIndex, int shapeIndex);
    public void setPolygonPoints(String points, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setPolygonTransform(String transform, int imageIndex, int roiIndex, int shapeIndex);
    public void setPolygonTransform(String transform, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setPolylineID(String id, int imageIndex, int roiIndex, int shapeIndex);
    public void setPolylineID(String id, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setPolylinePoints(String points, int imageIndex, int roiIndex, int shapeIndex);
    public void setPolylinePoints(String points, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setPolylineTransform(String transform, int imageIndex, int roiIndex, int shapeIndex);
    public void setPolylineTransform(String transform, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setProjectDescription(String description, int projectIndex);
    public void setProjectDescription(String description, int projectIndex, java.util.Map<String, String> __ctx);

    public void setProjectExperimenterRef(String experimenterRef, int projectIndex);
    public void setProjectExperimenterRef(String experimenterRef, int projectIndex, java.util.Map<String, String> __ctx);

    public void setProjectGroupRef(String groupRef, int projectIndex);
    public void setProjectGroupRef(String groupRef, int projectIndex, java.util.Map<String, String> __ctx);

    public void setProjectID(String id, int projectIndex);
    public void setProjectID(String id, int projectIndex, java.util.Map<String, String> __ctx);

    public void setProjectName(String name, int projectIndex);
    public void setProjectName(String name, int projectIndex, java.util.Map<String, String> __ctx);

    public void setProjectRefID(String id, int datasetIndex, int projectRefIndex);
    public void setProjectRefID(String id, int datasetIndex, int projectRefIndex, java.util.Map<String, String> __ctx);

    public void setPumpLightSource(String lightSource, int instrumentIndex, int lightSourceIndex);
    public void setPumpLightSource(String lightSource, int instrumentIndex, int lightSourceIndex, java.util.Map<String, String> __ctx);

    public void setROIID(String id, int imageIndex, int roiIndex);
    public void setROIID(String id, int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public void setROIT0(int t0, int imageIndex, int roiIndex);
    public void setROIT0(int t0, int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public void setROIT1(int t1, int imageIndex, int roiIndex);
    public void setROIT1(int t1, int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public void setROIX0(int x0, int imageIndex, int roiIndex);
    public void setROIX0(int x0, int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public void setROIX1(int x1, int imageIndex, int roiIndex);
    public void setROIX1(int x1, int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public void setROIY0(int y0, int imageIndex, int roiIndex);
    public void setROIY0(int y0, int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public void setROIY1(int y1, int imageIndex, int roiIndex);
    public void setROIY1(int y1, int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public void setROIZ0(int z0, int imageIndex, int roiIndex);
    public void setROIZ0(int z0, int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public void setROIZ1(int z1, int imageIndex, int roiIndex);
    public void setROIZ1(int z1, int imageIndex, int roiIndex, java.util.Map<String, String> __ctx);

    public void setROIRefID(String id, int imageIndex, int microbeamManipulationIndex, int roiRefIndex);
    public void setROIRefID(String id, int imageIndex, int microbeamManipulationIndex, int roiRefIndex, java.util.Map<String, String> __ctx);

    public void setReagentDescription(String description, int screenIndex, int reagentIndex);
    public void setReagentDescription(String description, int screenIndex, int reagentIndex, java.util.Map<String, String> __ctx);

    public void setReagentID(String id, int screenIndex, int reagentIndex);
    public void setReagentID(String id, int screenIndex, int reagentIndex, java.util.Map<String, String> __ctx);

    public void setReagentName(String name, int screenIndex, int reagentIndex);
    public void setReagentName(String name, int screenIndex, int reagentIndex, java.util.Map<String, String> __ctx);

    public void setReagentReagentIdentifier(String reagentIdentifier, int screenIndex, int reagentIndex);
    public void setReagentReagentIdentifier(String reagentIdentifier, int screenIndex, int reagentIndex, java.util.Map<String, String> __ctx);

    public void setRectHeight(String height, int imageIndex, int roiIndex, int shapeIndex);
    public void setRectHeight(String height, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setRectID(String id, int imageIndex, int roiIndex, int shapeIndex);
    public void setRectID(String id, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setRectTransform(String transform, int imageIndex, int roiIndex, int shapeIndex);
    public void setRectTransform(String transform, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setRectWidth(String width, int imageIndex, int roiIndex, int shapeIndex);
    public void setRectWidth(String width, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setRectX(String x, int imageIndex, int roiIndex, int shapeIndex);
    public void setRectX(String x, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setRectY(String y, int imageIndex, int roiIndex, int shapeIndex);
    public void setRectY(String y, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setRegionID(String id, int imageIndex, int regionIndex);
    public void setRegionID(String id, int imageIndex, int regionIndex, java.util.Map<String, String> __ctx);

    public void setRegionName(String name, int imageIndex, int regionIndex);
    public void setRegionName(String name, int imageIndex, int regionIndex, java.util.Map<String, String> __ctx);

    public void setRegionTag(String tag, int imageIndex, int regionIndex);
    public void setRegionTag(String tag, int imageIndex, int regionIndex, java.util.Map<String, String> __ctx);

    public void setRoiLinkDirection(String direction, int imageIndex, int roiIndex, int roiLinkIndex);
    public void setRoiLinkDirection(String direction, int imageIndex, int roiIndex, int roiLinkIndex, java.util.Map<String, String> __ctx);

    public void setRoiLinkName(String name, int imageIndex, int roiIndex, int roiLinkIndex);
    public void setRoiLinkName(String name, int imageIndex, int roiIndex, int roiLinkIndex, java.util.Map<String, String> __ctx);

    public void setRoiLinkRef(String ref, int imageIndex, int roiIndex, int roiLinkIndex);
    public void setRoiLinkRef(String ref, int imageIndex, int roiIndex, int roiLinkIndex, java.util.Map<String, String> __ctx);

    public void setScreenDescription(String description, int screenIndex);
    public void setScreenDescription(String description, int screenIndex, java.util.Map<String, String> __ctx);

    public void setScreenExtern(String extern, int screenIndex);
    public void setScreenExtern(String extern, int screenIndex, java.util.Map<String, String> __ctx);

    public void setScreenID(String id, int screenIndex);
    public void setScreenID(String id, int screenIndex, java.util.Map<String, String> __ctx);

    public void setScreenName(String name, int screenIndex);
    public void setScreenName(String name, int screenIndex, java.util.Map<String, String> __ctx);

    public void setScreenProtocolDescription(String protocolDescription, int screenIndex);
    public void setScreenProtocolDescription(String protocolDescription, int screenIndex, java.util.Map<String, String> __ctx);

    public void setScreenProtocolIdentifier(String protocolIdentifier, int screenIndex);
    public void setScreenProtocolIdentifier(String protocolIdentifier, int screenIndex, java.util.Map<String, String> __ctx);

    public void setScreenReagentSetDescription(String reagentSetDescription, int screenIndex);
    public void setScreenReagentSetDescription(String reagentSetDescription, int screenIndex, java.util.Map<String, String> __ctx);

    public void setScreenReagentSetIdentifier(String reagentSetIdentifier, int screenIndex);
    public void setScreenReagentSetIdentifier(String reagentSetIdentifier, int screenIndex, java.util.Map<String, String> __ctx);

    public void setScreenType(String type, int screenIndex);
    public void setScreenType(String type, int screenIndex, java.util.Map<String, String> __ctx);

    public void setScreenAcquisitionEndTime(String endTime, int screenIndex, int screenAcquisitionIndex);
    public void setScreenAcquisitionEndTime(String endTime, int screenIndex, int screenAcquisitionIndex, java.util.Map<String, String> __ctx);

    public void setScreenAcquisitionID(String id, int screenIndex, int screenAcquisitionIndex);
    public void setScreenAcquisitionID(String id, int screenIndex, int screenAcquisitionIndex, java.util.Map<String, String> __ctx);

    public void setScreenAcquisitionStartTime(String startTime, int screenIndex, int screenAcquisitionIndex);
    public void setScreenAcquisitionStartTime(String startTime, int screenIndex, int screenAcquisitionIndex, java.util.Map<String, String> __ctx);

    public void setScreenRefID(String id, int plateIndex, int screenRefIndex);
    public void setScreenRefID(String id, int plateIndex, int screenRefIndex, java.util.Map<String, String> __ctx);

    public void setShapeBaselineShift(String baselineShift, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeBaselineShift(String baselineShift, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeDirection(String direction, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeDirection(String direction, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeFillColor(String fillColor, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeFillColor(String fillColor, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeFillOpacity(String fillOpacity, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeFillOpacity(String fillOpacity, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeFillRule(String fillRule, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeFillRule(String fillRule, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeFontFamily(String fontFamily, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeFontFamily(String fontFamily, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeFontSize(int fontSize, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeFontSize(int fontSize, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeFontStretch(String fontStretch, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeFontStretch(String fontStretch, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeFontStyle(String fontStyle, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeFontStyle(String fontStyle, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeFontVariant(String fontVariant, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeFontVariant(String fontVariant, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeFontWeight(String fontWeight, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeFontWeight(String fontWeight, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeG(String g, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeG(String g, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeGlyphOrientationVertical(int glyphOrientationVertical, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeGlyphOrientationVertical(int glyphOrientationVertical, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeID(String id, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeID(String id, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeLocked(boolean locked, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeLocked(boolean locked, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeStrokeAttribute(String strokeAttribute, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeStrokeAttribute(String strokeAttribute, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeStrokeColor(String strokeColor, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeStrokeColor(String strokeColor, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeStrokeDashArray(String strokeDashArray, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeStrokeDashArray(String strokeDashArray, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeStrokeLineCap(String strokeLineCap, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeStrokeLineCap(String strokeLineCap, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeStrokeLineJoin(String strokeLineJoin, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeStrokeLineJoin(String strokeLineJoin, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeStrokeMiterLimit(int strokeMiterLimit, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeStrokeMiterLimit(int strokeMiterLimit, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeStrokeOpacity(float strokeOpacity, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeStrokeOpacity(float strokeOpacity, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeStrokeWidth(int strokeWidth, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeStrokeWidth(int strokeWidth, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeText(String text, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeText(String text, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeTextAnchor(String textAnchor, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeTextAnchor(String textAnchor, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeTextDecoration(String textDecoration, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeTextDecoration(String textDecoration, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeTextFill(String textFill, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeTextFill(String textFill, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeTextStroke(String textStroke, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeTextStroke(String textStroke, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeTheT(int theT, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeTheT(int theT, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeTheZ(int theZ, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeTheZ(int theZ, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeVectorEffect(String vectorEffect, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeVectorEffect(String vectorEffect, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeVisibility(boolean visibility, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeVisibility(boolean visibility, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setShapeWritingMode(String writingMode, int imageIndex, int roiIndex, int shapeIndex);
    public void setShapeWritingMode(String writingMode, int imageIndex, int roiIndex, int shapeIndex, java.util.Map<String, String> __ctx);

    public void setStageLabelName(String name, int imageIndex);
    public void setStageLabelName(String name, int imageIndex, java.util.Map<String, String> __ctx);

    public void setStageLabelX(float x, int imageIndex);
    public void setStageLabelX(float x, int imageIndex, java.util.Map<String, String> __ctx);

    public void setStageLabelY(float y, int imageIndex);
    public void setStageLabelY(float y, int imageIndex, java.util.Map<String, String> __ctx);

    public void setStageLabelZ(float z, int imageIndex);
    public void setStageLabelZ(float z, int imageIndex, java.util.Map<String, String> __ctx);

    public void setStagePositionPositionX(float positionX, int imageIndex, int pixelsIndex, int planeIndex);
    public void setStagePositionPositionX(float positionX, int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public void setStagePositionPositionY(float positionY, int imageIndex, int pixelsIndex, int planeIndex);
    public void setStagePositionPositionY(float positionY, int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public void setStagePositionPositionZ(float positionZ, int imageIndex, int pixelsIndex, int planeIndex);
    public void setStagePositionPositionZ(float positionZ, int imageIndex, int pixelsIndex, int planeIndex, java.util.Map<String, String> __ctx);

    public void setThumbnailHref(String href, int imageIndex);
    public void setThumbnailHref(String href, int imageIndex, java.util.Map<String, String> __ctx);

    public void setThumbnailID(String id, int imageIndex);
    public void setThumbnailID(String id, int imageIndex, java.util.Map<String, String> __ctx);

    public void setThumbnailMIMEtype(String mimEtype, int imageIndex);
    public void setThumbnailMIMEtype(String mimEtype, int imageIndex, java.util.Map<String, String> __ctx);

    public void setTiffDataFileName(String fileName, int imageIndex, int pixelsIndex, int tiffDataIndex);
    public void setTiffDataFileName(String fileName, int imageIndex, int pixelsIndex, int tiffDataIndex, java.util.Map<String, String> __ctx);

    public void setTiffDataFirstC(int firstC, int imageIndex, int pixelsIndex, int tiffDataIndex);
    public void setTiffDataFirstC(int firstC, int imageIndex, int pixelsIndex, int tiffDataIndex, java.util.Map<String, String> __ctx);

    public void setTiffDataFirstT(int firstT, int imageIndex, int pixelsIndex, int tiffDataIndex);
    public void setTiffDataFirstT(int firstT, int imageIndex, int pixelsIndex, int tiffDataIndex, java.util.Map<String, String> __ctx);

    public void setTiffDataFirstZ(int firstZ, int imageIndex, int pixelsIndex, int tiffDataIndex);
    public void setTiffDataFirstZ(int firstZ, int imageIndex, int pixelsIndex, int tiffDataIndex, java.util.Map<String, String> __ctx);

    public void setTiffDataIFD(int ifd, int imageIndex, int pixelsIndex, int tiffDataIndex);
    public void setTiffDataIFD(int ifd, int imageIndex, int pixelsIndex, int tiffDataIndex, java.util.Map<String, String> __ctx);

    public void setTiffDataNumPlanes(int numPlanes, int imageIndex, int pixelsIndex, int tiffDataIndex);
    public void setTiffDataNumPlanes(int numPlanes, int imageIndex, int pixelsIndex, int tiffDataIndex, java.util.Map<String, String> __ctx);

    public void setTiffDataUUID(String uuid, int imageIndex, int pixelsIndex, int tiffDataIndex);
    public void setTiffDataUUID(String uuid, int imageIndex, int pixelsIndex, int tiffDataIndex, java.util.Map<String, String> __ctx);

    public void setTransmittanceRangeCutIn(int cutIn, int instrumentIndex, int filterIndex);
    public void setTransmittanceRangeCutIn(int cutIn, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setTransmittanceRangeCutInTolerance(int cutInTolerance, int instrumentIndex, int filterIndex);
    public void setTransmittanceRangeCutInTolerance(int cutInTolerance, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setTransmittanceRangeCutOut(int cutOut, int instrumentIndex, int filterIndex);
    public void setTransmittanceRangeCutOut(int cutOut, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setTransmittanceRangeCutOutTolerance(int cutOutTolerance, int instrumentIndex, int filterIndex);
    public void setTransmittanceRangeCutOutTolerance(int cutOutTolerance, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setTransmittanceRangeTransmittance(int transmittance, int instrumentIndex, int filterIndex);
    public void setTransmittanceRangeTransmittance(int transmittance, int instrumentIndex, int filterIndex, java.util.Map<String, String> __ctx);

    public void setWellColumn(int column, int plateIndex, int wellIndex);
    public void setWellColumn(int column, int plateIndex, int wellIndex, java.util.Map<String, String> __ctx);

    public void setWellExternalDescription(String externalDescription, int plateIndex, int wellIndex);
    public void setWellExternalDescription(String externalDescription, int plateIndex, int wellIndex, java.util.Map<String, String> __ctx);

    public void setWellExternalIdentifier(String externalIdentifier, int plateIndex, int wellIndex);
    public void setWellExternalIdentifier(String externalIdentifier, int plateIndex, int wellIndex, java.util.Map<String, String> __ctx);

    public void setWellID(String id, int plateIndex, int wellIndex);
    public void setWellID(String id, int plateIndex, int wellIndex, java.util.Map<String, String> __ctx);

    public void setWellReagent(String reagent, int plateIndex, int wellIndex);
    public void setWellReagent(String reagent, int plateIndex, int wellIndex, java.util.Map<String, String> __ctx);

    public void setWellRow(int row, int plateIndex, int wellIndex);
    public void setWellRow(int row, int plateIndex, int wellIndex, java.util.Map<String, String> __ctx);

    public void setWellType(String type, int plateIndex, int wellIndex);
    public void setWellType(String type, int plateIndex, int wellIndex, java.util.Map<String, String> __ctx);

    public void setWellSampleID(String id, int plateIndex, int wellIndex, int wellSampleIndex);
    public void setWellSampleID(String id, int plateIndex, int wellIndex, int wellSampleIndex, java.util.Map<String, String> __ctx);

    public void setWellSampleImageRef(String imageRef, int plateIndex, int wellIndex, int wellSampleIndex);
    public void setWellSampleImageRef(String imageRef, int plateIndex, int wellIndex, int wellSampleIndex, java.util.Map<String, String> __ctx);

    public void setWellSampleIndex(int index, int plateIndex, int wellIndex, int wellSampleIndex);
    public void setWellSampleIndex(int index, int plateIndex, int wellIndex, int wellSampleIndex, java.util.Map<String, String> __ctx);

    public void setWellSamplePosX(float posX, int plateIndex, int wellIndex, int wellSampleIndex);
    public void setWellSamplePosX(float posX, int plateIndex, int wellIndex, int wellSampleIndex, java.util.Map<String, String> __ctx);

    public void setWellSamplePosY(float posY, int plateIndex, int wellIndex, int wellSampleIndex);
    public void setWellSamplePosY(float posY, int plateIndex, int wellIndex, int wellSampleIndex, java.util.Map<String, String> __ctx);

    public void setWellSampleTimepoint(int timepoint, int plateIndex, int wellIndex, int wellSampleIndex);
    public void setWellSampleTimepoint(int timepoint, int plateIndex, int wellIndex, int wellSampleIndex, java.util.Map<String, String> __ctx);

    public void setWellSampleRefID(String id, int screenIndex, int screenAcquisitionIndex, int wellSampleRefIndex);
    public void setWellSampleRefID(String id, int screenIndex, int screenAcquisitionIndex, int wellSampleRefIndex, java.util.Map<String, String> __ctx);
}
