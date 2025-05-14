package starhealthcaretech.DataTypes;

public class WVS {
    private String sourceOneName;  // WVS.1 - Source One Name (8 characters)
    private String sourceTwoName;  // WVS.2 - Source Two Name (8 characters)

    // Getter and Setter for sourceOneName
    public String getSourceOneName() {
        return sourceOneName;
    }

    public void setSourceOneName(String sourceOneName) {
        this.sourceOneName = sourceOneName;
    }

    // Getter and Setter for sourceTwoName
    public String getSourceTwoName() {
        return sourceTwoName;
    }

    public void setSourceTwoName(String sourceTwoName) {
        this.sourceTwoName = sourceTwoName;
    }
}

