package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.CX;
import starhealthcaretech.DataTypes.DLD;
import starhealthcaretech.DataTypes.FC;
import starhealthcaretech.DataTypes.PL;
import starhealthcaretech.DataTypes.TS;
import starhealthcaretech.DataTypes.XCN;
import starhealthcaretech.HL7Helper.HL7util;

public class PV1 implements HL7SegmentInterface{
    private String setIdPV1;                     // PV1.1
    private String patientClass;                 // PV1.2
    private PL assignedPatientLocation;      // PV1.3
    private String admissionType;                // PV1.4
    private CX preadmitNumber;               // PV1.5
    private PL priorPatientLocation;         // PV1.6
    private List<XCN> attendingDoctor;              // PV1.7
    private List<XCN> referringDoctor;              // PV1.8
    private List<XCN> consultingDoctor;             // PV1.9
    private String hospitalService;              // PV1.10
    private PL temporaryLocation;            // PV1.11
    private String preadmitTestIndicator;         // PV1.12
    private String reAdmissionIndicator;         // PV1.13
    private String admitSource;                  // PV1.14
    private List<String> ambulatoryStatus;             // PV1.15
    private String vipIndicator;                 // PV1.16
    private List<XCN> admittingDoctor;              // PV1.17
    private String patientType;                  // PV1.18
    private CX visitNumber;                  // PV1.19
    private List<FC> financialClass;               // PV1.20
    private String chargePriceIndicator;         // PV1.21
    private String courtesyCode;                 // PV1.22
    private String creditRating;                 // PV1.23
    private List<String> contractCode;                 // PV1.24
    private List<String> contractEffectiveDate;        // PV1.25
    private List<String> contractAmount;               // PV1.26
    private List<String> contractPeriod;               // PV1.27
    private String interestCode;                 // PV1.28
    private String transferToBadDebtCode;         // PV1.29
    private String transferToBadDebtDate;        // PV1.30
    private String badDebtAgencyCode;            // PV1.31
    private String badDebtTransferAmount;        // PV1.32
    private String badDebtRecoveryAmount;        // PV1.33
    private String deleteAccountIndicator;       // PV1.34
    private String deleteAccountDate;            // PV1.35
    private String dischargeDisposition;         // PV1.36
    private DLD dischargedToLocation;         // PV1.37
    private CE dietType;                     // PV1.38
    private String servicingFacility;            // PV1.39
    private String bedStatus;                    // PV1.40
    private String accountStatus;                // PV1.41
    private PL pendingLocation;              // PV1.42
    private PL priorTemporaryLocation;       // PV1.43
    private TS admitDateTime;                // PV1.44
    private List<TS> dischargeDateTime;            // PV1.45
    private String currentPatientBalance;        // PV1.46
    private String totalCharges;                 // PV1.47
    private String totalAdjustments;             // PV1.48
    private String totalPayments;                // PV1.49
    private CX alternateVisitId;             // PV1.50
    private String visitIndicator;               // PV1.51
    private List<XCN> otherHealthcareProvider;      // PV1.52

    // Getters and Setters

    public String getSetIdPV1() {
        return setIdPV1;
    }

    public void setSetIdPV1(String setIdPV1) {
        this.setIdPV1 = setIdPV1;
    }

    public String getPatientClass() {
        return patientClass;
    }

    public void setPatientClass(String patientClass) {
        this.patientClass = patientClass;
    }

    public PL getAssignedPatientLocation() {
        return assignedPatientLocation;
    }

    public void setAssignedPatientLocation(PL assignedPatientLocation) {
        this.assignedPatientLocation = assignedPatientLocation;
    }

    public String getAdmissionType() {
        return admissionType;
    }

    public void setAdmissionType(String admissionType) {
        this.admissionType = admissionType;
    }

    public CX getPreadmitNumber() {
        return preadmitNumber;
    }

    public void setPreadmitNumber(CX preadmitNumber) {
        this.preadmitNumber = preadmitNumber;
    }

    public PL getPriorPatientLocation() {
        return priorPatientLocation;
    }

    public void setPriorPatientLocation(PL priorPatientLocation) {
        this.priorPatientLocation = priorPatientLocation;
    }

