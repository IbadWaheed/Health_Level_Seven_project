package starhealthcaretech.DataTypes;

public class PTA {
    public String policyType;                   // IS - Coded value from table 0147
    public String amountClass;                  // IS - Coded value from table 0193
    public String moneyOrPercentageQuantity;    // NM - Numeric value
    public String moneyOrPercentage;               // MOP - Custom data type
    public String getPolicyType() {
        return policyType;
    }
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }
    public String getAmountClass() {
        return amountClass;
    }
    public void setAmountClass(String amountClass) {
        this.amountClass = amountClass;
    }
    public String getMoneyOrPercentageQuantity() {
        return moneyOrPercentageQuantity;
    }
    public void setMoneyOrPercentageQuantity(String moneyOrPercentageQuantity) {
        this.moneyOrPercentageQuantity = moneyOrPercentageQuantity;
    }
    public String getMoneyOrPercentage() {
        return moneyOrPercentage;
    }
    public void setMoneyOrPercentage(String moneyOrPercentage) {
        this.moneyOrPercentage = moneyOrPercentage;
    }
    
}

