package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Ticket;
import com.example.demo.repo.TicketRepository;

public class TicketService {
	@Autowired
	private TicketRepository repo;
	
    public Ticket createTicket(Ticket ticket) {
        return repo.save(ticket);
    }
	
    public Optional<Ticket> findTicket(Integer ticketId) {
        return repo.findById(ticketId);
    }
	
    public List<Ticket> findAll() {
        return repo.findAll();
    }
	
	public void updateTicket(Ticket ticket, Integer ticketId) {
		ticket.setId(ticketId);
		repo.save(ticket);
	}
	
    public void deleteTicketById(Integer id) {
		repo.deleteById(id);
	}
    
    public Ticket findByPnr(Integer pnr) {
    	return repo.findByPnr(pnr);
    }
    
    public void deleteTicketByPnr(Integer pnr) {
    	repo.deleteById(findByPnr(pnr).getId());
    }
    
    public List<Ticket> findByEmailId(String emailId) {
    	return repo.findByEmailId(emailId);
    }
}
