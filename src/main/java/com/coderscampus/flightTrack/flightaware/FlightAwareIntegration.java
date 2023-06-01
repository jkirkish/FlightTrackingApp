package com.coderscampus.flightTrack.flightaware;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class FlightAwareIntegration {
	
//	static String AEROAPI_BASE_URL = "https://aeroapi.flightaware.com/aeroapi";
//    static String AEROAPI_KEY = "";
//	
//	@Test
//	public void callAirportId() {
//		
//		RestTemplate rt = new RestTemplate();
//		URI uri = UriComponentsBuilder.fromHttpUrl("https://aeroapi.flightaware.com/aeroapi/airports/{KIAH}")
//		                    .queryParam("airport_code*",String.class)
//		                    .queryParam("alternate_ident",String.class)
//		                    .queryParam("code_icao",String.class)
//		                    .queryParam("code_lid",String.class)
//		                    .queryParam("name",String.class)
//		                    .queryParam("type","enum")
//		                    .queryParam("elevation",Integer.class)
//		                    .queryParam("city",String.class)
//		                    .queryParam("state",String.class)
//		                    .queryParam("longitude",Double.class)
//		                    .queryParam("latitude",Double.class)
//		                    .queryParam("timezone",String.class)
//		                    .queryParam("country_code",String.class)
//		                    //.queryParam("wiki_url",uri)
//		                    //.queryParam("airport_flights_url",uri)
//		                    .queryParam("apikey","AEROAPI_KEY")
//		                    .build()
//		                    .toUri();
//		ResponseEntity<String> response = rt.getForEntity(uri, String.class);
//		System.out.println(response);
//	}

}
//String YOUR_API_KEY = "API_KEY_HERE";
//String apiUrl = "https://aeroapi.flightaware.com/aeroapi/";
//
//String airport = "KSFO";
//
//HttpClient client = HttpClient.newHttpClient();
//HttpRequest request = HttpRequest.newBuilder()
//	.uri(URI.create(apiUrl + "airports/" + airport + "/flights"))
//	.headers("x-apikey", YOUR_API_KEY)
//	.build();
//HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
//https://squoosh.app/  lighthouse score
//if (response.statusCode() == 200) {
//	System.out.println("responseBody: " + response.body());


//{https://stackoverflow.com/questions/30924271/correct-way-to-define-array-of-enums-in-json-schema
//	  "airport_code": "KIAH",
//	  "alternate_ident": "IAH",
//	  "code_icao": "KIAH",
//	  "code_iata": "IAH",
//	  "code_lid": "IAH",
//	  "name": "Houston Bush Int'ctl",
//	  "type": "Airport",
//	  "elevation": 95,
//	  "city": "Houston",
//	  "state": "TX",
//	  "longitude": -95.3414425,
//	  "latitude": 29.9844353,
//	  "timezone": "America/Chicago",
//	  "country_code": "US",
//	  "wiki_url": "http://en.wikipedia.org/wiki/George_Bush_Intercontinental_Airport",
//	  "airport_flights_url": "/airports/KIAH/flights",
//	  "alternatives": []
//UX idea ( templates, railway publishing get feedback, chatGpt, dummy data
//	}