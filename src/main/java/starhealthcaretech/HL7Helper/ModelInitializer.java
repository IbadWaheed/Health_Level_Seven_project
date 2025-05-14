package starhealthcaretech.HL7Helper;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import starhealthcaretech.DataTypes.HL7Helper;
import starhealthcaretech.DataTypes.TQ;
import starhealthcaretech.DataTypes.XAD;
import starhealthcaretech.DataTypes.XCN;
import starhealthcaretech.DataTypes.XPN;
import starhealthcaretech.DataTypes.XTN;
import starhealthcaretech.HL7Message.ADT;
import starhealthcaretech.HL7Message.SIU;
import starhealthcaretech.HL7MessagePart.Patient;
import starhealthcaretech.HL7MessagePart.PersonnelResource;
import starhealthcaretech.HL7MessagePart.Resources;
import starhealthcaretech.Segments.AIP;
import starhealthcaretech.Segments.AIS;
import starhealthcaretech.Segments.MSH;
import starhealthcaretech.Segments.PID;
import starhealthcaretech.Segments.RGS;
import starhealthcaretech.Segments.SCH;

public class ModelInitializer {
    public static void assignValuesSIU(Object obj) {
                if (obj == null)
                        return;

                try {
                        // Assigning values to SIU_S12MainModel
                        if (obj instanceof SIU) {
                                SIU mainModel = (SIU) obj;

                                // Set MSH Segment values
                                // The MSH segment defines the intent, source, destination, and some specifics
                                // of the syntax of a message
                                MSH MSH = new MSH();
                                MSH.setFieldSeparator("|");
                                MSH.setEncodingCharacters("^~\\&");
                                MSH.setSendingApplication("EPIC");
                                MSH.setSendingFacility("CADENCE");
                                MSH.setReceivingFacility("APPT_NEW");
                                LocalDateTime now = LocalDateTime.now();
                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
                                String formattedDateTime = now.format(formatter);
                                MSH.setDateTimeOfMessage(formattedDateTime);
                                MSH.setSecurity("SLUB01");
                                // MessageType
                                // SIU^S12 – Notification of New Appointment Booking
                                // SIU^S13 – Notification of Appointment Rescheduling
                                // SIU^S14 – Notification of Appointment Modification
                                // SIU^S15 – Notification of Appointment Cancellation
                                // SIU^S16 – Notification of Appointment Discontinuation
                                // SIU^S17 – Notification of Appointment Deletion
                                // SIU^S18 – Notification of Addition of Service/Resource on Appointment
                                // SIU^S19 – Notification of Modification of Service/Resource on Appointment
                                // SIU^S20 – Notification of Cancellation of Service/Resource on Appointment
                                // SIU^S21 – Notification of Discontinuation of Service/Resource on Appointment
                                // SIU^S22 – Notification of Deletion of Service/Resource on Appointment
                                // SIU^S23 – Notification of Blocked Schedule Timeslot(s)
                                // SIU^S24 – Notification of Opened (“un-blocked”) schedule time slot(s)
                                // SIU^S26 – Notification that Patient did not show up for Scheduled Appointment
                                MSH.setMessageType(HL7Helper.createMSG("SIU", "S12", null));
                                MSH.setMessageControlID("112");
                                MSH.setVersionID("2.3");
                                mainModel.setMsh(MSH);

                                // Set SCH Segment values
                                // The SCH segment contains general information about the scheduled appointment
                                SCH SCH = new SCH();
                                SCH.setFillerAppointmentID("104793600");
                                // AppointmentReason
                                // CHECKUP A routine check-up such as an annual physical.
                                // EMERGENCY Emergency appointment
                                // FOLLOWUP A follow up visit from a previous appointment.
                                // ROUTINE Routine appointment - default if not valued
                                // WALKIN A previously unscheduled walk-in visit
                                SCH.setAppointmentReason(
                                                HL7Helper.createCE("NATHC", "NEW ATHLETICS COUNSELING VISIT", null,
                                                                null, null, null));

                                // AppointmentType
                                // COMPLETE A request to add a completed appointment, used to maintain records
                                // of completed appointments that did not appear in the schedule (e.g., STAT, w
                                // alk-in, etc.)
                                // NORMAL Routine schedule request type - default if not valued
                                // TENTATIVE A request for a tentative (e.g., “penciled in”) appointment
                                SCH.setAppointmentType(HL7Helper.createCE("SCH", null, null, null, null, null));
                                SCH.setAppointmentDuration("60");
                                SCH.setAppointmentDurationUnits("MIN");

                                List<TQ> AppointmentTimingQuantityTQlist = new ArrayList<>();
                                AppointmentTimingQuantityTQlist
                                                .add(HL7Helper.createTQ(null, null, "60", "20221215120000",
                                                                "20221215130000"));
                                SCH.setAppointmentTimingQuantity(AppointmentTimingQuantityTQlist);

                                List<XCN> PlacerContactPersonXCNlist = new ArrayList<>();
                                PlacerContactPersonXCNlist.add(
                                                HL7Helper.createXCN("SLUB01", "SLUBOWSKI", "ALICIA", null, null, null,
                                                                null, null, null, null, null, null, null, null));
                                SCH.setPlacerContactPerson(PlacerContactPersonXCNlist);

                                // Standard HL7 codes - FIlter status code
                                // BLOCKED The indicated time slot(s) is(are) blocked. Not used in the AIS, AIG,
                                // AIL, AIP segments.
                                // BOOKED The indicated appointment is booked
                                // CANCELLED The indicated appointment was stopped from occurring (cancelled
                                // prior to starting)
                                // COMPLETE The indicated appointment has completed normally (was not
                                // discontinued, canceled, or deleted)
                                // DC The indicated appointment was discontinued (DCed while in progress,
                                // discontinued parent appointment, or discontinued child appointment)
                                // DELETED The indicated appointment was deleted from the filler application
                                // OVERBOOK The appointment has been confirmed; however it is confirmed in an
                                // overbooked state
                                // PENDING Appointment has not yet been confirmed
                                // STARTED The indicated appointment has begun and is currently in progress
                                // WAITLIST Appointment has been placed on a waiting list for a particular slot,
                                // or set of slots

                                SCH.setFillerStatusCode("SCH");

                                mainModel.setSch(SCH);

                                // Set PatientArea values
                                Patient patient = new Patient();
                                // The PID segment is used by all applications as the primary means of
                                // communicating patient identification information. This segment contains
                                // permanent patient identifying and demographic information that, for the most
                                // part, is not likely to change frequently.

                                // Usage notes: PID patient identification The assigning facility ID, the fourth
                                // component of the patient identifiers, is a string of up to six characters
                                // that is uniquely associated with the facility that originally assigned the
                                // number. A given institution, or group of intercommunicating institutions,
                                // should establish a list of facilities that may be potential assignors of
                                // patient identification (and other important identification) numbers. The list
                                // will be one of the institution’s master dictionary lists. Since third parties
                                // (other than the assignors of patient identification numbers) may send or
                                // receive HL7 messages containing patient identification numbers, the assigning
                                // facility ID in the patient identification numbers may not be the same as the
                                // sending and receiving systems identified in the MSH. The assigning facility
                                // ID must be unique across applications at a given site. This field is required
                                // in HL7 implementations that have more than a single Patient Administration
                                // application assigning such numbers.
                                PID PID = new PID();
                                List<String> PatientIdentifierList = new ArrayList<>();
                                PatientIdentifierList.add("430000244");
                                PID.setPatientIdentifierList(PatientIdentifierList);

                                List<XPN> PatientNamelist = new ArrayList<>();
                                PatientNamelist.add(HL7Helper.createXPN("SLUBTEST", "ATHLETE", null, null, null, null,
                                                "L"));
                                PatientNamelist.add(
                                                HL7Helper.createXPN("SLUBTEST", "ATH", null, null, null, null, "N"));
                                PID.setPatientName(PatientNamelist);

                                PID.setDateTimeOfBirth("20010818");
                                PID.setAdministrativeSex("M");

                                // Race
                                // user defined value
                                PID.setRace("W");

                                List<XAD> PatientAddresslist = new ArrayList<>();
                                PatientAddresslist.add(HL7Helper.createXAD("123 ST. JOHN", null, "HILLIARD", "OH",
                                                "43026", null, null,
                                                null, "FRANKLIN", null, null, null, null, null));
                                PID.setPatientAddress(PatientAddresslist);
                                PID.setCountyCode("FRANKLIN");

                                List<XTN> PhoneNumberHomelist = new ArrayList<>();
                                PhoneNumberHomelist.add(HL7Helper.createXTN("7777777777", null, "C", null, null, null,
                                                null, null, null,
                                                null, null, null, null, null, null, null, null, "1"));
                                PID.setPhoneNumberHome(PhoneNumberHomelist);

                                PID.setPrimaryLanguage(HL7Helper.createCE("ENG", "UNDEFINED", null, "22", null, null));
                                PID.setMaritalStatus("S");

                                List<String> EthnicGrouplist = new ArrayList<>();
                                EthnicGrouplist.add("N");
                                PID.setEthnicGroup(EthnicGrouplist);

                                // Death Indicator Y/N
                                PID.setPatientDeathIndicator("N");

                                patient.setPid(PID);
                                List<Patient> patientarealist = new ArrayList<>();
                                patientarealist.add(patient);
                                mainModel.setPatient(patientarealist);

                                // Set RGS values
                                // The RGS segment is used to identify relationships between resources
                                // identified for a scheduled event. This segment can be used, on a site
                                // specified basis, to identify groups of resources that are used together
                                // within a scheduled event, or to describe some other relationship between
                                // resources. To specify related groups of resources within a message, begin
                                // each group with an RGS segment, and then follow that RGS with one or more of
                                // the Appointment Information segments (AIG, AIL, AIS, or AIP). If a message
                                // does not require any grouping of resources, then specify a single RGS in the
                                // message, and follow it with all of the Appointment Information segments for
                                // the scheduled event. (At least one RGS segment is required in each message —
                                // even if no grouping of resources is required — to allow parsers to properly
                                // understand the message.)
                                RGS RGS = new RGS();

                                RGS.setSetId("1");
                                RGS.setSegmentActionCode("A");
                                RGS.setResourceGroupId(HL7Helper.createCE("300102469",
                                                "SPORTS MED PSYCHOLOGY ST JOHN ARENA", null,
                                                "300102469", null, null));

                                Resources resources = new Resources();
                                resources.setRgs(RGS);
                                // Set AIS values
                                // The AIS segment contains information about various kinds of services that can
                                // be scheduled. Services included in a transaction using this segment are
                                // assumed to be controlled by a schedule on a schedule filler application.
                                // Services not controlled by a schedule are not identified on a schedule
                                // request using this segment.
                                AIS AIS = new AIS();
                                AIS.setSetId("1");

                                // Segment Action Code
                                // A Add/Insert
                                // D Delete
                                // U Update
                                AIS.setSegmentActionCode("A");

                                AIS.setUniversalServiceIdentifier(
                                                HL7Helper.createCE("NATHC", "NEW ATHLETICS COUNSELING VISIT", null,
                                                                null, null, null));
                                AIS.setStartDateTime("20221215120000");
                                AIS.setDuration("60");
                                AIS.setDurationUnits(HL7Helper.createCE("MIN", null, null, null, null, null));
                                AIS.setFillerStatusCode(HL7Helper.createCE("SCH", null, null, null, null, null));

                                starhealthcaretech.HL7MessagePart.Service service = new starhealthcaretech.HL7MessagePart.Service();
                                service.setAis(AIS);

                                // Set AIP values
                                // The AIP segment contains information about the personnel types that can be
                                // scheduled. Personnel included in a transaction using this segment are assumed
                                // to be controlled by a schedule on a schedule filler application. Personnel
                                // not controlled by a schedule are not identified on a schedule request using
                                // this segment. The kinds of personnel described on this segment include any
                                // healthcare provider in the institution controlled by a schedule (for example:
                                // technicians, physicians, nurses, surgeons, anesthesiologists, or CRNAs).
                                AIP AIP = new AIP();
                                AIP.setSetId("1");

                                // A Add/Insert
                                // D Delete
                                // U Update
                                AIP.setSegmentActionCode("A");
                                AIP.setPersonnelResourceId(HL7Helper.createXCN("9500000", "WILLIAMS", "CANDICE", null,
                                                null, null, null,
                                                null, null, null, null, null, null, null));

                                PersonnelResource persoalresouce = new PersonnelResource();
                                persoalresouce.setAip(AIP);

                                List<starhealthcaretech.HL7MessagePart.Service> servicelist = new ArrayList<>();
                                servicelist.add(service);

                                List<PersonnelResource> personalresourcelist = new ArrayList<>();
                                personalresourcelist.add(persoalresouce);

                                resources.setService(servicelist);
                                resources.setPersonnelresource(personalresourcelist);

                                List<Resources> resourcelist = new ArrayList<>();
                                resourcelist.add(resources);
                                mainModel.setResources(resourcelist);
                        }
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

        public static void assignValuesADT(Object obj) {
                if (obj == null)
                        return;

                try {
                        // Assigning values to SIU_S12MainModel
                        if (obj instanceof ADT) {
                                ADT mainModel = (ADT) obj;

                                 // Set MSH Segment values
                                // The MSH segment defines the intent, source, destination, and some specifics
                                // of the syntax of a message
                                MSH MSH = new MSH();
                                MSH.setFieldSeparator("|");
                                MSH.setEncodingCharacters("^~\\&");
                                MSH.setSendingApplication("EPIC");
                                MSH.setSendingFacility("CADENCE");
                                MSH.setReceivingFacility("APPT_NEW");
                                LocalDateTime now = LocalDateTime.now();
                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
                                String formattedDateTime = now.format(formatter);
                                MSH.setDateTimeOfMessage(formattedDateTime);
                                MSH.setSecurity("SLUB01");
                                MSH.setMessageType(HL7Helper.createMSG("SIU", "S12", null));
                                MSH.setMessageControlID("112");
                                MSH.setVersionID("2.3");
                                mainModel.setMessageHeader(MSH);

                                PID pid = new PID();
                                pid.setSetIdPid("1");
                                List<String> patientidentifierlist = new ArrayList<>  ();
                                patientidentifierlist.add("410000060");
                                pid.setPatientIdentifierList(patientidentifierlist);
                                List<XPN> patientnamelist = new ArrayList<>();
                                patientnamelist.add(HL7Helper.createXPN("ZTEST", "ARTERA3", null, null, null, null, "L"));
                                patientnamelist.add(HL7Helper.createXPN("SMITH", "LINDA", null, null, null, null, "N"));

                                pid.setPatientName(patientnamelist);

                                pid.setDateTimeOfBirth("19700520");
                                List<XAD> patientaddresslist = new ArrayList<>();
                                patientaddresslist.add(HL7Helper.createXAD("342 ARTERA AVE", null, "POWELL", "OH", "43065", "US", "L", null, null, null, null, null, null, null));
                                pid.setPatientAddress(patientaddresslist);
                                List<XTN> phonenohomelist = new ArrayList<>();
                                phonenohomelist.add(HL7Helper.createXTN("9998887777", null, "H", null, null, null, null, null, null, null, null, null, null, null, null, null, null, "1"));
                                phonenohomelist.add(HL7Helper.createXTN(null, "Net", null, "robert.mychart@test.com", null, null, null, null, null, null, null, null, null, null, null, null, null, null));

                                pid.setPhoneNumberHome(phonenohomelist);
                                pid.setPrimaryLanguage(HL7Helper.createCE("ENG", "ENGLISH", null, "22", null, null));
                                pid.setPatientAccountNumber(HL7Helper.createCX("100013314", null, null, null, null, null, null, null, null, null));
                                pid.setPatientDeathIndicator("N");

                                mainModel.setPatientIdentification(pid);


                        }
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

}
