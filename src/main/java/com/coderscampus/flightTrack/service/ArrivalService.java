package com.coderscampus.flightTrack.service;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.flightTrack.domain.OpenSkyResponseArrival;
import com.coderscampus.flightTrack.repository.AirportOfFlightArrivalsRepository;

@Service
public class ArrivalService {

	private final AirportOfFlightArrivalsRepository arrivalsRepository;

    @Autowired
    public ArrivalService(AirportOfFlightArrivalsRepository arrivalsRepository) {
        this.arrivalsRepository = arrivalsRepository;
    }

    public List<OpenSkyResponseArrival> getArrivalList() {
        return arrivalsRepository.findAll();
    }

    public OpenSkyResponseArrival getArrivalById(Long id) {
        return arrivalsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid arrival ID: " + id));
    }

    public void createArrival(OpenSkyResponseArrival arrival) {
//    	RestTemplate rt = new RestTemplate();
//	    URI uri = UriComponentsBuilder.fromHttpUrl("https://opensky-network.org/api/flights/arrival")
//	    					 .queryParam("airport","KIAD")
//	    					 .queryParam("begin","1685832444")
//	    					 .queryParam("end","1686005244")
//	    					 .build()
//	    					 .toUri();
//	    
//	    
//	   
//	    	ResponseEntity<String>response = rt.getForEntity(uri, String.class);
//	    	System.out.println(response);
        arrivalsRepository.save(arrival);
    }

    public void updateArrival(Long id, OpenSkyResponseArrival updatedArrival) {
        OpenSkyResponseArrival existingArrival = arrivalsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid arrival ID: " + id));

        // Update the fields of the existing arrival entity with the new values
        existingArrival.setIcao24(updatedArrival.getIcao24());
        existingArrival.setFirstSeen(updatedArrival.getFirstSeen());
     

        arrivalsRepository.save(existingArrival);
    }

    public void deleteArrival(Long id) {
        arrivalsRepository.deleteById(id);
    }
}

