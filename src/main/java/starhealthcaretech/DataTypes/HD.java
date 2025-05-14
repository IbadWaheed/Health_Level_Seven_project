package starhealthcaretech.DataTypes;

public class HD {
    private String namespaceId;      // HD.1 - Namespace Id (IS)
    private String universalId;      // HD.2 - Universal Id (ST)
    private String universalIdType;  // HD.3 - Universal Id Type (ID)

    public String getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    public String getUniversalId() {
        return universalId;
    }

    public void setUniversalId(String universalId) {
        this.universalId = universalId;
    }

    public String getUniversalIdType() {
        return universalIdType;
    }

    public void setUniversalIdType(String universalIdType) {
        this.universalIdType = universalIdType;
    }
}
