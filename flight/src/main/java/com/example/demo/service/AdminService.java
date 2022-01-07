package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Admin;
import com.example.demo.repo.AdminRepository;

public class AdminService {
	@Autowired
	private AdminRepository repo;
	
    public Admin createAdmin(Admin admin) {
        return repo.save(admin);
    }
	
    public Optional<Admin> findAdmin(Integer adminId) {
        return repo.findById(adminId);
    }
	
    public List<Admin> findAll() {
        return repo.findAll();
    }
	
	public void updateAdmin(Admin admin, Integer adminId) {
		admin.setId(adminId);
		repo.save(admin);
	}
	
	public void deleteAdmin(Integer id) {
		repo.deleteById(id);
	}
	
	public Admin login(String username, String password) {
		Admin admin = repo.findByUsername(username);
		if(admin.getPassword().equals(password)) {
			return admin;
		}
		return null;
	}
}
