package edu.fiu.ffqr.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import edu.fiu.ffqr.models.Clinician;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection="parents")
public class Parent implements Serializable{

	@JsonProperty("userId")
	private String userId; 
	@JsonProperty("username")
	private String username;
	@JsonProperty("userpassword")
    private String userpassword;
    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("assignedclinic")
    private String assignedClinic;
	@JsonProperty("assignedclinician")
    private String assignedClinician;
    @JsonProperty("childrennames")
    private ArrayList<String> childrenNames = new ArrayList<String>();

	public Parent() {}
	
    public Parent(String userId, String username, String firstname, String lastname, String userpassword, boolean isEnabled, String assignedClinic,
    String assignedClinician, ArrayList<String> childrenNames){
        this.userId = userId;
		this.username = username;
		this.userpassword = userpassword;
        this.firstname = firstname;
        this.lastname = lastname;
        this.assignedClinic = assignedClinic;
        this.assignedClinician = assignedClinician;
        this.childrenNames = childrenNames;

    }
	
	public String getParentId() {
		return this.userId;
	}

	public void setParentId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
    }
    
    public String getFullname() {
        return (this.firstname + " " + this.lastname);
    }
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
            
    }

    public String getAssignedClinician() {
        return this.assignedClinician;
    }
    public void setAssignedClinician(String assignedClinician) {
        this.assignedClinician = assignedClinician;
            
    }

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String userpassword){
		this.userpassword = userpassword;
    }
    
    public ArrayList<String> getChildrenNames() {
        return this.childrenNames;
    }

    public void setChildrenNames(ArrayList<String> childrenNames) {
        this.childrenNames = childrenNames;
    }

    public void addNewChild(String childName){
        this.childrenNames.add(childName);
    }


}