    public List<XCN> getAttendingDoctor() {
        return attendingDoctor;
    }

    public void setAttendingDoctor(List<XCN> attendingDoctor) {
        this.attendingDoctor = attendingDoctor;
    }

    public List<XCN> getReferringDoctor() {
        return referringDoctor;
    }

    public void setReferringDoctor(List<XCN> referringDoctor) {
        this.referringDoctor = referringDoctor;
    }

    public List<XCN> getConsultingDoctor() {
        return consultingDoctor;
    }

    public void setConsultingDoctor(List<XCN> consultingDoctor) {
        this.consultingDoctor = consultingDoctor;
    }

    public String getHospitalService() {
        return hospitalService;
    }

    public void setHospitalService(String hospitalService) {
        this.hospitalService = hospitalService;
    }

    public PL getTemporaryLocation() {
        return temporaryLocation;
    }

    public void setTemporaryLocation(PL temporaryLocation) {
        this.temporaryLocation = temporaryLocation;
    }

    public String getPreadmitTestIndicator() {
        return preadmitTestIndicator;
    }

    public void setPreadmitTestIndicator(String preadmitTestIndicator) {
        this.preadmitTestIndicator = preadmitTestIndicator;
    }

    public String getReAdmissionIndicator() {
        return reAdmissionIndicator;
    }

    public void setReAdmissionIndicator(String reAdmissionIndicator) {
        this.reAdmissionIndicator = reAdmissionIndicator;
    }

    public String getAdmitSource() {
        return admitSource;
    }

    public void setAdmitSource(String admitSource) {
        this.admitSource = admitSource;
    }

    public List<String> getAmbulatoryStatus() {
        return ambulatoryStatus;
    }

    public void setAmbulatoryStatus(List<String> ambulatoryStatus) {
        this.ambulatoryStatus = ambulatoryStatus;
    }

    public String getVipIndicator() {
        return vipIndicator;
    }

    public void setVipIndicator(String vipIndicator) {
        this.vipIndicator = vipIndicator;
    }

    public List<XCN> getAdmittingDoctor() {
        return admittingDoctor;
    }

