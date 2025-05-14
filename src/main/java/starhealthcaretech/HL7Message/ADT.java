package starhealthcaretech.HL7Message;

import java.util.List;

import starhealthcaretech.HL7MessagePart.INSURANCE;
import starhealthcaretech.HL7MessagePart.PROCEDURE;
import starhealthcaretech.Segments.*;

public class ADT {
    private MSH messageHeader; // MSH - Message Header (Required)
    private List<SFT> softwareSegments; // SFT - Software Segment (Optional, multiple)
    private EVN eventType; // EVN - Event Type (Required)
    private PID patientIdentification; // PID - Patient Identification (Required)
    private PD1 patientAdditionalDemographic; // PD1 - Patient Additional Demographic (Optional)
    private List<ROL> patientRoles; // ROL - Role (Optional, multiple)
    private List<NK1> nextOfKinAssociatedParties; // NK1 - Next of Kin / Associated Parties (Optional, multiple)
    private PV1 patientVisit; // PV1 - Patient Visit (Required)
    private PV2 patientVisitAdditionalInfo; // PV2 - Patient Visit - Additional Information (Optional)
    private List<ROL> additionalRoles; // ROL - Role (second appearance, Optional, multiple)
    private List<DB1> patientDisabilities; // DB1 - Disability (Optional, multiple)
    private List<OBX> observationResults; // OBX - Observation/Result (Optional, multiple)
    private List<AL1> patientAllergyInformation; // AL1 - Patient Allergy Information (Optional, multiple)
    private List<DG1> diagnoses; // DG1 - Diagnosis (Optional, multiple)
    private DRG diagnosisRelatedGroup; // DRG - Diagnosis Related Group (Optional)
    private List<PROCEDURE> procedures; // PROCEDURE - Optional, multiple
    private List<GT1> guarantors; // GT1 - Guarantor (Optional, multiple)
    private List<INSURANCE> insuranceInformation; // INSURANCE - Optional, multiple
    private ACC accidentInformation; // ACC - Accident (Optional)
    private UB1 ub82Data; // UB1 - UB82 Data (Optional)
    private UB2 ub92Data; // UB2 - UB92 Data (Optional)
    private PDA patientDeathAndAutopsy; // PDA - Patient Death and Autopsy (Optional)

    public MSH getMessageHeader() {
        return messageHeader;
    }

    public void setMessageHeader(MSH messageHeader) {
        this.messageHeader = messageHeader;
    }

    public List<SFT> getSoftwareSegments() {
        return softwareSegments;
    }

    public void setSoftwareSegments(List<SFT> softwareSegments) {
        this.softwareSegments = softwareSegments;
    }

    public EVN getEventType() {
        return eventType;
    }

    public void setEventType(EVN eventType) {
        this.eventType = eventType;
    }

    public PID getPatientIdentification() {
        return patientIdentification;
    }

    public void setPatientIdentification(PID patientIdentification) {
        this.patientIdentification = patientIdentification;
    }

    public PD1 getPatientAdditionalDemographic() {
        return patientAdditionalDemographic;
    }

    public void setPatientAdditionalDemographic(PD1 patientAdditionalDemographic) {
        this.patientAdditionalDemographic = patientAdditionalDemographic;
    }

    public List<ROL> getPatientRoles() {
        return patientRoles;
    }

    public void setPatientRoles(List<ROL> patientRoles) {
        this.patientRoles = patientRoles;
    }

    public List<NK1> getNextOfKinAssociatedParties() {
        return nextOfKinAssociatedParties;
    }

    public void setNextOfKinAssociatedParties(List<NK1> nextOfKinAssociatedParties) {
        this.nextOfKinAssociatedParties = nextOfKinAssociatedParties;
    }

    public PV1 getPatientVisit() {
        return patientVisit;
    }

    public void setPatientVisit(PV1 patientVisit) {
        this.patientVisit = patientVisit;
    }

    public PV2 getPatientVisitAdditionalInfo() {
        return patientVisitAdditionalInfo;
    }

    public void setPatientVisitAdditionalInfo(PV2 patientVisitAdditionalInfo) {
        this.patientVisitAdditionalInfo = patientVisitAdditionalInfo;
    }

    public List<ROL> getAdditionalRoles() {
        return additionalRoles;
    }

    public void setAdditionalRoles(List<ROL> additionalRoles) {
        this.additionalRoles = additionalRoles;
    }

    public List<DB1> getPatientDisabilities() {
        return patientDisabilities;
    }

    public void setPatientDisabilities(List<DB1> patientDisabilities) {
        this.patientDisabilities = patientDisabilities;
    }

    public List<OBX> getObservationResults() {
        return observationResults;
    }

    public void setObservationResults(List<OBX> observationResults) {
        this.observationResults = observationResults;
    }

    public List<AL1> getPatientAllergyInformation() {
        return patientAllergyInformation;
    }

    public void setPatientAllergyInformation(List<AL1> patientAllergyInformation) {
        this.patientAllergyInformation = patientAllergyInformation;
    }

    public List<DG1> getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(List<DG1> diagnoses) {
        this.diagnoses = diagnoses;
    }

