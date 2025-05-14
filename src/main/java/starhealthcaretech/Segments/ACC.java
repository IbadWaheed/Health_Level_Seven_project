package starhealthcaretech.Segments;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.XAD;
import starhealthcaretech.DataTypes.XCN;
import starhealthcaretech.HL7Helper.HL7util;

public class ACC implements HL7SegmentInterface{



    private String accidentDateTime; // ACC.1 (TS)
    private CE accidentCode; // ACC.2
    private String accidentLocation; // ACC.3
    private CE autoAccidentState; // ACC.4
    private String accidentJobRelatedIndicator; // ACC.5
    private String accidentDeathIndicator; // ACC.6
    private XCN enteredBy; // ACC.7
    private String accidentDescription; // ACC.8
    private String broughtInBy; // ACC.9
    private String policeNotifiedIndicator; // ACC.10
    private XAD accidentAddress; // ACC.11

    public String getAccidentDateTime() {
        return accidentDateTime;
    }

    public void setAccidentDateTime(String accidentDateTime) {
        this.accidentDateTime = accidentDateTime;
    }

    public CE getAccidentCode() {
        return accidentCode;
    }

    public void setAccidentCode(CE accidentCode) {
        this.accidentCode = accidentCode;
    }

    public String getAccidentLocation() {
        return accidentLocation;
    }

    public void setAccidentLocation(String accidentLocation) {
        this.accidentLocation = accidentLocation;
    }

    public CE getAutoAccidentState() {
        return autoAccidentState;
    }

    public void setAutoAccidentState(CE autoAccidentState) {
        this.autoAccidentState = autoAccidentState;
    }

    public String getAccidentJobRelatedIndicator() {
        return accidentJobRelatedIndicator;
    }

    public void setAccidentJobRelatedIndicator(String accidentJobRelatedIndicator) {
        this.accidentJobRelatedIndicator = accidentJobRelatedIndicator;
    }

    public String getAccidentDeathIndicator() {
        return accidentDeathIndicator;
    }

    public void setAccidentDeathIndicator(String accidentDeathIndicator) {
        this.accidentDeathIndicator = accidentDeathIndicator;
    }

    public XCN getEnteredBy() {
        return enteredBy;
    }

    public void setEnteredBy(XCN enteredBy) {
        this.enteredBy = enteredBy;
    }

    public String getAccidentDescription() {
        return accidentDescription;
    }

    public void setAccidentDescription(String accidentDescription) {
        this.accidentDescription = accidentDescription;
    }

    public String getBroughtInBy() {
        return broughtInBy;
    }

    public void setBroughtInBy(String broughtInBy) {
        this.broughtInBy = broughtInBy;
    }

    public String getPoliceNotifiedIndicator() {
        return policeNotifiedIndicator;
    }

    public void setPoliceNotifiedIndicator(String policeNotifiedIndicator) {
        this.policeNotifiedIndicator = policeNotifiedIndicator;
    }

    public XAD getAccidentAddress() {
        return accidentAddress;
    }

    public void setAccidentAddress(XAD accidentAddress) {
        this.accidentAddress = accidentAddress;
    }



    @Override
    public String toHL7() {
        return "ACC" + HL7util.processAllFields(this);
    }
}
