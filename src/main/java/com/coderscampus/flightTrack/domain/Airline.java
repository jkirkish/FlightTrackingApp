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
	@Override
	public String toString() {
		return "Airline [AirlineId=" + AirlineId + ", AirlineName=" + AirlineName + "]";
	}
    
}
