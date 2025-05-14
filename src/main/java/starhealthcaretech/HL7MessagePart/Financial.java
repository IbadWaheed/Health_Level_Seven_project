package starhealthcaretech.HL7MessagePart;

import java.util.List;

import starhealthcaretech.Segments.DG1;
import starhealthcaretech.Segments.DRG;
import starhealthcaretech.Segments.FT1;
import starhealthcaretech.Segments.GT1;

public class Financial {
    private FT1 financialtransaction; // Required
    private List<FinancialProcedure> financialProcedureList; // Optional, repeating
    private List<FinancialCommonOrder> financialCommonOrderList; // Optional, repeating
    private List<DG1> diagnosis; // Optional, repeating
    private DRG diagnosisrelatedgroup; // Optional
    private List<GT1> guarantor; // Optional, repeating
    private List<FinancialInsurance> financialInsuranceList; // Optional, repeating
    public FT1 getFinancialtransaction() {
        return financialtransaction;
    }
    public void setFinancialtransaction(FT1 financialtransaction) {
        this.financialtransaction = financialtransaction;
    }
    public List<FinancialProcedure> getFinancialProcedureList() {
        return financialProcedureList;
    }
    public void setFinancialProcedureList(List<FinancialProcedure> financialProcedureList) {
        this.financialProcedureList = financialProcedureList;
    }
    public List<FinancialCommonOrder> getFinancialCommonOrderList() {
        return financialCommonOrderList;
    }
    public void setFinancialCommonOrderList(List<FinancialCommonOrder> financialCommonOrderList) {
        this.financialCommonOrderList = financialCommonOrderList;
    }
    public List<DG1> getDiagnosis() {
        return diagnosis;
    }
    public void setDiagnosis(List<DG1> diagnosis) {
        this.diagnosis = diagnosis;
    }
    public DRG getDiagnosisrelatedgroup() {
        return diagnosisrelatedgroup;
    }
    public void setDiagnosisrelatedgroup(DRG diagnosisrelatedgroup) {
        this.diagnosisrelatedgroup = diagnosisrelatedgroup;
    }
    public List<GT1> getGuarantor() {
        return guarantor;
    }
    public void setGuarantor(List<GT1> guarantor) {
        this.guarantor = guarantor;
    }
    public List<FinancialInsurance> getFinancialInsuranceList() {
        return financialInsuranceList;
    }
    public void setFinancialInsuranceList(List<FinancialInsurance> financialInsuranceList) {
        this.financialInsuranceList = financialInsuranceList;
    }
    

    
    

}
