package starhealthcaretech.DataTypes;

public class EIP {

    // EIP.1 - Placer Assigned Identifier (Optional, Entity Identifier (EI), Length: 427)
    private EI placerAssignedIdentifier;

    // EIP.2 - Filler Assigned Identifier (Optional, Entity Identifier (EI), Length: 427)
    private EI fillerAssignedIdentifier;

    // Getter and Setter for placerAssignedIdentifier
    public EI getPlacerAssignedIdentifier() {
        return placerAssignedIdentifier;
    }

    public void setPlacerAssignedIdentifier(EI placerAssignedIdentifier) {
        this.placerAssignedIdentifier = placerAssignedIdentifier;
    }

    // Getter and Setter for fillerAssignedIdentifier
    public EI getFillerAssignedIdentifier() {
        return fillerAssignedIdentifier;
    }

    public void setFillerAssignedIdentifier(EI fillerAssignedIdentifier) {
        this.fillerAssignedIdentifier = fillerAssignedIdentifier;
    }
}
