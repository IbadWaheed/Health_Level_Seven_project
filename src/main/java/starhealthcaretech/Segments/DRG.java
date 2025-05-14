package starhealthcaretech.Segments;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.CP;
import starhealthcaretech.HL7Helper.HL7util;

public class DRG implements HL7SegmentInterface{

    private CE diagnosticRelatedGroup; // DRG.1
    private String drgAssignedDateTime; // DRG.2
    private String drgApprovalIndicator; // DRG.3
    private String drgGrouperReviewCode; // DRG.4
    private CE outlierType; // DRG.5
    private String outlierDays; // DRG.6
    private CP outlierCost; // DRG.7
    private String drgPayor; // DRG.8
    private CP outlierReimbursement; // DRG.9
    private String confidentialIndicator; // DRG.10
    private String drgTransferType; // DRG.11
    
    public CE getDiagnosticRelatedGroup() {
        return diagnosticRelatedGroup;
    }



    public void setDiagnosticRelatedGroup(CE diagnosticRelatedGroup) {
        this.diagnosticRelatedGroup = diagnosticRelatedGroup;
    }



    public String getDrgAssignedDateTime() {
        return drgAssignedDateTime;
    }



    public void setDrgAssignedDateTime(String drgAssignedDateTime) {
        this.drgAssignedDateTime = drgAssignedDateTime;
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



    public String getDrgPayor() {
        return drgPayor;
    }



    public void setDrgPayor(String drgPayor) {
        this.drgPayor = drgPayor;
    }



    public CP getOutlierReimbursement() {
        return outlierReimbursement;
    }



    public void setOutlierReimbursement(CP outlierReimbursement) {
        this.outlierReimbursement = outlierReimbursement;
    }



    public String getConfidentialIndicator() {
        return confidentialIndicator;
    }



    public void setConfidentialIndicator(String confidentialIndicator) {
        this.confidentialIndicator = confidentialIndicator;
    }



    public String getDrgTransferType() {
        return drgTransferType;
    }



    public void setDrgTransferType(String drgTransferType) {
        this.drgTransferType = drgTransferType;
    }



    



    @Override
    public String toHL7() {
        return "DRG" + HL7util.processAllFields(this);
    }
}
