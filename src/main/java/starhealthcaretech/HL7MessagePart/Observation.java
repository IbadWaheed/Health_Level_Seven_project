package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.NTE;
import starhealthcaretech.Segments.OBX;

public class Observation {
    private OBX observationresult; // Required
    private List<NTE> notesandcomments; // Optional, repeating
    public OBX getObservationresult() {
        return observationresult;
    }
    public void setObservationresult(OBX observationresult) {
        this.observationresult = observationresult;
    }
    public List<NTE> getNotesandcomments() {
        return notesandcomments;
    }
    public void setNotesandcomments(List<NTE> notesandcomments) {
        this.notesandcomments = notesandcomments;
    }
   

    
    

}
