package starhealthcaretech.DataTypes;

public class DLN {

    // DLN.1 - License Number (Required, String (ST), Length: 20)
    private String licenseNumber;

    // DLN.2 - Issuing State, Province, Country (Optional, Coded Value (IS), Length: 20)
    private String issuingLocation;

    // DLN.3 - Expiration Date (Optional, Date (DT), Length: 24)
    private String expirationDate;

    // Getter and Setter for licenseNumber
    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    // Getter and Setter for issuingLocation
    public String getIssuingLocation() {
        return issuingLocation;
    }

    public void setIssuingLocation(String issuingLocation) {
        this.issuingLocation = issuingLocation;
    }

    // Getter and Setter for expirationDate
    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
