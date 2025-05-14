package starhealthcaretech.DataTypes;

public class MA {

    // MA.1 - Sample 1 From Channel 1 (Optional, Numeric (NM), Length: 16)
    private String sample1FromChannel1;

    // MA.2 - Sample 1 From Channel 2 (Optional, Numeric (NM), Length: 16)
    private String sample1FromChannel2;

    // MA.3 - Sample 1 From Channel N (Optional, Numeric (NM), Length: 16)
    private String sample1FromChannelN;

    // MA.4 - Sample 2 From Channel 1 (Optional, Numeric (NM), Length: 16)
    private String sample2FromChannel1;

    // MA.5 - Sample 2 From Channel N (Optional, Numeric (NM), Length: 16)
    private String sample2FromChannelN;

    // MA.6 - Sample N From Channel N (Optional, Numeric (NM), Length: 16)
    private String sampleNFromChannelN;

    // Getter and Setter for sample1FromChannel1
    public String getSample1FromChannel1() {
        return sample1FromChannel1;
    }

    public void setSample1FromChannel1(String sample1FromChannel1) {
        this.sample1FromChannel1 = sample1FromChannel1;
    }

    // Getter and Setter for sample1FromChannel2
    public String getSample1FromChannel2() {
        return sample1FromChannel2;
    }

    public void setSample1FromChannel2(String sample1FromChannel2) {
        this.sample1FromChannel2 = sample1FromChannel2;
    }

    // Getter and Setter for sample1FromChannelN
    public String getSample1FromChannelN() {
        return sample1FromChannelN;
    }

    public void setSample1FromChannelN(String sample1FromChannelN) {
        this.sample1FromChannelN = sample1FromChannelN;
    }

    // Getter and Setter for sample2FromChannel1
    public String getSample2FromChannel1() {
        return sample2FromChannel1;
    }

    public void setSample2FromChannel1(String sample2FromChannel1) {
        this.sample2FromChannel1 = sample2FromChannel1;
    }

    // Getter and Setter for sample2FromChannelN
    public String getSample2FromChannelN() {
        return sample2FromChannelN;
    }

    public void setSample2FromChannelN(String sample2FromChannelN) {
        this.sample2FromChannelN = sample2FromChannelN;
    }

    // Getter and Setter for sampleNFromChannelN
    public String getSampleNFromChannelN() {
        return sampleNFromChannelN;
    }

    public void setSampleNFromChannelN(String sampleNFromChannelN) {
        this.sampleNFromChannelN = sampleNFromChannelN;
    }
}
