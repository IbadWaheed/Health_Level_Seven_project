package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.NTE;
import starhealthcaretech.Segments.OBX;

public class FinancialObservation {
    private OBX obx; // Required
    private List<NTE> nteList; // Optional, repeating 
    public OBX getObx() {
        return obx;
    }
    public void setObx(OBX obx) {
        this.obx = obx;
    }
    public List<NTE> getNteList() {
        return nteList;
    }
    public void setNteList(List<NTE> nteList) {
        this.nteList = nteList;
    }


    

}
