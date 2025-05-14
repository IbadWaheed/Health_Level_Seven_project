package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.HL7Helper.HL7util;

public class AL1 implements HL7SegmentInterface {
    

    private String setIdAL1; // AL1.1
    private CE allergenTypeCode; // AL1.2
    private CE allergenCodeMnemonicDescription; // AL1.3
    private CE allergySeverityCode; // AL1.4
    private List<String> allergyReactionCode; // AL1.5
    private String identificationDate; // AL1.6


    


    public String getSetIdAL1() {
        return setIdAL1;
    }


    public void setSetIdAL1(String setIdAL1) {
        this.setIdAL1 = setIdAL1;
    }


    public CE getAllergenTypeCode() {
        return allergenTypeCode;
    }


    public void setAllergenTypeCode(CE allergenTypeCode) {
        this.allergenTypeCode = allergenTypeCode;
    }


    public CE getAllergenCodeMnemonicDescription() {
        return allergenCodeMnemonicDescription;
    }


    public void setAllergenCodeMnemonicDescription(CE allergenCodeMnemonicDescription) {
        this.allergenCodeMnemonicDescription = allergenCodeMnemonicDescription;
    }


    public CE getAllergySeverityCode() {
        return allergySeverityCode;
    }


    public void setAllergySeverityCode(CE allergySeverityCode) {
        this.allergySeverityCode = allergySeverityCode;
    }


    public List<String> getAllergyReactionCode() {
        return allergyReactionCode;
    }


    public void setAllergyReactionCode(List<String> allergyReactionCode) {
        this.allergyReactionCode = allergyReactionCode;
    }


    public String getIdentificationDate() {
        return identificationDate;
    }


    public void setIdentificationDate(String identificationDate) {
        this.identificationDate = identificationDate;
    }

    @Override
    public String toHL7() {
        return "AL1" + HL7util.processAllFields(this);
    }
}
