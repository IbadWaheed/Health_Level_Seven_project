package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.CX;
import starhealthcaretech.DataTypes.JCC;
import starhealthcaretech.DataTypes.XAD;
import starhealthcaretech.DataTypes.XON;
import starhealthcaretech.DataTypes.XPN;
import starhealthcaretech.DataTypes.XTN;
import starhealthcaretech.HL7Helper.HL7util;

public class NK1 implements HL7SegmentInterface {

    private String setIdNK1; // NK1.1
    private List<XPN> nkName; // NK1.2
    private CE relationship; // NK1.3
    private List<XAD> address; // NK1.4
    private List<XTN> phoneNumber; // NK1.5
    private List<XTN> businessPhoneNumber; // NK1.6
    private CE contactRole; // NK1.7
    private String startDate; // NK1.8
    private String endDate; // NK1.9
    private String jobTitle; // NK1.10
    private JCC jobCodeClass; // NK1.11
    private CX employeeNumber; // NK1.12
    private List<XON> organizationName; // NK1.13
    private CE maritalStatus; // NK1.14
    private String administrativeSex; // NK1.15
    private String dateTimeOfBirth; // NK1.16
    private List<String> livingDependency; // NK1.17
    private List<String> ambulatoryStatus; // NK1.18
    private List<CE> citizenship; // NK1.19
    private CE primaryLanguage; // NK1.20
    private String livingArrangement; // NK1.21
    private CE publicityCode; // NK1.22
    private String protectionIndicator; // NK1.23
    private String studentIndicator; // NK1.24
    private CE religion; // NK1.25
    private List<XPN> mothersMaidenName; // NK1.26
    private CE nationality; // NK1.27
    private List<CE> ethnicGroup; // NK1.28
    private List<CE> contactReason; // NK1.29
    private List<XPN> contactPersonsName; // NK1.30
    private List<XTN> contactPersonsTelephoneNumber; // NK1.31
    private List<XAD> contactPersonsAddress; // NK1.32
    private List<CX> partyIdentifiers; // NK1.33
    private String jobStatus; // NK1.34
    private List<CE> race; // NK1.35
    private String handicap; // NK1.36
    private String contactPersonSSN; // NK1.37
    private String birthPlace; // NK1.38
    private String vipIndicator; // NK1.39

    

    public String getSetIdNK1() {
        return setIdNK1;
    }

    public void setSetIdNK1(String setIdNK1) {
        this.setIdNK1 = setIdNK1;
    }

    public List<XPN> getNkName() {
        return nkName;
    }

    public void setNkName(List<XPN> nkName) {
        this.nkName = nkName;
    }

    public CE getRelationship() {
        return relationship;
    }

    public void setRelationship(CE relationship) {
        this.relationship = relationship;
    }

    public List<XAD> getAddress() {
        return address;
    }

    public void setAddress(List<XAD> address) {
        this.address = address;
    }

    public List<XTN> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<XTN> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<XTN> getBusinessPhoneNumber() {
        return businessPhoneNumber;
    }

    public void setBusinessPhoneNumber(List<XTN> businessPhoneNumber) {
        this.businessPhoneNumber = businessPhoneNumber;
    }

    public CE getContactRole() {
        return contactRole;
    }

    public void setContactRole(CE contactRole) {
        this.contactRole = contactRole;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
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

    public CX getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(CX employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public List<XON> getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(List<XON> organizationName) {
        this.organizationName = organizationName;
    }

    public CE getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(CE maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getAdministrativeSex() {
        return administrativeSex;
    }

    public void setAdministrativeSex(String administrativeSex) {
        this.administrativeSex = administrativeSex;
    }

    public String getDateTimeOfBirth() {
        return dateTimeOfBirth;
    }

    public void setDateTimeOfBirth(String dateTimeOfBirth) {
        this.dateTimeOfBirth = dateTimeOfBirth;
    }

    public List<String> getLivingDependency() {
        return livingDependency;
    }

    public void setLivingDependency(List<String> livingDependency) {
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

    public List<CE> getContactReason() {
        return contactReason;
    }

    public void setContactReason(List<CE> contactReason) {
        this.contactReason = contactReason;
    }

    public List<XPN> getContactPersonsName() {
        return contactPersonsName;
    }

    public void setContactPersonsName(List<XPN> contactPersonsName) {
        this.contactPersonsName = contactPersonsName;
    }

    public List<XTN> getContactPersonsTelephoneNumber() {
        return contactPersonsTelephoneNumber;
    }

    public void setContactPersonsTelephoneNumber(List<XTN> contactPersonsTelephoneNumber) {
        this.contactPersonsTelephoneNumber = contactPersonsTelephoneNumber;
    }

    public List<XAD> getContactPersonsAddress() {
        return contactPersonsAddress;
    }

    public void setContactPersonsAddress(List<XAD> contactPersonsAddress) {
        this.contactPersonsAddress = contactPersonsAddress;
    }

    public List<CX> getPartyIdentifiers() {
        return partyIdentifiers;
    }

    public void setPartyIdentifiers(List<CX> partyIdentifiers) {
        this.partyIdentifiers = partyIdentifiers;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public List<CE> getRace() {
        return race;
    }

    public void setRace(List<CE> race) {
        this.race = race;
    }

    public String getHandicap() {
        return handicap;
    }

    public void setHandicap(String handicap) {
        this.handicap = handicap;
    }

    public String getContactPersonSSN() {
        return contactPersonSSN;
    }

    public void setContactPersonSSN(String contactPersonSSN) {
        this.contactPersonSSN = contactPersonSSN;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getVipIndicator() {
        return vipIndicator;
    }

    public void setVipIndicator(String vipIndicator) {
        this.vipIndicator = vipIndicator;
    }

    @Override
    public String toHL7() {
        return "NK1" + HL7util.processAllFields(this);
    }
}
