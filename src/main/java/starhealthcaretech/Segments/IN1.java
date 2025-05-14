package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.AUI;
import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.CX;
import starhealthcaretech.DataTypes.XAD;
import starhealthcaretech.DataTypes.XCN;
import starhealthcaretech.DataTypes.XON;
import starhealthcaretech.DataTypes.XPN;
import starhealthcaretech.DataTypes.XTN;
import starhealthcaretech.HL7Helper.HL7util;

public class IN1 implements HL7SegmentInterface{

    
    private String setIdIn1; // IN1.1
    private CE insurancePlanId; // IN1.2
    private List<CX> insuranceCompanyId; // IN1.3
    private List<XON> insuranceCompanyName; // IN1.4
    private List<XAD> insuranceCompanyAddress; // IN1.5
    private List<XPN> insuranceCoContactPerson; // IN1.6
    private List<XTN> insuranceCoPhoneNumber; // IN1.7
    private String groupNumber; // IN1.8
    private List<XON> groupName; // IN1.9
    private List<CX> insuredGroupEmpId; // IN1.10
    private List<XON> insuredGroupEmpName; // IN1.11
    private String planEffectiveDate; // IN1.12
    private String planExpirationDate; // IN1.13
    private AUI authorizationInformation; // IN1.14
    private String planType; // IN1.15
    private List<XPN> nameOfInsured; // IN1.16
    private CE insuredRelationshipToPatient; // IN1.17
    private String insuredDateOfBirth; // IN1.18
    private List<XAD> insuredAddress; // IN1.19
    private String assignmentOfBenefits; // IN1.20
    private String coordinationOfBenefits; // IN1.21
    private String coordOfBenefitsPriority; // IN1.22
    private String noticeOfAdmissionFlag; // IN1.23
    private String noticeOfAdmissionDate; // IN1.24
    private String reportOfEligibilityFlag; // IN1.25
    private String reportOfEligibilityDate; // IN1.26
    private String releaseInformationCode; // IN1.27
    private String preAdmitCert; // IN1.28
    private String verificationDateTime; // IN1.29
    private List<XCN> verificationBy; // IN1.30
    private String typeOfAgreementCode; // IN1.31
    private String billingStatus; // IN1.32
    private String lifetimeReserveDays; // IN1.33
    private String delayBeforeLRDay; // IN1.34
    private String companyPlanCode; // IN1.35
    private String policyNumber; // IN1.36
    private String policyDeductible; // IN1.37 (CP)
    private String policyLimitAmount; // IN1.38 (CP)
    private String policyLimitDays; // IN1.39
    private String roomRateSemiPrivate; // IN1.40 (CP)
    private String roomRatePrivate; // IN1.41 (CP)
    private CE insuredEmploymentStatus; // IN1.42
    private String insuredAdministrativeSex; // IN1.43
    private List<XAD> insuredEmployerAddress; // IN1.44
    private String verificationStatus; // IN1.45
    private String priorInsurancePlanId; // IN1.46
    private String coverageType; // IN1.47
    private String handicap; // IN1.48
    private List<CX> insuredIdNumber; // IN1.49
    private String signatureCode; // IN1.50
    private String signatureCodeDate; // IN1.51
    private String insuredBirthPlace; // IN1.52
    private String vipIndicator; // IN1.53


    public String getSetIdIn1() {
        return setIdIn1;
    }


    public void setSetIdIn1(String setIdIn1) {
        this.setIdIn1 = setIdIn1;
    }


    public CE getInsurancePlanId() {
        return insurancePlanId;
    }


    public void setInsurancePlanId(CE insurancePlanId) {
        this.insurancePlanId = insurancePlanId;
    }


    public List<CX> getInsuranceCompanyId() {
        return insuranceCompanyId;
    }


    public void setInsuranceCompanyId(List<CX> insuranceCompanyId) {
        this.insuranceCompanyId = insuranceCompanyId;
    }


    public List<XON> getInsuranceCompanyName() {
        return insuranceCompanyName;
    }


    public void setInsuranceCompanyName(List<XON> insuranceCompanyName) {
        this.insuranceCompanyName = insuranceCompanyName;
    }


    public List<XAD> getInsuranceCompanyAddress() {
        return insuranceCompanyAddress;
    }


    public void setInsuranceCompanyAddress(List<XAD> insuranceCompanyAddress) {
        this.insuranceCompanyAddress = insuranceCompanyAddress;
    }


    public List<XPN> getInsuranceCoContactPerson() {
        return insuranceCoContactPerson;
    }


    public void setInsuranceCoContactPerson(List<XPN> insuranceCoContactPerson) {
        this.insuranceCoContactPerson = insuranceCoContactPerson;
    }


    public List<XTN> getInsuranceCoPhoneNumber() {
        return insuranceCoPhoneNumber;
    }


