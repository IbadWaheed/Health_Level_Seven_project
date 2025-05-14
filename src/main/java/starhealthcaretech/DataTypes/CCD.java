package starhealthcaretech.DataTypes;


public class CCD {
    private String invocationEvent;
    private TS dateTime;

    public String getInvocationEvent() {
        return invocationEvent;
    }

    public void setInvocationEvent(String invocationEvent) {
        this.invocationEvent = invocationEvent;
    }

    // Getter and Setter for dateTime
    public TS getDateTime() {
        return dateTime;
    }

    public void setDateTime(TS dateTime) {
        this.dateTime = dateTime;
    }   
}
