# Flight Tracking App (API Key GpnSYSf1d2xK8eeteSPjWJkEHBbBnrQo)
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
     4) (Airlines operators screen) 
          GET /operators
          GET /operators/{id}
          GET /operators/{id}/flights
          GET /operators/{id}/flights/arrivals
          GET /operators/{id}/flights/enroute
          GET /operators/{id}/flights/scheduled
          GET /history/flights/{ident}
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
  
 
  
   
