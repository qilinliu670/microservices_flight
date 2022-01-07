package com.example.demo.repo;

import com.example.demo.model.Ticket;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
	Ticket findByPnr(Integer pnr);
	List<Ticket> findByEmailId(String emailId);
}
