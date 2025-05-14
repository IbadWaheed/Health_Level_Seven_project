package starhealthcaretech.DataTypes;

public class MOC {

    // MOC.1 - Monetary Amount (Optional, Monetary Amount (MO), Length: 20)
    private MO monetaryAmount;

    // MOC.2 - Charge Code (Optional, Coded Value (CE), Length: 483)
    private CE chargeCode;

    // Getter and Setter for monetaryAmount
    public MO getMonetaryAmount() {
        return monetaryAmount;
    }

    public void setMonetaryAmount(MO monetaryAmount) {
        this.monetaryAmount = monetaryAmount;
    }

    // Getter and Setter for chargeCode
    public CE getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(CE chargeCode) {
        this.chargeCode = chargeCode;
    }
}
