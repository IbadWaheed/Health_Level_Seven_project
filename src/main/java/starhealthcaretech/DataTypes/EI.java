package starhealthcaretech.DataTypes;

public class EI {

    // EI.1 - Entity Identifier (Optional, String (ST), Length: 199)
    private String entityIdentifier;

    // EI.2 - Namespace Id (Optional, Coded Value (IS), Length: 20)
    private String namespaceId;

    // EI.3 - Universal Id (Conditional, String (ST), Length: 199)
    private String universalId;

    // EI.4 - Universal Id Type (Conditional, Coded Value (ID), Length: 6)
    private String universalIdType;

    // Getter and Setter for entityIdentifier
    public String getEntityIdentifier() {
        return entityIdentifier;
    }

    public void setEntityIdentifier(String entityIdentifier) {
        this.entityIdentifier = entityIdentifier;
    }

    // Getter and Setter for namespaceId
    public String getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    // Getter and Setter for universalId
    public String getUniversalId() {
        return universalId;
    }

    public void setUniversalId(String universalId) {
        this.universalId = universalId;
    }

    // Getter and Setter for universalIdType
    public String getUniversalIdType() {
        return universalIdType;
    }

    public void setUniversalIdType(String universalIdType) {
        this.universalIdType = universalIdType;
    }
}
