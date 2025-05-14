package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.*;
import starhealthcaretech.HL7Helper.HL7util;

public class FT1 implements HL7SegmentInterface{
    
    private String setIdFt1;
    private String transactionId;
    private String transactionBatchId;
    private DR transactionDate;
    private TS transactionPostingDate;
    private String transactionType;
    private CE transactionCode;
    private String transactionDescription;
    private String transactionDescriptionAlt;
    private String transactionQuantity;
    private CP transactionAmountExtended;
    private CP transactionAmountUnit;
    private CE departmentCode;
    private CE insurancePlanId;
    private CP insuranceAmount;
    private PL assignedPatientLocation;
    private String feeSchedule;
    private String patientType;
    private List<CE> diagnosisCodeFt1;
    private List<XCN> performedByCode;
    private List<XCN> orderedByCode;
    private CP unitCost;
    private EI fillerOrderNumber;
    private List<XCN> enteredByCode;
    private CE procedureCode;
    private List<CE> procedureCodeModifier;
    private CE advancedBeneficiaryNoticeCode;
    private CWE medicallyNecessaryDuplicateProcedureReason;
    private CNE ndcCode;
    private CX paymentReferenceId;
    private List<String> transactionReferenceKey;
    public String getSetIdFt1() {
        return setIdFt1;
    }
    public void setSetIdFt1(String setIdFt1) {
        this.setIdFt1 = setIdFt1;
    }
    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public String getTransactionBatchId() {
        return transactionBatchId;
    }
    public void setTransactionBatchId(String transactionBatchId) {
        this.transactionBatchId = transactionBatchId;
    }
    public DR getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(DR transactionDate) {
        this.transactionDate = transactionDate;
    }
    public TS getTransactionPostingDate() {
        return transactionPostingDate;
    }
    public void setTransactionPostingDate(TS transactionPostingDate) {
        this.transactionPostingDate = transactionPostingDate;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    public CE getTransactionCode() {
        return transactionCode;
    }
    public void setTransactionCode(CE transactionCode) {
        this.transactionCode = transactionCode;
    }
    public String getTransactionDescription() {
        return transactionDescription;
    }
    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }
    public String getTransactionDescriptionAlt() {
        return transactionDescriptionAlt;
    }
    public void setTransactionDescriptionAlt(String transactionDescriptionAlt) {
        this.transactionDescriptionAlt = transactionDescriptionAlt;
    }
    public String getTransactionQuantity() {
        return transactionQuantity;
    }
    public void setTransactionQuantity(String transactionQuantity) {
        this.transactionQuantity = transactionQuantity;
    }
    public CP getTransactionAmountExtended() {
        return transactionAmountExtended;
    }
    public void setTransactionAmountExtended(CP transactionAmountExtended) {
        this.transactionAmountExtended = transactionAmountExtended;
    }
    public CP getTransactionAmountUnit() {
        return transactionAmountUnit;
    }
    public void setTransactionAmountUnit(CP transactionAmountUnit) {
        this.transactionAmountUnit = transactionAmountUnit;
    }
    public CE getDepartmentCode() {
        return departmentCode;
    }
    public void setDepartmentCode(CE departmentCode) {
        this.departmentCode = departmentCode;
    }
    public CE getInsurancePlanId() {
        return insurancePlanId;
    }
    public void setInsurancePlanId(CE insurancePlanId) {
        this.insurancePlanId = insurancePlanId;
    }
    public CP getInsuranceAmount() {
        return insuranceAmount;
    }
    public void setInsuranceAmount(CP insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }
    public PL getAssignedPatientLocation() {
        return assignedPatientLocation;
    }
    public void setAssignedPatientLocation(PL assignedPatientLocation) {
        this.assignedPatientLocation = assignedPatientLocation;
    }
    public String getFeeSchedule() {
        return feeSchedule;
    }
    public void setFeeSchedule(String feeSchedule) {
        this.feeSchedule = feeSchedule;
    }
    public String getPatientType() {
        return patientType;
    }
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }
    public List<CE> getDiagnosisCodeFt1() {
        return diagnosisCodeFt1;
    }
    public void setDiagnosisCodeFt1(List<CE> diagnosisCodeFt1) {
        this.diagnosisCodeFt1 = diagnosisCodeFt1;
    }
    public List<XCN> getPerformedByCode() {
        return performedByCode;
    }
    public void setPerformedByCode(List<XCN> performedByCode) {
        this.performedByCode = performedByCode;
    }
    public List<XCN> getOrderedByCode() {
        return orderedByCode;
    }
    public void setOrderedByCode(List<XCN> orderedByCode) {
        this.orderedByCode = orderedByCode;
    }
    public CP getUnitCost() {
        return unitCost;
    }
    public void setUnitCost(CP unitCost) {
        this.unitCost = unitCost;
    }
    public EI getFillerOrderNumber() {
        return fillerOrderNumber;
    }
    public void setFillerOrderNumber(EI fillerOrderNumber) {
        this.fillerOrderNumber = fillerOrderNumber;
    }
    public List<XCN> getEnteredByCode() {
        return enteredByCode;
    }
    public void setEnteredByCode(List<XCN> enteredByCode) {
        this.enteredByCode = enteredByCode;
    }
    public CE getProcedureCode() {
        return procedureCode;
    }
    public void setProcedureCode(CE procedureCode) {
        this.procedureCode = procedureCode;
    }
    public List<CE> getProcedureCodeModifier() {
        return procedureCodeModifier;
    }
    public void setProcedureCodeModifier(List<CE> procedureCodeModifier) {
        this.procedureCodeModifier = procedureCodeModifier;
    }
    public CE getAdvancedBeneficiaryNoticeCode() {
        return advancedBeneficiaryNoticeCode;
    }
    public void setAdvancedBeneficiaryNoticeCode(CE advancedBeneficiaryNoticeCode) {
        this.advancedBeneficiaryNoticeCode = advancedBeneficiaryNoticeCode;
    }
    public CWE getMedicallyNecessaryDuplicateProcedureReason() {
        return medicallyNecessaryDuplicateProcedureReason;
    }
    public void setMedicallyNecessaryDuplicateProcedureReason(CWE medicallyNecessaryDuplicateProcedureReason) {
        this.medicallyNecessaryDuplicateProcedureReason = medicallyNecessaryDuplicateProcedureReason;
    }
    public CNE getNdcCode() {
        return ndcCode;
    }
    public void setNdcCode(CNE ndcCode) {
        this.ndcCode = ndcCode;
    }
    public CX getPaymentReferenceId() {
        return paymentReferenceId;
    }
    public void setPaymentReferenceId(CX paymentReferenceId) {
        this.paymentReferenceId = paymentReferenceId;
    }
    public List<String> getTransactionReferenceKey() {
        return transactionReferenceKey;
    }
    public void setTransactionReferenceKey(List<String> transactionReferenceKey) {
        this.transactionReferenceKey = transactionReferenceKey;
    }


    @Override
    public String toHL7() {
        return "FT1" + HL7util.processAllFields(this);
    }

}
