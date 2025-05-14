package starhealthcaretech.HL7Message;

import java.util.List;

import starhealthcaretech.HL7MessagePart.CommonOrder;
import starhealthcaretech.HL7MessagePart.Financial;
import starhealthcaretech.HL7MessagePart.INSURANCE;
import starhealthcaretech.Segments.*;


public class DFT {
    private MSH messageheader; // Required
    private List<SFT> softwaresegment; // Optional, repeating
    private EVN eventtype; // Required
    private PID patientidentification; // Required
    private PD1 patientadditionaldemographic; // Optional
    private List<ROL> after_pid_pd1_role; // Optional, repeating (before PV1)
    private PV1 patientvisit; // Optional
    private PV2 patientvisitadditionalinformation; // Optional
    private List<ROL> afterpv1_pv2_role; // Optional, repeating (after PV2)
    private List<DB1> disability; // Optional, repeating
    private List<CommonOrder> commonOrderList; // Optional, repeating
    private List<DG1> diagnosis; // Optional, repeating
    private DRG diagnosisrelatedgroup; // Optional
    private List<GT1> guarantor; // Optional, repeating
    private List<INSURANCE> insuranceList; // Optional, repeating
    private ACC accident; // Optional
    private List<Financial> financialList; // Required, repeating
    public MSH getMessageheader() {
        return messageheader;
    }
    public void setMessageheader(MSH messageheader) {
        this.messageheader = messageheader;
    }
    public List<SFT> getSoftwaresegment() {
        return softwaresegment;
    }
    public void setSoftwaresegment(List<SFT> softwaresegment) {
        this.softwaresegment = softwaresegment;
    }
    public EVN getEventtype() {
        return eventtype;
    }
    public void setEventtype(EVN eventtype) {
        this.eventtype = eventtype;
    }
    public PID getPatientidentification() {
        return patientidentification;
    }
    public void setPatientidentification(PID patientidentification) {
        this.patientidentification = patientidentification;
    }
    public PD1 getPatientadditionaldemographic() {
        return patientadditionaldemographic;
    }
    public void setPatientadditionaldemographic(PD1 patientadditionaldemographic) {
        this.patientadditionaldemographic = patientadditionaldemographic;
    }
    public List<ROL> getAfter_pid_pd1_role() {
        return after_pid_pd1_role;
    }
    public void setAfter_pid_pd1_role(List<ROL> after_pid_pd1_role) {
        this.after_pid_pd1_role = after_pid_pd1_role;
    }
    public PV1 getPatientvisit() {
        return patientvisit;
    }
    public void setPatientvisit(PV1 patientvisit) {
        this.patientvisit = patientvisit;
    }
    public PV2 getPatientvisitadditionalinformation() {
        return patientvisitadditionalinformation;
    }
    public void setPatientvisitadditionalinformation(PV2 patientvisitadditionalinformation) {
        this.patientvisitadditionalinformation = patientvisitadditionalinformation;
    }
    public List<ROL> getAfterpv1_pv2_role() {
        return afterpv1_pv2_role;
    }
    public void setAfterpv1_pv2_role(List<ROL> afterpv1_pv2_role) {
        this.afterpv1_pv2_role = afterpv1_pv2_role;
    }
    public List<DB1> getDisability() {
        return disability;
    }
    public void setDisability(List<DB1> disability) {
        this.disability = disability;
    }
    public List<CommonOrder> getCommonOrderList() {
        return commonOrderList;
    }
    public void setCommonOrderList(List<CommonOrder> commonOrderList) {
        this.commonOrderList = commonOrderList;
    }
    public List<DG1> getDiagnosis() {
        return diagnosis;
    }
    public void setDiagnosis(List<DG1> diagnosis) {
        this.diagnosis = diagnosis;
    }
    public DRG getDiagnosisrelatedgroup() {
        return diagnosisrelatedgroup;
    }
    public void setDiagnosisrelatedgroup(DRG diagnosisrelatedgroup) {
        this.diagnosisrelatedgroup = diagnosisrelatedgroup;
    }
    public List<GT1> getGuarantor() {
        return guarantor;
    }
    public void setGuarantor(List<GT1> guarantor) {
        this.guarantor = guarantor;
    }
    public List<INSURANCE> getInsuranceList() {
        return insuranceList;
    }
    public void setInsuranceList(List<INSURANCE> insuranceList) {
        this.insuranceList = insuranceList;
    }
    public ACC getAccident() {
        return accident;
    }
    public void setAccident(ACC accident) {
        this.accident = accident;
    }
    public List<Financial> getFinancialList() {
        return financialList;
    }
    public void setFinancialList(List<Financial> financialList) {
        this.financialList = financialList;
    }
    
    

}
