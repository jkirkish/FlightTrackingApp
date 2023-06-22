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

import com.coderscampus.flightTrack.domain.OpenSkyResponseArrival;
import com.coderscampus.flightTrack.service.ArrivalService;

@Controller
@RequestMapping("/flights")
public class FlightArrivalsController {

	@Autowired
	private ArrivalService arrivalService;
	
    // GET mapping for displaying the flight arrival list
    @GetMapping("/arrival-list")
    public String getArrivalList(Model model) {
        // Logic to retrieve the arrivals data and pass it to the view
        // Example:
        List<OpenSkyResponseArrival> arrivals = arrivalService.getArrivalList();
        model.addAttribute("arrivals", arrivals);
        return "arrivalList";
    }

    // GET mapping for displaying the flight arrival details
    @GetMapping("/arrivals/{id}")
    public String getArrivalDetails(@PathVariable("id") int id, Model model) {
        // Logic to retrieve the arrival details based on the provided id and pass it to the view
        // Example:
    	OpenSkyResponseArrival arrival = arrivalService.getArrivalById(id);
        model.addAttribute("arrival", arrival);
        return "arrivalDetails";
    }

    // GET mapping for displaying the create form
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("arrival", new OpenSkyResponseArrival());
        return "createArrival";
    }

    // POST mapping for creating a new arrival
    @PostMapping("/create")
    public String createArrival(@ModelAttribute("arrival") OpenSkyResponseArrival arrival) {
        // Logic to create a new arrival based on the provided data
        arrivalService.createArrival(arrival);
        return "redirect:/flights/arrival-list";
    }

    // GET mapping for displaying the update form
    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        // Logic to retrieve the arrival details based on the provided id and pass it to the view
        // Example:
    	OpenSkyResponseArrival arrival = arrivalService.getArrivalById(id);
        model.addAttribute("arrival", arrival);
        return "updateArrival";
    }

    // POST mapping for updating an arrival
    @PostMapping("/update/{id}")
    public String updateArrival(@PathVariable("id") int id, @ModelAttribute("arrival") OpenSkyResponseArrival updatedArrival) {
        // Logic to update the arrival based on the provided data
        arrivalService.updateArrival(id, updatedArrival);
        return "redirect:/flights/arrival-list";
    }

    // POST mapping for deleting an arrival
    @PostMapping("/delete/{id}")
    public String deleteArrival(@PathVariable("id") int id) {
        // Logic to delete the arrival based on the provided id
        arrivalService.deleteArrival(id);
        return "redirect:/flights/arrival-list";
    }
}

