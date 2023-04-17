package com.coderscampus.flightTrack.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Airport")
public class Airports {

	private Long airportId;
	private String fourLetterAirportId;
	private String airportRegularName;
	private String City;
	private String Country;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getAirportId() {
		return airportId;
	}
	public void setAirportId(Long airportId) {
		this.airportId = airportId;
	}
	public String getFourLetterAirportId() {
		return fourLetterAirportId;
	}
	public void setFourLetterAirportId(String fourLetterAirportId) {
		this.fourLetterAirportId = fourLetterAirportId;
	}
	public String getAirportRegularName() {
		return airportRegularName;
	}
	public void setAirportRegularName(String airportRegularName) {
		this.airportRegularName = airportRegularName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "Airports [airportId=" + airportId + ", fourLetterAirportId=" + fourLetterAirportId
				+ ", airportRegularName=" + airportRegularName + ", City=" + City + ", Country=" + Country + "]";
	}
	
	
}
