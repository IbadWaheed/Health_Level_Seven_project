package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.CWE;
import starhealthcaretech.DataTypes.CX;
import starhealthcaretech.DataTypes.DLN;
import starhealthcaretech.DataTypes.HD;
import starhealthcaretech.DataTypes.TS;
import starhealthcaretech.DataTypes.XAD;
import starhealthcaretech.DataTypes.XPN;
import starhealthcaretech.DataTypes.XTN;
import starhealthcaretech.HL7Helper.HL7util;

public class PID implements HL7SegmentInterface{
    private String setIdPid;
    private CX patientId;
    private List<String> patientIdentifierList;
    private List<CX> alternatePatientId;
    private List<XPN> patientName;
    private List<XPN> mothersMaidenName;
    private String dateTimeOfBirth;
    private String administrativeSex;
    private List<XPN> patientAlias;
    private String race;
    private List<XAD> patientAddress;
    private String countyCode;
    private List<XTN> phoneNumberHome;
    private List<XTN> phoneNumberBusiness;
    private CE primaryLanguage;
    private String maritalStatus;
    private CE religion;
    private CX patientAccountNumber;
    private String ssnNumberPatient;
    private DLN driversLicenseNumberPatient;
    private List<CX> mothersIdentifier;
    private List<String> ethnicGroup;
    private String birthPlace;
    private String multipleBirthIndicator;
    private String birthOrder;
    private List<CE> citizenship;
    private CE veteransMilitaryStatus;
    private CE nationality;
    private TS patientDeathDateTime;
    private String patientDeathIndicator;
    private String identityUnknownIndicator;
    private List<String> identityReliabilityCode;
    private TS lastUpdateDateTime;
    private HD lastUpdateFacility;
    private CE speciesCode;
    private CE breedCode;
    private String strain;
    private List<CE> productionClassCode;
    private List<CWE> tribalCitizenship;

    // Getters and setters for each field...

    public String getSetIdPid() {
        return setIdPid;
    }

    public void setSetIdPid(String setIdPid) {
        this.setIdPid = setIdPid;
    }

    public CX getPatientId() {
        return patientId;
    }

    public void setPatientId(CX patientId) {
        this.patientId = patientId;
    }

    public List<String> getPatientIdentifierList() {
        return patientIdentifierList;
    }

    public void setPatientIdentifierList(List<String> patientIdentifierList) {
        this.patientIdentifierList = patientIdentifierList;
    }

    public List<CX> getAlternatePatientId() {
        return alternatePatientId;
    }

    public void setAlternatePatientId(List<CX> alternatePatientId) {
        this.alternatePatientId = alternatePatientId;
    }

    public List<XPN> getPatientName() {
        return patientName;
    }

    public void setPatientName(List<XPN> patientName) {
        this.patientName = patientName;
    }

    public List<XPN> getMothersMaidenName() {
        return mothersMaidenName;
    }

    public void setMothersMaidenName(List<XPN> mothersMaidenName) {
        this.mothersMaidenName = mothersMaidenName;
    }

    public String getDateTimeOfBirth() {
        return dateTimeOfBirth;
    }

    public void setDateTimeOfBirth(String dateTimeOfBirth) {
        this.dateTimeOfBirth = dateTimeOfBirth;
    }

    public String getAdministrativeSex() {
        return administrativeSex;
    }

    public void setAdministrativeSex(String administrativeSex) {
        this.administrativeSex = administrativeSex;
    }

    public List<XPN> getPatientAlias() {
        return patientAlias;
    }

