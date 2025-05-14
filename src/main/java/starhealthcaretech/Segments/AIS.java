package starhealthcaretech.Segments;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.HL7Helper.HL7util;

public class AIS implements HL7SegmentInterface{
    private String setId;                                 // AIS.1
    private String segmentActionCode;                     // AIS.2
    private CE universalServiceIdentifier;            // AIS.3
    private String startDateTime;                         // AIS.4
    private String startDateTimeOffset;                   // AIS.5
    private CE startDateTimeOffsetUnits;              // AIS.6
    private String duration;                              // AIS.7
    private CE durationUnits;                         // AIS.8
    private String allowSubstitutionCode;                 // AIS.9
    private CE fillerStatusCode;                      // AIS.10
 
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

    public CE getUniversalServiceIdentifier() {
        return universalServiceIdentifier;
    }

    public void setUniversalServiceIdentifier(CE universalServiceIdentifier) {
        this.universalServiceIdentifier = universalServiceIdentifier;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
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
        return "AIS" + HL7util.processAllFields(this);
    }
}
