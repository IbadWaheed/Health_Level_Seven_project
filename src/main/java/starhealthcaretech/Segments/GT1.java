package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.CP;
import starhealthcaretech.DataTypes.CX;
import starhealthcaretech.DataTypes.FC;
import starhealthcaretech.DataTypes.JCC;
import starhealthcaretech.DataTypes.XAD;
import starhealthcaretech.DataTypes.XON;
import starhealthcaretech.DataTypes.XPN;
import starhealthcaretech.DataTypes.XTN;
import starhealthcaretech.HL7Helper.HL7util;

public class GT1 implements HL7SegmentInterface{

    private String setIdGt1; // GT1.1
    private List<CX> guarantorNumber; // GT1.2
    private List<XPN> guarantorName; // GT1.3
    private List<XPN> guarantorSpouseName; // GT1.4
    private List<XAD> guarantorAddress; // GT1.5
    private List<XTN> guarantorPhoneNumberHome; // GT1.6
    private List<XTN> guarantorPhoneNumberBusiness; // GT1.7
    private String guarantorDateTimeOfBirth; // GT1.8 (TS)
    private String guarantorAdministrativeSex; // GT1.9
    private String guarantorType; // GT1.10
    private CE guarantorRelationship; // GT1.11
    private String guarantorSSN; // GT1.12
    private String guarantorDateBegin; // GT1.13
    private String guarantorDateEnd; // GT1.14
    private String guarantorPriority; // GT1.15
    private List<XPN> guarantorEmployerName; // GT1.16
    private List<XAD> guarantorEmployerAddress; // GT1.17
    private List<XTN> guarantorEmployerPhoneNumber; // GT1.18
    private List<CX> guarantorEmployeeIdNumber; // GT1.19
    private String guarantorEmploymentStatus; // GT1.20
    private List<XON> guarantorOrganizationName; // GT1.21
    private String guarantorBillingHoldFlag; // GT1.22
    private CE guarantorCreditRatingCode; // GT1.23
    private String guarantorDeathDateTime; // GT1.24 (TS)
    private String guarantorDeathFlag; // GT1.25
    private CE guarantorChargeAdjustmentCode; // GT1.26
    private CP guarantorHouseholdAnnualIncome; // GT1.27
    private String guarantorHouseholdSize; // GT1.28
    private List<CX> guarantorEmployerIdNumber; // GT1.29
    private CE guarantorMaritalStatusCode; // GT1.30
    private String guarantorHireEffectiveDate; // GT1.31
    private String employmentStopDate; // GT1.32
    private String livingDependency; // GT1.33
    private List<String> ambulatoryStatus; // GT1.34
    private List<CE> citizenship; // GT1.35
    private CE primaryLanguage; // GT1.36
    private String livingArrangement; // GT1.37
    private CE publicityCode; // GT1.38
    private String protectionIndicator; // GT1.39
    private String studentIndicator; // GT1.40
    private CE religion; // GT1.41
    private List<XPN> mothersMaidenName; // GT1.42
    private CE nationality; // GT1.43
    private List<CE> ethnicGroup; // GT1.44
    private List<XPN> contactPersonName; // GT1.45
    private List<XTN> contactPersonPhoneNumber; // GT1.46
    private CE contactReason; // GT1.47
    private String contactRelationship; // GT1.48
    private String jobTitle; // GT1.49
    private JCC jobCodeClass; // GT1.50
    private List<XON> guarantorEmployerOrgName; // GT1.51
    private String handicap; // GT1.52
    private String jobStatus; // GT1.53
    private FC guarantorFinancialClass; // GT1.54
    private List<CE> guarantorRace; // GT1.55
    private String guarantorBirthPlace; // GT1.56
    private String vipIndicator; // GT1.57



    public String getSetIdGt1() {
        return setIdGt1;
    }

    public void setSetIdGt1(String setIdGt1) {
        this.setIdGt1 = setIdGt1;
    }

    public List<CX> getGuarantorNumber() {
        return guarantorNumber;
    }

