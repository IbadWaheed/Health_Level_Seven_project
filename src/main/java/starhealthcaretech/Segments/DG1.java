package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.CP;
import starhealthcaretech.DataTypes.EI;
import starhealthcaretech.DataTypes.TS;
import starhealthcaretech.DataTypes.XCN;
import starhealthcaretech.HL7Helper.HL7util;

public class DG1 implements HL7SegmentInterface{
    private String setIdDG1; // Set ID - DG1
    private String diagnosisCodingMethod; // Diagnosis Coding Method
    private CE diagnosisCode; // Diagnosis Code - DG1
    private String diagnosisDescription; // Diagnosis Description
    private TS diagnosisDateTime; // Diagnosis Date/Time
    private String diagnosisType; // Diagnosis Type
    private CE majorDiagnosticCategory; // Major Diagnostic Category
    private CE diagnosticRelatedGroup; // Diagnostic Related Group
    private String drgApprovalIndicator; // DRG Approval Indicator
    private String drgGrouperReviewCode; // DRG Grouper Review Code
    private CE outlierType; // Outlier Type
    private String outlierDays; // Outlier Days
    private CP outlierCost; // Outlier Cost
    private String grouperVersionAndType; // Grouper Version and Type
    private String diagnosisPriority; // Diagnosis Priority
    private List<XCN> diagnosingClinician; // Diagnosing Clinician
    private String diagnosisClassification; // Diagnosis Classification
    private String confidentialIndicator; // Confidential Indicator
    private TS attestationDateTime; // Attestation Date/Time
    private EI diagnosisIdentifier; // Diagnosis Identifier
    private String diagnosisActionCode; // Diagnosis Action Code

    // Getter and Setter methods
    public String getSetIdDG1() {
        return setIdDG1;
    }

    public void setSetIdDG1(String setIdDG1) {
        this.setIdDG1 = setIdDG1;
    }

    public String getDiagnosisCodingMethod() {
        return diagnosisCodingMethod;
    }

    public void setDiagnosisCodingMethod(String diagnosisCodingMethod) {
        this.diagnosisCodingMethod = diagnosisCodingMethod;
    }

    public CE getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(CE diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    public String getDiagnosisDescription() {
        return diagnosisDescription;
    }

    public void setDiagnosisDescription(String diagnosisDescription) {
        this.diagnosisDescription = diagnosisDescription;
    }

    public TS getDiagnosisDateTime() {
        return diagnosisDateTime;
    }

    public void setDiagnosisDateTime(TS diagnosisDateTime) {
        this.diagnosisDateTime = diagnosisDateTime;
    }

    public String getDiagnosisType() {
        return diagnosisType;
    }

    public void setDiagnosisType(String diagnosisType) {
        this.diagnosisType = diagnosisType;
    }

    public CE getMajorDiagnosticCategory() {
        return majorDiagnosticCategory;
    }

    public void setMajorDiagnosticCategory(CE majorDiagnosticCategory) {
        this.majorDiagnosticCategory = majorDiagnosticCategory;
    }

    public CE getDiagnosticRelatedGroup() {
        return diagnosticRelatedGroup;
    }

    public void setDiagnosticRelatedGroup(CE diagnosticRelatedGroup) {
        this.diagnosticRelatedGroup = diagnosticRelatedGroup;
    }

    public String getDrgApprovalIndicator() {
        return drgApprovalIndicator;
    }

    public void setDrgApprovalIndicator(String drgApprovalIndicator) {
        this.drgApprovalIndicator = drgApprovalIndicator;
    }

    public String getDrgGrouperReviewCode() {
        return drgGrouperReviewCode;
    }

    public void setDrgGrouperReviewCode(String drgGrouperReviewCode) {
        this.drgGrouperReviewCode = drgGrouperReviewCode;
    }

    public CE getOutlierType() {
        return outlierType;
    }

    public void setOutlierType(CE outlierType) {
        this.outlierType = outlierType;
    }

    public String getOutlierDays() {
        return outlierDays;
    }

    public void setOutlierDays(String outlierDays) {
        this.outlierDays = outlierDays;
    }

    public CP getOutlierCost() {
        return outlierCost;
    }

    public void setOutlierCost(CP outlierCost) {
        this.outlierCost = outlierCost;
    }

    public String getGrouperVersionAndType() {
        return grouperVersionAndType;
    }

    public void setGrouperVersionAndType(String grouperVersionAndType) {
        this.grouperVersionAndType = grouperVersionAndType;
    }

    public String getDiagnosisPriority() {
        return diagnosisPriority;
    }

    public void setDiagnosisPriority(String diagnosisPriority) {
        this.diagnosisPriority = diagnosisPriority;
    }

    public List<XCN> getDiagnosingClinician() {
        return diagnosingClinician;
    }

    public void setDiagnosingClinician(List<XCN> diagnosingClinician) {
        this.diagnosingClinician = diagnosingClinician;
    }

    public String getDiagnosisClassification() {
        return diagnosisClassification;
    }

    public void setDiagnosisClassification(String diagnosisClassification) {
        this.diagnosisClassification = diagnosisClassification;
    }

    public String getConfidentialIndicator() {
        return confidentialIndicator;
    }

    public void setConfidentialIndicator(String confidentialIndicator) {
        this.confidentialIndicator = confidentialIndicator;
    }

    public TS getAttestationDateTime() {
        return attestationDateTime;
    }

    public void setAttestationDateTime(TS attestationDateTime) {
        this.attestationDateTime = attestationDateTime;
    }

    public EI getDiagnosisIdentifier() {
        return diagnosisIdentifier;
    }

    public void setDiagnosisIdentifier(EI diagnosisIdentifier) {
        this.diagnosisIdentifier = diagnosisIdentifier;
    }

    public String getDiagnosisActionCode() {
        return diagnosisActionCode;
    }

    public void setDiagnosisActionCode(String diagnosisActionCode) {
        this.diagnosisActionCode = diagnosisActionCode;
    }

    @Override
    public String toHL7() {
        return "DG1" + HL7util.processAllFields(this);
    }
}
