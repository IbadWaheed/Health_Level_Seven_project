package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.PL;
import starhealthcaretech.DataTypes.TS;
import starhealthcaretech.DataTypes.XCN;
import starhealthcaretech.DataTypes.XON;
import starhealthcaretech.HL7Helper.HL7util;

public class PV2 implements HL7SegmentInterface{
    private PL priorPendingLocation;
    private CE accommodationCode;
    private CE admitReason;
    private CE transferReason;
    private List<String> patientValuables;
    private String patientValuablesLocation;
    private List<String> visitUserCode;
    private TS expectedAdmitDateTime;
    private TS expectedDischargeDateTime;
    private String estimatedLengthOfInpatientStay;
    private String actualLengthOfInpatientStay;
    private String visitDescription;
    private List<XCN> referralSourceCode;
    private String previousServiceDate;
    private String employmentIllnessRelatedIndicator;
    private String purgeStatusCode;
    private String purgeStatusDate;
    private String specialProgramCode;
    private String retentionIndicator;
    private String expectedNumberOfInsurancePlans;
    private String visitPublicityCode;
    private String visitProtectionIndicator;
    private List<XON> clinicOrganizationName;
    private String patientStatusCode;
    private String visitPriorityCode;
    private String previousTreatmentDate;
    private String expectedDischargeDisposition;
    private String signatureOnFileDate;
    private String firstSimilarIllnessDate;
    private CE patientChargeAdjustmentCode;
    private String recurringServiceCode;
    private String billingMediaCode;
    private TS expectedSurgeryDateTime;
    private String militaryPartnershipCode;
    private String militaryNonAvailabilityCode;
    private String newbornBabyIndicator;
    private String babyDetainedIndicator;
    private CE modeOfArrivalCode;
    private List<CE> recreationalDrugUseCode;
    private CE admissionLevelOfCareCode;
    private List<CE> precautionCode;
    private CE patientConditionCode;
    private String livingWillCode;
    private String organDonorCode;
    private List<CE> advanceDirectiveCode;
    private String patientStatusEffectiveDate;
    private TS expectedLOAReturnDateTime;
    private TS expectedPreAdmissionTestingDateTime;
    private List<String> notifyClergyCode;

        // Getters and Setters
        public PL getPriorPendingLocation() {
            return priorPendingLocation;
        }
    
        public void setPriorPendingLocation(PL priorPendingLocation) {
            this.priorPendingLocation = priorPendingLocation;
        }
    
        public CE getAccommodationCode() {
            return accommodationCode;
        }
    
        public void setAccommodationCode(CE accommodationCode) {
            this.accommodationCode = accommodationCode;
        }
    
        public CE getAdmitReason() {
            return admitReason;
        }
    
        public void setAdmitReason(CE admitReason) {
            this.admitReason = admitReason;
        }
    
        public CE getTransferReason() {
            return transferReason;
        }
    
        public void setTransferReason(CE transferReason) {
            this.transferReason = transferReason;
        }
    
        public List<String> getPatientValuables() {
            return patientValuables;
        }
    
        public void setPatientValuables(List<String> patientValuables) {
            this.patientValuables = patientValuables;
        }
    
        public String getPatientValuablesLocation() {
            return patientValuablesLocation;
        }
    
        public void setPatientValuablesLocation(String patientValuablesLocation) {
            this.patientValuablesLocation = patientValuablesLocation;
        }
    
        public List<String> getVisitUserCode() {
            return visitUserCode;
        }
    
        public void setVisitUserCode(List<String> visitUserCode) {
            this.visitUserCode = visitUserCode;
        }
    
        public TS getExpectedAdmitDateTime() {
            return expectedAdmitDateTime;
        }
    
        public void setExpectedAdmitDateTime(TS expectedAdmitDateTime) {
            this.expectedAdmitDateTime = expectedAdmitDateTime;
        }
    
        public TS getExpectedDischargeDateTime() {
            return expectedDischargeDateTime;
        }
    
        public void setExpectedDischargeDateTime(TS expectedDischargeDateTime) {
            this.expectedDischargeDateTime = expectedDischargeDateTime;
        }
    
        public String getEstimatedLengthOfInpatientStay() {
            return estimatedLengthOfInpatientStay;
        }
    
        public void setEstimatedLengthOfInpatientStay(String estimatedLengthOfInpatientStay) {
            this.estimatedLengthOfInpatientStay = estimatedLengthOfInpatientStay;
        }
    
        public String getActualLengthOfInpatientStay() {
            return actualLengthOfInpatientStay;
        }
    
        public void setActualLengthOfInpatientStay(String actualLengthOfInpatientStay) {
            this.actualLengthOfInpatientStay = actualLengthOfInpatientStay;
        }
    
