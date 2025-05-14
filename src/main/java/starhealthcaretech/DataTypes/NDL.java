package starhealthcaretech.DataTypes;

public class NDL {

    // NDL.1 - Name (Optional, Coded Name (CNN), Length: 406)
    private String name;

    // NDL.2 - Start Date/Time (Optional, Time Stamp (TS), Length: 26)
    private String startDateTime;

    // NDL.3 - End Date/Time (Optional, Time Stamp (TS), Length: 26)
    private String endDateTime;

    // NDL.4 - Point Of Care (Optional, Coded Value (IS), Length: 20)
    private String pointOfCare;

    // NDL.5 - Room (Optional, Coded Value (IS), Length: 20)
    private String room;

    // NDL.6 - Bed (Optional, Coded Value (IS), Length: 20)
    private String bed;

    // NDL.7 - Facility (Optional, Hierarchical Designator (HD), Length: 227)
    private String facility;

    // NDL.8 - Location Status (Optional, Coded Value (IS), Length: 20)
    private String locationStatus;

    // NDL.9 - Patient Location Type (Optional, Coded Value (IS), Length: 20)
    private String patientLocationType;

    // NDL.10 - Building (Optional, Coded Value (IS), Length: 20)
    private String building;

    // NDL.11 - Floor (Optional, Coded Value (IS), Length: 20)
    private String floor;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for startDateTime
    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    // Getter and Setter for endDateTime
    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

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
    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
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
}
