package edu.fiu.ffqr.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;


import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection="clinics")
public class Clinic implements Serializable {

	@JsonProperty("clinicId")
	private String clinicId; 
	@JsonProperty("address")
	private String address;
	@JsonProperty("datebuilt")
	private String dateBuilt;
	@JsonProperty("clinicname")
	private String clinicName;
	@JsonProperty("headclinician")
	private String headClinician;
	@JsonProperty("isactive")
	private boolean isActive;

	public Clinic() {}
	
	public Clinic(String clinicId, String address, String dateBuilt, String clinicName, String headClinician, boolean isActive){
        this.clinicId = clinicId;
		this.address = address;
		this.dateBuilt = dateBuilt;
		this.clinicName = clinicName;
		this.headClinician = headClinician;
		this.isActive = isActive;
    }
	
	public String getClinicId() {
		return clinicId;
	}

	public void setClinicianId(String clinicId) {
		this.clinicId = clinicId;
	}

	public String getAddress() {
		return this.address;
    }
    
    public void setAdress(String address) {
        this.address = address;
    }
    public String getDateBuilt() {
        return this.dateBuilt;
	}
	public void setDateBuilt(String dateBuilt) {
        this.dateBuilt = dateBuilt;
	}

	public String getClinicName() {
		return this.clinicName;
	}   
    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

	public String getHeadClinician() {
		return this.headClinician;
	}   
    public void setHeadClinician(String headClinician) {
        this.headClinician = headClinician;
	}
	
	public boolean getIsActive() {
		return this.isActive;
	}   
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

}
