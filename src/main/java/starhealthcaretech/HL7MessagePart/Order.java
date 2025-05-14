package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.NTE;
import starhealthcaretech.Segments.OBR;

public class Order {
    private OBR  observationrequest; // Required
    private List<NTE> notesandcomments; // Optional, repeating
    public OBR getObservationrequest() {
        return observationrequest;
    }
    public void setObservationrequest(OBR observationrequest) {
        this.observationrequest = observationrequest;
    }
    public List<NTE> getNotesandcomments() {
        return notesandcomments;
    }
    public void setNotesandcomments(List<NTE> notesandcomments) {
        this.notesandcomments = notesandcomments;
    }
    

    

    

}
