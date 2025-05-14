package starhealthcaretech.DataTypes;

public class NR {
    private Double lowValue;  // NR.1 - Low Value (16 digits, numeric)
    private Double highValue; // NR.2 - High Value (16 digits, numeric)

    // Getter and Setter for lowValue
    public Double getLowValue() {
        return lowValue;
    }

    public void setLowValue(Double lowValue) {
        this.lowValue = lowValue;
    }

    // Getter and Setter for highValue
    public Double getHighValue() {
        return highValue;
    }

    public void setHighValue(Double highValue) {
        this.highValue = highValue;
    }
}
