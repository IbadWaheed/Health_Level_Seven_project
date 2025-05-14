package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.DataTypes.CX;
import starhealthcaretech.DataTypes.XCN;
import starhealthcaretech.DataTypes.XON;
import starhealthcaretech.HL7Helper.HL7util;

public class PD1 implements HL7SegmentInterface {
    private String livingDependency;                        
    private String livingArrangement;                       
    private List<XON> patientPrimaryFacility;                  
    private List<XCN> patientPrimaryCareProviderNameAndIdNo;   
    private String studentIndicator;                        
    private String handicap;                                
    private String livingWillCode;                           
    private String organDonorCode;                           
    private String separateBill;                             
    private List<CX> duplicatePatient;                         
    private CE publicityCode;                            
    private String protectionIndicator;                      
    private String protectionIndicatorEffectiveDate;         
    private List<XON> placeOfWorship;                            
    private List<CE> advanceDirectiveCode;                     
    private String immunizationRegistryStatus;               
    private String immunizationRegistryStatusEffectiveDate;  
    private String publicityCodeEffectiveDate;               
    private String militaryBranch;                           
    private String militaryRankGrade;                        
    private String militaryStatus;                           

    // Getters and Setters

    public String getLivingDependency() {
        return livingDependency;
    }

    public void setLivingDependency(String livingDependency) {
        this.livingDependency = livingDependency;
    }

    public String getLivingArrangement() {
        return livingArrangement;
    }

    public void setLivingArrangement(String livingArrangement) {
        this.livingArrangement = livingArrangement;
    }

    public List<XON> getPatientPrimaryFacility() {
        return patientPrimaryFacility;
    }

    public void setPatientPrimaryFacility(List<XON> patientPrimaryFacility) {
        this.patientPrimaryFacility = patientPrimaryFacility;
    }

    public List<XCN> getPatientPrimaryCareProviderNameAndIdNo() {
        return patientPrimaryCareProviderNameAndIdNo;
    }

    public void setPatientPrimaryCareProviderNameAndIdNo(List<XCN> patientPrimaryCareProviderNameAndIdNo) {
        this.patientPrimaryCareProviderNameAndIdNo = patientPrimaryCareProviderNameAndIdNo;
    }

    public String getStudentIndicator() {
        return studentIndicator;
    }

    public void setStudentIndicator(String studentIndicator) {
        this.studentIndicator = studentIndicator;
    }

    public String getHandicap() {
        return handicap;
    }

    public void setHandicap(String handicap) {
        this.handicap = handicap;
    }

    public String getLivingWillCode() {
        return livingWillCode;
    }

    public void setLivingWillCode(String livingWillCode) {
        this.livingWillCode = livingWillCode;
    }

    public String getOrganDonorCode() {
        return organDonorCode;
    }

    public void setOrganDonorCode(String organDonorCode) {
        this.organDonorCode = organDonorCode;
    }

    public String getSeparateBill() {
        return separateBill;
    }

    public void setSeparateBill(String separateBill) {
        this.separateBill = separateBill;
    }

    public List<CX> getDuplicatePatient() {
        return duplicatePatient;
    }

    public void setDuplicatePatient(List<CX> duplicatePatient) {
        this.duplicatePatient = duplicatePatient;
    }

    public CE getPublicityCode() {
        return publicityCode;
    }

    public void setPublicityCode(CE publicityCode) {
        this.publicityCode = publicityCode;
    }

    public String getProtectionIndicator() {
        return protectionIndicator;
    }

    public void setProtectionIndicator(String protectionIndicator) {
        this.protectionIndicator = protectionIndicator;
    }

    public String getProtectionIndicatorEffectiveDate() {
        return protectionIndicatorEffectiveDate;
    }

    public void setProtectionIndicatorEffectiveDate(String protectionIndicatorEffectiveDate) {
        this.protectionIndicatorEffectiveDate = protectionIndicatorEffectiveDate;
    }

    public List<XON> getPlaceOfWorship() {
        return placeOfWorship;
    }

    public void setPlaceOfWorship(List<XON> placeOfWorship) {
        this.placeOfWorship = placeOfWorship;
    }

    public List<CE> getAdvanceDirectiveCode() {
        return advanceDirectiveCode;
    }

    public void setAdvanceDirectiveCode(List<CE> advanceDirectiveCode) {
        this.advanceDirectiveCode = advanceDirectiveCode;
    }

    public String getImmunizationRegistryStatus() {
        return immunizationRegistryStatus;
    }

    public void setImmunizationRegistryStatus(String immunizationRegistryStatus) {
        this.immunizationRegistryStatus = immunizationRegistryStatus;
    }

    public String getImmunizationRegistryStatusEffectiveDate() {
        return immunizationRegistryStatusEffectiveDate;
    }

    public void setImmunizationRegistryStatusEffectiveDate(String immunizationRegistryStatusEffectiveDate) {
        this.immunizationRegistryStatusEffectiveDate = immunizationRegistryStatusEffectiveDate;
    }

    public String getPublicityCodeEffectiveDate() {
        return publicityCodeEffectiveDate;
    }

    public void setPublicityCodeEffectiveDate(String publicityCodeEffectiveDate) {
        this.publicityCodeEffectiveDate = publicityCodeEffectiveDate;
    }

    public String getMilitaryBranch() {
        return militaryBranch;
    }

    public void setMilitaryBranch(String militaryBranch) {
        this.militaryBranch = militaryBranch;
    }

    public String getMilitaryRankGrade() {
        return militaryRankGrade;
    }

    public void setMilitaryRankGrade(String militaryRankGrade) {
        this.militaryRankGrade = militaryRankGrade;
    }

    public String getMilitaryStatus() {
        return militaryStatus;
    }

    public void setMilitaryStatus(String militaryStatus) {
        this.militaryStatus = militaryStatus;
    }
    @Override
    public String toHL7() {
        return "PD1" + HL7util.processAllFields(this);
    }
}
