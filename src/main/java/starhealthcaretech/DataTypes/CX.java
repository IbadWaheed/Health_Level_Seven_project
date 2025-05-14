package starhealthcaretech.DataTypes;

public class CX {
    private String idNumber;                         // CX.1 - Id Number (ST)
    private String checkDigit;                       // CX.2 - Check Digit (ST)
    private String checkDigitScheme;                 // CX.3 - Check Digit Scheme (ID)
    private HD assigningAuthority;                   // CX.4 - Assigning Authority (HD)
    private String identifierTypeCode;               // CX.5 - Identifier Type Code (ID)
    private HD assigningFacility;                    // CX.6 - Assigning Facility (HD)
    private String effectiveDate;                    // CX.7 - Effective Date (DT)
    private String expirationDate;                   // CX.8 - Expiration Date (DT)
    private CWE assigningJurisdiction;               // CX.9 - Assigning Jurisdiction (CWE)
    private CWE assigningAgencyOrDepartment;         // CX.10 - Assigning Agency Or Department (CWE)

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

    public HD getAssigningAuthority() {
        return assigningAuthority;
    }

    public void setAssigningAuthority(HD assigningAuthority) {
        this.assigningAuthority = assigningAuthority;
    }

    public String getIdentifierTypeCode() {
        return identifierTypeCode;
    }

    public void setIdentifierTypeCode(String identifierTypeCode) {
        this.identifierTypeCode = identifierTypeCode;
    }

    public HD getAssigningFacility() {
        return assigningFacility;
    }

    public void setAssigningFacility(HD assigningFacility) {
        this.assigningFacility = assigningFacility;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public CWE getAssigningJurisdiction() {
        return assigningJurisdiction;
    }

    public void setAssigningJurisdiction(CWE assigningJurisdiction) {
        this.assigningJurisdiction = assigningJurisdiction;
    }

    public CWE getAssigningAgencyOrDepartment() {
        return assigningAgencyOrDepartment;
    }

    public void setAssigningAgencyOrDepartment(CWE assigningAgencyOrDepartment) {
        this.assigningAgencyOrDepartment = assigningAgencyOrDepartment;
    }
}
