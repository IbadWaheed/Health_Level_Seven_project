package starhealthcaretech.DataTypes;

public class CD {
    private WVI channelIdentifier;  // CD.1 - Channel Identifier (WVI type)
    private WVS waveformSource;     // CD.2 - Waveform Source (WVS type)
    private CSU channelSensitivityUnits;  // CD.3 - Channel Sensitivity/Units (CSU type)
    private CCP channelCalibrationParameters;  // CD.4 - Channel Calibration Parameters (CCP type)
    private Double channelSamplingFrequency;  // CD.5 - Channel Sampling Frequency (NM type)
    private NR minimumMaximumDataValues;  // CD.6 - Minimum/Maximum Data Values (NR type)

    // Getter and Setter for channelIdentifier
    public WVI getChannelIdentifier() {
        return channelIdentifier;
    }

    public void setChannelIdentifier(WVI channelIdentifier) {
        this.channelIdentifier = channelIdentifier;
    }

    // Getter and Setter for waveformSource
    public WVS getWaveformSource() {
        return waveformSource;
    }

    public void setWaveformSource(WVS waveformSource) {
        this.waveformSource = waveformSource;
    }

    // Getter and Setter for channelSensitivityUnits
    public CSU getChannelSensitivityUnits() {
        return channelSensitivityUnits;
    }

    public void setChannelSensitivityUnits(CSU channelSensitivityUnits) {
        this.channelSensitivityUnits = channelSensitivityUnits;
    }

    // Getter and Setter for channelCalibrationParameters
    public CCP getChannelCalibrationParameters() {
        return channelCalibrationParameters;
    }

    public void setChannelCalibrationParameters(CCP channelCalibrationParameters) {
        this.channelCalibrationParameters = channelCalibrationParameters;
    }

    // Getter and Setter for channelSamplingFrequency
    public Double getChannelSamplingFrequency() {
        return channelSamplingFrequency;
    }

    public void setChannelSamplingFrequency(Double channelSamplingFrequency) {
        this.channelSamplingFrequency = channelSamplingFrequency;
    }

    // Getter and Setter for minimumMaximumDataValues
    public NR getMinimumMaximumDataValues() {
        return minimumMaximumDataValues;
    }

    public void setMinimumMaximumDataValues(NR minimumMaximumDataValues) {
        this.minimumMaximumDataValues = minimumMaximumDataValues;
    }
}
