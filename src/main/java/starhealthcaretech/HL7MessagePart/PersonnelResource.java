package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.AIP;
import starhealthcaretech.Segments.NTE;



public class PersonnelResource {
    private AIP aip;

    private List<NTE> nte;

    public AIP getAip() {
        return aip;
    }

    public void setAip(AIP aip) {
        this.aip = aip;
    }

    public List<NTE> getNte() {
        return nte;
    }

    public void setNte(List<NTE> nte) {
        this.nte = nte;
    }


    public String toHL7(){
        StringBuilder builder = new StringBuilder();
        if (aip != null) {
            builder.append(aip.toHL7()).append("\r");
        }
        
        if (nte != null) {
            for (NTE nteitem : nte) {
                if (nteitem != null) {
                    builder.append(nteitem.toHL7()).append("\r");
                }
            }
        }
        

      


        return builder.toString();
    }

}
