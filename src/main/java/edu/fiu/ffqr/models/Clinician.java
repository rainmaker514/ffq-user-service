package edu.fiu.ffqr.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;


import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection="clinicians")
public class Clinician implements Serializable{

	@JsonProperty("userId")
	private String userId; 
	@JsonProperty("username")
	private String username;
	@JsonProperty("userpassword")
    private String userpassword;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("lastname")
	private String lastname;
    @JsonProperty("assignedClinic")
    private String assignedClinic;
    @JsonProperty("previousclinics")
    private ArrayList<String> previousClinics = new ArrayList<String>();

	public Clinician() {}
	
    public Clinician(String userId, String username, String abbreviation, String firstname, String lastname, String userpassword, String assignedClinic,
                            ArrayList<String> previousClinics){
        this.userId = userId;
		this.username = username;
		this.userpassword = userpassword;
        this.firstname = firstname;
        this.lastname = lastname;
        this.assignedClinic = assignedClinic;
        this.abbreviation = abbreviation;
        this.previousClinics = previousClinics;

    }


	
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
    }

    public String getAbbreviation(){
        return this.abbreviation;
    }
    public void setAbbreviation(String abbreviation){
        this.abbreviation = abbreviation;
    }
    
    /*public String getFullname() {
        return (this.firstname + " " + this.lastname);
    }*/
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAssignedClinic() {
        return this.assignedClinic;
    }
    public void setAssignedClinic(String assignedClinic) {
        this.assignedClinic = assignedClinic;
        this.previousClinics.add(assignedClinic);
      
    }

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String userpassword){
		this.userpassword = userpassword;
    }
    
    public ArrayList<String> getPreviousClinics() {
        return this.previousClinics;
    }
    public void setPreviousClinic(ArrayList<String> previousClinics) {
        this.previousClinics = previousClinics;   
    }



}
