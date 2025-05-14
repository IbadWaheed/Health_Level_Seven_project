package starhealthcaretech.DataTypes;

public class DDI{
    
    // DDI.1 - Delay Days (Optional, Numeric, Length: 3)
    private Double delayDays;

    // DDI.2 - Monetary Amount (Required, Monetary, Length: 16)
    private MO monetaryAmount;

    // DDI.3 - Number Of Days (Optional, Numeric, Length: 4)
    private Double numberOfDays;

    // Getter and Setter for delayDays
    public Double getDelayDays() {
        return delayDays;
    }

    public void setDelayDays(Double delayDays) {
        this.delayDays = delayDays;
    }

    // Getter and Setter for monetaryAmount
    public MO getMonetaryAmount() {
        return monetaryAmount;
    }

    public void setMonetaryAmount(MO monetaryAmount) {
        this.monetaryAmount = monetaryAmount;
    }

    // Getter and Setter for numberOfDays
    public Double getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(Double numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}
