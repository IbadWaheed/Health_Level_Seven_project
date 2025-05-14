package starhealthcaretech.DataTypes;

public class MOP {

    // MOP.1 - Money Or Percentage Indicator (Required, Coded Value (ID), Length: 2)
    private String moneyOrPercentageIndicator;

    // MOP.2 - Money Or Percentage Quantity (Required, Numeric (NM), Length: 16)
    private String moneyOrPercentageQuantity;

    // MOP.3 - Currency Denomination (Optional, Coded Value (ID), Length: 3)
    private String currencyDenomination;

    // Getter and Setter for moneyOrPercentageIndicator
    public String getMoneyOrPercentageIndicator() {
        return moneyOrPercentageIndicator;
    }

    public void setMoneyOrPercentageIndicator(String moneyOrPercentageIndicator) {
        this.moneyOrPercentageIndicator = moneyOrPercentageIndicator;
    }

    // Getter and Setter for moneyOrPercentageQuantity
    public String getMoneyOrPercentageQuantity() {
        return moneyOrPercentageQuantity;
    }

    public void setMoneyOrPercentageQuantity(String moneyOrPercentageQuantity) {
        this.moneyOrPercentageQuantity = moneyOrPercentageQuantity;
    }

    // Getter and Setter for currencyDenomination
    public String getCurrencyDenomination() {
        return currencyDenomination;
    }

    public void setCurrencyDenomination(String currencyDenomination) {
        this.currencyDenomination = currencyDenomination;
    }
}
