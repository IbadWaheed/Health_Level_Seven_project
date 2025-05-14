package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.OCD;
import starhealthcaretech.DataTypes.OSP;
import starhealthcaretech.DataTypes.UVC;
import starhealthcaretech.HL7Helper.HL7util;

public class UB2 implements HL7SegmentInterface{

    private String setIdUb2;
    private String coInsuranceDays;
    private List<String> conditionCode;
    private String coveredDays;
    private String nonCoveredDays;
    private List<UVC> valueAmountAndCode;
    private List<OCD> occurrenceCodeAndDate;
    private List<OSP> occurrenceSpanCodeDates;
    private List<String> ub92Locator2State;
    private List<String> ub92Locator11State;
    private String ub92Locator31National;
    private List<String> documentControlNumber;
    private List<String> ub92Locator49National;
    private List<String> ub92Locator56State;
    private String ub92Locator57National;
    private List<String> ub92Locator78State;
    private String specialVisitCount;

    

    public String getSetIdUb2() {
        return setIdUb2;
    }



    public void setSetIdUb2(String setIdUb2) {
        this.setIdUb2 = setIdUb2;
    }



    public String getCoInsuranceDays() {
        return coInsuranceDays;
    }



    public void setCoInsuranceDays(String coInsuranceDays) {
        this.coInsuranceDays = coInsuranceDays;
    }



    public List<String> getConditionCode() {
        return conditionCode;
    }



    public void setConditionCode(List<String> conditionCode) {
        this.conditionCode = conditionCode;
    }



    public String getCoveredDays() {
        return coveredDays;
    }



    public void setCoveredDays(String coveredDays) {
        this.coveredDays = coveredDays;
    }



    public String getNonCoveredDays() {
        return nonCoveredDays;
    }



    public void setNonCoveredDays(String nonCoveredDays) {
        this.nonCoveredDays = nonCoveredDays;
    }



    public List<UVC> getValueAmountAndCode() {
        return valueAmountAndCode;
    }



    public void setValueAmountAndCode(List<UVC> valueAmountAndCode) {
        this.valueAmountAndCode = valueAmountAndCode;
    }



    public List<OCD> getOccurrenceCodeAndDate() {
        return occurrenceCodeAndDate;
    }



    public void setOccurrenceCodeAndDate(List<OCD> occurrenceCodeAndDate) {
        this.occurrenceCodeAndDate = occurrenceCodeAndDate;
    }



    public List<OSP> getOccurrenceSpanCodeDates() {
        return occurrenceSpanCodeDates;
    }



    public void setOccurrenceSpanCodeDates(List<OSP> occurrenceSpanCodeDates) {
        this.occurrenceSpanCodeDates = occurrenceSpanCodeDates;
    }



    public List<String> getUb92Locator2State() {
        return ub92Locator2State;
    }



    public void setUb92Locator2State(List<String> ub92Locator2State) {
        this.ub92Locator2State = ub92Locator2State;
    }



    public List<String> getUb92Locator11State() {
        return ub92Locator11State;
    }



    public void setUb92Locator11State(List<String> ub92Locator11State) {
        this.ub92Locator11State = ub92Locator11State;
    }



    public String getUb92Locator31National() {
        return ub92Locator31National;
    }



    public void setUb92Locator31National(String ub92Locator31National) {
        this.ub92Locator31National = ub92Locator31National;
    }



    public List<String> getDocumentControlNumber() {
        return documentControlNumber;
    }



    public void setDocumentControlNumber(List<String> documentControlNumber) {
        this.documentControlNumber = documentControlNumber;
    }



    public List<String> getUb92Locator49National() {
        return ub92Locator49National;
    }



    public void setUb92Locator49National(List<String> ub92Locator49National) {
        this.ub92Locator49National = ub92Locator49National;
    }



    public List<String> getUb92Locator56State() {
        return ub92Locator56State;
    }



    public void setUb92Locator56State(List<String> ub92Locator56State) {
        this.ub92Locator56State = ub92Locator56State;
    }



    public String getUb92Locator57National() {
        return ub92Locator57National;
    }



    public void setUb92Locator57National(String ub92Locator57National) {
        this.ub92Locator57National = ub92Locator57National;
    }



    public List<String> getUb92Locator78State() {
        return ub92Locator78State;
    }



    public void setUb92Locator78State(List<String> ub92Locator78State) {
        this.ub92Locator78State = ub92Locator78State;
    }



    public String getSpecialVisitCount() {
        return specialVisitCount;
    }



    public void setSpecialVisitCount(String specialVisitCount) {
        this.specialVisitCount = specialVisitCount;
    }



    @Override
    public String toHL7() {
        return "UB2" + HL7util.processAllFields(this);
    }
}


