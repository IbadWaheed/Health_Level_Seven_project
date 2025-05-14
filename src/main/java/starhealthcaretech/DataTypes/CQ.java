package starhealthcaretech.DataTypes;

public class CQ {
    private String quantity;   // CQ.1 - Quantity (NM)
    private CE units;          // CQ.2 - Units (CE)

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public CE getUnits() {
        return units;
    }

    public void setUnits(CE units) {
        this.units = units;
    }
}
