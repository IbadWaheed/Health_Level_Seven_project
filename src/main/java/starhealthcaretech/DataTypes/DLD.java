package starhealthcaretech.DataTypes;

public class DLD {

    // DLD.1 - Discharge Location (Required, Coded Value for User-defined Tables (IS), Length: 20)
    private String dischargeLocation;

    // DLD.2 - Effective Date (Optional, Timestamp (TS), Length: 26)
    private TS effectiveDate;

    // Getter and Setter for dischargeLocation
    public String getDischargeLocation() {
        return dischargeLocation;
    }

    public void setDischargeLocation(String dischargeLocation) {
        this.dischargeLocation = dischargeLocation;
    }

    // Getter and Setter for effectiveDate
    public TS getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(TS effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}
