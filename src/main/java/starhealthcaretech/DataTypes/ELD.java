package starhealthcaretech.DataTypes;

public class ELD {

    // ELD.1 - Segment Id (Optional, String (ST), Length: 3)
    private String segmentId;

    // ELD.2 - Segment Sequence (Optional, Numeric (NM), Length: 2)
    private Integer segmentSequence;

    // ELD.3 - Field Position (Optional, Numeric (NM), Length: 2)
    private Integer fieldPosition;

    // ELD.4 - Code Identifying Error (Optional, Coded Element (CE), Length: 483)
    private CE codeIdentifyingError;

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

    // Getter and Setter for codeIdentifyingError
    public CE getCodeIdentifyingError() {
        return codeIdentifyingError;
    }

    public void setCodeIdentifyingError(CE codeIdentifyingError) {
        this.codeIdentifyingError = codeIdentifyingError;
    }
}

