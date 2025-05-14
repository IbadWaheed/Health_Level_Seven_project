package starhealthcaretech.DataTypes;

public class CCP {
    private Double channelCalibrationSensitivityCorrectionFactor;  // CCP.1
    private Double channelCalibrationBaseline;  // CCP.2
    private Double channelCalibrationTimeSkew;  // CCP.3

    public Double getChannelCalibrationSensitivityCorrectionFactor() {
        return channelCalibrationSensitivityCorrectionFactor;
    }

    public void setChannelCalibrationSensitivityCorrectionFactor(Double channelCalibrationSensitivityCorrectionFactor) {
        this.channelCalibrationSensitivityCorrectionFactor = channelCalibrationSensitivityCorrectionFactor;
    }

    // Getter and Setter for channelCalibrationBaseline
    public Double getChannelCalibrationBaseline() {
        return channelCalibrationBaseline;
    }

    public void setChannelCalibrationBaseline(Double channelCalibrationBaseline) {
        this.channelCalibrationBaseline = channelCalibrationBaseline;
    }

    // Getter and Setter for channelCalibrationTimeSkew
    public Double getChannelCalibrationTimeSkew() {
        return channelCalibrationTimeSkew;
    }

    public void setChannelCalibrationTimeSkew(Double channelCalibrationTimeSkew) {
        this.channelCalibrationTimeSkew = channelCalibrationTimeSkew;
    }
}
