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
public class FlightDeparturesController {

	@Autowired
	private DepartureService departService;
	
	
	
    // GET mapping for displaying the flight departure list
    @GetMapping("/departures")
    public String getDepartureList(Model model) {
        // Logic to retrieve the departures data and pass it to the view
        // Example:
        List<OpenSkyResponseDeparture> departures = departService.getDepartureList();
        model.addAttribute("departures", departures);
        return "departures";
    }

    // GET mapping for displaying the flight departure details
    @GetMapping("/departures/{id}")
    public String getDepartureDetails(@PathVariable("id") Long id, Model model) {
        // Logic to retrieve the departure details based on the provided id and pass it to the view
        // Example:
    	OpenSkyResponseDeparture departure = departService.getDepartureById(id);
        model.addAttribute("departure", departure);
        return "/departures/{id}";
    }

    

    }

    

   

