package com.coderscampus.flightTrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderscampus.flightTrack.domain.Address;
import com.coderscampus.flightTrack.domain.OpenSkyResponseDeparture;

public interface AirportOfFlightDeparturesRepository extends JpaRepository<OpenSkyResponseDeparture, Long>{

}
