package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.CX;
import starhealthcaretech.DataTypes.DTN;
import starhealthcaretech.DataTypes.ICD;
import starhealthcaretech.DataTypes.MOP;
import starhealthcaretech.DataTypes.XCN;
import starhealthcaretech.DataTypes.XTN;
import starhealthcaretech.HL7Helper.HL7util;

public class IN3 implements HL7SegmentInterface{

    private String setIdIn3;
    private CX certificationNumber;
    private List<XCN> certifiedBy;
    private String certificationRequired;
    private MOP penalty;
    private String certificationDateTime;
    private String certificationModifyDateTime;
    private List<XCN> operator;
    private String certificationBeginDate;
    private String certificationEndDate;
    private DTN days;
    private CE nonConcurCodeDescription;
    private String nonConcurEffectiveDateTime;
    private List<XCN> physicianReviewer;
    private String certificationContact;
    private List<XTN> certificationContactPhoneNumber;
    private CE appealReason;
    private CE certificationAgency;
    private List<XTN> certificationAgencyPhoneNumber;
    private List<ICD> preCertificationRequirement;
    private String caseManager;
    private String secondOpinionDate;
    private String secondOpinionStatus;
    private List<String> secondOpinionDocumentationReceived;
    private List<XCN> secondOpinionPhysician;

    

    public String getSetIdIn3() {
        return setIdIn3;
    }



    public void setSetIdIn3(String setIdIn3) {
        this.setIdIn3 = setIdIn3;
    }



    public CX getCertificationNumber() {
        return certificationNumber;
    }



    public void setCertificationNumber(CX certificationNumber) {
        this.certificationNumber = certificationNumber;
    }



    public List<XCN> getCertifiedBy() {
        return certifiedBy;
    }



    public void setCertifiedBy(List<XCN> certifiedBy) {
        this.certifiedBy = certifiedBy;
    }



    public String getCertificationRequired() {
        return certificationRequired;
    }



    public void setCertificationRequired(String certificationRequired) {
        this.certificationRequired = certificationRequired;
    }



    public MOP getPenalty() {
        return penalty;
    }



    public void setPenalty(MOP penalty) {
        this.penalty = penalty;
    }



    public String getCertificationDateTime() {
        return certificationDateTime;
    }



    public void setCertificationDateTime(String certificationDateTime) {
        this.certificationDateTime = certificationDateTime;
    }



    public String getCertificationModifyDateTime() {
        return certificationModifyDateTime;
    }



    public void setCertificationModifyDateTime(String certificationModifyDateTime) {
        this.certificationModifyDateTime = certificationModifyDateTime;
    }



    public List<XCN> getOperator() {
        return operator;
    }



    public void setOperator(List<XCN> operator) {
        this.operator = operator;
    }



    public String getCertificationBeginDate() {
        return certificationBeginDate;
    }



    public void setCertificationBeginDate(String certificationBeginDate) {
        this.certificationBeginDate = certificationBeginDate;
    }



    public String getCertificationEndDate() {
        return certificationEndDate;
    }



    public void setCertificationEndDate(String certificationEndDate) {
        this.certificationEndDate = certificationEndDate;
    }



    public DTN getDays() {
        return days;
    }



    public void setDays(DTN days) {
        this.days = days;
    }



    public CE getNonConcurCodeDescription() {
        return nonConcurCodeDescription;
    }



    public void setNonConcurCodeDescription(CE nonConcurCodeDescription) {
        this.nonConcurCodeDescription = nonConcurCodeDescription;
    }



    public String getNonConcurEffectiveDateTime() {
        return nonConcurEffectiveDateTime;
    }



    public void setNonConcurEffectiveDateTime(String nonConcurEffectiveDateTime) {
        this.nonConcurEffectiveDateTime = nonConcurEffectiveDateTime;
    }



    public List<XCN> getPhysicianReviewer() {
        return physicianReviewer;
    }



    public void setPhysicianReviewer(List<XCN> physicianReviewer) {
        this.physicianReviewer = physicianReviewer;
    }



    public String getCertificationContact() {
        return certificationContact;
    }



    public void setCertificationContact(String certificationContact) {
        this.certificationContact = certificationContact;
    }



    public List<XTN> getCertificationContactPhoneNumber() {
        return certificationContactPhoneNumber;
    }



    public void setCertificationContactPhoneNumber(List<XTN> certificationContactPhoneNumber) {
        this.certificationContactPhoneNumber = certificationContactPhoneNumber;
    }



    public CE getAppealReason() {
        return appealReason;
    }



    public void setAppealReason(CE appealReason) {
        this.appealReason = appealReason;
    }



    public CE getCertificationAgency() {
        return certificationAgency;
    }



    public void setCertificationAgency(CE certificationAgency) {
        this.certificationAgency = certificationAgency;
    }



    public List<XTN> getCertificationAgencyPhoneNumber() {
        return certificationAgencyPhoneNumber;
    }



    public void setCertificationAgencyPhoneNumber(List<XTN> certificationAgencyPhoneNumber) {
        this.certificationAgencyPhoneNumber = certificationAgencyPhoneNumber;
    }



    public List<ICD> getPreCertificationRequirement() {
        return preCertificationRequirement;
    }



    public void setPreCertificationRequirement(List<ICD> preCertificationRequirement) {
        this.preCertificationRequirement = preCertificationRequirement;
    }



    public String getCaseManager() {
        return caseManager;
    }



    public void setCaseManager(String caseManager) {
        this.caseManager = caseManager;
    }



    public String getSecondOpinionDate() {
        return secondOpinionDate;
    }



    public void setSecondOpinionDate(String secondOpinionDate) {
        this.secondOpinionDate = secondOpinionDate;
    }



    public String getSecondOpinionStatus() {
        return secondOpinionStatus;
    }



    public void setSecondOpinionStatus(String secondOpinionStatus) {
        this.secondOpinionStatus = secondOpinionStatus;
    }



    public List<String> getSecondOpinionDocumentationReceived() {
        return secondOpinionDocumentationReceived;
    }



    public void setSecondOpinionDocumentationReceived(List<String> secondOpinionDocumentationReceived) {
        this.secondOpinionDocumentationReceived = secondOpinionDocumentationReceived;
    }



    public List<XCN> getSecondOpinionPhysician() {
        return secondOpinionPhysician;
    }



    public void setSecondOpinionPhysician(List<XCN> secondOpinionPhysician) {
        this.secondOpinionPhysician = secondOpinionPhysician;
    }



    @Override
    public String toHL7() {
        return "IN3" + HL7util.processAllFields(this);
    }

}


