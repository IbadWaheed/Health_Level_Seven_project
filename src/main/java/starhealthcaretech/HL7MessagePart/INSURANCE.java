package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.IN1;
import starhealthcaretech.Segments.IN2;
import starhealthcaretech.Segments.IN3;
import starhealthcaretech.Segments.ROL;

public class INSURANCE {
    private IN1 insurance;                        // IN1 - Insurance (Required)
    private IN2 insuranceAdditionalInfo;          // IN2 - Insurance Additional Information (Optional)
    private List<IN3> insuranceCertifications;    // IN3 - Insurance Additional Information, Certification (Optional, multiple)
    private List<ROL> roles;                      // ROL - Role (Optional, multiple)


    


    public IN1 getInsurance() {
        return insurance;
    }





    public void setInsurance(IN1 insurance) {
        this.insurance = insurance;
    }





    public IN2 getInsuranceAdditionalInfo() {
        return insuranceAdditionalInfo;
    }





    public void setInsuranceAdditionalInfo(IN2 insuranceAdditionalInfo) {
        this.insuranceAdditionalInfo = insuranceAdditionalInfo;
    }





    public List<IN3> getInsuranceCertifications() {
        return insuranceCertifications;
    }





    public void setInsuranceCertifications(List<IN3> insuranceCertifications) {
        this.insuranceCertifications = insuranceCertifications;
    }





    public List<ROL> getRoles() {
        return roles;
    }





    public void setRoles(List<ROL> roles) {
        this.roles = roles;
    }





    public String toHL7() {
        StringBuilder builder = new StringBuilder();
    
        if (insurance != null) {
            builder.append(insurance.toHL7()).append("\r");
        }
    
        if (insuranceAdditionalInfo != null) {
            builder.append(insuranceAdditionalInfo.toHL7()).append("\r");
        }
    
        if (insuranceCertifications != null) {
            for (IN3 in3 : insuranceCertifications) {
                if (in3 != null) {
                    builder.append(in3.toHL7()).append("\r");
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
