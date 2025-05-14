package starhealthcaretech.DataTypes;

public class WVI {
    private Integer channelNumber;  // WVI.1 - Channel Number (4 digits)
    private String channelName;     // WVI.2 - Channel Name (up to 17 characters)


    public Integer getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(Integer channelNumber) {
        this.channelNumber = channelNumber;
    }

    // Getter and Setter for channelName
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

}