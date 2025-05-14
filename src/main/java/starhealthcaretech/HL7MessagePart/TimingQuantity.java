package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.TQ1;
import starhealthcaretech.Segments.TQ2;

public class TimingQuantity {
    private TQ1 timing_quantity; // Required
    private List<TQ2> timingquantityrelationship; // Optional, repeating
    public TQ1 getTiming_quantity() {
        return timing_quantity;
    }
    public void setTiming_quantity(TQ1 timing_quantity) {
        this.timing_quantity = timing_quantity;
    }
    public List<TQ2> getTimingquantityrelationship() {
        return timingquantityrelationship;
    }
    public void setTimingquantityrelationship(List<TQ2> timingquantityrelationship) {
        this.timingquantityrelationship = timingquantityrelationship;
    }
    

    

}
