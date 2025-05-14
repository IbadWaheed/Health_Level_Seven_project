package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.TQ;
import starhealthcaretech.DataTypes.XCN;
import starhealthcaretech.HL7Helper.HL7util;

public class SCH implements HL7SegmentInterface {
       // SCH.1 - Placer Appointment ID (Composite ID, Length: 75)
    private String placerAppointmentID;

    // SCH.2 - Filler Appointment ID (Composite ID, Length: 75)
    private String fillerAppointmentID;

    // SCH.3 - Occurrence Number (Numeric, Length: 5)
    private String occurrenceNumber;

    // SCH.4 - Placer Group Number (Optional, Composite ID, Length: 22)
    private String placerGroupNumber;

    // SCH.5 - Schedule ID (Optional, Coded Element, Length: 250)
    private String scheduleID;

    // SCH.6 - Event Reason (Required, Coded Element, Length: 250)
    private CE eventReason;

    // SCH.7 - Appointment Reason (Optional, Coded Element, Length: 250)
    private CE appointmentReason;

    // SCH.8 - Appointment Type (Optional, Coded Element, Length: 250)
    private CE appointmentType;

    // SCH.9 - Appointment Duration (Numeric, Length: 20)
    private String appointmentDuration;

    // SCH.10 - Appointment Duration Units (Coded Element, Length: 250)
    private String appointmentDurationUnits;

    // SCH.11 - Appointment Timing Quantity (Time Quantity, Length: 200)
    private List<TQ> appointmentTimingQuantity;

    // SCH.12 - Placer Contact Person (Optional, Extended Composite Name and Number, Length: 250)
    private List<XCN> placerContactPerson;

    // SCH.13 - Placer Contact Phone Number (Optional, Extended Telecommunication Number, Length: 250)
    private String placerContactPhoneNumber;

    // SCH.14 - Placer Contact Address (Optional, Extended Address, Length: 250)
    private List<String> placerContactAddress;

    // SCH.15 - Placer Contact Location (Optional, Place, Length: 80)
    private String placerContactLocation;

    // SCH.16 - Filler Contact Person (Required, Extended Composite Name and Number, Length: 250)
    private List<String> fillerContactPerson;

    // SCH.17 - Filler Contact Phone Number (Optional, Extended Telecommunication Number, Length: 250)
    private String fillerContactPhoneNumber;

    // SCH.18 - Filler Contact Address (Optional, Extended Address, Length: 250)
    private List<String> fillerContactAddress;

    // SCH.19 - Filler Contact Location (Optional, Place, Length: 80)
    private String fillerContactLocation;

    // SCH.20 - Entered By Person (Required, Extended Composite Name and Number, Length: 250)
    private List<String> enteredByPerson;

    // SCH.21 - Entered By Phone Number (Optional, Extended Telecommunication Number, Length: 250)
    private List<String> enteredByPhoneNumber;

    // SCH.22 - Entered By Location (Optional, Place, Length: 80)
    private String enteredByLocation;

    // SCH.23 - Parent Placer Appointment ID (Optional, Composite ID, Length: 75)
    private String parentPlacerAppointmentID;

    // SCH.24 - Parent Filler Appointment ID (Required, Composite ID, Length: 75)
    private String parentFillerAppointmentID;

    // SCH.25 - Filler Status Code (Optional, Coded Element, Length: 250)
    private String fillerStatusCode;

    // SCH.26 - Placer Order Number (Required, Composite ID, Length: 22)
    private List<String> placerOrderNumber;

    // SCH.27 - Filler Order Number (Required, Composite ID, Length: 22)
    private List<String> fillerOrderNumber;

    // Getter and Setter methods

    public String getPlacerAppointmentID() {
        return placerAppointmentID;
    }

    public void setPlacerAppointmentID(String placerAppointmentID) {
        this.placerAppointmentID = placerAppointmentID;
    }

    public String getFillerAppointmentID() {
        return fillerAppointmentID;
    }

    public void setFillerAppointmentID(String fillerAppointmentID) {
        this.fillerAppointmentID = fillerAppointmentID;
    }

    public String getOccurrenceNumber() {
        return occurrenceNumber;
    }

    public void setOccurrenceNumber(String occurrenceNumber) {
        this.occurrenceNumber = occurrenceNumber;
    }

    public String getPlacerGroupNumber() {
        return placerGroupNumber;
    }

    public void setPlacerGroupNumber(String placerGroupNumber) {
        this.placerGroupNumber = placerGroupNumber;
    }

    public String getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(String scheduleID) {
        this.scheduleID = scheduleID;
    }

    public CE getEventReason() {
        return eventReason;
    }

    public void setEventReason(CE eventReason) {
        this.eventReason = eventReason;
    }

