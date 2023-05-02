package com.coderscampus.flightTrack.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Airline")
public class Airline {
	
	private Long AirlineId;
	private String AirlineName;
	private String IcaoCode;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getAirlineId() {
		return AirlineId;
	}
	public void setAirlineId(Long airlineId) {
		AirlineId = airlineId;
	}
	public String getAirlineName() {
		return AirlineName;
	}
	public void setAirlineName(String airlineName) {
		AirlineName = airlineName;
	}
	public String getIcaoCode() {
		return IcaoCode;
	}
	public void setIcaoCode(String icaoCode) {
		IcaoCode = icaoCode;
	}
	@Override
	public String toString() {
		return "Airline [AirlineId=" + AirlineId + ", AirlineName=" + AirlineName + "]";
	}
    
}
