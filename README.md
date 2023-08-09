# FlightTrackingApp
Citation and Terms of Use¶
If you create a publication (including web pages, papers published by a third party, and publicly available presentations) using data from the OpenSky Network data set, you should cite the original OpenSky paper as follows:

Matthias Schäfer, Martin Strohmeier, Vincent Lenders, Ivan Martinovic and Matthias Wilhelm.
"Bringing Up OpenSky: A Large-scale ADS-B Sensor Network for Research".
In Proceedings of the 13th IEEE/ACM International Symposium on Information Processing in Sensor Networks 

OpenSky REST API¶
The root URL of our REST API is:

https://opensky-network.org/api

Airplanes seen by the OpenSky Network are associated with flight state information derived from ADS-B and Mode S messages. The state of an aircraft is a summary of all tracking information (mainly position, velocity, and identity) 
at a certain point in time. These states of aircraft can be retrieved as state vectors in the form of a JSON object.
Limitiations for anonymous (unauthenticated) users¶


Anonymous are those users who access the API without using credentials. The limitations for anonymous users are:
Anonymous users can only get the most recent state vectors, i.e. the time parameter will be ignored.
Anonymous users can only retrieve data with a time resolution of 10 seconds. That means, the API will return state vectors for time 
.Anonymous users get 400 API credits per day (see credit usage below).

Limitations for OpenSky users¶
An OpenSky user is anybody who uses a valid OpenSky account (see below) to access the API. The rate limitations for OpenSky users are:
OpenSky users can retrieve data of up to 1 hour in the past. If the time parameter has a value 
the API will return 400 Bad Request.

OpenSky users can retrieve data with a time resolution of 5 seconds. That means, if the time parameter was set to 
,the API will return state vectors for time.
OpenSky users get 4000 API credits per day. For higher request loads please contact OpenSky.
Active contributing OpenSky users get a total of 8000 API credits per day. An active user is a user which has an ADS-B receiver that is at least 30% online (measured over the current month).

https://openskynetwork.github.io/opensky-api/rest.html

Here is a youtube demo video
https://youtu.be/3yu7cZt4lSk

