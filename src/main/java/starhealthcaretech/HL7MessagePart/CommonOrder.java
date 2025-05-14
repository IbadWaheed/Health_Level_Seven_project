package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.ORC;

public class CommonOrder {
    private ORC commonorder; // Optional
    private List<TimingQuantity> timingQuantityList; // Optional, repeating
    private Order order; // Optional
    private List<Observation> observationList; // Optional, repeating
    public ORC getCommonorder() {
        return commonorder;
    }
    public void setCommonorder(ORC commonorder) {
        this.commonorder = commonorder;
    }
    public List<TimingQuantity> getTimingQuantityList() {
        return timingQuantityList;
    }
    public void setTimingQuantityList(List<TimingQuantity> timingQuantityList) {
        this.timingQuantityList = timingQuantityList;
    }
    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }
    public List<Observation> getObservationList() {
        return observationList;
    }
    public void setObservationList(List<Observation> observationList) {
        this.observationList = observationList;
    }
   

    

}
