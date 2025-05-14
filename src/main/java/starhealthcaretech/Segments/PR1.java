package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.EI;
import starhealthcaretech.DataTypes.TS;
import starhealthcaretech.DataTypes.XCN;
import starhealthcaretech.HL7Helper.HL7util;

public class PR1 implements HL7SegmentInterface{
    
    private String setIdPr1;
    private String procedureCodingMethod;
    private CE procedureCode;
    private String procedureDescription;
    private TS procedureDateTime;
    private String procedureFunctionalType;
    private String procedureMinutes;
    private List<XCN> anesthesiologist;
    private String anesthesiaCode;
    private String anesthesiaMinutes;
    private List<XCN> surgeon;
    private List<XCN> procedurePractitioner;
    private CE consentCode;
    private String procedurePriority;
    private CE associatedDiagnosisCode;
    private List<CE> procedureCodeModifier;
    private String procedureDrgType;
    private List<CE> tissueTypeCode;
    private EI procedureIdentifier;
    private String procedureActionCode;

    

    public String getSetIdPr1() {
        return setIdPr1;
    }



    public void setSetIdPr1(String setIdPr1) {
        this.setIdPr1 = setIdPr1;
    }



    public String getProcedureCodingMethod() {
        return procedureCodingMethod;
    }



    public void setProcedureCodingMethod(String procedureCodingMethod) {
        this.procedureCodingMethod = procedureCodingMethod;
    }



    public CE getProcedureCode() {
        return procedureCode;
    }



    public void setProcedureCode(CE procedureCode) {
        this.procedureCode = procedureCode;
    }



    public String getProcedureDescription() {
        return procedureDescription;
    }



    public void setProcedureDescription(String procedureDescription) {
        this.procedureDescription = procedureDescription;
    }



    public TS getProcedureDateTime() {
        return procedureDateTime;
    }



    public void setProcedureDateTime(TS procedureDateTime) {
        this.procedureDateTime = procedureDateTime;
    }



    public String getProcedureFunctionalType() {
        return procedureFunctionalType;
    }



    public void setProcedureFunctionalType(String procedureFunctionalType) {
        this.procedureFunctionalType = procedureFunctionalType;
    }



    public String getProcedureMinutes() {
        return procedureMinutes;
    }



    public void setProcedureMinutes(String procedureMinutes) {
        this.procedureMinutes = procedureMinutes;
    }



    public List<XCN> getAnesthesiologist() {
        return anesthesiologist;
    }



    public void setAnesthesiologist(List<XCN> anesthesiologist) {
        this.anesthesiologist = anesthesiologist;
    }



    public String getAnesthesiaCode() {
        return anesthesiaCode;
    }



    public void setAnesthesiaCode(String anesthesiaCode) {
        this.anesthesiaCode = anesthesiaCode;
    }



    public String getAnesthesiaMinutes() {
        return anesthesiaMinutes;
    }



    public void setAnesthesiaMinutes(String anesthesiaMinutes) {
        this.anesthesiaMinutes = anesthesiaMinutes;
    }



    public List<XCN> getSurgeon() {
        return surgeon;
    }



    public void setSurgeon(List<XCN> surgeon) {
        this.surgeon = surgeon;
    }



    public List<XCN> getProcedurePractitioner() {
        return procedurePractitioner;
    }



    public void setProcedurePractitioner(List<XCN> procedurePractitioner) {
        this.procedurePractitioner = procedurePractitioner;
    }



    public CE getConsentCode() {
        return consentCode;
    }



    public void setConsentCode(CE consentCode) {
        this.consentCode = consentCode;
    }



    public String getProcedurePriority() {
        return procedurePriority;
    }



    public void setProcedurePriority(String procedurePriority) {
        this.procedurePriority = procedurePriority;
    }



    public CE getAssociatedDiagnosisCode() {
        return associatedDiagnosisCode;
    }



    public void setAssociatedDiagnosisCode(CE associatedDiagnosisCode) {
        this.associatedDiagnosisCode = associatedDiagnosisCode;
    }



    public List<CE> getProcedureCodeModifier() {
        return procedureCodeModifier;
    }



    public void setProcedureCodeModifier(List<CE> procedureCodeModifier) {
        this.procedureCodeModifier = procedureCodeModifier;
    }



    public String getProcedureDrgType() {
        return procedureDrgType;
    }



    public void setProcedureDrgType(String procedureDrgType) {
        this.procedureDrgType = procedureDrgType;
    }



    public List<CE> getTissueTypeCode() {
        return tissueTypeCode;
    }



    public void setTissueTypeCode(List<CE> tissueTypeCode) {
        this.tissueTypeCode = tissueTypeCode;
    }



    public EI getProcedureIdentifier() {
        return procedureIdentifier;
    }



    public void setProcedureIdentifier(EI procedureIdentifier) {
        this.procedureIdentifier = procedureIdentifier;
    }



    public String getProcedureActionCode() {
        return procedureActionCode;
    }



    public void setProcedureActionCode(String procedureActionCode) {
        this.procedureActionCode = procedureActionCode;
    }



    @Override
    public String toHL7() {
        return "PR1" + HL7util.processAllFields(this);
    }
}
