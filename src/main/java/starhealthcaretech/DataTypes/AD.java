package starhealthcaretech.DataTypes;

public class AD {
    private String streetAddress;                 // AD.1
    private String otherDesignation;              // AD.2
    private String city;                          // AD.3
    private String stateOrProvince;               // AD.4
    private String zipOrPostalCode;               // AD.5
    private String country;                       // AD.6
    private String addressType;                   // AD.7
    private String otherGeographicDesignation;    // AD.8

    // Getters and Setters

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getOtherDesignation() {
        return otherDesignation;
    }

    public void setOtherDesignation(String otherDesignation) {
        this.otherDesignation = otherDesignation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    public String getZipOrPostalCode() {
        return zipOrPostalCode;
    }

    public void setZipOrPostalCode(String zipOrPostalCode) {
        this.zipOrPostalCode = zipOrPostalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getOtherGeographicDesignation() {
        return otherGeographicDesignation;
    }

    public void setOtherGeographicDesignation(String otherGeographicDesignation) {
        this.otherGeographicDesignation = otherGeographicDesignation;
    }
}
