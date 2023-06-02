package com.coderscampus.flightTrack.flightaware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FlightAwareIntegration {
	
	
		public static void main(String[] args) {
	        String baseUrl = "https://aeroapi.flightaware.com/aeroapi";
	        String apiKey = "";//"YOUR_API_KEY"; // Replace with your actual API key

	        // Example request to get the canonical code for an airport
	        String airportId = "KIAH"; // Replace with the desired airport ID
	        String airportCanonicalUrl = baseUrl + "/airports/" + airportId + "/canonical";
	        makeApiRequest(airportCanonicalUrl, apiKey);

	        // Example request to get the canonical code for a flight
	        String flightIdent = "UAL93"; // Replace with the desired flight ident
	        String flightCanonicalUrl = baseUrl + "/flights/" + flightIdent + "/canonical";
	        makeApiRequest(flightCanonicalUrl, apiKey);

	        // Example request to get the canonical code for an operator
	        String operatorId = "UAL"; // Replace with the desired operator ID
	        String operatorCanonicalUrl = baseUrl + "/operators/" + operatorId + "/canonical";
	        makeApiRequest(operatorCanonicalUrl, apiKey);
	    }

	    public static void makeApiRequest(String apiUrl, String apiKey) {
	        try {
	            // Create URL object with the specific API endpoint
	            URL url = new URL(apiUrl);

	            // Open connection
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.setRequestMethod("GET");

	            // Set API key as a request header
	            connection.setRequestProperty("X-API-Key", apiKey);

	            // Read response
	            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	            String line;
	            StringBuilder response = new StringBuilder();
	            while ((line = reader.readLine()) != null) {
	                response.append(line);
	            }
	            reader.close();

	            // Print the response
	            System.out.println(response.toString());

	            // Close connection
	            connection.disconnect();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
