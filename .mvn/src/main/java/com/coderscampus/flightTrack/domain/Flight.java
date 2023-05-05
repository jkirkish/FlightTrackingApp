package com.coderscampus.flightTrack.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Flight")
public class Flight {
	
	private Long flightId;
	private Long user;
	private boolean departed;
	private boolean arrived;
	private boolean enroute;
	private String airline;
	private String departureAirport;
	private String arrivalAirport;
	private LocalDateTime departure;
	private LocalDateTime arrival;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getFlightId() {
		return flightId;
	}

	public Long getUser() {
		return user;
	}

	public void setUser(Long user) {
		this.user = user;
	}

	public boolean isDeparted() {
		return departed;
	}

	public void setDeparted(boolean departed) {
		this.departed = departed;
	}

	public boolean isArrived() {
		return arrived;
	}

	public void setArrived(boolean arrived) {
		this.arrived = arrived;
	}

	public boolean isEnroute() {
		return enroute;
	}

	public void setEnroute(boolean enroute) {
		this.enroute = enroute;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	public String getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public LocalDateTime getDeparture() {
		return departure;
	}

	public void setDeparture(LocalDateTime departure) {
		this.departure = departure;
	}

	public LocalDateTime getArrival() {
		return arrival;
	}

	public void setArrival(LocalDateTime arrival) {
		this.arrival = arrival;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
}