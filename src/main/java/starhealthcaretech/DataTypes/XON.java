package starhealthcaretech.DataTypes;

public class XON {

    private String organizationName;              // XON.1
    private String organizationNameTypeCode;       // XON.2
    private String idNumber;                       // XON.3
    private String checkDigit;                     // XON.4
    private String checkDigitScheme;               // XON.5
    private String assigningAuthority;             // XON.6
    private String identifierTypeCode;             // XON.7
    private String assigningFacility;              // XON.8
    private String nameRepresentationCode;         // XON.9
    private String organizationIdentifier;         // XON.10

    // Getters and Setters

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationNameTypeCode() {
        return organizationNameTypeCode;
    }

    public void setOrganizationNameTypeCode(String organizationNameTypeCode) {
        this.organizationNameTypeCode = organizationNameTypeCode;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getCheckDigit() {
        return checkDigit;
    }

    public void setCheckDigit(String checkDigit) {
        this.checkDigit = checkDigit;
    }

    public String getCheckDigitScheme() {
        return checkDigitScheme;
    }

    public void setCheckDigitScheme(String checkDigitScheme) {
        this.checkDigitScheme = checkDigitScheme;
    }

    public String getAssigningAuthority() {
        return assigningAuthority;
    }

    public void setAssigningAuthority(String assigningAuthority) {
        this.assigningAuthority = assigningAuthority;
    }

    public String getIdentifierTypeCode() {
        return identifierTypeCode;
    }

    public void setIdentifierTypeCode(String identifierTypeCode) {
        this.identifierTypeCode = identifierTypeCode;
    }

    public String getAssigningFacility() {
        return assigningFacility;
    }

    public void setAssigningFacility(String assigningFacility) {
        this.assigningFacility = assigningFacility;
    }

    public String getNameRepresentationCode() {
        return nameRepresentationCode;
    }

    public void setNameRepresentationCode(String nameRepresentationCode) {
        this.nameRepresentationCode = nameRepresentationCode;
    }

    public String getOrganizationIdentifier() {
        return organizationIdentifier;
    }

    public void setOrganizationIdentifier(String organizationIdentifier) {
        this.organizationIdentifier = organizationIdentifier;
    }
}

