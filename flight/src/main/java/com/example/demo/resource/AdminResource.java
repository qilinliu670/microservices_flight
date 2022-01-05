package com.example.demo.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.model.Admin;
import com.example.demo.repo.AdminRepository;

public class AdminResource {
	@Autowired
	private AdminRepository repo;
	
	@PostMapping(value = "/flight/admin")
    @ResponseStatus(HttpStatus.CREATED)
    public Admin createAdmin(@RequestBody Admin admin) {
        return repo.save(admin);
    }
	
	@GetMapping(value = "/flight/admin/{adminId}")
    public Optional<Admin> findAdmin(@PathVariable("adminId") int adminId) {
        return repo.findById(adminId);
    }
	
	@GetMapping(value = "/flight/admin")
    public List<Admin> findAll() {
        return repo.findAll();
    }
	
	@PutMapping("/flight/admin/{adminId}")
	void updateAdmin(@RequestBody Admin admin, @PathVariable Integer adminId) {
		admin.setId(adminId);
		repo.save(admin);
	}
}
