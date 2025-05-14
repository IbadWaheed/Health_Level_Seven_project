package starhealthcaretech.DataTypes;

public class RMC {
    public String roomType;              // IS - Coded value from table 0145
    public String amountType;            // IS - Coded value from table 0146
    public String coverageAmount;        // NM - Numeric value
    public String moneyOrPercentage;        // MOP - Custom data type
    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public String getAmountType() {
        return amountType;
    }
    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }
    public String getCoverageAmount() {
        return coverageAmount;
    }
    public void setCoverageAmount(String coverageAmount) {
        this.coverageAmount = coverageAmount;
    }
    public String getMoneyOrPercentage() {
        return moneyOrPercentage;
    }
    public void setMoneyOrPercentage(String moneyOrPercentage) {
        this.moneyOrPercentage = moneyOrPercentage;
    }
    
}