    public void setPatientAlias(List<XPN> patientAlias) {
        this.patientAlias = patientAlias;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public List<XAD> getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(List<XAD> patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public List<XTN> getPhoneNumberHome() {
        return phoneNumberHome;
    }

    public void setPhoneNumberHome(List<XTN> phoneNumberHome) {
        this.phoneNumberHome = phoneNumberHome;
    }

    public List<XTN> getPhoneNumberBusiness() {
        return phoneNumberBusiness;
    }

    public void setPhoneNumberBusiness(List<XTN> phoneNumberBusiness) {
        this.phoneNumberBusiness = phoneNumberBusiness;
    }

    public CE getPrimaryLanguage() {
        return primaryLanguage;
    }

    public void setPrimaryLanguage(CE primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public CE getReligion() {
        return religion;
    }

    public void setReligion(CE religion) {
        this.religion = religion;
    }

    public CX getPatientAccountNumber() {
        return patientAccountNumber;
    }

    public void setPatientAccountNumber(CX patientAccountNumber) {
        this.patientAccountNumber = patientAccountNumber;
    }

    public String getSsnNumberPatient() {
        return ssnNumberPatient;
    }

    public void setSsnNumberPatient(String ssnNumberPatient) {
        this.ssnNumberPatient = ssnNumberPatient;
    }

    public DLN getDriversLicenseNumberPatient() {
        return driversLicenseNumberPatient;
    }

    public void setDriversLicenseNumberPatient(DLN driversLicenseNumberPatient) {
        this.driversLicenseNumberPatient = driversLicenseNumberPatient;
    }

    public List<CX> getMothersIdentifier() {
        return mothersIdentifier;
    }

    public void setMothersIdentifier(List<CX> mothersIdentifier) {
        this.mothersIdentifier = mothersIdentifier;
    }

    public List<String> getEthnicGroup() {
        return ethnicGroup;
    }

    public void setEthnicGroup(List<String> ethnicGroup) {
        this.ethnicGroup = ethnicGroup;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getMultipleBirthIndicator() {
        return multipleBirthIndicator;
    }

    public void setMultipleBirthIndicator(String multipleBirthIndicator) {
        this.multipleBirthIndicator = multipleBirthIndicator;
    }

    public String getBirthOrder() {
        return birthOrder;
    }

    public void setBirthOrder(String birthOrder) {
        this.birthOrder = birthOrder;
    }

    public List<CE> getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(List<CE> citizenship) {
        this.citizenship = citizenship;
    }

    public CE getVeteransMilitaryStatus() {
        return veteransMilitaryStatus;
    }

    public void setVeteransMilitaryStatus(CE veteransMilitaryStatus) {
        this.veteransMilitaryStatus = veteransMilitaryStatus;
    }

    public CE getNationality() {
        return nationality;
    }

    public void setNationality(CE nationality) {
        this.nationality = nationality;
    }

    public TS getPatientDeathDateTime() {
        return patientDeathDateTime;
    }

    public void setPatientDeathDateTime(TS patientDeathDateTime) {
        this.patientDeathDateTime = patientDeathDateTime;
    }

    public String getPatientDeathIndicator() {
        return patientDeathIndicator;
    }

    public void setPatientDeathIndicator(String patientDeathIndicator) {
        this.patientDeathIndicator = patientDeathIndicator;
    }

    public String getIdentityUnknownIndicator() {
        return identityUnknownIndicator;
    }

    public void setIdentityUnknownIndicator(String identityUnknownIndicator) {
        this.identityUnknownIndicator = identityUnknownIndicator;
    }

    public List<String> getIdentityReliabilityCode() {
        return identityReliabilityCode;
    }

    public void setIdentityReliabilityCode(List<String> identityReliabilityCode) {
        this.identityReliabilityCode = identityReliabilityCode;
    }

    public TS getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    public void setLastUpdateDateTime(TS lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    public HD getLastUpdateFacility() {
        return lastUpdateFacility;
    }

    public void setLastUpdateFacility(HD lastUpdateFacility) {
        this.lastUpdateFacility = lastUpdateFacility;
    }

    public CE getSpeciesCode() {
        return speciesCode;
    }

    public void setSpeciesCode(CE speciesCode) {
        this.speciesCode = speciesCode;
    }

    public CE getBreedCode() {
        return breedCode;
    }

    public void setBreedCode(CE breedCode) {
        this.breedCode = breedCode;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public List<CE> getProductionClassCode() {
        return productionClassCode;
    }

    public void setProductionClassCode(List<CE> productionClassCode) {
        this.productionClassCode = productionClassCode;
    }

    public List<CWE> getTribalCitizenship() {
        return tribalCitizenship;
    }

    public void setTribalCitizenship(List<CWE> tribalCitizenship) {
        this.tribalCitizenship = tribalCitizenship;
    }

    @Override
    public String toHL7() {
        return "PID" + HL7util.processAllFields(this);
    }    
}
