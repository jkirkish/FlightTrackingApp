# Flight Tracking App ()
Flight aware API documentation source(https://flightaware.com/aeroapi/portal/documentation#overview) 
1) This app will have a user database that stores users login username and password
2) tables will include users, airports, airlines
3) Several Screens
     1) Register screen 
     2) Login Screen
     3) Flight tracking on a map screen for any flight(aircraft private owners)
          GET /flights/{id}/map
          GET /flights/{id}/position
          GET /flights/{id}/route
          GET /flights/{id}/track
          GET /flights/{idents
          POST /flights/{ident}/intents
          GET /flights/search
          "Returns a flight's track as a base64-encoded image. Image can contain a variety of additional data layers beyond just the track. Data from up to 10 days              ago can be obtained. If looking for older data, please use the corresponding historical endpoint."
     4) (Airlines operators screen) 
          GET /operators
          GET /operators/{id}
          GET /operators/{id}/flights
          GET /operators/{id}/flights/arrivals
          GET /operators/{id}/flights/enroute
          GET /operators/{id}/flights/scheduled
          GET /history/flights/{ident}
          "Returns list of operator references (ICAO/IATA codes and URLs to access more information)."
     5) Airports screen
        GET /airports
        GET /airports/{id}
        GET /airports/{id}/delays
        GET /airports/{id}/flights
        GET /airports/{id}/flights/arrivals
        GET /airports/{id}/flights/counts
        GET /airports/{id}/flights/departures
        GET /airports/{id}/flights/scheduled_arrivals
        GET /airports/{id}/flights/scheduled_departures
        GET /airports/{id}/flights/to/{dest_id}
        GET /airports/{id}/weather/forecast
        GET /airports/{id}/weather/observations
        "Returns the ICAO identifiers of all known airports. For airports that do not have an ICAO identifier, the FAA LID identifier will be used. Links for further          information about each airport are included."
  
 
  
   
