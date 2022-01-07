package com.example.demo.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
	List<Flight> search(Date start, Date end, String from, String to, String type);
}
