package starhealthcaretech.Segments;

import starhealthcaretech.DataTypes.XON;
import starhealthcaretech.HL7Helper.HL7util;

public class SFT implements HL7SegmentInterface{
    
    private XON softwareVendorOrganization; // SFT.1
    private String certifiedVersionOrReleaseNumber; // SFT.2
    private String softwareProductName; // SFT.3
    private String softwareBinaryId; // SFT.4
    private String softwareProductInformation; // SFT.5
    private String softwareInstallDate; // SFT.6

    // Getters and Setters
    public XON getSoftwareVendorOrganization() {
        return softwareVendorOrganization;
    }

    public void setSoftwareVendorOrganization(XON softwareVendorOrganization) {
        this.softwareVendorOrganization = softwareVendorOrganization;
    }

    public String getCertifiedVersionOrReleaseNumber() {
        return certifiedVersionOrReleaseNumber;
    }

    public void setCertifiedVersionOrReleaseNumber(String certifiedVersionOrReleaseNumber) {
        this.certifiedVersionOrReleaseNumber = certifiedVersionOrReleaseNumber;
    }

    public String getSoftwareProductName() {
        return softwareProductName;
    }

    public void setSoftwareProductName(String softwareProductName) {
        this.softwareProductName = softwareProductName;
    }

    public String getSoftwareBinaryId() {
        return softwareBinaryId;
    }

    public void setSoftwareBinaryId(String softwareBinaryId) {
        this.softwareBinaryId = softwareBinaryId;
    }

    public String getSoftwareProductInformation() {
        return softwareProductInformation;
    }

    public void setSoftwareProductInformation(String softwareProductInformation) {
        this.softwareProductInformation = softwareProductInformation;
    }

    public String getSoftwareInstallDate() {
        return softwareInstallDate;
    }

    public void setSoftwareInstallDate(String softwareInstallDate) {
        this.softwareInstallDate = softwareInstallDate;
    }

    @Override
    public String toHL7() {
        return "SFT" + HL7util.processAllFields(this);
    }
}
