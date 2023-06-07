package com.coderscampus.flightTrack;

import java.io.IOException;
import java.net.URI;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
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
	public void callOpenSkyExampleAllflights() throws JsonMappingException, JsonProcessingException {
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
    	ObjectMapper objectMapper = new ObjectMapper();
    	objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    	String formattedResponse = objectMapper.readValue(response.getBody(), Object.class).toString();
    	System.out.println(formattedResponse);
	}
	
@Test
public void openskyExampleArrivalAirport() throws IOException{
		/*Retrieve flights for a certain airport which arrived within a given time interval [begin, end]. 
		 * If no flights are found for the given period, HTTP stats 404 - Not found is returned with an 
		 * empty response body.
		 * The given time interval must not be larger than seven days!
		 */
		RestTemplate rt = new RestTemplate();
	    URI uri = UriComponentsBuilder.fromHttpUrl("https://opensky-network.org/api/flights/arrival")
	    					 .queryParam("airport","kCMH")
	    					 .queryParam("begin","1685898028")
	    					 .queryParam("end","1685984428")
	    					 .build()
	    					 .toUri();
	    
	    
	   
	    	ResponseEntity<String>response = rt.getForEntity(uri, String.class);
	    	ObjectMapper objectMapper = new ObjectMapper();
	    	objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
	    	String formattedResponse = objectMapper.readValue(response.getBody(), Object.class).toString();
	    	System.out.println(formattedResponse);
	}
@Test
public void openskyExampleDepartureAirport() throws IOException{
		/*Retrieve flights for a certain airport which departure within a given time interval [begin, end]. 
		 * If no flights are found for the given period, HTTP stats 404 - Not found is returned with an 
		 * empty response body.
		 * The given time interval must not be larger than seven days!
		 */
		RestTemplate rt = new RestTemplate();
	    URI uri = UriComponentsBuilder.fromHttpUrl("https://opensky-network.org/api/flights/departure")
	    					 .queryParam("airport","kCMH")
	    					 .queryParam("begin","1685898028")
	    					 .queryParam("end","1685984428")
	    					 .build()
	    					 .toUri();
	    
	    
	   
	    	ResponseEntity<String>response = rt.getForEntity(uri, String.class);
	    	ObjectMapper objectMapper = new ObjectMapper();
	    	objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
	    	String formattedResponse = objectMapper.readValue(response.getBody(), Object.class).toString();
	    	System.out.println(formattedResponse);
	}
@Test
public void openskyExampleforAircraft() throws IOException{
		RestTemplate rt = new RestTemplate();
		URI uri = UriComponentsBuilder.fromHttpUrl("https://opensky-network.org/api/flights/aircraft")
									  .queryParam("icao24","a3614c")
									  .queryParam("begin","1685898028")
									  .queryParam("end","1685984428")
									  .build()
									  .toUri();
		ResponseEntity<String>response = rt.getForEntity(uri, String.class);
    	ObjectMapper objectMapper = new ObjectMapper();
    	objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    	String formattedResponse = objectMapper.readValue(response.getBody(), Object.class).toString();
    	System.out.println(formattedResponse);
}
}
