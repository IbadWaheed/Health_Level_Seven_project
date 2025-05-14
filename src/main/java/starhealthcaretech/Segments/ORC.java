package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.*;
import starhealthcaretech.HL7Helper.HL7util;

public class ORC implements HL7SegmentInterface{
    private String orderControl;
    private String placerOrderNumber;
    private String fillerOrderNumber;
    private String placerGroupNumber;
    private String orderStatus;
    private String responseFlag;
    private List<TQ> quantityTiming;
    private EIP parentOrder;
    private TS dateTimeOfTransaction;
    private List<XCN> enteredBy;
    private List<XCN> verifiedBy;
    private List<XCN> orderingProvider;
    private PL enterersLocation;
    private List<XTN> callBackPhoneNumber;
    private TS orderEffectiveDateTime;
    private CE orderControlCodeReason;
    private CE enteringOrganization;
    private CE enteringDevice;
    private List<XCN> actionBy;
    private CE advancedBeneficiaryNoticeCode;
    private List<XON> orderingFacilityName;
    private List<XAD> orderingFacilityAddress;
    private List<XTN> orderingFacilityPhoneNumber;
    private List<XAD> orderingProviderAddress;
    private CWE orderStatusModifier;
    private CWE advancedBeneficiaryNoticeOverrideReason;
    private TS fillersExpectedAvailabilityDateTime;
    private CWE confidentialityCode;
    private CWE orderType;
    private CNE entererAuthorizationMode;
    private CWE parentUniversalServiceIdentifier;
    public String getOrderControl() {
        return orderControl;
    }
    public void setOrderControl(String orderControl) {
        this.orderControl = orderControl;
    }
    public String getPlacerOrderNumber() {
        return placerOrderNumber;
    }
    public void setPlacerOrderNumber(String placerOrderNumber) {
        this.placerOrderNumber = placerOrderNumber;
    }
    public String getFillerOrderNumber() {
        return fillerOrderNumber;
    }
    public void setFillerOrderNumber(String fillerOrderNumber) {
        this.fillerOrderNumber = fillerOrderNumber;
    }
    public String getPlacerGroupNumber() {
        return placerGroupNumber;
    }
    public void setPlacerGroupNumber(String placerGroupNumber) {
        this.placerGroupNumber = placerGroupNumber;
    }
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public String getResponseFlag() {
        return responseFlag;
    }
    public void setResponseFlag(String responseFlag) {
        this.responseFlag = responseFlag;
    }
    public List<TQ> getQuantityTiming() {
        return quantityTiming;
    }
    public void setQuantityTiming(List<TQ> quantityTiming) {
        this.quantityTiming = quantityTiming;
    }
    public EIP getParentOrder() {
        return parentOrder;
    }
    public void setParentOrder(EIP parentOrder) {
        this.parentOrder = parentOrder;
    }
    public TS getDateTimeOfTransaction() {
        return dateTimeOfTransaction;
    }
    public void setDateTimeOfTransaction(TS dateTimeOfTransaction) {
        this.dateTimeOfTransaction = dateTimeOfTransaction;
    }
    public List<XCN> getEnteredBy() {
        return enteredBy;
    }
    public void setEnteredBy(List<XCN> enteredBy) {
        this.enteredBy = enteredBy;
    }
    public List<XCN> getVerifiedBy() {
        return verifiedBy;
    }
    public void setVerifiedBy(List<XCN> verifiedBy) {
        this.verifiedBy = verifiedBy;
    }
    public List<XCN> getOrderingProvider() {
        return orderingProvider;
    }
    public void setOrderingProvider(List<XCN> orderingProvider) {
        this.orderingProvider = orderingProvider;
    }
    public PL getEnterersLocation() {
        return enterersLocation;
    }
    public void setEnterersLocation(PL enterersLocation) {
        this.enterersLocation = enterersLocation;
    }
    public List<XTN> getCallBackPhoneNumber() {
        return callBackPhoneNumber;
    }
    public void setCallBackPhoneNumber(List<XTN> callBackPhoneNumber) {
        this.callBackPhoneNumber = callBackPhoneNumber;
    }
    public TS getOrderEffectiveDateTime() {
        return orderEffectiveDateTime;
    }
    public void setOrderEffectiveDateTime(TS orderEffectiveDateTime) {
        this.orderEffectiveDateTime = orderEffectiveDateTime;
    }
    public CE getOrderControlCodeReason() {
        return orderControlCodeReason;
    }
    public void setOrderControlCodeReason(CE orderControlCodeReason) {
        this.orderControlCodeReason = orderControlCodeReason;
    }
    public CE getEnteringOrganization() {
        return enteringOrganization;
    }
    public void setEnteringOrganization(CE enteringOrganization) {
        this.enteringOrganization = enteringOrganization;
    }
    public CE getEnteringDevice() {
        return enteringDevice;
    }
    public void setEnteringDevice(CE enteringDevice) {
        this.enteringDevice = enteringDevice;
    }
    public List<XCN> getActionBy() {
        return actionBy;
    }
    public void setActionBy(List<XCN> actionBy) {
        this.actionBy = actionBy;
    }
    public CE getAdvancedBeneficiaryNoticeCode() {
        return advancedBeneficiaryNoticeCode;
    }
    public void setAdvancedBeneficiaryNoticeCode(CE advancedBeneficiaryNoticeCode) {
        this.advancedBeneficiaryNoticeCode = advancedBeneficiaryNoticeCode;
    }
    public List<XON> getOrderingFacilityName() {
        return orderingFacilityName;
    }
    public void setOrderingFacilityName(List<XON> orderingFacilityName) {
        this.orderingFacilityName = orderingFacilityName;
    }
    public List<XAD> getOrderingFacilityAddress() {
        return orderingFacilityAddress;
    }
    public void setOrderingFacilityAddress(List<XAD> orderingFacilityAddress) {
        this.orderingFacilityAddress = orderingFacilityAddress;
    }
    public List<XTN> getOrderingFacilityPhoneNumber() {
        return orderingFacilityPhoneNumber;
    }
    public void setOrderingFacilityPhoneNumber(List<XTN> orderingFacilityPhoneNumber) {
        this.orderingFacilityPhoneNumber = orderingFacilityPhoneNumber;
    }
    public List<XAD> getOrderingProviderAddress() {
        return orderingProviderAddress;
    }
    public void setOrderingProviderAddress(List<XAD> orderingProviderAddress) {
        this.orderingProviderAddress = orderingProviderAddress;
    }
    public CWE getOrderStatusModifier() {
        return orderStatusModifier;
    }
    public void setOrderStatusModifier(CWE orderStatusModifier) {
        this.orderStatusModifier = orderStatusModifier;
    }
    public CWE getAdvancedBeneficiaryNoticeOverrideReason() {
        return advancedBeneficiaryNoticeOverrideReason;
    }
    public void setAdvancedBeneficiaryNoticeOverrideReason(CWE advancedBeneficiaryNoticeOverrideReason) {
        this.advancedBeneficiaryNoticeOverrideReason = advancedBeneficiaryNoticeOverrideReason;
    }
    public TS getFillersExpectedAvailabilityDateTime() {
        return fillersExpectedAvailabilityDateTime;
    }
    public void setFillersExpectedAvailabilityDateTime(TS fillersExpectedAvailabilityDateTime) {
        this.fillersExpectedAvailabilityDateTime = fillersExpectedAvailabilityDateTime;
    }
    public CWE getConfidentialityCode() {
        return confidentialityCode;
    }
    public void setConfidentialityCode(CWE confidentialityCode) {
        this.confidentialityCode = confidentialityCode;
    }
    public CWE getOrderType() {
        return orderType;
    }
    public void setOrderType(CWE orderType) {
        this.orderType = orderType;
    }
    public CNE getEntererAuthorizationMode() {
        return entererAuthorizationMode;
    }
    public void setEntererAuthorizationMode(CNE entererAuthorizationMode) {
        this.entererAuthorizationMode = entererAuthorizationMode;
    }
    public CWE getParentUniversalServiceIdentifier() {
        return parentUniversalServiceIdentifier;
    }
    public void setParentUniversalServiceIdentifier(CWE parentUniversalServiceIdentifier) {
        this.parentUniversalServiceIdentifier = parentUniversalServiceIdentifier;
    }

    @Override
    public String toHL7() {
        return "ORC" + HL7util.processAllFields(this);
    }

}
