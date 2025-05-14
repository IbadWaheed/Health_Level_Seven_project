package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.CX;
import starhealthcaretech.DataTypes.DDI;
import starhealthcaretech.DataTypes.JCC;
import starhealthcaretech.DataTypes.PTA;
import starhealthcaretech.DataTypes.RMC;
import starhealthcaretech.DataTypes.XCN;
import starhealthcaretech.DataTypes.XON;
import starhealthcaretech.DataTypes.XPN;
import starhealthcaretech.DataTypes.XTN;
import starhealthcaretech.HL7Helper.HL7util;

public class IN2 implements HL7SegmentInterface{
    
    
    public List<CX> insuredEmployeeId;
    public String insuredSSN;
    public List<XCN> insuredEmployerNameAndId;
    public String employerInformationData;
    public List<String> mailClaimParty;
    public String medicareHealthInsCardNumber;
    public List<XPN> medicaidCaseName;
    public String medicaidCaseNumber;
    public List<XPN> militarySponsorName;
    public String militaryIdNumber;
    public CE dependentOfMilitaryRecipient;
    public String militaryOrganization;
    public String militaryStation;
    public String militaryService;
    public String militaryRankGrade;
    public String militaryStatus;
    public String militaryRetireDate;
    public String militaryNonAvailCertOnFile;
    public String babyCoverage;
    public String combineBabyBill;
    public String bloodDeductible;
    public List<XPN> specialCoverageApprovalName;
    public String specialCoverageApprovalTitle;
    public List<String> nonCoveredInsuranceCode;
    public List<CX> payorId;
    public List<CX> payorSubscriberId;
    public String eligibilitySource;
    public List<RMC> roomCoverageTypeAmount;
    public List<PTA> policyTypeAmount;
    public DDI dailyDeductible;
    public String livingDependency;
    public List<String> ambulatoryStatus;
    public List<CE> citizenship;
    public CE primaryLanguage;
    public String livingArrangement;
    public CE publicityCode;
    public String protectionIndicator;
    public String studentIndicator;
    public CE religion;
    public List<XPN> mothersMaidenName;
    public CE nationality;
    public List<CE> ethnicGroup;
    public List<CE> maritalStatus;
    public String insuredEmploymentStartDate;
    public String employmentStopDate;
    public String jobTitle;
    public JCC jobCodeClass;
    public String jobStatus;
    public List<XPN> employerContactPersonName;
    public List<XTN> employerContactPersonPhoneNumber;
    public String employerContactReason;
    public List<XPN> insuredContactPersonName;
    public List<XTN> insuredContactPersonPhoneNumber;
    public List<String> insuredContactPersonReason;
    public String relationshipToPatientStartDate;
    public List<String> relationshipToPatientStopDate;
    public String insuranceCoContactReason;
    public XTN insuranceCoContactPhoneNumber;
    public String policyScope;
    public String policySource;
    public CX patientMemberNumber;
    public CE guarantorRelationshipToInsured;
    public List<XTN> insuredPhoneNumberHome;
    public List<XTN> insuredEmployerPhoneNumber;
    public CE militaryHandicappedProgram;
    public String suspendFlag;
    public String copayLimitFlag;
    public String stoplossLimitFlag;
    public List<XON> insuredOrganizationNameAndId;
    public List<XON> insuredEmployerOrganizationNameAndId;
    public List<CE> race;
    public CE cmsPatientRelationshipToInsured;

    

    public List<CX> getInsuredEmployeeId() {
        return insuredEmployeeId;
    }



    public void setInsuredEmployeeId(List<CX> insuredEmployeeId) {
        this.insuredEmployeeId = insuredEmployeeId;
    }



    public String getInsuredSSN() {
        return insuredSSN;
    }



    public void setInsuredSSN(String insuredSSN) {
        this.insuredSSN = insuredSSN;
    }



    public List<XCN> getInsuredEmployerNameAndId() {
        return insuredEmployerNameAndId;
    }



    public void setInsuredEmployerNameAndId(List<XCN> insuredEmployerNameAndId) {
        this.insuredEmployerNameAndId = insuredEmployerNameAndId;
    }



    public String getEmployerInformationData() {
        return employerInformationData;
    }