    public void setGuarantorNumber(List<CX> guarantorNumber) {
        this.guarantorNumber = guarantorNumber;
    }

    public List<XPN> getGuarantorName() {
        return guarantorName;
    }

    public void setGuarantorName(List<XPN> guarantorName) {
        this.guarantorName = guarantorName;
    }

    public List<XPN> getGuarantorSpouseName() {
        return guarantorSpouseName;
    }

    public void setGuarantorSpouseName(List<XPN> guarantorSpouseName) {
        this.guarantorSpouseName = guarantorSpouseName;
    }

    public List<XAD> getGuarantorAddress() {
        return guarantorAddress;
    }

    public void setGuarantorAddress(List<XAD> guarantorAddress) {
        this.guarantorAddress = guarantorAddress;
    }

    public List<XTN> getGuarantorPhoneNumberHome() {
        return guarantorPhoneNumberHome;
    }

    public void setGuarantorPhoneNumberHome(List<XTN> guarantorPhoneNumberHome) {
        this.guarantorPhoneNumberHome = guarantorPhoneNumberHome;
    }

    public List<XTN> getGuarantorPhoneNumberBusiness() {
        return guarantorPhoneNumberBusiness;
    }

    public void setGuarantorPhoneNumberBusiness(List<XTN> guarantorPhoneNumberBusiness) {
        this.guarantorPhoneNumberBusiness = guarantorPhoneNumberBusiness;
    }

    public String getGuarantorDateTimeOfBirth() {
        return guarantorDateTimeOfBirth;
    }

    public void setGuarantorDateTimeOfBirth(String guarantorDateTimeOfBirth) {
        this.guarantorDateTimeOfBirth = guarantorDateTimeOfBirth;
    }

    public String getGuarantorAdministrativeSex() {
        return guarantorAdministrativeSex;
    }

    public void setGuarantorAdministrativeSex(String guarantorAdministrativeSex) {
        this.guarantorAdministrativeSex = guarantorAdministrativeSex;
    }

    public String getGuarantorType() {
        return guarantorType;
    }

    public void setGuarantorType(String guarantorType) {
        this.guarantorType = guarantorType;
    }

    public CE getGuarantorRelationship() {
        return guarantorRelationship;
    }

    public void setGuarantorRelationship(CE guarantorRelationship) {
        this.guarantorRelationship = guarantorRelationship;
    }

    public String getGuarantorSSN() {
        return guarantorSSN;
    }

    public void setGuarantorSSN(String guarantorSSN) {
        this.guarantorSSN = guarantorSSN;
    }

    public String getGuarantorDateBegin() {
        return guarantorDateBegin;
    }

    public void setGuarantorDateBegin(String guarantorDateBegin) {
        this.guarantorDateBegin = guarantorDateBegin;
    }

    public String getGuarantorDateEnd() {
        return guarantorDateEnd;
    }

    public void setGuarantorDateEnd(String guarantorDateEnd) {
        this.guarantorDateEnd = guarantorDateEnd;
    }

    public String getGuarantorPriority() {
        return guarantorPriority;
    }

    public void setGuarantorPriority(String guarantorPriority) {
        this.guarantorPriority = guarantorPriority;
    }

    public List<XPN> getGuarantorEmployerName() {
        return guarantorEmployerName;
    }

    public void setGuarantorEmployerName(List<XPN> guarantorEmployerName) {
        this.guarantorEmployerName = guarantorEmployerName;
    }

    public List<XAD> getGuarantorEmployerAddress() {
        return guarantorEmployerAddress;
    }

    public void setGuarantorEmployerAddress(List<XAD> guarantorEmployerAddress) {
        this.guarantorEmployerAddress = guarantorEmployerAddress;
    }

    public List<XTN> getGuarantorEmployerPhoneNumber() {
        return guarantorEmployerPhoneNumber;
    }

    public void setGuarantorEmployerPhoneNumber(List<XTN> guarantorEmployerPhoneNumber) {
        this.guarantorEmployerPhoneNumber = guarantorEmployerPhoneNumber;
    }

