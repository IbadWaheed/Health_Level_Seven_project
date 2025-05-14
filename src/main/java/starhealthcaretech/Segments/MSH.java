package starhealthcaretech.Segments;

import starhealthcaretech.DataTypes.*;
import starhealthcaretech.HL7Helper.HL7util;

import java.util.List;

public class    MSH implements HL7SegmentInterface {
    // LocalDateTime now = LocalDateTime.now();
    // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    // String formattedDateTime = now.format(formatter);
    // MSH.1 - Field Separator (Required, String (ST), Length: 1)
    private String fieldSeparator;

    // MSH.2 - Encoding Characters (Required, String (ST), Length: 4)
    private String encodingCharacters;

    // MSH.3 - Sending Application (Optional, Hierarchical Designator (HD), Length: 227)
    private String sendingApplication;

    // MSH.4 - Sending Facility (Optional, Hierarchical Designator (HD), Length: 227)
    private String sendingFacility;

    // MSH.5 - Receiving Application (Optional, Hierarchical Designator (HD), Length: 227)
    private String receivingApplication;

    // MSH.6 - Receiving Facility (Optional, Hierarchical Designator (HD), Length: 227)
    private String receivingFacility;

    // MSH.7 - Date/Time Of Message (Required, Time Stamp (TS), Length: 26)
    private String dateTimeOfMessage;

    // MSH.8 - Security (Optional, String (ST), Length: 40)
    private String security;

    // MSH.9 - Message Type (Required, Message (MSG), Length: 15)
    private MSG messageType;

    // MSH.10 - Message Control ID (Required, String (ST), Length: 20)
    private String messageControlID;

    // MSH.11 - Processing ID (Required, Processing Type (PT), Length: 3)
    private String processingID;

    // MSH.12 - Version ID (Required, Version Identifier (VID), Length: 60)
    private String versionID;

    // MSH.13 - Sequence Number (Optional, Numeric (NM), Length: 15)
    private String sequenceNumber;

    // MSH.14 - Continuation Pointer (Optional, String (ST), Length: 180)
    private String continuationPointer;

    // MSH.15 - Accept Acknowledgment Type (Optional, Coded Value (ID), Length: 2)
    private String acceptAcknowledgmentType;

    // MSH.16 - Application Acknowledgment Type (Optional, Coded Value (ID), Length: 2)
    private String applicationAcknowledgmentType;

    // MSH.17 - Country Code (Optional, Coded Value (ID), Length: 3)
    private String countryCode;

    // MSH.18 - Character Set (Optional, Coded Value (ID), Length: 16)
    private List<String> characterSet;

    // MSH.19 - Principal Language Of Message (Optional, Coded Element (CE), Length: 250)
    private String principalLanguageOfMessage;

    // MSH.20 - Alternate Character Set Handling Scheme (Optional, Coded Value (ID), Length: 20)
    private String alternateCharacterSetHandlingScheme;

    // MSH.21 - Message Profile Identifier (Optional, Entity Identifier (EI), Length: 427)
    private List<String> messageProfileIdentifier;

    // Getter and Setter for fieldSeparator
    public String getFieldSeparator() {
        return fieldSeparator;
    }

    public void setFieldSeparator(String fieldSeparator) {
        this.fieldSeparator = fieldSeparator;
    }

    // Getter and Setter for encodingCharacters
    public String getEncodingCharacters() {
        return encodingCharacters;
    }

    public void setEncodingCharacters(String encodingCharacters) {
        this.encodingCharacters = encodingCharacters;
    }

    // Getter and Setter for sendingApplication
    public String getSendingApplication() {
        return sendingApplication;
    }

    public void setSendingApplication(String sendingApplication) {
        this.sendingApplication = sendingApplication;
    }

    // Getter and Setter for sendingFacility
    public String getSendingFacility() {
        return sendingFacility;
    }

    public void setSendingFacility(String sendingFacility) {
        this.sendingFacility = sendingFacility;
    }

    // Getter and Setter for receivingApplication
    public String getReceivingApplication() {
        return receivingApplication;
    }

    public void setReceivingApplication(String receivingApplication) {
        this.receivingApplication = receivingApplication;
    }

    // Getter and Setter for receivingFacility
    public String getReceivingFacility() {
        return receivingFacility;
    }

    public void setReceivingFacility(String receivingFacility) {
        this.receivingFacility = receivingFacility;
    }

