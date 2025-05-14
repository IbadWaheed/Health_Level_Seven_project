package starhealthcaretech.HL7MessagePart;

import java.util.List;


import starhealthcaretech.Segments.*;

public class Resources {
    private RGS rgs;

    private List<Service> service;
    private List<GeneralResource> generalresource;
    private List<LocationResource> locationresource;
    private List<PersonnelResource> personnelresource;
    public RGS getRgs() {
        return rgs;
    }
    public void setRgs(RGS rgs) {
        this.rgs = rgs;
    }
    public List<Service> getService() {
        return service;
    }
    public void setService(List<Service> service) {
        this.service = service;
    }
    public List<GeneralResource> getGeneralresource() {
        return generalresource;
    }
    public void setGeneralresource(List<GeneralResource> generalresource) {
        this.generalresource = generalresource;
    }
    public List<LocationResource> getLocationresource() {
        return locationresource;
    }
    public void setLocationresource(List<LocationResource> locationresource) {
        this.locationresource = locationresource;
    }
    public List<PersonnelResource> getPersonnelresource() {
        return personnelresource;
    }
    public void setPersonnelresource(List<PersonnelResource> personnelresource) {
        this.personnelresource = personnelresource;
    }

    public String toHL7(){
        StringBuilder builder = new StringBuilder();
        if (rgs != null) {
            builder.append(rgs.toHL7()).append("\r");
        }
    
        if (service != null) {
            for (Service s : service) {
                builder.append(s.toHL7()).append("\r");
            }
        }
    
        if (generalresource != null) {
            for (GeneralResource gr : generalresource) {
                builder.append(gr.toHL7()).append("\r");
            }
        }
    
        if (locationresource != null) {
            for (LocationResource lr : locationresource) {
                builder.append(lr.toHL7()).append("\r");
            }
        }
    
        if (personnelresource != null) {
            for (PersonnelResource pr : personnelresource) {
                builder.append(pr.toHL7()).append("\r");
            }
        }
       
        return builder.toString();
    }
}
