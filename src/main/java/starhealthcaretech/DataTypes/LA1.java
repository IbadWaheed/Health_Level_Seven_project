package starhealthcaretech.DataTypes;

public class LA1 {

    // LA1.1 - Point Of Care (Optional, Coded Value (IS), Length: 20)
    private String pointOfCare;

    // LA1.2 - Room (Optional, Coded Value (IS), Length: 20)
    private String room;

    // LA1.3 - Bed (Optional, Coded Value (IS), Length: 20)
    private String bed;

    // LA1.4 - Facility (Optional, Hierarchic Designator (HD), Length: 227)
    private HD facility;

    // LA1.5 - Location Status (Optional, Coded Value (IS), Length: 20)
    private String locationStatus;

    // LA1.6 - Patient Location Type (Optional, Coded Value (IS), Length: 20)
    private String patientLocationType;

    // LA1.7 - Building (Optional, Coded Value (IS), Length: 20)
    private String building;

    // LA1.8 - Floor (Optional, Coded Value (IS), Length: 20)
    private String floor;

    // LA1.9 - Address (Optional, Address (AD), Length: 415)
    private AD address;

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

    // Getter and Setter for address
    public AD getAddress() {
        return address;
    }

    public void setAddress(AD address) {
        this.address = address;
    }
}
