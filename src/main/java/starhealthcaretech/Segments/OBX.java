package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.EI;
import starhealthcaretech.DataTypes.TS;
import starhealthcaretech.DataTypes.XAD;
import starhealthcaretech.DataTypes.XCN;
import starhealthcaretech.DataTypes.XON;
import starhealthcaretech.HL7Helper.HL7util;

public class OBX implements HL7SegmentInterface{
    private String setIdOBX; // Set ID - OBX
    private String valueType; // Value Type
    private CE observationIdentifier; // Observation Identifier
    private String observationSubId; // Observation Sub-ID
    private List<String> observationValue; // Observation Value
    private CE units; // Units
    private String referencesRange; // References Range
    private List<String> abnormalFlags; // Abnormal Flags
    private String probability; // Probability
    private List<String> natureOfAbnormalTest; // Nature of Abnormal Test
    private String observationResultStatus; // Observation Result Status
    private TS effectiveDateOfReferenceRange; // Effective Date of Reference Range
    private String userDefinedAccessChecks; // User Defined Access Checks
    private TS dateTimeOfTheObservation; // Date/Time of the Observation
    private CE producersId; // Producer's ID
    private List<XCN> responsibleObserver; // Responsible Observer
    private List<CE> observationMethod; // Observation Method
    private List<EI> equipmentInstanceIdentifier; // Equipment Instance Identifier
    private TS dateTimeOfTheAnalysis; // Date/Time of the Analysis
    private String reservedForHarmonizationV26_1; // Reserved for harmonization with V2.6
    private String reservedForHarmonizationV26_2; // Reserved for harmonization with V2.6
    private String reservedForHarmonizationV26_3; // Reserved for harmonization with V2.6
    private XON performingOrganizationName; // Performing Organization Name
    private XAD performingOrganizationAddress; // Performing Organization Address
    private XCN performingOrganizationMedicalDirector; // Performing Organization Medical Director


     // Getters and Setters
     public String getSetIdOBX() {
        return setIdOBX;
    }

    public void setSetIdOBX(String setIdOBX) {
        this.setIdOBX = setIdOBX;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public CE getObservationIdentifier() {
        return observationIdentifier;
    }

    public void setObservationIdentifier(CE observationIdentifier) {
        this.observationIdentifier = observationIdentifier;
    }

    public String getObservationSubId() {
        return observationSubId;
    }

    public void setObservationSubId(String observationSubId) {
        this.observationSubId = observationSubId;
    }

    public List<String> getObservationValue() {
        return observationValue;
    }

    public void setObservationValue(List<String> observationValue) {
        this.observationValue = observationValue;
    }

    public CE getUnits() {
        return units;
    }

    public void setUnits(CE units) {
        this.units = units;
    }

    public String getReferencesRange() {
        return referencesRange;
    }

    public void setReferencesRange(String referencesRange) {
        this.referencesRange = referencesRange;
    }

    public List<String> getAbnormalFlags() {
        return abnormalFlags;
    }

    public void setAbnormalFlags(List<String> abnormalFlags) {
        this.abnormalFlags = abnormalFlags;
    }

    public String getProbability() {
        return probability;
    }

    public void setProbability(String probability) {
        this.probability = probability;
    }

    public List<String> getNatureOfAbnormalTest() {
        return natureOfAbnormalTest;
    }

    public void setNatureOfAbnormalTest(List<String> natureOfAbnormalTest) {
        this.natureOfAbnormalTest = natureOfAbnormalTest;
    }

    public String getObservationResultStatus() {
        return observationResultStatus;
    }

    public void setObservationResultStatus(String observationResultStatus) {
        this.observationResultStatus = observationResultStatus;
    }

    public TS getEffectiveDateOfReferenceRange() {
        return effectiveDateOfReferenceRange;
    }

    public void setEffectiveDateOfReferenceRange(TS effectiveDateOfReferenceRange) {
        this.effectiveDateOfReferenceRange = effectiveDateOfReferenceRange;
    }

    public String getUserDefinedAccessChecks() {
        return userDefinedAccessChecks;
    }

    public void setUserDefinedAccessChecks(String userDefinedAccessChecks) {
        this.userDefinedAccessChecks = userDefinedAccessChecks;
    }

    public TS getDateTimeOfTheObservation() {
        return dateTimeOfTheObservation;
    }

    public void setDateTimeOfTheObservation(TS dateTimeOfTheObservation) {
        this.dateTimeOfTheObservation = dateTimeOfTheObservation;
    }

    public CE getProducersId() {
        return producersId;
    }

    public void setProducersId(CE producersId) {
        this.producersId = producersId;
    }

    public List<XCN> getResponsibleObserver() {
        return responsibleObserver;
    }

    public void setResponsibleObserver(List<XCN> responsibleObserver) {
        this.responsibleObserver = responsibleObserver;
    }

    public List<CE> getObservationMethod() {
        return observationMethod;
    }

    public void setObservationMethod(List<CE> observationMethod) {
        this.observationMethod = observationMethod;
    }

    public List<EI> getEquipmentInstanceIdentifier() {
        return equipmentInstanceIdentifier;
    }

    public void setEquipmentInstanceIdentifier(List<EI> equipmentInstanceIdentifier) {
        this.equipmentInstanceIdentifier = equipmentInstanceIdentifier;
    }

    public TS getDateTimeOfTheAnalysis() {
        return dateTimeOfTheAnalysis;
    }

    public void setDateTimeOfTheAnalysis(TS dateTimeOfTheAnalysis) {
        this.dateTimeOfTheAnalysis = dateTimeOfTheAnalysis;
    }

    public String getReservedForHarmonizationV26_1() {
        return reservedForHarmonizationV26_1;
    }

    public void setReservedForHarmonizationV26_1(String reservedForHarmonizationV26_1) {
        this.reservedForHarmonizationV26_1 = reservedForHarmonizationV26_1;
    }

    public String getReservedForHarmonizationV26_2() {
        return reservedForHarmonizationV26_2;
    }

    public void setReservedForHarmonizationV26_2(String reservedForHarmonizationV26_2) {
        this.reservedForHarmonizationV26_2 = reservedForHarmonizationV26_2;
    }

    public String getReservedForHarmonizationV26_3() {
        return reservedForHarmonizationV26_3;
    }

    public void setReservedForHarmonizationV26_3(String reservedForHarmonizationV26_3) {
        this.reservedForHarmonizationV26_3 = reservedForHarmonizationV26_3;
    }

    public XON getPerformingOrganizationName() {
        return performingOrganizationName;
    }

    public void setPerformingOrganizationName(XON performingOrganizationName) {
        this.performingOrganizationName = performingOrganizationName;
    }

    public XAD getPerformingOrganizationAddress() {
        return performingOrganizationAddress;
    }

    public void setPerformingOrganizationAddress(XAD performingOrganizationAddress) {
        this.performingOrganizationAddress = performingOrganizationAddress;
    }

    public XCN getPerformingOrganizationMedicalDirector() {
        return performingOrganizationMedicalDirector;
    }

    public void setPerformingOrganizationMedicalDirector(XCN performingOrganizationMedicalDirector) {
        this.performingOrganizationMedicalDirector = performingOrganizationMedicalDirector;
    }



    @Override
    public String toHL7() {
        return "OBX" + HL7util.processAllFields(this);
    }
}
