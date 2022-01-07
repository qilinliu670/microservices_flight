package com.example.demo.repo;

import com.example.demo.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	Admin findByUsername(String username);
}
