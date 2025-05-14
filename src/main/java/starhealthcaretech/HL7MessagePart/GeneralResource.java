package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.AIG;
import starhealthcaretech.Segments.NTE;



public class GeneralResource {
    private AIG aig;

    private List<NTE> nte;

    public AIG getAig() {
        return aig;
    }

    public void setAig(AIG aig) {
        this.aig = aig;
    }

    public List<NTE> getNte() {
        return nte;
    }

    public void setNte(List<NTE> nte) {
        this.nte = nte;
    }

    public String toHL7(){

        
        StringBuilder builder = new StringBuilder();
        if (aig != null) {
            builder.append(aig.toHL7()).append("\r");
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