        public String getVisitDescription() {
            return visitDescription;
        }
    
        public void setVisitDescription(String visitDescription) {
            this.visitDescription = visitDescription;
        }
    
        public List<XCN> getReferralSourceCode() {
            return referralSourceCode;
        }
    
        public void setReferralSourceCode(List<XCN> referralSourceCode) {
            this.referralSourceCode = referralSourceCode;
        }
    
        public String getPreviousServiceDate() {
            return previousServiceDate;
        }
    
        public void setPreviousServiceDate(String previousServiceDate) {
            this.previousServiceDate = previousServiceDate;
        }
    
        public String getEmploymentIllnessRelatedIndicator() {
            return employmentIllnessRelatedIndicator;
        }
    
        public void setEmploymentIllnessRelatedIndicator(String employmentIllnessRelatedIndicator) {
            this.employmentIllnessRelatedIndicator = employmentIllnessRelatedIndicator;
        }
    
        public String getPurgeStatusCode() {
            return purgeStatusCode;
        }
    
        public void setPurgeStatusCode(String purgeStatusCode) {
            this.purgeStatusCode = purgeStatusCode;
        }
    
        public String getPurgeStatusDate() {
            return purgeStatusDate;
        }
    
        public void setPurgeStatusDate(String purgeStatusDate) {
            this.purgeStatusDate = purgeStatusDate;
        }
    
        public String getSpecialProgramCode() {
            return specialProgramCode;
        }
    
        public void setSpecialProgramCode(String specialProgramCode) {
            this.specialProgramCode = specialProgramCode;
        }
    
        public String getRetentionIndicator() {
            return retentionIndicator;
        }
    
        public void setRetentionIndicator(String retentionIndicator) {
            this.retentionIndicator = retentionIndicator;
        }
    
        public String getExpectedNumberOfInsurancePlans() {
            return expectedNumberOfInsurancePlans;
        }
    
        public void setExpectedNumberOfInsurancePlans(String expectedNumberOfInsurancePlans) {
            this.expectedNumberOfInsurancePlans = expectedNumberOfInsurancePlans;
        }
    
        public String getVisitPublicityCode() {
            return visitPublicityCode;
        }
    
        public void setVisitPublicityCode(String visitPublicityCode) {
            this.visitPublicityCode = visitPublicityCode;
        }
    
        public String getVisitProtectionIndicator() {
            return visitProtectionIndicator;
        }
    
        public void setVisitProtectionIndicator(String visitProtectionIndicator) {
            this.visitProtectionIndicator = visitProtectionIndicator;
        }
    
        public List<XON> getClinicOrganizationName() {
            return clinicOrganizationName;
        }
    
        public void setClinicOrganizationName(List<XON> clinicOrganizationName) {
            this.clinicOrganizationName = clinicOrganizationName;
        }
    
        public String getPatientStatusCode() {
            return patientStatusCode;
        }
    
        public void setPatientStatusCode(String patientStatusCode) {
            this.patientStatusCode = patientStatusCode;
        }
    
        public String getVisitPriorityCode() {
            return visitPriorityCode;
        }
    
        public void setVisitPriorityCode(String visitPriorityCode) {
            this.visitPriorityCode = visitPriorityCode;
        }
    
        public String getPreviousTreatmentDate() {
            return previousTreatmentDate;
        }
    
        public void setPreviousTreatmentDate(String previousTreatmentDate) {
            this.previousTreatmentDate = previousTreatmentDate;
        }
    
        public String getExpectedDischargeDisposition() {
            return expectedDischargeDisposition;
        }
    
        public void setExpectedDischargeDisposition(String expectedDischargeDisposition) {
            this.expectedDischargeDisposition = expectedDischargeDisposition;
        }
    
        public String getSignatureOnFileDate() {
            return signatureOnFileDate;
        }
    
        public void setSignatureOnFileDate(String signatureOnFileDate) {
            this.signatureOnFileDate = signatureOnFileDate;
        }
    
        public String getFirstSimilarIllnessDate() {
            return firstSimilarIllnessDate;
        }
    
        public void setFirstSimilarIllnessDate(String firstSimilarIllnessDate) {
            this.firstSimilarIllnessDate = firstSimilarIllnessDate;
        }
    
        public CE getPatientChargeAdjustmentCode() {
            return patientChargeAdjustmentCode;
        }
    
        public void setPatientChargeAdjustmentCode(CE patientChargeAdjustmentCode) {
            this.patientChargeAdjustmentCode = patientChargeAdjustmentCode;
        }
    
        public String getRecurringServiceCode() {
            return recurringServiceCode;
        }
    
        public void setRecurringServiceCode(String recurringServiceCode) {
            this.recurringServiceCode = recurringServiceCode;
        }
    
