package starhealthcaretech.DataTypes;

public class CSU {
    private Double channelSensitivity;  // CSU.1 - Channel Sensitivity (60 digits, numeric)
    private String unitOfMeasureIdentifier;  // CSU.2 - Unit Of Measure Identifier (20 characters)
    private String unitOfMeasureDescription;  // CSU.3 - Unit Of Measure Description (199 characters)
    private String unitOfMeasureCodingSystem;  // CSU.4 - Unit Of Measure Coding System (20 characters)
    private String alternateUnitOfMeasureIdentifier;  // CSU.5 - Alternate Unit Of Measure Identifier (20 characters)
    private String alternateUnitOfMeasureDescription;  // CSU.6 - Alternate Unit Of Measure Description (199 characters)
    private String alternateUnitOfMeasureCodingSystem;  // CSU.7 - Alternate Unit Of Measure Coding System (20 characters)

    // Getter and Setter for channelSensitivity
    public Double getChannelSensitivity() {
        return channelSensitivity;
    }

    public void setChannelSensitivity(Double channelSensitivity) {
        this.channelSensitivity = channelSensitivity;
    }

    // Getter and Setter for unitOfMeasureIdentifier
    public String getUnitOfMeasureIdentifier() {
        return unitOfMeasureIdentifier;
    }

    public void setUnitOfMeasureIdentifier(String unitOfMeasureIdentifier) {
        this.unitOfMeasureIdentifier = unitOfMeasureIdentifier;
    }

    // Getter and Setter for unitOfMeasureDescription
    public String getUnitOfMeasureDescription() {
        return unitOfMeasureDescription;
    }

    public void setUnitOfMeasureDescription(String unitOfMeasureDescription) {
        this.unitOfMeasureDescription = unitOfMeasureDescription;
    }

    // Getter and Setter for unitOfMeasureCodingSystem
    public String getUnitOfMeasureCodingSystem() {
        return unitOfMeasureCodingSystem;
    }

    public void setUnitOfMeasureCodingSystem(String unitOfMeasureCodingSystem) {
        this.unitOfMeasureCodingSystem = unitOfMeasureCodingSystem;
    }

    // Getter and Setter for alternateUnitOfMeasureIdentifier
    public String getAlternateUnitOfMeasureIdentifier() {
        return alternateUnitOfMeasureIdentifier;
    }

    public void setAlternateUnitOfMeasureIdentifier(String alternateUnitOfMeasureIdentifier) {
        this.alternateUnitOfMeasureIdentifier = alternateUnitOfMeasureIdentifier;
    }

    // Getter and Setter for alternateUnitOfMeasureDescription
    public String getAlternateUnitOfMeasureDescription() {
        return alternateUnitOfMeasureDescription;
    }

    public void setAlternateUnitOfMeasureDescription(String alternateUnitOfMeasureDescription) {
        this.alternateUnitOfMeasureDescription = alternateUnitOfMeasureDescription;
    }

    // Getter and Setter for alternateUnitOfMeasureCodingSystem
    public String getAlternateUnitOfMeasureCodingSystem() {
        return alternateUnitOfMeasureCodingSystem;
    }

    public void setAlternateUnitOfMeasureCodingSystem(String alternateUnitOfMeasureCodingSystem) {
        this.alternateUnitOfMeasureCodingSystem = alternateUnitOfMeasureCodingSystem;
    }
}
