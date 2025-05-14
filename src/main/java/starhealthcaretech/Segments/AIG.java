package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.TS;
import starhealthcaretech.HL7Helper.HL7util;

public class AIG implements HL7SegmentInterface{
    private String setId;                         // AIG.1
    private String segmentActionCode;             // AIG.2
    private CE resourceId;                    // AIG.3
    private CE resourceType;                  // AIG.4
    private List<CE> resourceGroup;           // AIG.5 (repeating field)
    private String resourceQuantity;              // AIG.6
    private CE resourceQuantityUnits;         // AIG.7
    private TS startDateTime;                 // AIG.8
    private String startDateTimeOffset;           // AIG.9
    private CE startDateTimeOffsetUnits;      // AIG.10
    private String duration;                      // AIG.11
    private CE durationUnits;                 // AIG.12
    private String allowSubstitutionCode;         // AIG.13
    private CE fillerStatusCode;              // AIG.14

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

    public CE getResourceId() {
        return resourceId;
    }

    public void setResourceId(CE resourceId) {
        this.resourceId = resourceId;
    }

    public CE getResourceType() {
        return resourceType;
    }

    public void setResourceType(CE resourceType) {
        this.resourceType = resourceType;
    }

    public List<CE> getResourceGroup() {
        return resourceGroup;
    }

    public void setResourceGroup(List<CE> resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    public String getResourceQuantity() {
        return resourceQuantity;
    }

    public void setResourceQuantity(String resourceQuantity) {
        this.resourceQuantity = resourceQuantity;
    }

    public CE getResourceQuantityUnits() {
        return resourceQuantityUnits;
    }

    public void setResourceQuantityUnits(CE resourceQuantityUnits) {
        this.resourceQuantityUnits = resourceQuantityUnits;
    }

    public TS getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(TS startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getStartDateTimeOffset() {
        return startDateTimeOffset;
    }

    public void setStartDateTimeOffset(String startDateTimeOffset) {
        this.startDateTimeOffset = startDateTimeOffset;
    }

    public CE getStartDateTimeOffsetUnits() {
        return startDateTimeOffsetUnits;
    }

    public void setStartDateTimeOffsetUnits(CE startDateTimeOffsetUnits) {
        this.startDateTimeOffsetUnits = startDateTimeOffsetUnits;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public CE getDurationUnits() {
        return durationUnits;
    }

    public void setDurationUnits(CE durationUnits) {
        this.durationUnits = durationUnits;
    }

    public String getAllowSubstitutionCode() {
        return allowSubstitutionCode;
    }

    public void setAllowSubstitutionCode(String allowSubstitutionCode) {
        this.allowSubstitutionCode = allowSubstitutionCode;
    }

    public CE getFillerStatusCode() {
        return fillerStatusCode;
    }

    public void setFillerStatusCode(CE fillerStatusCode) {
        this.fillerStatusCode = fillerStatusCode;
    }

    @Override
    public String toHL7() {
        return "AIG" + HL7util.processAllFields(this);
    }

}
