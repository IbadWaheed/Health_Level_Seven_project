package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.*;


public class Patient {

    private PID pid;

    private PD1 pd1;

    private PV1 pv1;

    private PV2 pv2;

    private List<OBX> obx;

    private List<DG1> dg1;

    public PID getPid() {
        return pid;
    }

    public void setPid(PID pid) {
        this.pid = pid;
    }

    public PD1 getPd1() {
        return pd1;
    }

    public void setPd1(PD1 pd1) {
        this.pd1 = pd1;
    }

    public PV1 getPv1() {
        return pv1;
    }

    public void setPv1(PV1 pv1) {
        this.pv1 = pv1;
    }

    public PV2 getPv2() {
        return pv2;
    }

    public void setPv2(PV2 pv2) {
        this.pv2 = pv2;
    }

    public List<OBX> getObx() {
        return obx;
    }

    public void setObx(List<OBX> obx) {
        this.obx = obx;
    }

    public List<DG1> getDg1() {
        return dg1;
    }

    public void setDg1(List<DG1> dg1) {
        this.dg1 = dg1;
    }

    public String toHL7(){
        StringBuilder builder = new StringBuilder();
        if (pid != null) {
            builder.append(pid.toHL7()).append("\r");
        }
        
        if (pd1 != null) {
            builder.append(pd1.toHL7()).append("\r");
        }
        
        if (pv1 != null) {
            builder.append(pv1.toHL7()).append("\r");
        }
        
        if (pv2 != null) {
            builder.append(pv2.toHL7()).append("\r");
        }
        
        if (obx != null) {
            for (OBX obxitem : obx) {
                if (obxitem != null) {
                    builder.append(obxitem.toHL7()).append("\r");
                }
            }
        }
        
        if (dg1 != null) {
            for (DG1 dg1item : dg1) {
                if (dg1item != null) {
                    builder.append(dg1item.toHL7()).append("\r");
                }
            }
        }
        


        return builder.toString();
    }

}

