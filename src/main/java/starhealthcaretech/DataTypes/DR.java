package starhealthcaretech.DataTypes;

public class DR {

    // DR.1 - Range Start Date/Time (Optional, Timestamp (TS), Length: 26)
    private String rangeStartDateTime;

    // DR.2 - Range End Date/Time (Optional, Timestamp (TS), Length: 26)
    private String rangeEndDateTime;

    public String getRangeStartDateTime() {
        return rangeStartDateTime;
    }

    public void setRangeStartDateTime(String rangeStartDateTime) {
        this.rangeStartDateTime = rangeStartDateTime;
    }

    public String getRangeEndDateTime() {
        return rangeEndDateTime;
    }

    public void setRangeEndDateTime(String rangeEndDateTime) {
        this.rangeEndDateTime = rangeEndDateTime;
    }



   
}
