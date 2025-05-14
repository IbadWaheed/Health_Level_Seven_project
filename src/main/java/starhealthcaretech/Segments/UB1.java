package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.OCD;
import starhealthcaretech.DataTypes.UVC;
import starhealthcaretech.HL7Helper.HL7util;

public class UB1 implements HL7SegmentInterface{
    

    private String setIdUb1;
    private String bloodDeductible;
    private String bloodFurnishedPintsOf;
    private String bloodReplacedPints;
    private String bloodNotReplacedPints;
    private String coInsuranceDays;
    private List<String> conditionCode;
    private String coveredDays;
    private String nonCoveredDays;
    private List<UVC> valueAmountAndCode;
    private String numberOfGraceDays;
    private CE specialProgramIndicator;
    private CE psroUrApprovalIndicator;
    private String psroUrApprovedStayFm;
    private String psroUrApprovedStayTo;
    private List<OCD> occurrence;
    private CE occurrenceSpan;
    private String occurSpanStartDate;
    private String occurSpanEndDate;
    private String ub82Locator2;
    private String ub82Locator9;
    private String ub82Locator27;
    private String ub82Locator45;

    

    public String getSetIdUb1() {
        return setIdUb1;
    }



    public void setSetIdUb1(String setIdUb1) {
        this.setIdUb1 = setIdUb1;
    }



    public String getBloodDeductible() {
        return bloodDeductible;
    }



    public void setBloodDeductible(String bloodDeductible) {
        this.bloodDeductible = bloodDeductible;
    }



    public String getBloodFurnishedPintsOf() {
        return bloodFurnishedPintsOf;
    }



    public void setBloodFurnishedPintsOf(String bloodFurnishedPintsOf) {
        this.bloodFurnishedPintsOf = bloodFurnishedPintsOf;
    }



    public String getBloodReplacedPints() {
        return bloodReplacedPints;
    }



    public void setBloodReplacedPints(String bloodReplacedPints) {
        this.bloodReplacedPints = bloodReplacedPints;
    }



    public String getBloodNotReplacedPints() {
        return bloodNotReplacedPints;
    }



    public void setBloodNotReplacedPints(String bloodNotReplacedPints) {
        this.bloodNotReplacedPints = bloodNotReplacedPints;
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



    public String getNumberOfGraceDays() {
        return numberOfGraceDays;
    }



    public void setNumberOfGraceDays(String numberOfGraceDays) {
        this.numberOfGraceDays = numberOfGraceDays;
    }



    public CE getSpecialProgramIndicator() {
        return specialProgramIndicator;
    }



    public void setSpecialProgramIndicator(CE specialProgramIndicator) {
        this.specialProgramIndicator = specialProgramIndicator;
    }



    public CE getPsroUrApprovalIndicator() {
        return psroUrApprovalIndicator;
    }



    public void setPsroUrApprovalIndicator(CE psroUrApprovalIndicator) {
        this.psroUrApprovalIndicator = psroUrApprovalIndicator;
    }



    public String getPsroUrApprovedStayFm() {
        return psroUrApprovedStayFm;
    }



    public void setPsroUrApprovedStayFm(String psroUrApprovedStayFm) {
        this.psroUrApprovedStayFm = psroUrApprovedStayFm;
    }



    public String getPsroUrApprovedStayTo() {
        return psroUrApprovedStayTo;
    }



    public void setPsroUrApprovedStayTo(String psroUrApprovedStayTo) {
        this.psroUrApprovedStayTo = psroUrApprovedStayTo;
    }



    public List<OCD> getOccurrence() {
        return occurrence;
    }



    public void setOccurrence(List<OCD> occurrence) {
        this.occurrence = occurrence;
    }



    public CE getOccurrenceSpan() {
        return occurrenceSpan;
    }



    public void setOccurrenceSpan(CE occurrenceSpan) {
        this.occurrenceSpan = occurrenceSpan;
    }



    public String getOccurSpanStartDate() {
        return occurSpanStartDate;
    }



    public void setOccurSpanStartDate(String occurSpanStartDate) {
        this.occurSpanStartDate = occurSpanStartDate;
    }



    public String getOccurSpanEndDate() {
        return occurSpanEndDate;
    }



    public void setOccurSpanEndDate(String occurSpanEndDate) {
        this.occurSpanEndDate = occurSpanEndDate;
    }



    public String getUb82Locator2() {
        return ub82Locator2;
    }



    public void setUb82Locator2(String ub82Locator2) {
        this.ub82Locator2 = ub82Locator2;
    }



    public String getUb82Locator9() {
        return ub82Locator9;
    }



    public void setUb82Locator9(String ub82Locator9) {
        this.ub82Locator9 = ub82Locator9;
    }



    public String getUb82Locator27() {
        return ub82Locator27;
    }



    public void setUb82Locator27(String ub82Locator27) {
        this.ub82Locator27 = ub82Locator27;
    }



    public String getUb82Locator45() {
        return ub82Locator45;
    }



    public void setUb82Locator45(String ub82Locator45) {
        this.ub82Locator45 = ub82Locator45;
    }



    @Override
    public String toHL7() {
        return "UB1" + HL7util.processAllFields(this);
    }
}
