package starhealthcaretech.DataTypes;

public class CNN {
    private String idNumber;                             // CNN.1 - Id Number (ST)
    private String familyName;                           // CNN.2 - Family Name (ST)
    private String givenName;                            // CNN.3 - Given Name (ST)
    private String secondAndFurtherGivenNames;           // CNN.4 - Second And Further Given Names Or Initials Thereof (ST)
    private String suffix;                               // CNN.5 - Suffix (ST)
    private String prefix;                               // CNN.6 - Prefix (ST)
    private String degree;                               // CNN.7 - Degree (IS)
    private String sourceTable;                          // CNN.8 - Source Table (IS)
    private String assigningAuthorityNamespaceId;        // CNN.9 - Assigning Authority - Namespace Id (IS)
    private String assigningAuthorityUniversalId;        // CNN.10 - Assigning Authority - Universal Id (ST)
    private String assigningAuthorityUniversalIdType;    // CNN.11 - Assigning Authority - Universal Id Type (ID)

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

    public String getSecondAndFurtherGivenNames() {
        return secondAndFurtherGivenNames;
    }

    public void setSecondAndFurtherGivenNames(String secondAndFurtherGivenNames) {
        this.secondAndFurtherGivenNames = secondAndFurtherGivenNames;
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

    public String getAssigningAuthorityNamespaceId() {
        return assigningAuthorityNamespaceId;
    }

    public void setAssigningAuthorityNamespaceId(String assigningAuthorityNamespaceId) {
        this.assigningAuthorityNamespaceId = assigningAuthorityNamespaceId;
    }

    public String getAssigningAuthorityUniversalId() {
        return assigningAuthorityUniversalId;
    }

    public void setAssigningAuthorityUniversalId(String assigningAuthorityUniversalId) {
        this.assigningAuthorityUniversalId = assigningAuthorityUniversalId;
    }

    public String getAssigningAuthorityUniversalIdType() {
        return assigningAuthorityUniversalIdType;
    }

    public void setAssigningAuthorityUniversalIdType(String assigningAuthorityUniversalIdType) {
        this.assigningAuthorityUniversalIdType = assigningAuthorityUniversalIdType;
    }
}

