package com.coderscampus.flightTrack.service;

import java.io.IOException;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.flightTrack.domain.Search;
import com.coderscampus.flightTrack.domain.User;
import com.coderscampus.flightTrack.repository.SearchRepository;

@Service
public class SearchService {
	
	@Autowired
	private SearchRepository searchRepo;

	public List<Search> findAll() {
		return searchRepo.findAll();
		
	}
	public Search save(Search search) {
		return searchRepo.save(search);
	}
//	public void openskyExampleArrivalAirport() throws IOException{
//		/*Retrieve flights for a certain airport which arrived within a given time interval [begin, end]. 
//		 * If no flights are found for the given period, HTTP stats 404 - Not found is returned with an 
//		 * empty response body.
//		 * The given time interval must not be larger than seven days!
//		 */
//		RestTemplate rt = new RestTemplate();
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
//	}

}
