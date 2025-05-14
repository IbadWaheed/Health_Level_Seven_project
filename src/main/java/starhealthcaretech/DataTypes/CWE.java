package starhealthcaretech.DataTypes;

public class CWE {
    private String identifier;                      // CWE.1 - Identifier (ST)
    private String text;                            // CWE.2 - Text (ST)
    private String nameOfCodingSystem;              // CWE.3 - Name Of Coding System (ID)
    private String alternateIdentifier;             // CWE.4 - Alternate Identifier (ST)
    private String alternateText;                   // CWE.5 - Alternate Text (ST)
    private String nameOfAlternateCodingSystem;     // CWE.6 - Name Of Alternate Coding System (ID)
    private String codingSystemVersionId;           // CWE.7 - Coding System Version Id (ST)
    private String alternateCodingSystemVersionId;  // CWE.8 - Alternate Coding System Version Id (ST)
    private String originalText;                    // CWE.9 - Original Text (ST)

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNameOfCodingSystem() {
        return nameOfCodingSystem;
    }

    public void setNameOfCodingSystem(String nameOfCodingSystem) {
        this.nameOfCodingSystem = nameOfCodingSystem;
    }

    public String getAlternateIdentifier() {
        return alternateIdentifier;
    }

    public void setAlternateIdentifier(String alternateIdentifier) {
        this.alternateIdentifier = alternateIdentifier;
    }

    public String getAlternateText() {
        return alternateText;
    }

    public void setAlternateText(String alternateText) {
        this.alternateText = alternateText;
    }

    public String getNameOfAlternateCodingSystem() {
        return nameOfAlternateCodingSystem;
    }

    public void setNameOfAlternateCodingSystem(String nameOfAlternateCodingSystem) {
        this.nameOfAlternateCodingSystem = nameOfAlternateCodingSystem;
    }

    public String getCodingSystemVersionId() {
        return codingSystemVersionId;
    }

    public void setCodingSystemVersionId(String codingSystemVersionId) {
        this.codingSystemVersionId = codingSystemVersionId;
    }

    public String getAlternateCodingSystemVersionId() {
        return alternateCodingSystemVersionId;
    }

    public void setAlternateCodingSystemVersionId(String alternateCodingSystemVersionId) {
        this.alternateCodingSystemVersionId = alternateCodingSystemVersionId;
    }

    public String getOriginalText() {
        return originalText;
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }
}
