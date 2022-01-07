package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Flight;
import com.example.demo.repo.FlightRepository;

public class FlightService {
	@Autowired
	private FlightRepository repo;
	
    public Flight createFlight(Flight Flight) {
        return repo.save(Flight);
    }
	
    public Optional<Flight> findFlight(Integer FlightId) {
        return repo.findById(FlightId);
    }
	
    public List<Flight> findAll() {
        return repo.findAll();
    }
    
    public void deleteFlight(Integer id) {
		repo.deleteById(id);
	}
	
	public void updateFlight(Flight Flight, Integer FlightId) {
		Flight.setId(FlightId);
		repo.save(Flight);
	}
	
	public List<Flight> search(Date start, Date end, String from, String to, String type) {
		return repo.search(start, end, from, to, type);
	}
}
