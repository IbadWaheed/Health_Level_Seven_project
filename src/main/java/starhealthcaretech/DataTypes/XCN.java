package starhealthcaretech.DataTypes;

public class XCN {
    private String idNumber;                           // XCN.1
    private String familyName;                         // XCN.2
    private String givenName;                          // XCN.3
    private String middleInitialOrName;                // XCN.4
    private String suffix;                             // XCN.5
    private String prefix;                             // XCN.6
    private String degree;                             // XCN.7
    private String sourceTable;                        // XCN.8
    private String assigningAuthority;                 // XCN.9
    private String nameType;                           // XCN.10
    private String identifierCheckDigit;               // XCN.11
    private String checkDigitScheme;                   // XCN.12
    private String identifierTypeCode;                 // XCN.13
    private String assigningFacilityId;                // XCN.14

    // Getters and Setters
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMiddleInitialOrName() {
        return middleInitialOrName;
    }

    public void setMiddleInitialOrName(String middleInitialOrName) {
        this.middleInitialOrName = middleInitialOrName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSourceTable() {
        return sourceTable;
    }

    public void setSourceTable(String sourceTable) {
        this.sourceTable = sourceTable;
    }

    public String getAssigningAuthority() {
        return assigningAuthority;
    }

    public void setAssigningAuthority(String assigningAuthority) {
        this.assigningAuthority = assigningAuthority;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public String getIdentifierCheckDigit() {
        return identifierCheckDigit;
    }

    public void setIdentifierCheckDigit(String identifierCheckDigit) {
        this.identifierCheckDigit = identifierCheckDigit;
    }

    public String getCheckDigitScheme() {
        return checkDigitScheme;
    }

    public void setCheckDigitScheme(String checkDigitScheme) {
        this.checkDigitScheme = checkDigitScheme;
    }

    public String getIdentifierTypeCode() {
        return identifierTypeCode;
    }

    public void setIdentifierTypeCode(String identifierTypeCode) {
        this.identifierTypeCode = identifierTypeCode;
    }

    public String getAssigningFacilityId() {
        return assigningFacilityId;
    }

    public void setAssigningFacilityId(String assigningFacilityId) {
        this.assigningFacilityId = assigningFacilityId;
    }
}