    // Getter and Setter for dateTimeOfMessage
    public String getDateTimeOfMessage() {
        return dateTimeOfMessage;
    }

    public void setDateTimeOfMessage(String dateTimeOfMessage) {
        this.dateTimeOfMessage = dateTimeOfMessage;
    }

    // Getter and Setter for security
    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public MSG getMessageType() {
        return messageType;
    }

    public void setMessageType(MSG messageType) {
        this.messageType = messageType;
    }

    // Getter and Setter for messageControlID
    public String getMessageControlID() {
        return messageControlID;
    }

    public void setMessageControlID(String messageControlID) {
        this.messageControlID = messageControlID;
    }

    // Getter and Setter for processingID
    public String getProcessingID() {
        return processingID;
    }

    public void setProcessingID(String processingID) {
        this.processingID = processingID;
    }

    // Getter and Setter for versionID
    public String getVersionID() {
        return versionID;
    }

    public void setVersionID(String versionID) {
        this.versionID = versionID;
    }

    // Getter and Setter for sequenceNumber
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    // Getter and Setter for continuationPointer
    public String getContinuationPointer() {
        return continuationPointer;
    }

    public void setContinuationPointer(String continuationPointer) {
        this.continuationPointer = continuationPointer;
    }

    // Getter and Setter for acceptAcknowledgmentType
    public String getAcceptAcknowledgmentType() {
        return acceptAcknowledgmentType;
    }

    public void setAcceptAcknowledgmentType(String acceptAcknowledgmentType) {
        this.acceptAcknowledgmentType = acceptAcknowledgmentType;
    }

    // Getter and Setter for applicationAcknowledgmentType
    public String getApplicationAcknowledgmentType() {
        return applicationAcknowledgmentType;
    }

    public void setApplicationAcknowledgmentType(String applicationAcknowledgmentType) {
        this.applicationAcknowledgmentType = applicationAcknowledgmentType;
    }

    // Getter and Setter for countryCode
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    // Getter and Setter for characterSet
    public List<String> getCharacterSet() {
        return characterSet;
    }

    public void setCharacterSet(List<String> characterSet) {
        this.characterSet = characterSet;
    }

    // Getter and Setter for principalLanguageOfMessage
    public String getPrincipalLanguageOfMessage() {
        return principalLanguageOfMessage;
    }

    public void setPrincipalLanguageOfMessage(String principalLanguageOfMessage) {
        this.principalLanguageOfMessage = principalLanguageOfMessage;
    }

    // Getter and Setter for alternateCharacterSetHandlingScheme
    public String getAlternateCharacterSetHandlingScheme() {
        return alternateCharacterSetHandlingScheme;
    }

    public void setAlternateCharacterSetHandlingScheme(String alternateCharacterSetHandlingScheme) {
        this.alternateCharacterSetHandlingScheme = alternateCharacterSetHandlingScheme;
    }

    // Getter and Setter for messageProfileIdentifier
    public List<String> getMessageProfileIdentifier() {
        return messageProfileIdentifier;
    }

    public void setMessageProfileIdentifier(List<String> messageProfileIdentifier) {
        this.messageProfileIdentifier = messageProfileIdentifier;
    }


    @Override
    public String toHL7() {
        return "MSH" + fieldSeparator
            + getEncodingCharacters() 
            + HL7util.processObject(getSendingApplication())               
            + HL7util.processObject(getSendingFacility()) 
            + HL7util.processObject(getReceivingApplication()) 
            + HL7util.processObject(getReceivingFacility()) 
            + HL7util.processObject(getDateTimeOfMessage()) 
            + HL7util.processObject(getSecurity()) 
            + HL7util.processObject(getMessageType()) 
            + HL7util.processObject(getMessageControlID()) 
            + HL7util.processObject(getProcessingID()) 
            + HL7util.processObject(getVersionID()) 
            + HL7util.processObject(getSequenceNumber()) 
            + HL7util.processObject(getContinuationPointer()) 
            + HL7util.processObject(getAcceptAcknowledgmentType()) 
            + HL7util.processObject(getApplicationAcknowledgmentType()) 
            + HL7util.processObject(getCountryCode()) 
            + HL7util.processObject(getCharacterSet()) 
            + HL7util.processObject(getPrincipalLanguageOfMessage()) 
            + HL7util.processObject(getAlternateCharacterSetHandlingScheme()) 
            + HL7util.processObject(getMessageProfileIdentifier());
    }
    

}
