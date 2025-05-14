package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.EI;
import starhealthcaretech.DataTypes.XAD;
import starhealthcaretech.DataTypes.XCN;
import starhealthcaretech.DataTypes.XTN;
import starhealthcaretech.HL7Helper.HL7util;

public class ROL implements HL7SegmentInterface{
    private EI roleInstanceId; // ROL.1
    private String actionCode; // ROL.2
    private CE roleROL; // ROL.3
    private List<XCN> rolePerson; // ROL.4 (∞ - can occur multiple times)
    private String roleBeginDateTime; // ROL.5
    private String roleEndDateTime; // ROL.6
    private CE roleDuration; // ROL.7
    private CE roleActionReason; // ROL.8
    private List<CE> providerType; // ROL.9 (∞ - can occur multiple times)
    private CE organizationUnitType; // ROL.10
    private List<XAD> officeHomeAddressBirthplace; // ROL.11 (∞ - can occur multiple times)
    private List<XTN> phone; // ROL.12 (∞ - can occur multiple times)

    // Getters and Setters
    public EI getRoleInstanceId() {
        return roleInstanceId;
    }

    public void setRoleInstanceId(EI roleInstanceId) {
        this.roleInstanceId = roleInstanceId;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public CE getRoleROL() {
        return roleROL;
    }

    public void setRoleROL(CE roleROL) {
        this.roleROL = roleROL;
    }

    public List<XCN> getRolePerson() {
        return rolePerson;
    }

    public void setRolePerson(List<XCN> rolePerson) {
        this.rolePerson = rolePerson;
    }

    public String getRoleBeginDateTime() {
        return roleBeginDateTime;
    }

    public void setRoleBeginDateTime(String roleBeginDateTime) {
        this.roleBeginDateTime = roleBeginDateTime;
    }

    public String getRoleEndDateTime() {
        return roleEndDateTime;
    }

    public void setRoleEndDateTime(String roleEndDateTime) {
        this.roleEndDateTime = roleEndDateTime;
    }

    public CE getRoleDuration() {
        return roleDuration;
    }

    public void setRoleDuration(CE roleDuration) {
        this.roleDuration = roleDuration;
    }

    public CE getRoleActionReason() {
        return roleActionReason;
    }

    public void setRoleActionReason(CE roleActionReason) {
        this.roleActionReason = roleActionReason;
    }

    public List<CE> getProviderType() {
        return providerType;
    }

    public void setProviderType(List<CE> providerType) {
        this.providerType = providerType;
    }

    public CE getOrganizationUnitType() {
        return organizationUnitType;
    }

    public void setOrganizationUnitType(CE organizationUnitType) {
        this.organizationUnitType = organizationUnitType;
    }

    public List<XAD> getOfficeHomeAddressBirthplace() {
        return officeHomeAddressBirthplace;
    }

    public void setOfficeHomeAddressBirthplace(List<XAD> officeHomeAddressBirthplace) {
        this.officeHomeAddressBirthplace = officeHomeAddressBirthplace;
    }

    public List<XTN> getPhone() {
        return phone;
    }

    public void setPhone(List<XTN> phone) {
        this.phone = phone;
    }
    @Override
    public String toHL7() {
        return "ROL" + HL7util.processAllFields(this);
    }
}
