package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.*;
import starhealthcaretech.HL7Helper.HL7util;

public class OBR implements HL7SegmentInterface{
    private String setIdObr;
    private EI placerOrderNumber;
    private EI fillerOrderNumber;
    private CE universalServiceIdentifier;
    private String priorityObr;
    private TS requestedDateTime;
    private TS observationDateTime;
    private TS observationEndDateTime;
    private CQ collectionVolume;
    private List<XCN> collectorIdentifier;
    private String specimenActionCode;
    private CE dangerCode;
    private String relevantClinicalInformation;
    private TS specimenReceivedDateTime;
    private SPS specimenSource;
    private List<XCN> orderingProvider;
    private List<XTN> orderCallbackPhoneNumber;
    private String placerField1;
    private String placerField2;
    private String fillerField1;
    private String fillerField2;
    private TS resultsRptStatusChngDateTime;
    private MOC chargeToPractice;
    private String diagnosticServSectId;
    private String resultStatus;
    private PRL parentResult;
    private List<TQ> quantityTiming;
    private List<XCN> resultCopiesTo;
    private EIP parent;
    private String transportationMode;
    private List<CE> reasonForStudy;
    private NDL principalResultInterpreter;
    private List<NDL> assistantResultInterpreter;
    private List<NDL> technician;
    private List<NDL> transcriptionist;
    private TS scheduledDateTime;
    private String numberOfSampleContainers;
    private List<CE> transportLogisticsOfCollectedSample;
    private List<CE> collectorsComment;
    private CE transportArrangementResponsibility;
    private String transportArranged;
    private String escortRequired;
    private List<CE> plannedPatientTransportComment;
    private CE procedureCode;
    private List<CE> procedureCodeModifier;
    private List<CE> placerSupplementalServiceInfo;
    private List<CE> fillerSupplementalServiceInfo;
    private CWE medicallyNecessaryDuplicateProcedureReason;
    private String resultHandling;
    private CWE parentUniversalServiceIdentifier;
    public String getSetIdObr() {
        return setIdObr;
    }
    public void setSetIdObr(String setIdObr) {
        this.setIdObr = setIdObr;
    }
    public EI getPlacerOrderNumber() {
        return placerOrderNumber;
    }
    public void setPlacerOrderNumber(EI placerOrderNumber) {
        this.placerOrderNumber = placerOrderNumber;
    }
    public EI getFillerOrderNumber() {
        return fillerOrderNumber;
    }
    public void setFillerOrderNumber(EI fillerOrderNumber) {
        this.fillerOrderNumber = fillerOrderNumber;
    }
    public CE getUniversalServiceIdentifier() {
        return universalServiceIdentifier;
    }
    public void setUniversalServiceIdentifier(CE universalServiceIdentifier) {
        this.universalServiceIdentifier = universalServiceIdentifier;
    }
    public String getPriorityObr() {
        return priorityObr;
    }
    public void setPriorityObr(String priorityObr) {
        this.priorityObr = priorityObr;
    }
    public TS getRequestedDateTime() {
        return requestedDateTime;
    }
    public void setRequestedDateTime(TS requestedDateTime) {
        this.requestedDateTime = requestedDateTime;
    }
    public TS getObservationDateTime() {
        return observationDateTime;
    }
    public void setObservationDateTime(TS observationDateTime) {
        this.observationDateTime = observationDateTime;
    }
    public TS getObservationEndDateTime() {
        return observationEndDateTime;
    }
    public void setObservationEndDateTime(TS observationEndDateTime) {
        this.observationEndDateTime = observationEndDateTime;
    }
    public CQ getCollectionVolume() {
        return collectionVolume;
    }
    public void setCollectionVolume(CQ collectionVolume) {
        this.collectionVolume = collectionVolume;
    }
    public List<XCN> getCollectorIdentifier() {
        return collectorIdentifier;
    }
    public void setCollectorIdentifier(List<XCN> collectorIdentifier) {
        this.collectorIdentifier = collectorIdentifier;
    }
    public String getSpecimenActionCode() {
        return specimenActionCode;
    }
    public void setSpecimenActionCode(String specimenActionCode) {
        this.specimenActionCode = specimenActionCode;
    }
    public CE getDangerCode() {
        return dangerCode;
    }
    public void setDangerCode(CE dangerCode) {
        this.dangerCode = dangerCode;
    }
    public String getRelevantClinicalInformation() {
        return relevantClinicalInformation;
    }
    public void setRelevantClinicalInformation(String relevantClinicalInformation) {
        this.relevantClinicalInformation = relevantClinicalInformation;
    }
    public TS getSpecimenReceivedDateTime() {
        return specimenReceivedDateTime;
    }
    public void setSpecimenReceivedDateTime(TS specimenReceivedDateTime) {
        this.specimenReceivedDateTime = specimenReceivedDateTime;
    }
    public SPS getSpecimenSource() {
        return specimenSource;
    }
    public void setSpecimenSource(SPS specimenSource) {
        this.specimenSource = specimenSource;
    }
    public List<XCN> getOrderingProvider() {
        return orderingProvider;
    }
    public void setOrderingProvider(List<XCN> orderingProvider) {
        this.orderingProvider = orderingProvider;
    }
    public List<XTN> getOrderCallbackPhoneNumber() {
        return orderCallbackPhoneNumber;
    }
    public void setOrderCallbackPhoneNumber(List<XTN> orderCallbackPhoneNumber) {
        this.orderCallbackPhoneNumber = orderCallbackPhoneNumber;
    }
    public String getPlacerField1() {
        return placerField1;
    }
    public void setPlacerField1(String placerField1) {
        this.placerField1 = placerField1;
    }
    public String getPlacerField2() {
        return placerField2;
    }
    public void setPlacerField2(String placerField2) {
        this.placerField2 = placerField2;
    }
    public String getFillerField1() {
        return fillerField1;
    }
    public void setFillerField1(String fillerField1) {
        this.fillerField1 = fillerField1;
    }
    public String getFillerField2() {
        return fillerField2;
    }
    public void setFillerField2(String fillerField2) {
        this.fillerField2 = fillerField2;
    }
    public TS getResultsRptStatusChngDateTime() {
        return resultsRptStatusChngDateTime;
    }
    public void setResultsRptStatusChngDateTime(TS resultsRptStatusChngDateTime) {
        this.resultsRptStatusChngDateTime = resultsRptStatusChngDateTime;
    }
    public MOC getChargeToPractice() {
        return chargeToPractice;
    }
    public void setChargeToPractice(MOC chargeToPractice) {
        this.chargeToPractice = chargeToPractice;
    }
    public String getDiagnosticServSectId() {
        return diagnosticServSectId;
    }
    public void setDiagnosticServSectId(String diagnosticServSectId) {
        this.diagnosticServSectId = diagnosticServSectId;
    }
    public String getResultStatus() {
        return resultStatus;
    }
    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }
    public PRL getParentResult() {
        return parentResult;
    }
    public void setParentResult(PRL parentResult) {
        this.parentResult = parentResult;
    }
    public List<TQ> getQuantityTiming() {
        return quantityTiming;
    }
    public void setQuantityTiming(List<TQ> quantityTiming) {
        this.quantityTiming = quantityTiming;
    }
    public List<XCN> getResultCopiesTo() {
        return resultCopiesTo;
    }
    public void setResultCopiesTo(List<XCN> resultCopiesTo) {
        this.resultCopiesTo = resultCopiesTo;
    }
    public EIP getParent() {
        return parent;
    }
    public void setParent(EIP parent) {
        this.parent = parent;
    }
    public String getTransportationMode() {
        return transportationMode;
    }
    public void setTransportationMode(String transportationMode) {
        this.transportationMode = transportationMode;
    }
    public List<CE> getReasonForStudy() {
        return reasonForStudy;
    }
    public void setReasonForStudy(List<CE> reasonForStudy) {
        this.reasonForStudy = reasonForStudy;
    }
    public NDL getPrincipalResultInterpreter() {
        return principalResultInterpreter;
    }
    public void setPrincipalResultInterpreter(NDL principalResultInterpreter) {
        this.principalResultInterpreter = principalResultInterpreter;
    }
    public List<NDL> getAssistantResultInterpreter() {
        return assistantResultInterpreter;
    }
    public void setAssistantResultInterpreter(List<NDL> assistantResultInterpreter) {
        this.assistantResultInterpreter = assistantResultInterpreter;
    }
    public List<NDL> getTechnician() {
        return technician;
    }
    public void setTechnician(List<NDL> technician) {
        this.technician = technician;
    }
    public List<NDL> getTranscriptionist() {
        return transcriptionist;
    }
    public void setTranscriptionist(List<NDL> transcriptionist) {
        this.transcriptionist = transcriptionist;
    }
    public TS getScheduledDateTime() {
        return scheduledDateTime;
    }
    public void setScheduledDateTime(TS scheduledDateTime) {
        this.scheduledDateTime = scheduledDateTime;
    }
    public String getNumberOfSampleContainers() {
        return numberOfSampleContainers;
    }
    public void setNumberOfSampleContainers(String numberOfSampleContainers) {
        this.numberOfSampleContainers = numberOfSampleContainers;
    }
    public List<CE> getTransportLogisticsOfCollectedSample() {
        return transportLogisticsOfCollectedSample;
    }
    public void setTransportLogisticsOfCollectedSample(List<CE> transportLogisticsOfCollectedSample) {
        this.transportLogisticsOfCollectedSample = transportLogisticsOfCollectedSample;
    }
    public List<CE> getCollectorsComment() {
        return collectorsComment;
    }
    public void setCollectorsComment(List<CE> collectorsComment) {
        this.collectorsComment = collectorsComment;
    }
    public CE getTransportArrangementResponsibility() {
        return transportArrangementResponsibility;
    }
    public void setTransportArrangementResponsibility(CE transportArrangementResponsibility) {
        this.transportArrangementResponsibility = transportArrangementResponsibility;
    }
    public String getTransportArranged() {
        return transportArranged;
    }
    public void setTransportArranged(String transportArranged) {
        this.transportArranged = transportArranged;
    }
    public String getEscortRequired() {
        return escortRequired;
    }
    public void setEscortRequired(String escortRequired) {
        this.escortRequired = escortRequired;
    }
    public List<CE> getPlannedPatientTransportComment() {
        return plannedPatientTransportComment;
    }
    public void setPlannedPatientTransportComment(List<CE> plannedPatientTransportComment) {
        this.plannedPatientTransportComment = plannedPatientTransportComment;
    }
    public CE getProcedureCode() {
        return procedureCode;
    }
    public void setProcedureCode(CE procedureCode) {
        this.procedureCode = procedureCode;
    }
    public List<CE> getProcedureCodeModifier() {
        return procedureCodeModifier;
    }
    public void setProcedureCodeModifier(List<CE> procedureCodeModifier) {
        this.procedureCodeModifier = procedureCodeModifier;
    }
    public List<CE> getPlacerSupplementalServiceInfo() {
        return placerSupplementalServiceInfo;
    }
    public void setPlacerSupplementalServiceInfo(List<CE> placerSupplementalServiceInfo) {
        this.placerSupplementalServiceInfo = placerSupplementalServiceInfo;
    }
    public List<CE> getFillerSupplementalServiceInfo() {
        return fillerSupplementalServiceInfo;
    }
    public void setFillerSupplementalServiceInfo(List<CE> fillerSupplementalServiceInfo) {
        this.fillerSupplementalServiceInfo = fillerSupplementalServiceInfo;
    }
    public CWE getMedicallyNecessaryDuplicateProcedureReason() {
        return medicallyNecessaryDuplicateProcedureReason;
    }
    public void setMedicallyNecessaryDuplicateProcedureReason(CWE medicallyNecessaryDuplicateProcedureReason) {
        this.medicallyNecessaryDuplicateProcedureReason = medicallyNecessaryDuplicateProcedureReason;
    }
    public String getResultHandling() {
        return resultHandling;
    }
    public void setResultHandling(String resultHandling) {
        this.resultHandling = resultHandling;
    }
    public CWE getParentUniversalServiceIdentifier() {
        return parentUniversalServiceIdentifier;
    }
    public void setParentUniversalServiceIdentifier(CWE parentUniversalServiceIdentifier) {
        this.parentUniversalServiceIdentifier = parentUniversalServiceIdentifier;
    }

    @Override
    public String toHL7() {
        return "OBR" + HL7util.processAllFields(this);
    }


}
