package starhealthcaretech.DataTypes;

public class DTN {

    // DTN.1 - Day Type (Required, Coded Value (IS), Length: 2)
    private String dayType;

    // DTN.2 - Number Of Days (Required, Numeric (NM), Length: 3)
    private Integer numberOfDays;

    // Getter and Setter for dayType
    public String getDayType() {
        return dayType;
    }

    public void setDayType(String dayType) {
        this.dayType = dayType;
    }

    // Getter and Setter for numberOfDays
    public Integer getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(Integer numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}
