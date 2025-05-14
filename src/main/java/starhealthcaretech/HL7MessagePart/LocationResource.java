package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.AIL;
import starhealthcaretech.Segments.NTE;


public class LocationResource {
    private AIL ail;


    private List<NTE> nte;


    public AIL getAil() {
        return ail;
    }


    public void setAil(AIL ail) {
        this.ail = ail;
    }


    public List<NTE> getNte() {
        return nte;
    }


    public void setNte(List<NTE> nte) {
        this.nte = nte;
    }


    public String toHL7(){
        StringBuilder builder = new StringBuilder();
        if (ail != null) {
            builder.append(ail.toHL7()).append("\r");
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