    public void setEmployerInformationData(String employerInformationData) {
        this.employerInformationData = employerInformationData;
    }



    public List<String> getMailClaimParty() {
        return mailClaimParty;
    }



    public void setMailClaimParty(List<String> mailClaimParty) {
        this.mailClaimParty = mailClaimParty;
    }



    public String getMedicareHealthInsCardNumber() {
        return medicareHealthInsCardNumber;
    }



    public void setMedicareHealthInsCardNumber(String medicareHealthInsCardNumber) {
        this.medicareHealthInsCardNumber = medicareHealthInsCardNumber;
    }



    public List<XPN> getMedicaidCaseName() {
        return medicaidCaseName;
    }



    public void setMedicaidCaseName(List<XPN> medicaidCaseName) {
        this.medicaidCaseName = medicaidCaseName;
    }



    public String getMedicaidCaseNumber() {
        return medicaidCaseNumber;
    }



    public void setMedicaidCaseNumber(String medicaidCaseNumber) {
        this.medicaidCaseNumber = medicaidCaseNumber;
    }



    public List<XPN> getMilitarySponsorName() {
        return militarySponsorName;
    }



    public void setMilitarySponsorName(List<XPN> militarySponsorName) {
        this.militarySponsorName = militarySponsorName;
    }



    public String getMilitaryIdNumber() {
        return militaryIdNumber;
    }



    public void setMilitaryIdNumber(String militaryIdNumber) {
        this.militaryIdNumber = militaryIdNumber;
    }



    public CE getDependentOfMilitaryRecipient() {
        return dependentOfMilitaryRecipient;
    }



    public void setDependentOfMilitaryRecipient(CE dependentOfMilitaryRecipient) {
        this.dependentOfMilitaryRecipient = dependentOfMilitaryRecipient;
    }



    public String getMilitaryOrganization() {
        return militaryOrganization;
    }



    public void setMilitaryOrganization(String militaryOrganization) {
        this.militaryOrganization = militaryOrganization;
    }



    public String getMilitaryStation() {
        return militaryStation;
    }



    public void setMilitaryStation(String militaryStation) {
        this.militaryStation = militaryStation;
    }



    public String getMilitaryService() {
        return militaryService;
    }



    public void setMilitaryService(String militaryService) {
        this.militaryService = militaryService;
    }



    public String getMilitaryRankGrade() {
        return militaryRankGrade;
    }



    public void setMilitaryRankGrade(String militaryRankGrade) {
        this.militaryRankGrade = militaryRankGrade;
    }



    public String getMilitaryStatus() {
        return militaryStatus;
    }



    public void setMilitaryStatus(String militaryStatus) {
        this.militaryStatus = militaryStatus;
    }



    public String getMilitaryRetireDate() {
        return militaryRetireDate;
    }



    public void setMilitaryRetireDate(String militaryRetireDate) {
        this.militaryRetireDate = militaryRetireDate;
    }



    public String getMilitaryNonAvailCertOnFile() {
        return militaryNonAvailCertOnFile;
    }



    public void setMilitaryNonAvailCertOnFile(String militaryNonAvailCertOnFile) {
        this.militaryNonAvailCertOnFile = militaryNonAvailCertOnFile;
    }



    public String getBabyCoverage() {
        return babyCoverage;
    }



    public void setBabyCoverage(String babyCoverage) {
        this.babyCoverage = babyCoverage;
    }



    public String getCombineBabyBill() {
        return combineBabyBill;
    }



    public void setCombineBabyBill(String combineBabyBill) {
        this.combineBabyBill = combineBabyBill;
    }



    public String getBloodDeductible() {
        return bloodDeductible;
    }



    public void setBloodDeductible(String bloodDeductible) {
        this.bloodDeductible = bloodDeductible;
    }



    public List<XPN> getSpecialCoverageApprovalName() {
        return specialCoverageApprovalName;
    }



    public void setSpecialCoverageApprovalName(List<XPN> specialCoverageApprovalName) {
        this.specialCoverageApprovalName = specialCoverageApprovalName;
    }



    public String getSpecialCoverageApprovalTitle() {
        return specialCoverageApprovalTitle;
    }



    public void setSpecialCoverageApprovalTitle(String specialCoverageApprovalTitle) {
        this.specialCoverageApprovalTitle = specialCoverageApprovalTitle;
    }



