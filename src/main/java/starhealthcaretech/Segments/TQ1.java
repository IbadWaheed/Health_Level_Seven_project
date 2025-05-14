package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CQ;
import starhealthcaretech.DataTypes.CWE;
import starhealthcaretech.DataTypes.RPT;
import starhealthcaretech.HL7Helper.HL7util;

public class TQ1 implements HL7SegmentInterface{
    private String setIdTq1;                // TQ1.1
    private CQ quantity;                // TQ1.2
    private List<RPT> repeatPattern;           // TQ1.3
    private List<String> explicitTime;            // TQ1.4
    private List<CQ> relativeTimeAndUnits;    // TQ1.5
    private CQ serviceDuration;         // TQ1.6
    private String startDateTime;           // TQ1.7
    private String endDateTime;             // TQ1.8
    private List<CWE> priority;                // TQ1.9
    private String conditionText;           // TQ1.10
    private String textInstruction;         // TQ1.11
    private String conjunction;             // TQ1.12
    private CQ occurrenceDuration;      // TQ1.13
    private String totalOccurrences;        // TQ1.14

    // Getters and Setters

    public String getSetIdTq1() {
        return setIdTq1;
    }

    public void setSetIdTq1(String setIdTq1) {
        this.setIdTq1 = setIdTq1;
    }

    public CQ getQuantity() {
        return quantity;
    }

    public void setQuantity(CQ quantity) {
        this.quantity = quantity;
    }

    public List<RPT> getRepeatPattern() {
        return repeatPattern;
    }

    public void setRepeatPattern(List<RPT> repeatPattern) {
        this.repeatPattern = repeatPattern;
    }

    public List<String> getExplicitTime() {
        return explicitTime;
    }

    public void setExplicitTime(List<String> explicitTime) {
        this.explicitTime = explicitTime;
    }

    public List<CQ> getRelativeTimeAndUnits() {
        return relativeTimeAndUnits;
    }

    public void setRelativeTimeAndUnits(List<CQ> relativeTimeAndUnits) {
        this.relativeTimeAndUnits = relativeTimeAndUnits;
    }

    public CQ getServiceDuration() {
        return serviceDuration;
    }

    public void setServiceDuration(CQ serviceDuration) {
        this.serviceDuration = serviceDuration;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    public List<CWE> getPriority() {
        return priority;
    }

    public void setPriority(List<CWE> priority) {
        this.priority = priority;
    }

    public String getConditionText() {
        return conditionText;
    }

    public void setConditionText(String conditionText) {
        this.conditionText = conditionText;
    }

    public String getTextInstruction() {
        return textInstruction;
    }

    public void setTextInstruction(String textInstruction) {
        this.textInstruction = textInstruction;
    }

    public String getConjunction() {
        return conjunction;
    }

    public void setConjunction(String conjunction) {
        this.conjunction = conjunction;
    }

    public CQ getOccurrenceDuration() {
        return occurrenceDuration;
    }

    public void setOccurrenceDuration(CQ occurrenceDuration) {
        this.occurrenceDuration = occurrenceDuration;
    }

    public String getTotalOccurrences() {
        return totalOccurrences;
    }

    public void setTotalOccurrences(String totalOccurrences) {
        this.totalOccurrences = totalOccurrences;
    }

    @Override
    public String toHL7() {
        return "TQ1" + HL7util.processAllFields(this);
    }
}
