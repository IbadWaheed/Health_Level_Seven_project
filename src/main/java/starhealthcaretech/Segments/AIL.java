package starhealthcaretech.Segments;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.PL;
import starhealthcaretech.DataTypes.TS;
import starhealthcaretech.HL7Helper.HL7util;

public class AIL implements HL7SegmentInterface{
    private String setId;                        // AIL.1
    private String segmentActionCode;            // AIL.2
    private PL locationResourceId;           // AIL.3
    private CE locationType;                 // AIL.4
    private CE locationGroup;                // AIL.5
    private TS startDateTime;                // AIL.6
    private String startDateTimeOffset;          // AIL.7
    private CE startDateTimeOffsetUnits;     // AIL.8
    private String duration;                     // AIL.9
    private CE durationUnits;                // AIL.10
    private String allowSubstitutionCode;        // AIL.11
    private CE fillerStatusCode;             // AIL.12

    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    // Getter and Setter for segmentActionCode
    public String getSegmentActionCode() {
        return segmentActionCode;
    }

    public void setSegmentActionCode(String segmentActionCode) {
        this.segmentActionCode = segmentActionCode;
    }

    // Getter and Setter for locationResourceId
    public PL getLocationResourceId() {
        return locationResourceId;
    }

    public void setLocationResourceId(PL locationResourceId) {
        this.locationResourceId = locationResourceId;
    }

    // Getter and Setter for locationType
    public CE getLocationType() {
        return locationType;
    }

    public void setLocationType(CE locationType) {
        this.locationType = locationType;
    }

    // Getter and Setter for locationGroup
    public CE getLocationGroup() {
        return locationGroup;
    }

    public void setLocationGroup(CE locationGroup) {
        this.locationGroup = locationGroup;
    }

    // Getter and Setter for startDateTime
    public TS getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(TS startDateTime) {
        this.startDateTime = startDateTime;
    }

    // Getter and Setter for startDateTimeOffset
    public String getStartDateTimeOffset() {
        return startDateTimeOffset;
    }

    public void setStartDateTimeOffset(String startDateTimeOffset) {
        this.startDateTimeOffset = startDateTimeOffset;
    }

    // Getter and Setter for startDateTimeOffsetUnits
    public CE getStartDateTimeOffsetUnits() {
        return startDateTimeOffsetUnits;
    }

    public void setStartDateTimeOffsetUnits(CE startDateTimeOffsetUnits) {
        this.startDateTimeOffsetUnits = startDateTimeOffsetUnits;
    }

    // Getter and Setter for duration
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    // Getter and Setter for durationUnits
    public CE getDurationUnits() {
        return durationUnits;
    }

    public void setDurationUnits(CE durationUnits) {
        this.durationUnits = durationUnits;
    }

    // Getter and Setter for allowSubstitutionCode
    public String getAllowSubstitutionCode() {
        return allowSubstitutionCode;
    }

    public void setAllowSubstitutionCode(String allowSubstitutionCode) {
        this.allowSubstitutionCode = allowSubstitutionCode;
    }

    // Getter and Setter for fillerStatusCode
    public CE getFillerStatusCode() {
        return fillerStatusCode;
    }

    public void setFillerStatusCode(CE fillerStatusCode) {
        this.fillerStatusCode = fillerStatusCode;
    }
    @Override
    public String toHL7() {
        return "AIL" + HL7util.processAllFields(this);
    }

}
