package com.coderscampus.flightTrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderscampus.flightTrack.domain.OpenSkyResponseArrival;


public interface AirportOfFlightArrivalsRepository extends JpaRepository<OpenSkyResponseArrival, Long>{

}
