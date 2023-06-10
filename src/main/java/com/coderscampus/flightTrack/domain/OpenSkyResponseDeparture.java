package com.coderscampus.flightTrack.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flight_departures")
public class OpenSkyResponseDeparture {
	
	@Id
	@Column(name = "icao24", nullable = false)
	private String icao24;

	@Column(name = "first_seen")
	private Integer firstSeen;

	@Column(name = "est_departure_airport")
	private String estDepartureAirport;

	@Column(name = "last_seen")
	private Integer lastSeen;

	@Column(name = "est_arrival_airport")
	private String estArrivalAirport;

	@Column(name = "call_sign")
	private String callSign;

	@Column(name = "est_departure_airport_horiz_distance")
	private Integer estDepartureAirportHorizDistance;

	@Column(name = "est_departure_airport_vert_distance")
	private Integer estDepartureAirportVertDistance;

	@Column(name = "est_arrival_airport_horiz_distance")
	private Integer estArrivalAirportHorizDistance;

	@Column(name = "est_arrival_airport_vert_distance")
	private Integer estArrivalAirportVertDistance;

	@Column(name = "departure_airport_candidates_count")
	private Integer departureAirportCandidatesCount;

	@Column(name = "arrival_airport_candidates_count")
	private Integer arrivalAirportCandidatesCount;

	public String getIcao24() {
		return icao24;
	}

	public void setIcao24(String icao24) {
		this.icao24 = icao24;
	}

	public Integer getFirstSeen() {
		return firstSeen;
	}

	public void setFirstSeen(Integer firstSeen) {
		this.firstSeen = firstSeen;
	}

	public String getEstDepartureAirport() {
		return estDepartureAirport;
	}

	public void setEstDepartureAirport(String estDepartureAirport) {
		this.estDepartureAirport = estDepartureAirport;
	}

	public Integer getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(Integer lastSeen) {
		this.lastSeen = lastSeen;
	}

	public String getEstArrivalAirport() {
		return estArrivalAirport;
	}

	public void setEstArrivalAirport(String estArrivalAirport) {
		this.estArrivalAirport = estArrivalAirport;
	}

	public String getCallSign() {
		return callSign;
	}

	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}

	public Integer getEstDepartureAirportHorizDistance() {
		return estDepartureAirportHorizDistance;
	}

	public void setEstDepartureAirportHorizDistance(Integer estDepartureAirportHorizDistance) {
		this.estDepartureAirportHorizDistance = estDepartureAirportHorizDistance;
	}

	public Integer getEstDepartureAirportVertDistance() {
		return estDepartureAirportVertDistance;
	}

	public void setEstDepartureAirportVertDistance(Integer estDepartureAirportVertDistance) {
		this.estDepartureAirportVertDistance = estDepartureAirportVertDistance;
	}

	public Integer getEstArrivalAirportHorizDistance() {
		return estArrivalAirportHorizDistance;
	}

	public void setEstArrivalAirportHorizDistance(Integer estArrivalAirportHorizDistance) {
		this.estArrivalAirportHorizDistance = estArrivalAirportHorizDistance;
	}

	public Integer getEstArrivalAirportVertDistance() {
		return estArrivalAirportVertDistance;
	}

	public void setEstArrivalAirportVertDistance(Integer estArrivalAirportVertDistance) {
		this.estArrivalAirportVertDistance = estArrivalAirportVertDistance;
	}

	public Integer getDepartureAirportCandidatesCount() {
		return departureAirportCandidatesCount;
	}

	public void setDepartureAirportCandidatesCount(Integer departureAirportCandidatesCount) {
		this.departureAirportCandidatesCount = departureAirportCandidatesCount;
	}

	public Integer getArrivalAirportCandidatesCount() {
		return arrivalAirportCandidatesCount;
	}

	public void setArrivalAirportCandidatesCount(Integer arrivalAirportCandidatesCount) {
		this.arrivalAirportCandidatesCount = arrivalAirportCandidatesCount;
	}
}

