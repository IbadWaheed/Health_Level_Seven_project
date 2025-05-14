package starhealthcaretech.DataTypes;

public class XPN {
    private String familyName;                      // XPN.1
    private String givenName;                       // XPN.2
    private String middleNamesOrInitials;           // XPN.3
    private String suffix;                          // XPN.4
    private String prefix;                          // XPN.5
    private String degree;                          // XPN.6
    private String nameTypeCode;                    // XPN.7
    // private String nameRepresentationCode;          // XPN.8
    // private String nameContext;                     // XPN.9
    // private String nameValidityRange;               // XPN.10
    // private String nameAssemblyOrder;               // XPN.11
    // private String effectiveDate;                   // XPN.12
    // private String expirationDate;                  // XPN.13
    // private String professionalSuffix;              // XPN.14

    // Getters and Setters
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

    public String getMiddleNamesOrInitials() {
        return middleNamesOrInitials;
    }

    public void setMiddleNamesOrInitials(String middleNamesOrInitials) {
        this.middleNamesOrInitials = middleNamesOrInitials;
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

    public String getNameTypeCode() {
        return nameTypeCode;
    }

    public void setNameTypeCode(String nameTypeCode) {
        this.nameTypeCode = nameTypeCode;
    }

}

