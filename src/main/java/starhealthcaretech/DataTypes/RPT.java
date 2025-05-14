package starhealthcaretech.DataTypes;

public class RPT {

    private String repeatPatternCode;           // RPT.1
    private String calendarAlignment;           // RPT.2
    private String phaseRangeBeginValue;         // RPT.3
    private String phaseRangeEndValue;           // RPT.4
    private String periodQuantity;               // RPT.5
    private String periodUnits;                  // RPT.6
    private String institutionSpecifiedTime;     // RPT.7
    private String event;                        // RPT.8
    private String eventOffsetQuantity;          // RPT.9
    private String eventOffsetUnits;             // RPT.10
    private String generalTimingSpecification;   // RPT.11

    // Getters and Setters

    public String getRepeatPatternCode() {
        return repeatPatternCode;
    }

    public void setRepeatPatternCode(String repeatPatternCode) {
        this.repeatPatternCode = repeatPatternCode;
    }

    public String getCalendarAlignment() {
        return calendarAlignment;
    }

    public void setCalendarAlignment(String calendarAlignment) {
        this.calendarAlignment = calendarAlignment;
    }

    public String getPhaseRangeBeginValue() {
        return phaseRangeBeginValue;
    }

    public void setPhaseRangeBeginValue(String phaseRangeBeginValue) {
        this.phaseRangeBeginValue = phaseRangeBeginValue;
    }

    public String getPhaseRangeEndValue() {
        return phaseRangeEndValue;
    }

    public void setPhaseRangeEndValue(String phaseRangeEndValue) {
        this.phaseRangeEndValue = phaseRangeEndValue;
    }

    public String getPeriodQuantity() {
        return periodQuantity;
    }

    public void setPeriodQuantity(String periodQuantity) {
        this.periodQuantity = periodQuantity;
    }

    public String getPeriodUnits() {
        return periodUnits;
    }

    public void setPeriodUnits(String periodUnits) {
        this.periodUnits = periodUnits;
    }

    public String getInstitutionSpecifiedTime() {
        return institutionSpecifiedTime;
    }

    public void setInstitutionSpecifiedTime(String institutionSpecifiedTime) {
        this.institutionSpecifiedTime = institutionSpecifiedTime;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getEventOffsetQuantity() {
        return eventOffsetQuantity;
    }

    public void setEventOffsetQuantity(String eventOffsetQuantity) {
        this.eventOffsetQuantity = eventOffsetQuantity;
    }

    public String getEventOffsetUnits() {
        return eventOffsetUnits;
    }

    public void setEventOffsetUnits(String eventOffsetUnits) {
        this.eventOffsetUnits = eventOffsetUnits;
    }

    public String getGeneralTimingSpecification() {
        return generalTimingSpecification;
    }

    public void setGeneralTimingSpecification(String generalTimingSpecification) {
        this.generalTimingSpecification = generalTimingSpecification;
    }
}