    public List<String> getNonCoveredInsuranceCode() {
        return nonCoveredInsuranceCode;
    }



    public void setNonCoveredInsuranceCode(List<String> nonCoveredInsuranceCode) {
        this.nonCoveredInsuranceCode = nonCoveredInsuranceCode;
    }



    public List<CX> getPayorId() {
        return payorId;
    }



    public void setPayorId(List<CX> payorId) {
        this.payorId = payorId;
    }



    public List<CX> getPayorSubscriberId() {
        return payorSubscriberId;
    }



    public void setPayorSubscriberId(List<CX> payorSubscriberId) {
        this.payorSubscriberId = payorSubscriberId;
    }



    public String getEligibilitySource() {
        return eligibilitySource;
    }



    public void setEligibilitySource(String eligibilitySource) {
        this.eligibilitySource = eligibilitySource;
    }



    public List<RMC> getRoomCoverageTypeAmount() {
        return roomCoverageTypeAmount;
    }



    public void setRoomCoverageTypeAmount(List<RMC> roomCoverageTypeAmount) {
        this.roomCoverageTypeAmount = roomCoverageTypeAmount;
    }



    public List<PTA> getPolicyTypeAmount() {
        return policyTypeAmount;
    }



    public void setPolicyTypeAmount(List<PTA> policyTypeAmount) {
        this.policyTypeAmount = policyTypeAmount;
    }



    public DDI getDailyDeductible() {
        return dailyDeductible;
    }



