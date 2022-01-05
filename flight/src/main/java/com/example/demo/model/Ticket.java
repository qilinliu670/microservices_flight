package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket {

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
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "emailId")
	private String emailId;
	
	@Column(name = "numSeats")
	private Integer numSeats;
	
	@Column(name = "passengers")
	private ArrayList<Passenger> passengers;
	
	@Column(name = "pnr")
	private Integer pnr;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(Integer numSeats) {
		this.numSeats = numSeats;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}

	public Integer getPnr() {
		return pnr;
	}

	public void setPnr(Integer pnr) {
		this.pnr = pnr;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", start=" + start + ", end=" + end + ", from=" + from + ", to=" + to + ", type="
				+ type + ", airline=" + airline + ", price=" + price + ", name=" + name + ", emailId=" + emailId
				+ ", numSeats=" + numSeats + ", passengers=" + passengers + ", pnr=" + pnr + "]";
	}
}
