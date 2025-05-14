package starhealthcaretech.DataTypes;

public class JCC {

    // JCC.1 - Job Code (Optional, Coded Value (IS), Length: 20)
    private String jobCode;

    // JCC.2 - Job Class (Optional, Coded Value (IS), Length: 20)
    private String jobClass;

    // JCC.3 - Job Description Text (Optional, Text (TX), Length: 250)
    private String jobDescriptionText;

    // Getter and Setter for jobCode
    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    // Getter and Setter for jobClass
    public String getJobClass() {
        return jobClass;
    }

    public void setJobClass(String jobClass) {
        this.jobClass = jobClass;
    }

    // Getter and Setter for jobDescriptionText
    public String getJobDescriptionText() {
        return jobDescriptionText;
    }

    public void setJobDescriptionText(String jobDescriptionText) {
        this.jobDescriptionText = jobDescriptionText;
    }
}
