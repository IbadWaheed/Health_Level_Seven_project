package starhealthcaretech.DataTypes;

public class FC {

    // FC.1 - Financial Class Code (Required, Coded Value (IS), Length: 20)
    private String financialClassCode;

    // FC.2 - Effective Date (Optional, Timestamp (TS), Length: 26)
    private TS effectiveDate;

    // Getter and Setter for financialClassCode
    public String getFinancialClassCode() {
        return financialClassCode;
    }

    public void setFinancialClassCode(String financialClassCode) {
        this.financialClassCode = financialClassCode;
    }

    // Getter and Setter for effectiveDate
    public TS getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(TS effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}

