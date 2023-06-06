package com.coderscampus.flightTrack;

import java.net.URI;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//https://openskynetwork.github.io/opensky-api/rest.html
public class OpenSkyIntegrationAPITest {
	@Test
	public void callOpenSkyExample() {
		
		RestTemplate rt = new RestTemplate();
	    URI uri = UriComponentsBuilder.fromHttpUrl("https://opensky-network.org/api/states/all")
	    					 .build()
	    					 .toUri();
	    
	    ResponseEntity<String>response = rt.getForEntity(uri, String.class);
	    System.out.println(response);
	}@Test
	public void callOpenSkyExampleflights() {
//		begin
//
//		integer
//
//		Start of time interval to retrieve flights for as Unix time (seconds since epoch)
//
//		end
//      https://www.epochconverter.com/
//		integer
//		End of time interval to retrieve flights for as Unix time (seconds since epoch)
		RestTemplate rt = new RestTemplate();
	    URI uri = UriComponentsBuilder.fromHttpUrl("https://opensky-network.org/api/flights/all")
	    					 .queryParam("begin","1685991864")
	    					 .queryParam("end","1685999064")
	    					 .build()
	    					 .toUri();
	    
	    ResponseEntity<String>response = rt.getForEntity(uri, String.class);
	    System.out.println(response);
	}
	@Test
	public void openskyExampleAircraft() {
		RestTemplate rt = new RestTemplate();
	    URI uri = UriComponentsBuilder.fromHttpUrl("https://opensky-network.org/api/flights/aircraft")
	    					 .queryParam("icao24","3c666b")
	    					 .queryParam("begin","1685991864")
	    					 .queryParam("end","1685999064")
	    					 .build()
	    					 .toUri();
	    
	    
	    ObjectMapper mapper = new ObjectMapper();
	    try {
	    	ResponseEntity<String>response = rt.getForEntity(uri, String.class);
	    	System.out.println(mapper.writeValueAsString(response));
	    }catch(JsonProcessingException e) {
	      e.printStackTrace();
	   
	}
	}
}
