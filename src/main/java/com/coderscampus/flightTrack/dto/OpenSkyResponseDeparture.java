package com.coderscampus.flightTrack.dto;

public class OpenSkyResponseDeparture {
	
	private String icao24;
	private Integer firstSeen;
	private String estDepartureAirport;
	private Integer lastSeen;
	private String estArrivalAirport;
	private String callSign;
	private Integer estDepartureAirportHorizDistance;
	private Integer estDepartureAirportVertDistance;
	private Integer estArrivalAirportHorizDistance;
	private Integer estArrivalAirportVertDistance;
	private Integer departureAirportCandidatesCount;
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
