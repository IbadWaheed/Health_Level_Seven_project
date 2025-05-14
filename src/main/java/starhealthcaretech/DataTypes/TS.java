package starhealthcaretech.DataTypes;


public class TS {
    private String time;  // TS.1 - Time (DTM)
    private String degreeOfPrecision;  // TS.2 - Degree of Precision (ID)

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // Getter and Setter for degreeOfPrecision
    public String getDegreeOfPrecision() {
        return degreeOfPrecision;
    }

    public void setDegreeOfPrecision(String degreeOfPrecision) {
        this.degreeOfPrecision = degreeOfPrecision;
    }
}
