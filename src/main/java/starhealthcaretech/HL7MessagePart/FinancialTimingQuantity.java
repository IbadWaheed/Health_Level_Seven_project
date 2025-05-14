package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.TQ1;
import starhealthcaretech.Segments.TQ2;

public class FinancialTimingQuantity {
    private TQ1 tq1; // Required
    private List<TQ2> tq2List; // Optional, repeating
    public TQ1 getTq1() {
        return tq1;
    }
    public void setTq1(TQ1 tq1) {
        this.tq1 = tq1;
    }
    public List<TQ2> getTq2List() {
        return tq2List;
    }
    public void setTq2List(List<TQ2> tq2List) {
        this.tq2List = tq2List;
    }

    

}
