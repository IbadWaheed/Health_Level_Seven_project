package starhealthcaretech.DataTypes;

public class DLT {

    // DLT.1 - Normal Range (Optional, Numeric Range (NR), Length: 33)
    private String normalRange;

    // DLT.2 - Numeric Threshold (Optional, Numeric (NM), Length: 4)
    private Integer numericThreshold;

    // DLT.3 - Change Computation (Optional, Coded Value (ID), Length: 1)
    private String changeComputation;

    // DLT.4 - Days Retained (Optional, Numeric (NM), Length: 4)
    private Integer daysRetained;

    // Getter and Setter for normalRange
    public String getNormalRange() {
        return normalRange;
    }

    public void setNormalRange(String normalRange) {
        this.normalRange = normalRange;
    }

    // Getter and Setter for numericThreshold
    public Integer getNumericThreshold() {
        return numericThreshold;
    }

    public void setNumericThreshold(Integer numericThreshold) {
        this.numericThreshold = numericThreshold;
    }

    // Getter and Setter for changeComputation
    public String getChangeComputation() {
        return changeComputation;
    }

    public void setChangeComputation(String changeComputation) {
        this.changeComputation = changeComputation;
    }

    // Getter and Setter for daysRetained
    public Integer getDaysRetained() {
        return daysRetained;
    }

    public void setDaysRetained(Integer daysRetained) {
        this.daysRetained = daysRetained;
    }
}
