package starhealthcaretech.DataTypes;

public class ERL {

    // ERL.1 - Segment Id (Required, String (ST), Length: 3)
    private String segmentId;

    // ERL.2 - Segment Sequence (Required, Numeric (NM), Length: 2)
    private Integer segmentSequence;

    // ERL.3 - Field Position (Optional, Numeric (NM), Length: 2)
    private Integer fieldPosition;

    // ERL.4 - Field Repetition (Optional, Numeric (NM), Length: 2)
    private Integer fieldRepetition;

    // ERL.5 - Component Number (Optional, Numeric (NM), Length: 2)
    private Integer componentNumber;

    // ERL.6 - Sub-component Number (Optional, Numeric (NM), Length: 2)
    private Integer subComponentNumber;

    // Getter and Setter for segmentId
    public String getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    // Getter and Setter for segmentSequence
    public Integer getSegmentSequence() {
        return segmentSequence;
    }

    public void setSegmentSequence(Integer segmentSequence) {
        this.segmentSequence = segmentSequence;
    }

    // Getter and Setter for fieldPosition
    public Integer getFieldPosition() {
        return fieldPosition;
    }

    public void setFieldPosition(Integer fieldPosition) {
        this.fieldPosition = fieldPosition;
    }

    // Getter and Setter for fieldRepetition
    public Integer getFieldRepetition() {
        return fieldRepetition;
    }

    public void setFieldRepetition(Integer fieldRepetition) {
        this.fieldRepetition = fieldRepetition;
    }

    // Getter and Setter for componentNumber
    public Integer getComponentNumber() {
        return componentNumber;
    }

    public void setComponentNumber(Integer componentNumber) {
        this.componentNumber = componentNumber;
    }

    // Getter and Setter for subComponentNumber
    public Integer getSubComponentNumber() {
        return subComponentNumber;
    }

    public void setSubComponentNumber(Integer subComponentNumber) {
        this.subComponentNumber = subComponentNumber;
    }
}

