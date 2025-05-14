package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.DR;
import starhealthcaretech.DataTypes.PL;
import starhealthcaretech.DataTypes.TS;
import starhealthcaretech.DataTypes.XCN;
import starhealthcaretech.HL7Helper.HL7util;

public class PDA implements HL7SegmentInterface {

    private List<CE> deathCauseCode;
    private PL deathLocation;
    private String deathCertifiedIndicator;
    private TS deathCertificateSignedDateTime;
    private XCN deathCertifiedBy;
    private String autopsyIndicator;
    private DR autopsyStartAndEndDateTime;
    private XCN autopsyPerformedBy;
    private String coronerIndicator;

    

    public List<CE> getDeathCauseCode() {
        return deathCauseCode;
    }



    public void setDeathCauseCode(List<CE> deathCauseCode) {
        this.deathCauseCode = deathCauseCode;
    }



    public PL getDeathLocation() {
        return deathLocation;
    }



    public void setDeathLocation(PL deathLocation) {
        this.deathLocation = deathLocation;
    }



    public String getDeathCertifiedIndicator() {
        return deathCertifiedIndicator;
    }



    public void setDeathCertifiedIndicator(String deathCertifiedIndicator) {
        this.deathCertifiedIndicator = deathCertifiedIndicator;
    }



    public TS getDeathCertificateSignedDateTime() {
        return deathCertificateSignedDateTime;
    }



    public void setDeathCertificateSignedDateTime(TS deathCertificateSignedDateTime) {
        this.deathCertificateSignedDateTime = deathCertificateSignedDateTime;
    }



    public XCN getDeathCertifiedBy() {
        return deathCertifiedBy;
    }



    public void setDeathCertifiedBy(XCN deathCertifiedBy) {
        this.deathCertifiedBy = deathCertifiedBy;
    }



    public String getAutopsyIndicator() {
        return autopsyIndicator;
    }



    public void setAutopsyIndicator(String autopsyIndicator) {
        this.autopsyIndicator = autopsyIndicator;
    }



    public DR getAutopsyStartAndEndDateTime() {
        return autopsyStartAndEndDateTime;
    }



    public void setAutopsyStartAndEndDateTime(DR autopsyStartAndEndDateTime) {
        this.autopsyStartAndEndDateTime = autopsyStartAndEndDateTime;
    }



    public XCN getAutopsyPerformedBy() {
        return autopsyPerformedBy;
    }



    public void setAutopsyPerformedBy(XCN autopsyPerformedBy) {
        this.autopsyPerformedBy = autopsyPerformedBy;
    }



    public String getCoronerIndicator() {
        return coronerIndicator;
    }



    public void setCoronerIndicator(String coronerIndicator) {
        this.coronerIndicator = coronerIndicator;
    }



    @Override
    public String toHL7() {
        return "PDA" + HL7util.processAllFields(this);
    }
}
