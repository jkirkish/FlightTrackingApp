package com.coderscampus.flightTrack.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.coderscampus.flightTrack.domain.OpenSkyResponseArrival;
import com.coderscampus.flightTrack.service.ArrivalService;

@Controller
public class FlightArrivalsController {

	@Autowired
	private ArrivalService arrivalService;
	
    
	
	
    @GetMapping("/arrivals")
    public String getArrivalList(ModelMap model) {
        List<OpenSkyResponseArrival> arrivals = arrivalService.findAll();
        model.put("arrivals", arrivals);
        return "arrivals";
    }

    
    @GetMapping("/arrivals/{id}")
    public String getArrivalDetails(ModelMap model, @PathVariable Long id) {
    	OpenSkyResponseArrival arrival = arrivalService.findById(id);
        model.put("arrival", arrival);
        return "arrivals";
    }

    
    @GetMapping("/update/{id}")
    public String showUpdatedArrival(ModelMap model, @PathVariable Long id) {
    	OpenSkyResponseArrival arrival = arrivalService.findById(id);
        model.put("arrival", arrival);
        return "Arrivals";
    }

    
    @PostMapping("/update/{id}")
    public String updateArrival(@PathVariable Long id, OpenSkyResponseArrival updatedArrival) {
        arrivalService.save(updatedArrival);
        return "redirect:/arrivals/" +updatedArrival.getId();
    }

    
    @PostMapping("/delete/{id}")
    public String deleteArrival(@PathVariable Long id) {
        arrivalService.delete(id);
        return "redirect:/arrivals";
    }
}

