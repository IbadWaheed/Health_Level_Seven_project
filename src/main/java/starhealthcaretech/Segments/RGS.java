package starhealthcaretech.Segments;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.HL7Helper.HL7util;

public class RGS implements HL7SegmentInterface{
    private String setId;               // RGS.1
    private String segmentActionCode;   // RGS.2
    private CE resourceGroupId;     // RGS.3

    // Getters and Setters
    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public String getSegmentActionCode() {
        return segmentActionCode;
    }

    public void setSegmentActionCode(String segmentActionCode) {
        this.segmentActionCode = segmentActionCode;
    }

    public CE getResourceGroupId() {
        return resourceGroupId;
    }

    public void setResourceGroupId(CE resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    @Override
    public String toHL7() {
        return "RGS" + HL7util.processAllFields(this);
    }
}
