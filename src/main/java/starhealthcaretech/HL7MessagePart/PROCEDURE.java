package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.PR1;
import starhealthcaretech.Segments.ROL;

public class PROCEDURE {

    private List<PR1> procedures;       // PR1 - Procedures (Required, possibly multiple)
    private List<ROL> roles;            // ROL - Role (Optional, multiple)

    

    public List<PR1> getProcedures() {
        return procedures;
    }



    public void setProcedures(List<PR1> procedures) {
        this.procedures = procedures;
    }



    public List<ROL> getRoles() {
        return roles;
    }



    public void setRoles(List<ROL> roles) {
        this.roles = roles;
    }



    public String toHL7() {
        StringBuilder builder = new StringBuilder();
    
        if (procedures != null) {
            for (PR1 pr1 : procedures) {
                if (pr1 != null) {
                    builder.append(pr1.toHL7()).append("\r");
                }
            }
        }
    
        if (roles != null) {
            for (ROL rol : roles) {
                if (rol != null) {
                    builder.append(rol.toHL7()).append("\r");
                }
            }
        }
    
        return builder.toString();
    }
    
}
