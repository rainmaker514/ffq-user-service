package edu.fiu.ffqr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import edu.fiu.ffqr.models.SysUser;
import edu.fiu.ffqr.models.Clinician;
import edu.fiu.ffqr.repositories.ClinicianRepository;

@Service
@Component
public class ClinicianService {

	@Autowired
	private ClinicianRepository clinicianRepository;
	
	public List<Clinician> getAll()	{
		return clinicianRepository.findAll();
	}
	
	public Clinician getClinicianByUsername(String username) {
		return clinicianRepository.findByUsername(username);
	}
	
	public Clinician getClinicianBy_id(ObjectId _id) {
		return clinicianRepository.getUserBy_id(_id);
	}

	public Clinician getClinicianByUserId(String userId) {
		return clinicianRepository.getByUserId(userId);
	}

	public Clinician getClinicianByAbbreviation(String abbreviation) {
		return clinicianRepository.getByAbbreviation(abbreviation);
	}
	
	public Clinician create(Clinician user) {
		return clinicianRepository.save(user);
	}
	
	
	public void delete(String username) {
		Clinician fi = clinicianRepository.getByUserId(username);
		clinicianRepository.delete(fi);
	}

	public void deleteById(String userId) {
		Clinician fi = clinicianRepository.getByUserId(userId);
		clinicianRepository.delete(fi);
	}
	
}
