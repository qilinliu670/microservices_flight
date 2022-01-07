package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Flight;
import com.example.demo.model.Ticket;
import com.example.demo.service.AdminService;
import com.example.demo.service.FlightService;
import com.example.demo.service.TicketService;

@RestController
@RequestMapping("/flight")
public class FlightController {
	@Autowired
	private AdminService adminService;

	@Autowired
	private FlightService flightService;
	
	@Autowired
	private TicketService ticketService;
	
	@PostMapping("/admin/login")
	public void adminLogin(@RequestBody String username, @RequestBody String password) {
		adminService.login(username, password);
	}
	
	@PostMapping("/flight/add")
	public void addFlight(@RequestBody Flight flight) {
		flightService.createFlight(flight);
	}
	
	@GetMapping("/flight/search")
	public List<Flight> searchFlight(@RequestBody Date start, @RequestBody Date end,
			@RequestBody String from, @RequestBody String to, @RequestBody String type) {
		return flightService.search(start, end, from, to, type);
	}
	
	@PostMapping("/ticket/booking")
	public void bookTicket(@RequestBody Ticket ticket) {
		ticketService.createTicket(ticket);
	}
	
	@GetMapping("ticket/details/{pnr}")
	public Ticket findTicket(@RequestParam("pnr") Integer pnr) {
		return ticketService.findByPnr(pnr);
	}
	
	@GetMapping("ticket/history/{emailId}")
	public List<Ticket> viewHistory(@RequestParam("emailId") String emailId) {
		return ticketService.findByEmailId(emailId);
	}
	
	@DeleteMapping("ticket/cancel/{pnr}")
	public void cancelTicket(@RequestParam("pnr") Integer pnr) {
		ticketService.deleteTicketByPnr(pnr);
	}
}
