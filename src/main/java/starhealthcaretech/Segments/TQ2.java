package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CQ;
import starhealthcaretech.DataTypes.EI;
import starhealthcaretech.HL7Helper.HL7util;

public class TQ2 implements HL7SegmentInterface{
    private String setIdTq2;
    private String sequenceResultsFlag;
    private List<EI> relatedPlacerNumber;
    private List<EI> relatedFillerNumber;
    private List<EI> relatedPlacerGroupNumber;
    private String sequenceConditionCode;
    private String cyclicEntryExitIndicator;
    private CQ sequenceConditionTimeInterval;
    private String cyclicGroupMaximumNumberOfRepeats;
    private String specialServiceRequestRelationship;
    public String getSetIdTq2() {
        return setIdTq2;
    }
    public void setSetIdTq2(String setIdTq2) {
        this.setIdTq2 = setIdTq2;
    }
    public String getSequenceResultsFlag() {
        return sequenceResultsFlag;
    }
    public void setSequenceResultsFlag(String sequenceResultsFlag) {
        this.sequenceResultsFlag = sequenceResultsFlag;
    }
    public List<EI> getRelatedPlacerNumber() {
        return relatedPlacerNumber;
    }
    public void setRelatedPlacerNumber(List<EI> relatedPlacerNumber) {
        this.relatedPlacerNumber = relatedPlacerNumber;
    }
    public List<EI> getRelatedFillerNumber() {
        return relatedFillerNumber;
    }
    public void setRelatedFillerNumber(List<EI> relatedFillerNumber) {
        this.relatedFillerNumber = relatedFillerNumber;
    }
    public List<EI> getRelatedPlacerGroupNumber() {
        return relatedPlacerGroupNumber;
    }
    public void setRelatedPlacerGroupNumber(List<EI> relatedPlacerGroupNumber) {
        this.relatedPlacerGroupNumber = relatedPlacerGroupNumber;
    }
    public String getSequenceConditionCode() {
        return sequenceConditionCode;
    }
    public void setSequenceConditionCode(String sequenceConditionCode) {
        this.sequenceConditionCode = sequenceConditionCode;
    }
    public String getCyclicEntryExitIndicator() {
        return cyclicEntryExitIndicator;
    }
    public void setCyclicEntryExitIndicator(String cyclicEntryExitIndicator) {
        this.cyclicEntryExitIndicator = cyclicEntryExitIndicator;
    }
    public CQ getSequenceConditionTimeInterval() {
        return sequenceConditionTimeInterval;
    }
    public void setSequenceConditionTimeInterval(CQ sequenceConditionTimeInterval) {
        this.sequenceConditionTimeInterval = sequenceConditionTimeInterval;
    }
    public String getCyclicGroupMaximumNumberOfRepeats() {
        return cyclicGroupMaximumNumberOfRepeats;
    }
    public void setCyclicGroupMaximumNumberOfRepeats(String cyclicGroupMaximumNumberOfRepeats) {
        this.cyclicGroupMaximumNumberOfRepeats = cyclicGroupMaximumNumberOfRepeats;
    }
    public String getSpecialServiceRequestRelationship() {
        return specialServiceRequestRelationship;
    }
    public void setSpecialServiceRequestRelationship(String specialServiceRequestRelationship) {
        this.specialServiceRequestRelationship = specialServiceRequestRelationship;
    }

    @Override
    public String toHL7() {
        return "TQ2" + HL7util.processAllFields(this);
    }

}
