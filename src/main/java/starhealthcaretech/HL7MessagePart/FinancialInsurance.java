package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.IN1;
import starhealthcaretech.Segments.IN2;
import starhealthcaretech.Segments.IN3;
import starhealthcaretech.Segments.ROL;

public class FinancialInsurance {
    private IN1 in1; // Required
    private IN2 in2; // Optional
    private List<IN3> in3List; // Optional, repeating
    private List<ROL> rolList; // Optional, repeating
    public IN1 getIn1() {
        return in1;
    }
    public void setIn1(IN1 in1) {
        this.in1 = in1;
    }
    public IN2 getIn2() {
        return in2;
    }
    public void setIn2(IN2 in2) {
        this.in2 = in2;
    }
    public List<IN3> getIn3List() {
        return in3List;
    }
    public void setIn3List(List<IN3> in3List) {
        this.in3List = in3List;
    }
    public List<ROL> getRolList() {
        return rolList;
    }
    public void setRolList(List<ROL> rolList) {
        this.rolList = rolList;
    }

    

}