    public List<CX> getGuarantorEmployeeIdNumber() {
        return guarantorEmployeeIdNumber;
    }

    public void setGuarantorEmployeeIdNumber(List<CX> guarantorEmployeeIdNumber) {
        this.guarantorEmployeeIdNumber = guarantorEmployeeIdNumber;
    }

    public String getGuarantorEmploymentStatus() {
        return guarantorEmploymentStatus;
    }

    public void setGuarantorEmploymentStatus(String guarantorEmploymentStatus) {
        this.guarantorEmploymentStatus = guarantorEmploymentStatus;
    }

    public List<XON> getGuarantorOrganizationName() {
        return guarantorOrganizationName;
    }

    public void setGuarantorOrganizationName(List<XON> guarantorOrganizationName) {
        this.guarantorOrganizationName = guarantorOrganizationName;
    }

    public String getGuarantorBillingHoldFlag() {
        return guarantorBillingHoldFlag;
    }

    public void setGuarantorBillingHoldFlag(String guarantorBillingHoldFlag) {
        this.guarantorBillingHoldFlag = guarantorBillingHoldFlag;
    }

    public CE getGuarantorCreditRatingCode() {
        return guarantorCreditRatingCode;
    }

    public void setGuarantorCreditRatingCode(CE guarantorCreditRatingCode) {
        this.guarantorCreditRatingCode = guarantorCreditRatingCode;
    }

    public String getGuarantorDeathDateTime() {
        return guarantorDeathDateTime;
    }

    public void setGuarantorDeathDateTime(String guarantorDeathDateTime) {
        this.guarantorDeathDateTime = guarantorDeathDateTime;
    }

    public String getGuarantorDeathFlag() {
        return guarantorDeathFlag;
    }

    public void setGuarantorDeathFlag(String guarantorDeathFlag) {
        this.guarantorDeathFlag = guarantorDeathFlag;
    }

    public CE getGuarantorChargeAdjustmentCode() {
        return guarantorChargeAdjustmentCode;
    }

    public void setGuarantorChargeAdjustmentCode(CE guarantorChargeAdjustmentCode) {
        this.guarantorChargeAdjustmentCode = guarantorChargeAdjustmentCode;
    }

    public CP getGuarantorHouseholdAnnualIncome() {
        return guarantorHouseholdAnnualIncome;
    }

    public void setGuarantorHouseholdAnnualIncome(CP guarantorHouseholdAnnualIncome) {
        this.guarantorHouseholdAnnualIncome = guarantorHouseholdAnnualIncome;
    }

    public String getGuarantorHouseholdSize() {
        return guarantorHouseholdSize;
    }

    public void setGuarantorHouseholdSize(String guarantorHouseholdSize) {
        this.guarantorHouseholdSize = guarantorHouseholdSize;
    }

    public List<CX> getGuarantorEmployerIdNumber() {
        return guarantorEmployerIdNumber;
    }

    public void setGuarantorEmployerIdNumber(List<CX> guarantorEmployerIdNumber) {
        this.guarantorEmployerIdNumber = guarantorEmployerIdNumber;
    }

    public CE getGuarantorMaritalStatusCode() {
        return guarantorMaritalStatusCode;
    }

    public void setGuarantorMaritalStatusCode(CE guarantorMaritalStatusCode) {
        this.guarantorMaritalStatusCode = guarantorMaritalStatusCode;
    }

    public String getGuarantorHireEffectiveDate() {
        return guarantorHireEffectiveDate;
    }

    public void setGuarantorHireEffectiveDate(String guarantorHireEffectiveDate) {
        this.guarantorHireEffectiveDate = guarantorHireEffectiveDate;
    }

    public String getEmploymentStopDate() {
        return employmentStopDate;
    }

    public void setEmploymentStopDate(String employmentStopDate) {
        this.employmentStopDate = employmentStopDate;
    }

    public String getLivingDependency() {
        return livingDependency;
    }

    public void setLivingDependency(String livingDependency) {
        this.livingDependency = livingDependency;
    }

