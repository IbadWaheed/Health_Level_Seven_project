package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CX;
import starhealthcaretech.DataTypes.XPN;
import starhealthcaretech.HL7Helper.HL7util;

public class MRG implements HL7SegmentInterface{
    

    private List<CX> priorPatientIdentifierList;
    private List<CX> priorAlternatePatientId;
    private CX priorPatientAccountNumber;
    private CX priorPatientId;
    private CX priorVisitNumber;
    private CX priorAlternateVisitId;
    private List<XPN> priorPatientName;

    

    public List<CX> getPriorPatientIdentifierList() {
        return priorPatientIdentifierList;
    }



    public void setPriorPatientIdentifierList(List<CX> priorPatientIdentifierList) {
        this.priorPatientIdentifierList = priorPatientIdentifierList;
    }



    public List<CX> getPriorAlternatePatientId() {
        return priorAlternatePatientId;
    }



    public void setPriorAlternatePatientId(List<CX> priorAlternatePatientId) {
        this.priorAlternatePatientId = priorAlternatePatientId;
    }



    public CX getPriorPatientAccountNumber() {
        return priorPatientAccountNumber;
    }



    public void setPriorPatientAccountNumber(CX priorPatientAccountNumber) {
        this.priorPatientAccountNumber = priorPatientAccountNumber;
    }



    public CX getPriorPatientId() {
        return priorPatientId;
    }



    public void setPriorPatientId(CX priorPatientId) {
        this.priorPatientId = priorPatientId;
    }



    public CX getPriorVisitNumber() {
        return priorVisitNumber;
    }



    public void setPriorVisitNumber(CX priorVisitNumber) {
        this.priorVisitNumber = priorVisitNumber;
    }



    public CX getPriorAlternateVisitId() {
        return priorAlternateVisitId;
    }



    public void setPriorAlternateVisitId(CX priorAlternateVisitId) {
        this.priorAlternateVisitId = priorAlternateVisitId;
    }



    public List<XPN> getPriorPatientName() {
        return priorPatientName;
    }



    public void setPriorPatientName(List<XPN> priorPatientName) {
        this.priorPatientName = priorPatientName;
    }



    @Override
    public String toHL7() {
        return "MRG" + HL7util.processAllFields(this);
    }
}
