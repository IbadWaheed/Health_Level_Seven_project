package starhealthcaretech.DataTypes;

public class CNE {
    private String identifier;                         // CNE.1 - Identifier (ST)
    private String text;                               // CNE.2 - Text (ST)
    private String nameOfCodingSystem;                 // CNE.3 - Name Of Coding System (ID)
    private String alternateIdentifier;                // CNE.4 - Alternate Identifier (ST)
    private String alternateText;                      // CNE.5 - Alternate Text (ST)
    private String nameOfAlternateCodingSystem;        // CNE.6 - Name Of Alternate Coding System (ID)
    private String codingSystemVersionId;              // CNE.7 - Coding System Version Id (ST)
    private String alternateCodingSystemVersionId;     // CNE.8 - Alternate Coding System Version Id (ST)
    private String originalText;                       // CNE.9 - Original Text (ST)

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

    // Getter and Setter for codingSystemVersionId
    public String getCodingSystemVersionId() {
        return codingSystemVersionId;
    }

    public void setCodingSystemVersionId(String codingSystemVersionId) {
        this.codingSystemVersionId = codingSystemVersionId;
    }

    // Getter and Setter for alternateCodingSystemVersionId
    public String getAlternateCodingSystemVersionId() {
        return alternateCodingSystemVersionId;
    }

    public void setAlternateCodingSystemVersionId(String alternateCodingSystemVersionId) {
        this.alternateCodingSystemVersionId = alternateCodingSystemVersionId;
    }

    // Getter and Setter for originalText
    public String getOriginalText() {
        return originalText;
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }
}

