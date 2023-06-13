package com.coderscampus.flightTrack.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartureService {
    private List<Departure> departures;

    public DepartureService() {
        // Initialize departures or retrieve them from a database
    }

    public List<Departure> getDepartureList() {
        return departures;
    }

    public Departure getDepartureById(int id) {
        // Logic to retrieve a departure by its id
    }

    public void createDeparture(Departure departure) {
        // Logic to create a new departure
    }

    public void updateDeparture(int id, Departure updatedDeparture) {
        // Logic to update an existing departure by its id
    }

    public void deleteDeparture(int id) {
        // Logic to delete a departure by its id
    }
}
