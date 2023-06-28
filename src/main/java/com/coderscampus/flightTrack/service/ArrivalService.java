package com.coderscampus.flightTrack.service;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.flightTrack.domain.OpenSkyResponseArrival;
import com.coderscampus.flightTrack.domain.User;
import com.coderscampus.flightTrack.repository.AirportOfFlightArrivalsRepository;

@Service
public class ArrivalService {

	private final AirportOfFlightArrivalsRepository arrivalsRepository;

    @Autowired
    public ArrivalService(AirportOfFlightArrivalsRepository arrivalsRepository) {
        this.arrivalsRepository = arrivalsRepository;
    }

    public List<OpenSkyResponseArrival> findAll() {
        return arrivalsRepository.findAll();
    }

    public OpenSkyResponseArrival findById(Long id) {
    	Optional<OpenSkyResponseArrival> arrivalOpt = arrivalsRepository.findById(id);
        return arrivalOpt.orElse(new OpenSkyResponseArrival());
    	
    }

    public OpenSkyResponseArrival save(OpenSkyResponseArrival arrival) {
    	return arrivalsRepository.save(arrival);
    }

    public void delete(Long id) {
        arrivalsRepository.deleteById(id);
    }
}

