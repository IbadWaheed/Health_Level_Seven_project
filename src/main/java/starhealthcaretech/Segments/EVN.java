package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.HD;
import starhealthcaretech.DataTypes.XCN;
import starhealthcaretech.HL7Helper.HL7util;

public class EVN implements HL7SegmentInterface{

    private String eventTypeCode; // EVN.1
    private String recordedDateTime; // EVN.2
    private String dateTimePlannedEvent; // EVN.3
    private String eventReasonCode; // EVN.4
    private List<XCN> operatorId; // EVN.5 (∞ - can occur multiple times)
    private String eventOccurred; // EVN.6
    private HD eventFacility; // EVN.7

    // Getters and Setters
    public String getEventTypeCode() {
        return eventTypeCode;
    }

    public void setEventTypeCode(String eventTypeCode) {
        this.eventTypeCode = eventTypeCode;
    }

    public String getRecordedDateTime() {
        return recordedDateTime;
    }

    public void setRecordedDateTime(String recordedDateTime) {
        this.recordedDateTime = recordedDateTime;
    }

    public String getDateTimePlannedEvent() {
        return dateTimePlannedEvent;
    }

    public void setDateTimePlannedEvent(String dateTimePlannedEvent) {
        this.dateTimePlannedEvent = dateTimePlannedEvent;
    }

    public String getEventReasonCode() {
        return eventReasonCode;
    }

    public void setEventReasonCode(String eventReasonCode) {
        this.eventReasonCode = eventReasonCode;
    }

    public List<XCN> getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(List<XCN> operatorId) {
        this.operatorId = operatorId;
    }

    public String getEventOccurred() {
        return eventOccurred;
    }

    public void setEventOccurred(String eventOccurred) {
        this.eventOccurred = eventOccurred;
    }

    public HD getEventFacility() {
        return eventFacility;
    }

    public void setEventFacility(HD eventFacility) {
        this.eventFacility = eventFacility;
    }
    
    @Override
    public String toHL7() {
        return "EVN" + HL7util.processAllFields(this);
    }
}
