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

import com.example.demo.model.Ticket;
import com.example.demo.repo.TicketRepository;

public class TicketResource {
	@Autowired
	private TicketRepository repo;
	
	@PostMapping(value = "/flight/ticket")
    @ResponseStatus(HttpStatus.CREATED)
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return repo.save(ticket);
    }
	
	@GetMapping(value = "/flight/ticket/{ticketId}")
    public Optional<Ticket> findTicket(@PathVariable("ticketId") int ticketId) {
        return repo.findById(ticketId);
    }
	
	@GetMapping(value = "/flight/ticket")
    public List<Ticket> findAll() {
        return repo.findAll();
    }
	
	@PutMapping("/flight/ticket/{ticketId}")
	void updateTicket(@RequestBody Ticket ticket, @PathVariable Integer ticketId) {
		ticket.setId(ticketId);
		repo.save(ticket);
	}
}
