package starhealthcaretech.DataTypes;

public class DIN {

    // DIN.1 - Date (Required, Timestamp, Length: 26)
    private TS date;

    // DIN.2 - Institution Name (Required, Coded Element, Length: 483)
    private CE institutionName;

    // Getter and Setter for date
    public TS getDate() {
        return date;
    }

    public void setDate(TS date) {
        this.date = date;
    }

    // Getter and Setter for institutionName
    public CE getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(CE institutionName) {
        this.institutionName = institutionName;
    }
}
