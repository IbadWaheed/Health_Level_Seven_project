package starhealthcaretech.Segments;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.TS;
import starhealthcaretech.DataTypes.XCN;
import starhealthcaretech.HL7Helper.HL7util;

public class AIP implements HL7SegmentInterface{
    private String setId;                    // AIP.1
    private String segmentActionCode;        // AIP.2
    private XCN personnelResourceId;      // AIP.3
    private CE resourceRole;             // AIP.4
    private CE resourceGroup;            // AIP.5
    private TS startDateTime;            // AIP.6
    private String startDateTimeOffset;      // AIP.7
    private CE startDateTimeOffsetUnits; // AIP.8
    private String duration;                 // AIP.9
    private CE durationUnits;            // AIP.10
    private String allowSubstitutionCode;    // AIP.11
    private CE fillerStatusCode;         // AIP.12

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

    public XCN getPersonnelResourceId() {
        return personnelResourceId;
    }

    public void setPersonnelResourceId(XCN personnelResourceId) {
        this.personnelResourceId = personnelResourceId;
    }

    public CE getResourceRole() {
        return resourceRole;
    }

    public void setResourceRole(CE resourceRole) {
        this.resourceRole = resourceRole;
    }

    public CE getResourceGroup() {
        return resourceGroup;
    }

    public void setResourceGroup(CE resourceGroup) {
        this.resourceGroup = resourceGroup;
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
        return "AIP" + HL7util.processAllFields(this);
    }
}
