package com.coderscampus.flightTrack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