    public void setInsuranceCoPhoneNumber(List<XTN> insuranceCoPhoneNumber) {
        this.insuranceCoPhoneNumber = insuranceCoPhoneNumber;
    }


    public String getGroupNumber() {
        return groupNumber;
    }


    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }


    public List<XON> getGroupName() {
        return groupName;
    }


    public void setGroupName(List<XON> groupName) {
        this.groupName = groupName;
    }


    public List<CX> getInsuredGroupEmpId() {
        return insuredGroupEmpId;
    }


    public void setInsuredGroupEmpId(List<CX> insuredGroupEmpId) {
        this.insuredGroupEmpId = insuredGroupEmpId;
    }


    public List<XON> getInsuredGroupEmpName() {
        return insuredGroupEmpName;
    }


    public void setInsuredGroupEmpName(List<XON> insuredGroupEmpName) {
        this.insuredGroupEmpName = insuredGroupEmpName;
    }


    public String getPlanEffectiveDate() {
        return planEffectiveDate;
    }


    public void setPlanEffectiveDate(String planEffectiveDate) {
        this.planEffectiveDate = planEffectiveDate;
    }


    public String getPlanExpirationDate() {
        return planExpirationDate;
    }


    public void setPlanExpirationDate(String planExpirationDate) {
        this.planExpirationDate = planExpirationDate;
    }


    public AUI getAuthorizationInformation() {
        return authorizationInformation;
    }


    public void setAuthorizationInformation(AUI authorizationInformation) {
        this.authorizationInformation = authorizationInformation;
    }


    public String getPlanType() {
        return planType;
    }


    public void setPlanType(String planType) {
        this.planType = planType;
    }


    public List<XPN> getNameOfInsured() {
        return nameOfInsured;
    }


    public void setNameOfInsured(List<XPN> nameOfInsured) {
        this.nameOfInsured = nameOfInsured;
    }


    public CE getInsuredRelationshipToPatient() {
        return insuredRelationshipToPatient;
    }


    public void setInsuredRelationshipToPatient(CE insuredRelationshipToPatient) {
        this.insuredRelationshipToPatient = insuredRelationshipToPatient;
    }


    public String getInsuredDateOfBirth() {
        return insuredDateOfBirth;
    }


    public void setInsuredDateOfBirth(String insuredDateOfBirth) {
        this.insuredDateOfBirth = insuredDateOfBirth;
    }


    public List<XAD> getInsuredAddress() {
        return insuredAddress;
    }


    public void setInsuredAddress(List<XAD> insuredAddress) {
        this.insuredAddress = insuredAddress;
    }


    public String getAssignmentOfBenefits() {
        return assignmentOfBenefits;
    }


    public void setAssignmentOfBenefits(String assignmentOfBenefits) {
        this.assignmentOfBenefits = assignmentOfBenefits;
    }


    public String getCoordinationOfBenefits() {
        return coordinationOfBenefits;
    }


    public void setCoordinationOfBenefits(String coordinationOfBenefits) {
        this.coordinationOfBenefits = coordinationOfBenefits;
    }


    public String getCoordOfBenefitsPriority() {
        return coordOfBenefitsPriority;
    }


    public void setCoordOfBenefitsPriority(String coordOfBenefitsPriority) {
        this.coordOfBenefitsPriority = coordOfBenefitsPriority;
    }


    public String getNoticeOfAdmissionFlag() {
        return noticeOfAdmissionFlag;
    }


    public void setNoticeOfAdmissionFlag(String noticeOfAdmissionFlag) {
        this.noticeOfAdmissionFlag = noticeOfAdmissionFlag;
    }


    public String getNoticeOfAdmissionDate() {
        return noticeOfAdmissionDate;
    }


    public void setNoticeOfAdmissionDate(String noticeOfAdmissionDate) {
        this.noticeOfAdmissionDate = noticeOfAdmissionDate;
    }


    public String getReportOfEligibilityFlag() {
        return reportOfEligibilityFlag;
    }


    public void setReportOfEligibilityFlag(String reportOfEligibilityFlag) {
        this.reportOfEligibilityFlag = reportOfEligibilityFlag;
    }


    public String getReportOfEligibilityDate() {
        return reportOfEligibilityDate;
    }


    public void setReportOfEligibilityDate(String reportOfEligibilityDate) {
        this.reportOfEligibilityDate = reportOfEligibilityDate;
    }


    public String getReleaseInformationCode() {
        return releaseInformationCode;
    }


    public void setReleaseInformationCode(String releaseInformationCode) {
        this.releaseInformationCode = releaseInformationCode;
    }


    public String getPreAdmitCert() {
        return preAdmitCert;
    }


    public void setPreAdmitCert(String preAdmitCert) {
        this.preAdmitCert = preAdmitCert;
    }


    public String getVerificationDateTime() {
        return verificationDateTime;
    }


    public void setVerificationDateTime(String verificationDateTime) {
        this.verificationDateTime = verificationDateTime;
    }


    public List<XCN> getVerificationBy() {
        return verificationBy;
    }


    public void setVerificationBy(List<XCN> verificationBy) {
        this.verificationBy = verificationBy;
    }


    public String getTypeOfAgreementCode() {
        return typeOfAgreementCode;
    }


    public void setTypeOfAgreementCode(String typeOfAgreementCode) {
        this.typeOfAgreementCode = typeOfAgreementCode;
    }


    public String getBillingStatus() {
        return billingStatus;
    }


    public void setBillingStatus(String billingStatus) {
        this.billingStatus = billingStatus;
    }


    public String getLifetimeReserveDays() {
        return lifetimeReserveDays;
    }


    public void setLifetimeReserveDays(String lifetimeReserveDays) {
        this.lifetimeReserveDays = lifetimeReserveDays;
    }


    public String getDelayBeforeLRDay() {
        return delayBeforeLRDay;
    }


    public void setDelayBeforeLRDay(String delayBeforeLRDay) {
        this.delayBeforeLRDay = delayBeforeLRDay;
    }


    public String getCompanyPlanCode() {
        return companyPlanCode;
    }


    public void setCompanyPlanCode(String companyPlanCode) {
        this.companyPlanCode = companyPlanCode;
    }


    public String getPolicyNumber() {
        return policyNumber;
    }


    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }


    public String getPolicyDeductible() {
        return policyDeductible;
    }


    public void setPolicyDeductible(String policyDeductible) {
        this.policyDeductible = policyDeductible;
    }


    public String getPolicyLimitAmount() {
        return policyLimitAmount;
    }


    public void setPolicyLimitAmount(String policyLimitAmount) {
        this.policyLimitAmount = policyLimitAmount;
    }


    public String getPolicyLimitDays() {
        return policyLimitDays;
    }


    public void setPolicyLimitDays(String policyLimitDays) {
        this.policyLimitDays = policyLimitDays;
    }


    public String getRoomRateSemiPrivate() {
        return roomRateSemiPrivate;
    }


    public void setRoomRateSemiPrivate(String roomRateSemiPrivate) {
        this.roomRateSemiPrivate = roomRateSemiPrivate;
    }


    public String getRoomRatePrivate() {
        return roomRatePrivate;
    }


    public void setRoomRatePrivate(String roomRatePrivate) {
        this.roomRatePrivate = roomRatePrivate;
    }


    public CE getInsuredEmploymentStatus() {
        return insuredEmploymentStatus;
    }


    public void setInsuredEmploymentStatus(CE insuredEmploymentStatus) {
        this.insuredEmploymentStatus = insuredEmploymentStatus;
    }


    public String getInsuredAdministrativeSex() {
        return insuredAdministrativeSex;
    }


    public void setInsuredAdministrativeSex(String insuredAdministrativeSex) {
        this.insuredAdministrativeSex = insuredAdministrativeSex;
    }


    public List<XAD> getInsuredEmployerAddress() {
        return insuredEmployerAddress;
    }


    public void setInsuredEmployerAddress(List<XAD> insuredEmployerAddress) {
        this.insuredEmployerAddress = insuredEmployerAddress;
    }


    public String getVerificationStatus() {
        return verificationStatus;
    }


    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }


    public String getPriorInsurancePlanId() {
        return priorInsurancePlanId;
    }


    public void setPriorInsurancePlanId(String priorInsurancePlanId) {
        this.priorInsurancePlanId = priorInsurancePlanId;
    }


    public String getCoverageType() {
        return coverageType;
    }


    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }


    public String getHandicap() {
        return handicap;
    }


    public void setHandicap(String handicap) {
        this.handicap = handicap;
    }


    public List<CX> getInsuredIdNumber() {
        return insuredIdNumber;
    }


    public void setInsuredIdNumber(List<CX> insuredIdNumber) {
        this.insuredIdNumber = insuredIdNumber;
    }


    public String getSignatureCode() {
        return signatureCode;
    }


    public void setSignatureCode(String signatureCode) {
        this.signatureCode = signatureCode;
    }


    public String getSignatureCodeDate() {
        return signatureCodeDate;
    }


    public void setSignatureCodeDate(String signatureCodeDate) {
        this.signatureCodeDate = signatureCodeDate;
    }


    public String getInsuredBirthPlace() {
        return insuredBirthPlace;
    }


    public void setInsuredBirthPlace(String insuredBirthPlace) {
        this.insuredBirthPlace = insuredBirthPlace;
    }


    public String getVipIndicator() {
        return vipIndicator;
    }


    public void setVipIndicator(String vipIndicator) {
        this.vipIndicator = vipIndicator;
    }


    @Override
    public String toHL7() {
        return "IN1" + HL7util.processAllFields(this);
    }
}
