package starhealthcaretech.DataTypes;

public class MO {
    private String quantity;       // MO.1 - Quantity (NM)
    private String denomination;   // MO.2 - Denomination (ID)

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }
}

