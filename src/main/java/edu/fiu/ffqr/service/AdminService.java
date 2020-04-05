package edu.fiu.ffqr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import edu.fiu.ffqr.models.SysUser;
import edu.fiu.ffqr.models.Admin;
import edu.fiu.ffqr.repositories.AdminRepository;

@Service
@Component
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	public List<Admin> getAll()	{
		return adminRepository.findAll();
	}
	
	public Admin getUserByUsername(String username) {
		return adminRepository.findByUsername(username);
	}
	
	public Admin getUserByUserId(String userId) {
		return adminRepository.getByUserId(userId);
	}
	
	public Admin create(Admin user) {
		return adminRepository.save(user);
	}
	
	public void delete(String userName) {
		Admin fi = adminRepository.findByUsername(userName);
		adminRepository.delete(fi);
	}

	public void deleteById(String userId) {
		Admin fi = adminRepository.getByUserId(userId);
		adminRepository.delete(fi);
	}
	/*public List<User> getAllAdmins(boolean admin)	{
		return usersRepository.getAdmins(admin);
	}*/
	
}
