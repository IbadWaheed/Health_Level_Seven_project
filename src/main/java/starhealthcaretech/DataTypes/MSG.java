package starhealthcaretech.DataTypes;

public class MSG {

    // MSG.1 - Message Code (Required, Coded Value (ID), Length: 3)
    private String messageCode;

    // MSG.2 - Trigger Event (Required, Coded Value (ID), Length: 3)
    private String triggerEvent;

    // MSG.3 - Message Structure (Required, Coded Value (ID), Length: 7)
    private String messageStructure;

    // Getter and Setter for messageCode
    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    // Getter and Setter for triggerEvent
    public String getTriggerEvent() {
        return triggerEvent;
    }

    public void setTriggerEvent(String triggerEvent) {
        this.triggerEvent = triggerEvent;
    }

    // Getter and Setter for messageStructure
    public String getMessageStructure() {
        return messageStructure;
    }

    public void setMessageStructure(String messageStructure) {
        this.messageStructure = messageStructure;
    }
}
