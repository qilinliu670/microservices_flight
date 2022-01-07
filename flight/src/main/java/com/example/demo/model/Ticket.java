package com.example.demo.model;

import java.util.ArrayList;
import javax.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@ManyToOne
	@JoinColumn(name="flight_id")
	private Flight flight;
	
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

	public Ticket(Integer id, Flight flight, String name, String emailId, Integer numSeats,
			ArrayList<Passenger> passengers, Integer pnr) {
		super();
		this.id = id;
		this.flight = flight;
		this.name = name;
		this.emailId = emailId;
		this.numSeats = numSeats;
		this.passengers = passengers;
		this.pnr = pnr;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
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
		return "Ticket [id=" + id + ", flight=" + flight + ", name=" + name + ", emailId=" + emailId + ", numSeats="
				+ numSeats + ", passengers=" + passengers + ", pnr=" + pnr + "]";
	}

}