    public List<String> getAmbulatoryStatus() {
        return ambulatoryStatus;
    }

    public void setAmbulatoryStatus(List<String> ambulatoryStatus) {
        this.ambulatoryStatus = ambulatoryStatus;
    }

    public List<CE> getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(List<CE> citizenship) {
        this.citizenship = citizenship;
    }

    public CE getPrimaryLanguage() {
        return primaryLanguage;
    }

    public void setPrimaryLanguage(CE primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }

    public String getLivingArrangement() {
        return livingArrangement;
    }

    public void setLivingArrangement(String livingArrangement) {
        this.livingArrangement = livingArrangement;
    }

    public CE getPublicityCode() {
        return publicityCode;
    }

    public void setPublicityCode(CE publicityCode) {
        this.publicityCode = publicityCode;
    }

    public String getProtectionIndicator() {
        return protectionIndicator;
    }

    public void setProtectionIndicator(String protectionIndicator) {
        this.protectionIndicator = protectionIndicator;
    }

    public String getStudentIndicator() {
        return studentIndicator;
    }

    public void setStudentIndicator(String studentIndicator) {
        this.studentIndicator = studentIndicator;
    }

    public CE getReligion() {
        return religion;
    }

    public void setReligion(CE religion) {
        this.religion = religion;
    }

    public List<XPN> getMothersMaidenName() {
        return mothersMaidenName;
    }

    public void setMothersMaidenName(List<XPN> mothersMaidenName) {
        this.mothersMaidenName = mothersMaidenName;
    }

    public CE getNationality() {
        return nationality;
    }

    public void setNationality(CE nationality) {
        this.nationality = nationality;
    }

    public List<CE> getEthnicGroup() {
        return ethnicGroup;
    }

    public void setEthnicGroup(List<CE> ethnicGroup) {
        this.ethnicGroup = ethnicGroup;
    }

    public List<XPN> getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(List<XPN> contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public List<XTN> getContactPersonPhoneNumber() {
        return contactPersonPhoneNumber;
    }

    public void setContactPersonPhoneNumber(List<XTN> contactPersonPhoneNumber) {
        this.contactPersonPhoneNumber = contactPersonPhoneNumber;
    }

    public CE getContactReason() {
        return contactReason;
    }

    public void setContactReason(CE contactReason) {
        this.contactReason = contactReason;
    }

    public String getContactRelationship() {
        return contactRelationship;
    }

    public void setContactRelationship(String contactRelationship) {
        this.contactRelationship = contactRelationship;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public JCC getJobCodeClass() {
        return jobCodeClass;
    }

    public void setJobCodeClass(JCC jobCodeClass) {
        this.jobCodeClass = jobCodeClass;
    }

    public List<XON> getGuarantorEmployerOrgName() {
        return guarantorEmployerOrgName;
    }

    public void setGuarantorEmployerOrgName(List<XON> guarantorEmployerOrgName) {
        this.guarantorEmployerOrgName = guarantorEmployerOrgName;
    }

    public String getHandicap() {
        return handicap;
    }

    public void setHandicap(String handicap) {
        this.handicap = handicap;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public FC getGuarantorFinancialClass() {
        return guarantorFinancialClass;
    }

    public void setGuarantorFinancialClass(FC guarantorFinancialClass) {
        this.guarantorFinancialClass = guarantorFinancialClass;
    }

    public List<CE> getGuarantorRace() {
        return guarantorRace;
    }

    public void setGuarantorRace(List<CE> guarantorRace) {
        this.guarantorRace = guarantorRace;
    }

    public String getGuarantorBirthPlace() {
        return guarantorBirthPlace;
    }

    public void setGuarantorBirthPlace(String guarantorBirthPlace) {
        this.guarantorBirthPlace = guarantorBirthPlace;
    }

    public String getVipIndicator() {
        return vipIndicator;
    }

    public void setVipIndicator(String vipIndicator) {
        this.vipIndicator = vipIndicator;
    }

    

    @Override
    public String toHL7() {
        return "GT1" + HL7util.processAllFields(this);
    }
}
