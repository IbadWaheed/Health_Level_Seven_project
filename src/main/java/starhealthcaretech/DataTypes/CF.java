package starhealthcaretech.DataTypes;

public class CF {
    private String identifier;                      // CF.1 - Identifier (ST)
    private String formattedText;                   // CF.2 - Formatted Text (FT)
    private String nameOfCodingSystem;              // CF.3 - Name Of Coding System (ID)
    private String alternateIdentifier;             // CF.4 - Alternate Identifier (ST)
    private String alternateFormattedText;          // CF.5 - Alternate Formatted Text (FT)
    private String nameOfAlternateCodingSystem;     // CF.6 - Name Of Alternate Coding System (ID)

    // Getter and Setter for identifier
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    // Getter and Setter for formattedText
    public String getFormattedText() {
        return formattedText;
    }

    public void setFormattedText(String formattedText) {
        this.formattedText = formattedText;
    }

    // Getter and Setter for nameOfCodingSystem
    public String getNameOfCodingSystem() {
        return nameOfCodingSystem;
    }

    public void setNameOfCodingSystem(String nameOfCodingSystem) {
        this.nameOfCodingSystem = nameOfCodingSystem;
    }

    // Getter and Setter for alternateIdentifier
    public String getAlternateIdentifier() {
        return alternateIdentifier;
    }

    public void setAlternateIdentifier(String alternateIdentifier) {
        this.alternateIdentifier = alternateIdentifier;
    }

    // Getter and Setter for alternateFormattedText
    public String getAlternateFormattedText() {
        return alternateFormattedText;
    }

    public void setAlternateFormattedText(String alternateFormattedText) {
        this.alternateFormattedText = alternateFormattedText;
    }

    // Getter and Setter for nameOfAlternateCodingSystem
    public String getNameOfAlternateCodingSystem() {
        return nameOfAlternateCodingSystem;
    }

    public void setNameOfAlternateCodingSystem(String nameOfAlternateCodingSystem) {
        this.nameOfAlternateCodingSystem = nameOfAlternateCodingSystem;
    }
}
