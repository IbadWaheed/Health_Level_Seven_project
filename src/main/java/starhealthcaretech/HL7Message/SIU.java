package starhealthcaretech.HL7Message;

import java.util.List;



import starhealthcaretech.Segments.*;
import starhealthcaretech.HL7MessagePart.*;

public class SIU{


    private MSH msh;

    private SCH sch;

    private List<TQ1> tq1;

    private List<NTE> nte;

    private List<Patient> patient;

    private List<Resources> resources;

 

 
    public MSH getMsh() {
        return msh;
    }




    public void setMsh(MSH msh) {
        this.msh = msh;
    }




    public SCH getSch() {
        return sch;
    }




    public void setSch(SCH sch) {
        this.sch = sch;
    }




    public List<TQ1> getTq1() {
        return tq1;
    }




    public void setTq1(List<TQ1> tq1) {
        this.tq1 = tq1;
    }




    public List<NTE> getNte() {
        return nte;
    }




    public void setNte(List<NTE> nte) {
        this.nte = nte;
    }




    public List<Patient> getPatient() {
        return patient;
    }




    public void setPatient(List<Patient> patient) {
        this.patient = patient;
    }




    public List<Resources> getResources() {
        return resources;
    }




    public void setResources(List<Resources> resources) {
        this.resources = resources;
    }




    public String toHL7(){
        StringBuilder builder = new StringBuilder();
        if (msh != null) {
            builder.append(msh.toHL7()).append("\r");
        }
        
        if (sch != null) {
            builder.append(sch.toHL7()).append("\r");
        }
        
        if (tq1 != null) {
            for (TQ1 t : tq1) {
                if (t != null) {
                    builder.append(t.toHL7()).append("\r");
                }
            }
        }
        
        if (nte != null) {
            for (NTE n : nte) {
                if (n != null) {
                    builder.append(n.toHL7()).append("\r");
                }
            }
        }
        
        if (patient != null) {
            for (Patient p : patient) {
                if (p != null) {
                    builder.append(p.toHL7()).append("\r");
                }
            }
        }
        
        if (resources != null) {
            for (Resources r : resources) {
                if (r != null) {
                    builder.append(r.toHL7()).append("\r");
                }
            }
        }
        
      

        return builder.toString();
    }
}

