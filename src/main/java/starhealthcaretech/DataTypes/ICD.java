package starhealthcaretech.DataTypes;

public class ICD {

    // ICD.1 - Certification Patient Type (Optional, Coded Value (IS), Length: 11)
    private String certificationPatientType;

    // ICD.2 - Certification Required (Required, Coded Value (ID), Length: 1)
    private String certificationRequired;

    // ICD.3 - Date/Time Certification Required (Optional, Timestamp (TS), Length: 26)
    private TS dateTimeCertificationRequired;

    // Getter and Setter for certificationPatientType
    public String getCertificationPatientType() {
        return certificationPatientType;
    }

    public void setCertificationPatientType(String certificationPatientType) {
        this.certificationPatientType = certificationPatientType;
    }

    // Getter and Setter for certificationRequired
    public String getCertificationRequired() {
        return certificationRequired;
    }

    public void setCertificationRequired(String certificationRequired) {
        this.certificationRequired = certificationRequired;
    }

    // Getter and Setter for dateTimeCertificationRequired
    public TS getDateTimeCertificationRequired() {
        return dateTimeCertificationRequired;
    }

    public void setDateTimeCertificationRequired(TS dateTimeCertificationRequired) {
        this.dateTimeCertificationRequired = dateTimeCertificationRequired;
    }
}
