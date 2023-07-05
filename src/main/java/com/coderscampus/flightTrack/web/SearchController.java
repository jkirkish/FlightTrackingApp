package com.coderscampus.flightTrack.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.coderscampus.flightTrack.domain.OpenSkyResponseArrival;
import com.coderscampus.flightTrack.domain.OpenSkyResponseDeparture;
import com.coderscampus.flightTrack.domain.Search;
import com.coderscampus.flightTrack.domain.User;
import com.coderscampus.flightTrack.service.SearchService;
import com.coderscampus.flightTrack.service.UserService;

@Controller
public class SearchController {
	
	
	@Autowired
	private SearchService searchService;
	
	@GetMapping("/arrivalSearchRequests")
	public String getallSearchRequests(ModelMap model){
		List<Search> search = searchService.findAll();
		model.put("arrivalSearch", search);
		return "arrivalSearchRequests";
	}
	
	@GetMapping("/airportArrivalSearch")
	public String getAirportArrivalSearches(ModelMap model) {
		model.put("arrivalSearch", new Search());
		return "airportArrivalSearch";
	}
	
	@PostMapping("/airportArrivalSearch")
	public String saveSearch(Search search) throws Exception {
		searchService.save(search);
		searchService.initiateSearch(search);
		return "redirect:/airportArrivalSearch";
	}
	 @PostMapping("/airportArrivalSearch/{id}/delete")
	   public String deleteSearch(@PathVariable Long id) {
		   searchService.delete(id);
		   return "redirect:/airportArrivalSearch";
	   }
			
		
	}


