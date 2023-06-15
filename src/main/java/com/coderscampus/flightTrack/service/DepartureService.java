package com.coderscampus.flightTrack.service;

import org.springframework.stereotype.Service;

import com.coderscampus.flightTrack.domain.OpenSkyResponseDeparture;

import java.util.List;

@Service
public class DepartureService {
    private List<OpenSkyResponseDeparture> departures;

    public DepartureService() {
        // Initialize departures or retrieve them from a database
    }

    public List<OpenSkyResponseDeparture> getOpenSkyResponseDepartureList() {
        return departures;
    }

    public OpenSkyResponseDeparture getOpenSkyResponseDepartureById(int id) {
             
    }

    public void createOpenSkyResponseDeparture(OpenSkyResponseDeparture departure) {
        // Logic to create a new departure
    }

    public void updateOpenSkyResponseDeparture(int id, OpenSkyResponseDeparture updatedOpenSkyResponseDeparture) {
        // Logic to update an existing departure by its id
    }

    public void deleteOpenSkyResponseDeparture(int id) {
        // Logic to delete a departure by its id
    }
}
