package com.coderscampus.flightTrack.web;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/flights")
public class FlightController {

    // GET mapping for displaying the flight departure list
    @GetMapping("/departure-list")
    public String getDepartureList(Model model) {
        // Logic to retrieve the departures data and pass it to the view
        // Example:
        List<OpenSkyResponseDeparture> departures = flightService.getDepartureList();
        model.addAttribute("departures", departures);
        return "departureList";
    }

    // GET mapping for displaying the flight departure details
    @GetMapping("/departures/{id}")
    public String getDepartureDetails(@PathVariable("id") int id, Model model) {
        // Logic to retrieve the departure details based on the provided id and pass it to the view
        // Example:
    	OpenSkyResponseDeparture departure = flightService.getDepartureById(id);
        model.addAttribute("departure", departure);
        return "departureDetails";
    }

    // GET mapping for displaying the create form
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("departure", new Departure());
        return "createDeparture";
    }

    // POST mapping for creating a new departure
    @PostMapping("/create")
    public String createDeparture(@ModelAttribute("departure") OpenSkyResponseDeparture departure) {
        // Logic to create a new departure based on the provided data
        flightService.createDeparture(departure);
        return "redirect:/flights/departure-list";
    }

    // GET mapping for displaying the update form
    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        // Logic to retrieve the departure details based on the provided id and pass it to the view
        // Example:
    	OpenSkyResponseDeparture departure = flightService.getDepartureById(id);
        model.addAttribute("departure", departure);
        return "updateDeparture";
    }

    // POST mapping for updating a departure
    @PostMapping("/update/{id}")
    public String updateDeparture(@PathVariable("id") int id, @ModelAttribute("departure") OpenSkyResponseDeparture updatedDeparture) {
        // Logic to update the departure based on the provided data
        flightService.updateDeparture(id, updatedDeparture);
        return "redirect:/flights/departure-list";
    }

    // POST mapping for deleting a departure
    @PostMapping("/delete/{id}")
    public String deleteDeparture(@PathVariable("id") int id) {
        // Logic to delete the departure based on the provided id
        flightService.deleteDeparture(id);
        return "redirect:/flights/departure-list";
    }
}

