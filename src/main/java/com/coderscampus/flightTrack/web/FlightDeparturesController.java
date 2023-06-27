package com.coderscampus.flightTrack.web;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coderscampus.flightTrack.domain.OpenSkyResponseDeparture;
import com.coderscampus.flightTrack.service.DepartureService;

@Controller
@RequestMapping("/flights")
public class FlightDeparturesController {

	@Autowired
	private DepartureService departService;
	
	
	
    // GET mapping for displaying the flight departure list
    @GetMapping("/departure-list")
    public String getDepartureList(Model model) {
        // Logic to retrieve the departures data and pass it to the view
        // Example:
        List<OpenSkyResponseDeparture> departures = departService.getDepartureList();
        model.addAttribute("departures", departures);
        return "departureList";
    }

    // GET mapping for displaying the flight departure details
    @GetMapping("/departures/{id}")
    public String getDepartureDetails(@PathVariable("id") Long id, Model model) {
        // Logic to retrieve the departure details based on the provided id and pass it to the view
        // Example:
    	OpenSkyResponseDeparture departure = departService.getDepartureById(id);
        model.addAttribute("departure", departure);
        return "departureDetails";
    }

    // GET mapping for displaying the create form
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("departure", new OpenSkyResponseDeparture());
        return "createDeparture";
    }

    // POST mapping for creating a new departure
    @PostMapping("/create")
    public String createDeparture(@ModelAttribute("departure") OpenSkyResponseDeparture departure) {
        // Logic to create a new departure based on the provided data
        departService.createDeparture(departure);
        return "redirect:/flights/departure-list";
    }

    // GET mapping for displaying the update form
    @GetMapping("/update/{id}")
    public String showDeparture(@PathVariable("id") Long id, Model model) {
        // Logic to retrieve the departure details based on the provided id and pass it to the view
        // Example:
    	OpenSkyResponseDeparture departure = departService.getDepartureById(id);
        model.addAttribute("departure", departure);
        return "updateDeparture";
    }

    // POST mapping for updating a departure
    @PostMapping("/update/{id}")
    public String updateDeparture(@PathVariable("id") Long id, @ModelAttribute("departure") OpenSkyResponseDeparture updatedDeparture) {
        // Logic to update the departure based on the provided data
        departService.updateDeparture(id, updatedDeparture);
        return "redirect:/flights/departure-list";
    }

    // POST mapping for deleting a departure
    @PostMapping("/delete/{id}")
    public String deleteDeparture(@PathVariable("id") Long id) {
        // Logic to delete the departure based on the provided id
        departService.deleteDeparture(id);
        return "redirect:/flights/departure-list";
    }
}
