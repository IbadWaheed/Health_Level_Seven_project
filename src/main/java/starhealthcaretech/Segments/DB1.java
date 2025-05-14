package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CX;
import starhealthcaretech.HL7Helper.HL7util;

public class DB1 implements HL7SegmentInterface{


    private String setIdDB1; // DB1.1
    private String disabledPersonCode; // DB1.2
    private List<CX> disabledPersonIdentifier; // DB1.3
    private String disabledIndicator; // DB1.4
    private String disabilityStartDate; // DB1.5
    private String disabilityEndDate; // DB1.6
    private String disabilityReturnToWorkDate; // DB1.7
    private String disabilityUnableToWorkDate; // DB1.8

    public String getSetIdDB1() {
        return setIdDB1;
    }
    public void setSetIdDB1(String setIdDB1) {
        this.setIdDB1 = setIdDB1;
    }
    public String getDisabledPersonCode() {
        return disabledPersonCode;
    }
    public void setDisabledPersonCode(String disabledPersonCode) {
        this.disabledPersonCode = disabledPersonCode;
    }
    public List<CX> getDisabledPersonIdentifier() {
        return disabledPersonIdentifier;
    }
    public void setDisabledPersonIdentifier(List<CX> disabledPersonIdentifier) {
        this.disabledPersonIdentifier = disabledPersonIdentifier;
    }
    public String getDisabledIndicator() {
        return disabledIndicator;
    }
    public void setDisabledIndicator(String disabledIndicator) {
        this.disabledIndicator = disabledIndicator;
    }
    public String getDisabilityStartDate() {
        return disabilityStartDate;
    }
    public void setDisabilityStartDate(String disabilityStartDate) {
        this.disabilityStartDate = disabilityStartDate;
    }
    public String getDisabilityEndDate() {
        return disabilityEndDate;
    }
    public void setDisabilityEndDate(String disabilityEndDate) {
        this.disabilityEndDate = disabilityEndDate;
    }
    public String getDisabilityReturnToWorkDate() {
        return disabilityReturnToWorkDate;
    }
    public void setDisabilityReturnToWorkDate(String disabilityReturnToWorkDate) {
        this.disabilityReturnToWorkDate = disabilityReturnToWorkDate;
    }
    public String getDisabilityUnableToWorkDate() {
        return disabilityUnableToWorkDate;
    }
    public void setDisabilityUnableToWorkDate(String disabilityUnableToWorkDate) {
        this.disabilityUnableToWorkDate = disabilityUnableToWorkDate;
    }
    
    @Override
    public String toHL7() {
        return "DB1" + HL7util.processAllFields(this);
    }

}
