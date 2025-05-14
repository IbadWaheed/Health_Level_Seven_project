package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.NTE;
import starhealthcaretech.Segments.OBR;

public class FinancialOrder {
    private OBR obr; // Required
    private List<NTE> nteList; // Optional, repeating
    public OBR getObr() {
        return obr;
    }
    public void setObr(OBR obr) {
        this.obr = obr;
    }
    public List<NTE> getNteList() {
        return nteList;
    }
    public void setNteList(List<NTE> nteList) {
        this.nteList = nteList;
    }

    

}
