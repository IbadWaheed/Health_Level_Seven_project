package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.PR1;
import starhealthcaretech.Segments.ROL;

public class FinancialProcedure {
    private PR1 pr1; // Required
    private List<ROL> rolList; // Optional, repeating
    public PR1 getPr1() {
        return pr1;
    }
    public void setPr1(PR1 pr1) {
        this.pr1 = pr1;
    }
    public List<ROL> getRolList() {
        return rolList;
    }
    public void setRolList(List<ROL> rolList) {
        this.rolList = rolList;
    }

    

}
