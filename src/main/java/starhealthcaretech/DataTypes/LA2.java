package starhealthcaretech.DataTypes;

public class LA2 {

    // LA2.1 - Point Of Care (Optional, Coded Value (IS), Length: 20)
    private String pointOfCare;

    // LA2.2 - Room (Optional, Coded Value (IS), Length: 20)
    private String room;

    // LA2.3 - Bed (Optional, Coded Value (IS), Length: 20)
    private String bed;

    // LA2.4 - Facility (Optional, Hierarchic Designator (HD), Length: 227)
    private HD facility;

    // LA2.5 - Location Status (Optional, Coded Value (IS), Length: 20)
    private String locationStatus;

    // LA2.6 - Patient Location Type (Optional, Coded Value (IS), Length: 20)
    private String patientLocationType;

    // LA2.7 - Building (Optional, Coded Value (IS), Length: 20)
    private String building;

    // LA2.8 - Floor (Optional, Coded Value (IS), Length: 20)
    private String floor;

    // LA2.9 - Street Address (Optional, String (ST), Length: 120)
    private String streetAddress;

    // LA2.10 - Other Designation (Optional, String (ST), Length: 120)
    private String otherDesignation;

    // LA2.11 - City (Optional, String (ST), Length: 50)
    private String city;

    // LA2.12 - State Or Province (Optional, String (ST), Length: 50)
    private String stateOrProvince;

    // LA2.13 - Zip Or Postal Code (Optional, String (ST), Length: 12)
    private String zipOrPostalCode;

    // LA2.14 - Country (Optional, Coded Value (ID), Length: 3)
    private String country;

    // LA2.15 - Address Type (Optional, Coded Value (ID), Length: 3)
    private String addressType;

    // LA2.16 - Other Geographic Designation (Optional, String (ST), Length: 50)
    private String otherGeographicDesignation;

    // Getter and Setter for pointOfCare
    public String getPointOfCare() {
        return pointOfCare;
    }

    public void setPointOfCare(String pointOfCare) {
        this.pointOfCare = pointOfCare;
    }

    // Getter and Setter for room
    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    // Getter and Setter for bed
    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    // Getter and Setter for facility
    public HD getFacility() {
        return facility;
    }

    public void setFacility(HD facility) {
        this.facility = facility;
    }

    // Getter and Setter for locationStatus
    public String getLocationStatus() {
        return locationStatus;
    }

    public void setLocationStatus(String locationStatus) {
        this.locationStatus = locationStatus;
    }

    // Getter and Setter for patientLocationType
    public String getPatientLocationType() {
        return patientLocationType;
    }

    public void setPatientLocationType(String patientLocationType) {
        this.patientLocationType = patientLocationType;
    }

    // Getter and Setter for building
    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    // Getter and Setter for floor
    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    // Getter and Setter for streetAddress
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    // Getter and Setter for otherDesignation
    public String getOtherDesignation() {
        return otherDesignation;
    }

    public void setOtherDesignation(String otherDesignation) {
        this.otherDesignation = otherDesignation;
    }

    // Getter and Setter for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter and Setter for stateOrProvince
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    // Getter and Setter for zipOrPostalCode
    public String getZipOrPostalCode() {
        return zipOrPostalCode;
    }

    public void setZipOrPostalCode(String zipOrPostalCode) {
        this.zipOrPostalCode = zipOrPostalCode;
    }

    // Getter and Setter for country
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Getter and Setter for addressType
    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    // Getter and Setter for otherGeographicDesignation
    public String getOtherGeographicDesignation() {
        return otherGeographicDesignation;
    }

    public void setOtherGeographicDesignation(String otherGeographicDesignation) {
        this.otherGeographicDesignation = otherGeographicDesignation;
    }
}