        public String getBillingMediaCode() {
            return billingMediaCode;
        }
    
        public void setBillingMediaCode(String billingMediaCode) {
            this.billingMediaCode = billingMediaCode;
        }
    
        public TS getExpectedSurgeryDateTime() {
            return expectedSurgeryDateTime;
        }
    
        public void setExpectedSurgeryDateTime(TS expectedSurgeryDateTime) {
            this.expectedSurgeryDateTime = expectedSurgeryDateTime;
        }
    
        public String getMilitaryPartnershipCode() {
            return militaryPartnershipCode;
        }
    
        public void setMilitaryPartnershipCode(String militaryPartnershipCode) {
            this.militaryPartnershipCode = militaryPartnershipCode;
        }
    
        public String getMilitaryNonAvailabilityCode() {
            return militaryNonAvailabilityCode;
        }
    
        public void setMilitaryNonAvailabilityCode(String militaryNonAvailabilityCode) {
            this.militaryNonAvailabilityCode = militaryNonAvailabilityCode;
        }
    
        public String getNewbornBabyIndicator() {
            return newbornBabyIndicator;
        }
    
        public void setNewbornBabyIndicator(String newbornBabyIndicator) {
            this.newbornBabyIndicator = newbornBabyIndicator;
        }
    
        public String getBabyDetainedIndicator() {
            return babyDetainedIndicator;
        }
    
        public void setBabyDetainedIndicator(String babyDetainedIndicator) {
            this.babyDetainedIndicator = babyDetainedIndicator;
        }
    
        public CE getModeOfArrivalCode() {
            return modeOfArrivalCode;
        }
    
        public void setModeOfArrivalCode(CE modeOfArrivalCode) {
            this.modeOfArrivalCode = modeOfArrivalCode;
        }
    
        public List<CE> getRecreationalDrugUseCode() {
            return recreationalDrugUseCode;
        }
    
        public void setRecreationalDrugUseCode(List<CE> recreationalDrugUseCode) {
            this.recreationalDrugUseCode = recreationalDrugUseCode;
        }
    
        public CE getAdmissionLevelOfCareCode() {
            return admissionLevelOfCareCode;
        }
    
        public void setAdmissionLevelOfCareCode(CE admissionLevelOfCareCode) {
            this.admissionLevelOfCareCode = admissionLevelOfCareCode;
        }
    
        public List<CE> getPrecautionCode() {
            return precautionCode;
        }
    
        public void setPrecautionCode(List<CE> precautionCode) {
            this.precautionCode = precautionCode;
        }
    
        public CE getPatientConditionCode() {
            return patientConditionCode;
        }
    
        public void setPatientConditionCode(CE patientConditionCode) {
            this.patientConditionCode = patientConditionCode;
        }
    
        public String getLivingWillCode() {
            return livingWillCode;
        }
    
        public void setLivingWillCode(String livingWillCode) {
            this.livingWillCode = livingWillCode;
        }
    
        public String getOrganDonorCode() {
            return organDonorCode;
        }
    
        public void setOrganDonorCode(String organDonorCode) {
            this.organDonorCode = organDonorCode;
        }
    
        public List<CE> getAdvanceDirectiveCode() {
            return advanceDirectiveCode;
        }
    
        public void setAdvanceDirectiveCode(List<CE> advanceDirectiveCode) {
            this.advanceDirectiveCode = advanceDirectiveCode;
        }
    
        public String getPatientStatusEffectiveDate() {
            return patientStatusEffectiveDate;
        }
    
        public void setPatientStatusEffectiveDate(String patientStatusEffectiveDate) {
            this.patientStatusEffectiveDate = patientStatusEffectiveDate;
        }
    
        public TS getExpectedLOAReturnDateTime() {
            return expectedLOAReturnDateTime;
        }
    
        public void setExpectedLOAReturnDateTime(TS expectedLOAReturnDateTime) {
            this.expectedLOAReturnDateTime = expectedLOAReturnDateTime;
        }
    
        public TS getExpectedPreAdmissionTestingDateTime() {
            return expectedPreAdmissionTestingDateTime;
        }
    
        public void setExpectedPreAdmissionTestingDateTime(TS expectedPreAdmissionTestingDateTime) {
            this.expectedPreAdmissionTestingDateTime = expectedPreAdmissionTestingDateTime;
        }
    
        public List<String> getNotifyClergyCode() {
            return notifyClergyCode;
        }
    
        public void setNotifyClergyCode(List<String> notifyClergyCode) {
            this.notifyClergyCode = notifyClergyCode;
        }

    @Override
    public String toHL7() {
        return "PV2" + HL7util.processAllFields(this);
    }
}