    public CE getAppointmentReason() {
        return appointmentReason;
    }

    public void setAppointmentReason(CE appointmentReason) {
        this.appointmentReason = appointmentReason;
    }

    public CE getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(CE appointmentType) {
        this.appointmentType = appointmentType;
    }

    public String getAppointmentDuration() {
        return appointmentDuration;
    }

    public void setAppointmentDuration(String appointmentDuration) {
        this.appointmentDuration = appointmentDuration;
    }

    public String getAppointmentDurationUnits() {
        return appointmentDurationUnits;
    }

    public void setAppointmentDurationUnits(String appointmentDurationUnits) {
        this.appointmentDurationUnits = appointmentDurationUnits;
    }

    public List<TQ> getAppointmentTimingQuantity() {
        return appointmentTimingQuantity;
    }

    public void setAppointmentTimingQuantity(List<TQ> appointmentTimingQuantity) {
        this.appointmentTimingQuantity = appointmentTimingQuantity;
    }

    public List<XCN> getPlacerContactPerson() {
        return placerContactPerson;
    }

    public void setPlacerContactPerson(List<XCN> placerContactPerson) {
        this.placerContactPerson = placerContactPerson;
    }

    public String getPlacerContactPhoneNumber() {
        return placerContactPhoneNumber;
    }

    public void setPlacerContactPhoneNumber(String placerContactPhoneNumber) {
        this.placerContactPhoneNumber = placerContactPhoneNumber;
    }

    public List<String> getPlacerContactAddress() {
        return placerContactAddress;
    }

    public void setPlacerContactAddress(List<String> placerContactAddress) {
        this.placerContactAddress = placerContactAddress;
    }

    public String getPlacerContactLocation() {
        return placerContactLocation;
    }

    public void setPlacerContactLocation(String placerContactLocation) {
        this.placerContactLocation = placerContactLocation;
    }

    public List<String> getFillerContactPerson() {
        return fillerContactPerson;
    }

    public void setFillerContactPerson(List<String> fillerContactPerson) {
        this.fillerContactPerson = fillerContactPerson;
    }

    public String getFillerContactPhoneNumber() {
        return fillerContactPhoneNumber;
    }

    public void setFillerContactPhoneNumber(String fillerContactPhoneNumber) {
        this.fillerContactPhoneNumber = fillerContactPhoneNumber;
    }

    public List<String> getFillerContactAddress() {
        return fillerContactAddress;
    }

    public void setFillerContactAddress(List<String> fillerContactAddress) {
        this.fillerContactAddress = fillerContactAddress;
    }

    public String getFillerContactLocation() {
        return fillerContactLocation;
    }

    public void setFillerContactLocation(String fillerContactLocation) {
        this.fillerContactLocation = fillerContactLocation;
    }

    public List<String> getEnteredByPerson() {
        return enteredByPerson;
    }

    public void setEnteredByPerson(List<String> enteredByPerson) {
        this.enteredByPerson = enteredByPerson;
    }

    public List<String> getEnteredByPhoneNumber() {
        return enteredByPhoneNumber;
    }

    public void setEnteredByPhoneNumber(List<String> enteredByPhoneNumber) {
        this.enteredByPhoneNumber = enteredByPhoneNumber;
    }

    public String getEnteredByLocation() {
        return enteredByLocation;
    }

    public void setEnteredByLocation(String enteredByLocation) {
        this.enteredByLocation = enteredByLocation;
    }

    public String getParentPlacerAppointmentID() {
        return parentPlacerAppointmentID;
    }

    public void setParentPlacerAppointmentID(String parentPlacerAppointmentID) {
        this.parentPlacerAppointmentID = parentPlacerAppointmentID;
    }

    public String getParentFillerAppointmentID() {
        return parentFillerAppointmentID;
    }

    public void setParentFillerAppointmentID(String parentFillerAppointmentID) {
        this.parentFillerAppointmentID = parentFillerAppointmentID;
    }

    public String getFillerStatusCode() {
        return fillerStatusCode;
    }

    public void setFillerStatusCode(String fillerStatusCode) {
        this.fillerStatusCode = fillerStatusCode;
    }

    public List<String> getPlacerOrderNumber() {
        return placerOrderNumber;
    }

    public void setPlacerOrderNumber(List<String> placerOrderNumber) {
        this.placerOrderNumber = placerOrderNumber;
    }

    public List<String> getFillerOrderNumber() {
        return fillerOrderNumber;
    }

    public void setFillerOrderNumber(List<String> fillerOrderNumber) {
        this.fillerOrderNumber = fillerOrderNumber;
    }

    @Override
    public String toHL7() {
        return "SCH" + HL7util.processAllFields(this);
    }

}
