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
	private String airportName;
	private String icaoCode;
	private String city;
	private String country;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getAirportId() {
		return airportId;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getIcaoCode() {
		return icaoCode;
	}

	public void setIcaoCode(String icaoCode) {
		this.icaoCode = icaoCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setAirportId(Long airportId) {
		this.airportId = airportId;
	}

	@Override
	public String toString() {
		return "Airports [airportId=" + airportId + ", airportName=" + airportName + ", icaoCode=" + icaoCode
				+ ", city=" + city + ", country=" + country + "]";
	}
	
	
}
