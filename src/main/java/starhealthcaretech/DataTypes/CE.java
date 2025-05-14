package starhealthcaretech.DataTypes;

public class CE {
    private String identifier;                     // CE.1 - Identifier (ST)
    private String text;                           // CE.2 - Text (ST)
    private String nameOfCodingSystem;             // CE.3 - Name Of Coding System (ID)
    private String alternateIdentifier;            // CE.4 - Alternate Identifier (ST)
    private String alternateText;                  // CE.5 - Alternate Text (ST)
    private String nameOfAlternateCodingSystem;    // CE.6 - Name Of Alternate Coding System (ID)

    // Getter and Setter for identifier
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    // Getter and Setter for text
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    // Getter and Setter for alternateText
    public String getAlternateText() {
        return alternateText;
    }

    public void setAlternateText(String alternateText) {
        this.alternateText = alternateText;
    }

    // Getter and Setter for nameOfAlternateCodingSystem
    public String getNameOfAlternateCodingSystem() {
        return nameOfAlternateCodingSystem;
    }

    public void setNameOfAlternateCodingSystem(String nameOfAlternateCodingSystem) {
        this.nameOfAlternateCodingSystem = nameOfAlternateCodingSystem;
    }
}

