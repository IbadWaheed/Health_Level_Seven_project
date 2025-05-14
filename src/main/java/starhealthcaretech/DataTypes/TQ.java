package starhealthcaretech.DataTypes;

public class TQ {
    private String quantity;                      // TQ.1 - Quantity (CQ)
    private String interval;                      // TQ.2 - Interval (RI)
    private String duration;                  // TQ.3 - Duration (ST)
    private String startDateTime;                 // TQ.4 - Start Date/Time (TS)
    private String endDateTime;                   // TQ.5 - End Date/Time (TS)
   
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }


}