    public void setAdmittingDoctor(List<XCN> admittingDoctor) {
        this.admittingDoctor = admittingDoctor;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public CX getVisitNumber() {
        return visitNumber;
    }

    public void setVisitNumber(CX visitNumber) {
        this.visitNumber = visitNumber;
    }

    public List<FC> getFinancialClass() {
        return financialClass;
    }

    public void setFinancialClass(List<FC> financialClass) {
        this.financialClass = financialClass;
    }

    public String getChargePriceIndicator() {
        return chargePriceIndicator;
    }

    public void setChargePriceIndicator(String chargePriceIndicator) {
        this.chargePriceIndicator = chargePriceIndicator;
    }

    public String getCourtesyCode() {
        return courtesyCode;
    }

    public void setCourtesyCode(String courtesyCode) {
        this.courtesyCode = courtesyCode;
    }

    public String getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(String creditRating) {
        this.creditRating = creditRating;
    }

    public List<String> getContractCode() {
        return contractCode;
    }

    public void setContractCode(List<String> contractCode) {
        this.contractCode = contractCode;
    }

    public List<String> getContractEffectiveDate() {
        return contractEffectiveDate;
    }

    public void setContractEffectiveDate(List<String> contractEffectiveDate) {
        this.contractEffectiveDate = contractEffectiveDate;
    }

    public List<String> getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(List<String> contractAmount) {
        this.contractAmount = contractAmount;
    }

    public List<String> getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(List<String> contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    public String getInterestCode() {
        return interestCode;
    }

    public void setInterestCode(String interestCode) {
        this.interestCode = interestCode;
    }

    public String getTransferToBadDebtCode() {
        return transferToBadDebtCode;
    }

    public void setTransferToBadDebtCode(String transferToBadDebtCode) {
        this.transferToBadDebtCode = transferToBadDebtCode;
    }

    public String getTransferToBadDebtDate() {
        return transferToBadDebtDate;
    }

    public void setTransferToBadDebtDate(String transferToBadDebtDate) {
        this.transferToBadDebtDate = transferToBadDebtDate;
    }

    public String getBadDebtAgencyCode() {
        return badDebtAgencyCode;
    }

    public void setBadDebtAgencyCode(String badDebtAgencyCode) {
        this.badDebtAgencyCode = badDebtAgencyCode;
    }

    public String getBadDebtTransferAmount() {
        return badDebtTransferAmount;
    }

    public void setBadDebtTransferAmount(String badDebtTransferAmount) {
        this.badDebtTransferAmount = badDebtTransferAmount;
    }

    public String getBadDebtRecoveryAmount() {
        return badDebtRecoveryAmount;
    }

    public void setBadDebtRecoveryAmount(String badDebtRecoveryAmount) {
        this.badDebtRecoveryAmount = badDebtRecoveryAmount;
    }

    public String getDeleteAccountIndicator() {
        return deleteAccountIndicator;
    }

    public void setDeleteAccountIndicator(String deleteAccountIndicator) {
        this.deleteAccountIndicator = deleteAccountIndicator;
    }

    public String getDeleteAccountDate() {
        return deleteAccountDate;
    }

    public void setDeleteAccountDate(String deleteAccountDate) {
        this.deleteAccountDate = deleteAccountDate;
    }

    public String getDischargeDisposition() {
        return dischargeDisposition;
    }

    public void setDischargeDisposition(String dischargeDisposition) {
        this.dischargeDisposition = dischargeDisposition;
    }

    public DLD getDischargedToLocation() {
        return dischargedToLocation;
    }

    public void setDischargedToLocation(DLD dischargedToLocation) {
        this.dischargedToLocation = dischargedToLocation;
    }

    public CE getDietType() {
        return dietType;
    }

    public void setDietType(CE dietType) {
        this.dietType = dietType;
    }

    public String getServicingFacility() {
        return servicingFacility;
    }

    public void setServicingFacility(String servicingFacility) {
        this.servicingFacility = servicingFacility;
    }

    public String getBedStatus() {
        return bedStatus;
    }

    public void setBedStatus(String bedStatus) {
        this.bedStatus = bedStatus;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public PL getPendingLocation() {
        return pendingLocation;
    }

    public void setPendingLocation(PL pendingLocation) {
        this.pendingLocation = pendingLocation;
    }

    public PL getPriorTemporaryLocation() {
        return priorTemporaryLocation;
    }

    public void setPriorTemporaryLocation(PL priorTemporaryLocation) {
        this.priorTemporaryLocation = priorTemporaryLocation;
    }

    public TS getAdmitDateTime() {
        return admitDateTime;
    }

    public void setAdmitDateTime(TS admitDateTime) {
        this.admitDateTime = admitDateTime;
    }

    public List<TS> getDischargeDateTime() {
        return dischargeDateTime;
    }

    public void setDischargeDateTime(List<TS> dischargeDateTime) {
        this.dischargeDateTime = dischargeDateTime;
    }

    public String getCurrentPatientBalance() {
        return currentPatientBalance;
    }

    public void setCurrentPatientBalance(String currentPatientBalance) {
        this.currentPatientBalance = currentPatientBalance;
    }

    public String getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCharges(String totalCharges) {
        this.totalCharges = totalCharges;
    }

    public String getTotalAdjustments() {
        return totalAdjustments;
    }

    public void setTotalAdjustments(String totalAdjustments) {
        this.totalAdjustments = totalAdjustments;
    }

    public String getTotalPayments() {
        return totalPayments;
    }

    public void setTotalPayments(String totalPayments) {
        this.totalPayments = totalPayments;
    }

    public CX getAlternateVisitId() {
        return alternateVisitId;
    }

    public void setAlternateVisitId(CX alternateVisitId) {
        this.alternateVisitId = alternateVisitId;
    }

    public String getVisitIndicator() {
        return visitIndicator;
    }

    public void setVisitIndicator(String visitIndicator) {
        this.visitIndicator = visitIndicator;
    }

    public List<XCN> getOtherHealthcareProvider() {
        return otherHealthcareProvider;
    }

    public void setOtherHealthcareProvider(List<XCN> otherHealthcareProvider) {
        this.otherHealthcareProvider = otherHealthcareProvider;
    }
    @Override
    public String toHL7() {
        return "PV1" + HL7util.processAllFields(this);
    }
}
