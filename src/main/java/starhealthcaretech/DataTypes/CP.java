package starhealthcaretech.DataTypes;

public class CP {
    private MO price;           // CP.1 - Price (MO)
    private String priceType;   // CP.2 - Price Type (ID)
    private String fromValue;   // CP.3 - From Value (NM)
    private String toValue;     // CP.4 - To Value (NM)
    private CE rangeUnits;      // CP.5 - Range Units (CE)
    private String rangeType;   // CP.6 - Range Type (ID)

    public MO getPrice() {
        return price;
    }

    public void setPrice(MO price) {
        this.price = price;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public String getFromValue() {
        return fromValue;
    }

    public void setFromValue(String fromValue) {
        this.fromValue = fromValue;
    }

    public String getToValue() {
        return toValue;
    }

    public void setToValue(String toValue) {
        this.toValue = toValue;
    }

    public CE getRangeUnits() {
        return rangeUnits;
    }

    public void setRangeUnits(CE rangeUnits) {
        this.rangeUnits = rangeUnits;
    }

    public String getRangeType() {
        return rangeType;
    }

    public void setRangeType(String rangeType) {
        this.rangeType = rangeType;
    }
}

