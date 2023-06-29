package com.coderscampus.flightTrack.service;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.flightTrack.domain.Search;
import com.coderscampus.flightTrack.repository.SearchRepository;
import com.coderscampus.flightTrack.util.EpochConverter;

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

   public void initiateSearch(String airport, String startDate, String endDate) throws Exception{
	   EpochConverter epochConvert = new EpochConverter();
	   
	  
	   RestTemplate rt = new RestTemplate();
	    URI uri = UriComponentsBuilder.fromHttpUrl("https://opensky-network.org/api/flights/arrival")
	    					 .queryParam("airport",airport)
	    					 .queryParam("begin",epochConvert.humanReadableToEpoch(startDate))
	    					 .queryParam("end", epochConvert.humanReadableToEpoch(endDate))
	    					 .build()
	    					 .toUri();
	    	ResponseEntity<String>response = rt.getForEntity(uri, String.class);
	    	System.out.println(response);
	    	
	    	/* ResponseEntity<String> response = rt.getForEntity(uri, String.class);
    String jsonResponse = response.getBody();
    
    // Parse the JSON response and convert it into an instance of your model/entity class
    ObjectMapper objectMapper = new ObjectMapper();
    OpenSkyResponseArrivalDTO arrivalDTO = objectMapper.readValue(jsonResponse, OpenSkyResponseArrivalDTO.class);
    
    // Convert the DTO to entity
    OpenSkyResponseArrival arrivalEntity = mapDTOtoEntity(arrivalDTO);
    
    // Save the entity to the JPA repository
    arrivalRepository.save(arrivalEntity);
	    	 * 
	    	 * 
	    	 */
	   
   }
}