    public void setDailyDeductible(DDI dailyDeductible) {
        this.dailyDeductible = dailyDeductible;
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



    public List<CE> getMaritalStatus() {
        return maritalStatus;
    }



    public void setMaritalStatus(List<CE> maritalStatus) {
        this.maritalStatus = maritalStatus;
    }



    public String getInsuredEmploymentStartDate() {
        return insuredEmploymentStartDate;
    }



    public void setInsuredEmploymentStartDate(String insuredEmploymentStartDate) {
        this.insuredEmploymentStartDate = insuredEmploymentStartDate;
    }



    public String getEmploymentStopDate() {
        return employmentStopDate;
    }



    public void setEmploymentStopDate(String employmentStopDate) {
        this.employmentStopDate = employmentStopDate;
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



    public String getJobStatus() {
        return jobStatus;
    }



    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }



    public List<XPN> getEmployerContactPersonName() {
        return employerContactPersonName;
    }



    public void setEmployerContactPersonName(List<XPN> employerContactPersonName) {
        this.employerContactPersonName = employerContactPersonName;
    }



    public List<XTN> getEmployerContactPersonPhoneNumber() {
        return employerContactPersonPhoneNumber;
    }



    public void setEmployerContactPersonPhoneNumber(List<XTN> employerContactPersonPhoneNumber) {
        this.employerContactPersonPhoneNumber = employerContactPersonPhoneNumber;
    }



    public String getEmployerContactReason() {
        return employerContactReason;
    }



    public void setEmployerContactReason(String employerContactReason) {
        this.employerContactReason = employerContactReason;
    }



    public List<XPN> getInsuredContactPersonName() {
        return insuredContactPersonName;
    }



    public void setInsuredContactPersonName(List<XPN> insuredContactPersonName) {
        this.insuredContactPersonName = insuredContactPersonName;
    }



    public List<XTN> getInsuredContactPersonPhoneNumber() {
        return insuredContactPersonPhoneNumber;
    }



    public void setInsuredContactPersonPhoneNumber(List<XTN> insuredContactPersonPhoneNumber) {
        this.insuredContactPersonPhoneNumber = insuredContactPersonPhoneNumber;
    }



    public List<String> getInsuredContactPersonReason() {
        return insuredContactPersonReason;
    }



    public void setInsuredContactPersonReason(List<String> insuredContactPersonReason) {
        this.insuredContactPersonReason = insuredContactPersonReason;
    }



    public String getRelationshipToPatientStartDate() {
        return relationshipToPatientStartDate;
    }



    public void setRelationshipToPatientStartDate(String relationshipToPatientStartDate) {
        this.relationshipToPatientStartDate = relationshipToPatientStartDate;
    }



    public List<String> getRelationshipToPatientStopDate() {
        return relationshipToPatientStopDate;
    }



    public void setRelationshipToPatientStopDate(List<String> relationshipToPatientStopDate) {
        this.relationshipToPatientStopDate = relationshipToPatientStopDate;
    }



    public String getInsuranceCoContactReason() {
        return insuranceCoContactReason;
    }



    public void setInsuranceCoContactReason(String insuranceCoContactReason) {
        this.insuranceCoContactReason = insuranceCoContactReason;
    }



    public XTN getInsuranceCoContactPhoneNumber() {
        return insuranceCoContactPhoneNumber;
    }



    public void setInsuranceCoContactPhoneNumber(XTN insuranceCoContactPhoneNumber) {
        this.insuranceCoContactPhoneNumber = insuranceCoContactPhoneNumber;
    }



    public String getPolicyScope() {
        return policyScope;
    }



    public void setPolicyScope(String policyScope) {
        this.policyScope = policyScope;
    }



    public String getPolicySource() {
        return policySource;
    }



    public void setPolicySource(String policySource) {
        this.policySource = policySource;
    }



    public CX getPatientMemberNumber() {
        return patientMemberNumber;
    }



    public void setPatientMemberNumber(CX patientMemberNumber) {
        this.patientMemberNumber = patientMemberNumber;
    }



    public CE getGuarantorRelationshipToInsured() {
        return guarantorRelationshipToInsured;
    }



    public void setGuarantorRelationshipToInsured(CE guarantorRelationshipToInsured) {
        this.guarantorRelationshipToInsured = guarantorRelationshipToInsured;
    }



    public List<XTN> getInsuredPhoneNumberHome() {
        return insuredPhoneNumberHome;
    }



    public void setInsuredPhoneNumberHome(List<XTN> insuredPhoneNumberHome) {
        this.insuredPhoneNumberHome = insuredPhoneNumberHome;
    }



    public List<XTN> getInsuredEmployerPhoneNumber() {
        return insuredEmployerPhoneNumber;
    }



    public void setInsuredEmployerPhoneNumber(List<XTN> insuredEmployerPhoneNumber) {
        this.insuredEmployerPhoneNumber = insuredEmployerPhoneNumber;
    }



    public CE getMilitaryHandicappedProgram() {
        return militaryHandicappedProgram;
    }



    public void setMilitaryHandicappedProgram(CE militaryHandicappedProgram) {
        this.militaryHandicappedProgram = militaryHandicappedProgram;
    }



    public String getSuspendFlag() {
        return suspendFlag;
    }



    public void setSuspendFlag(String suspendFlag) {
        this.suspendFlag = suspendFlag;
    }



    public String getCopayLimitFlag() {
        return copayLimitFlag;
    }



    public void setCopayLimitFlag(String copayLimitFlag) {
        this.copayLimitFlag = copayLimitFlag;
    }



    public String getStoplossLimitFlag() {
        return stoplossLimitFlag;
    }



    public void setStoplossLimitFlag(String stoplossLimitFlag) {
        this.stoplossLimitFlag = stoplossLimitFlag;
    }



    public List<XON> getInsuredOrganizationNameAndId() {
        return insuredOrganizationNameAndId;
    }



    public void setInsuredOrganizationNameAndId(List<XON> insuredOrganizationNameAndId) {
        this.insuredOrganizationNameAndId = insuredOrganizationNameAndId;
    }



    public List<XON> getInsuredEmployerOrganizationNameAndId() {
        return insuredEmployerOrganizationNameAndId;
    }



    public void setInsuredEmployerOrganizationNameAndId(List<XON> insuredEmployerOrganizationNameAndId) {
        this.insuredEmployerOrganizationNameAndId = insuredEmployerOrganizationNameAndId;
    }



    public List<CE> getRace() {
        return race;
    }



    public void setRace(List<CE> race) {
        this.race = race;
    }



    public CE getCmsPatientRelationshipToInsured() {
        return cmsPatientRelationshipToInsured;
    }



    public void setCmsPatientRelationshipToInsured(CE cmsPatientRelationshipToInsured) {
        this.cmsPatientRelationshipToInsured = cmsPatientRelationshipToInsured;
    }



    @Override
    public String toHL7() {
        return "IN2" + HL7util.processAllFields(this);
    }
}
