package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.ORC;

public class FinancialCommonOrder {
    private ORC orc; // Optional
    private List<FinancialTimingQuantity> financialTimingQuantityList; // Optional, repeating
    private FinancialOrder financialOrder; // Optional
    private List<FinancialObservation> financialObservationList; // Optional, repeating
    public ORC getOrc() {
        return orc;
    }
    public void setOrc(ORC orc) {
        this.orc = orc;
    }
    public List<FinancialTimingQuantity> getFinancialTimingQuantityList() {
        return financialTimingQuantityList;
    }
    public void setFinancialTimingQuantityList(List<FinancialTimingQuantity> financialTimingQuantityList) {
        this.financialTimingQuantityList = financialTimingQuantityList;
    }
    public FinancialOrder getFinancialOrder() {
        return financialOrder;
    }
    public void setFinancialOrder(FinancialOrder financialOrder) {
        this.financialOrder = financialOrder;
    }
    public List<FinancialObservation> getFinancialObservationList() {
        return financialObservationList;
    }
    public void setFinancialObservationList(List<FinancialObservation> financialObservationList) {
        this.financialObservationList = financialObservationList;
    }


    

}
