package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "start")
	private Date start;
	
	@Column(name = "end")
	private Date end;
	
	@Column(name = "from")
	private String from;
	
	@Column(name = "to")
	private String to;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "airline")
	private String airline;
	
	@Column(name = "price")
	private Double price;
	
	@OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
	private List<Ticket> tickets;

	public Flight(Integer id, Date start, Date end, String from, String to, String type, String airline, Double price,
			List<Ticket> tickets) {
		super();
		this.id = id;
		this.start = start;
		this.end = end;
		this.from = from;
		this.to = to;
		this.type = type;
		this.airline = airline;
		this.price = price;
		this.tickets = tickets;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", start=" + start + ", end=" + end + ", from=" + from + ", to=" + to + ", type="
				+ type + ", airline=" + airline + ", price=" + price + ", tickets=" + tickets + "]";
	}
}