    public DRG getDiagnosisRelatedGroup() {
        return diagnosisRelatedGroup;
    }

    public void setDiagnosisRelatedGroup(DRG diagnosisRelatedGroup) {
        this.diagnosisRelatedGroup = diagnosisRelatedGroup;
    }

    public List<PROCEDURE> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<PROCEDURE> procedures) {
        this.procedures = procedures;
    }

    public List<GT1> getGuarantors() {
        return guarantors;
    }

    public void setGuarantors(List<GT1> guarantors) {
        this.guarantors = guarantors;
    }

    public List<INSURANCE> getInsuranceInformation() {
        return insuranceInformation;
    }

    public void setInsuranceInformation(List<INSURANCE> insuranceInformation) {
        this.insuranceInformation = insuranceInformation;
    }

    public ACC getAccidentInformation() {
        return accidentInformation;
    }

    public void setAccidentInformation(ACC accidentInformation) {
        this.accidentInformation = accidentInformation;
    }

    public UB1 getUb82Data() {
        return ub82Data;
    }

    public void setUb82Data(UB1 ub82Data) {
        this.ub82Data = ub82Data;
    }

    public UB2 getUb92Data() {
        return ub92Data;
    }

    public void setUb92Data(UB2 ub92Data) {
        this.ub92Data = ub92Data;
    }

    public PDA getPatientDeathAndAutopsy() {
        return patientDeathAndAutopsy;
    }

    public void setPatientDeathAndAutopsy(PDA patientDeathAndAutopsy) {
        this.patientDeathAndAutopsy = patientDeathAndAutopsy;
    }

    public String toHL7() {
        StringBuilder builder = new StringBuilder();

        if (messageHeader != null) {
            builder.append(messageHeader.toHL7()).append("\r");
        }

        if (softwareSegments != null) {
            for (SFT sft : softwareSegments) {
                if (sft != null) {
                    builder.append(sft.toHL7()).append("\r");
                }
            }
        }

        if (eventType != null) {
            builder.append(eventType.toHL7()).append("\r");
        }

        if (patientIdentification != null) {
            builder.append(patientIdentification.toHL7()).append("\r");
        }

        if (patientAdditionalDemographic != null) {
            builder.append(patientAdditionalDemographic.toHL7()).append("\r");
        }

        if (patientRoles != null) {
            for (ROL rol : patientRoles) {
                if (rol != null) {
                    builder.append(rol.toHL7()).append("\r");
                }
            }
        }

        if (nextOfKinAssociatedParties != null) {
            for (NK1 nk1 : nextOfKinAssociatedParties) {
                if (nk1 != null) {
                    builder.append(nk1.toHL7()).append("\r");
                }
            }
        }

        if (patientVisit != null) {
            builder.append(patientVisit.toHL7()).append("\r");
        }

        if (patientVisitAdditionalInfo != null) {
            builder.append(patientVisitAdditionalInfo.toHL7()).append("\r");
        }

        if (additionalRoles != null) {
            for (ROL rol : additionalRoles) {
                if (rol != null) {
                    builder.append(rol.toHL7()).append("\r");
                }
            }
        }

        if (patientDisabilities != null) {
            for (DB1 db1 : patientDisabilities) {
                if (db1 != null) {
                    builder.append(db1.toHL7()).append("\r");
                }
            }
        }

        if (observationResults != null) {
            for (OBX obx : observationResults) {
                if (obx != null) {
                    builder.append(obx.toHL7()).append("\r");
                }
            }
        }

        if (patientAllergyInformation != null) {
            for (AL1 al1 : patientAllergyInformation) {
                if (al1 != null) {
                    builder.append(al1.toHL7()).append("\r");
                }
            }
        }

        if (diagnoses != null) {
            for (DG1 dg1 : diagnoses) {
                if (dg1 != null) {
                    builder.append(dg1.toHL7()).append("\r");
                }
            }
        }

        if (diagnosisRelatedGroup != null) {
            builder.append(diagnosisRelatedGroup.toHL7()).append("\r");
        }

        if (procedures != null) {
            for (PROCEDURE procedure : procedures) {
                if (procedure != null) {
                    builder.append(procedure.toHL7()).append("\r");
                }
            }
        }

        if (guarantors != null) {
            for (GT1 gt1 : guarantors) {
                if (gt1 != null) {
                    builder.append(gt1.toHL7()).append("\r");
                }
            }
        }

        if (insuranceInformation != null) {
            for (INSURANCE ins : insuranceInformation) {
                if (ins != null) {
                    builder.append(ins.toHL7()).append("\r");
                }
            }
        }

        if (accidentInformation != null) {
            builder.append(accidentInformation.toHL7()).append("\r");
        }

        if (ub82Data != null) {
            builder.append(ub82Data.toHL7()).append("\r");
        }

        if (ub92Data != null) {
            builder.append(ub92Data.toHL7()).append("\r");
        }

        if (patientDeathAndAutopsy != null) {
            builder.append(patientDeathAndAutopsy.toHL7()).append("\r");
        }

        return builder.toString();
    }
}
