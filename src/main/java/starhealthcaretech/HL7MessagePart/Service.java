package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.AIS;
import starhealthcaretech.Segments.NTE;



public class Service {
    private AIS ais;

    private List<NTE> nte;

    public AIS getAis() {
        return ais;
    }

    public void setAis(AIS ais) {
        this.ais = ais;
    }

    public List<NTE> getNte() {
        return nte;
    }

    public void setNte(List<NTE> nte) {
        this.nte = nte;
    }

    
    public String toHL7(){
        StringBuilder builder = new StringBuilder();
        if (ais != null) {
            builder.append(ais.toHL7()).append("\r");
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
