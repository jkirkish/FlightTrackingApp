package com.coderscampus.flightTrack.service;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.flightTrack.domain.OpenSkyResponseArrival;
import com.coderscampus.flightTrack.domain.Search;
import com.coderscampus.flightTrack.dto.OpenSkyResponseArrivalDTO;
import com.coderscampus.flightTrack.repository.AirportOfFlightArrivalsRepository;
import com.coderscampus.flightTrack.repository.SearchRepository;
import com.coderscampus.flightTrack.util.EpochConverter;

@Service
public class SearchService {

	@Autowired
	private SearchRepository searchRepo;
	@Autowired
	private AirportOfFlightArrivalsRepository arrivalRepository;

	public List<Search> findAll() {
		return searchRepo.findAll();

	}

	public Search save(Search arrival) {
		return searchRepo.save(arrival);
	}

	public Search findById(Long id) {
		Optional<Search> userOpt = searchRepo.findById(id);
		return userOpt.orElse(new Search());
	}

	public void delete(Long Id) {
		searchRepo.deleteById(Id);
	}

	public void initiateSearch(Search search) throws Exception {
		EpochConverter epochConverter = new EpochConverter();
		Long start = epochConverter.humanReadableToEpoch(search.getStartDate());
		String startDate = start.toString();
		System.out.println("StartDate is:" + startDate);
		Long end = epochConverter.humanReadableToEpoch(search.getEndDate());
		String endDate = end.toString();
		System.out.println("EndDate is:" + endDate);
		
		if(search.getSearchType().equalsIgnoreCase("Arrival")) {
		RestTemplate rt = new RestTemplate();
		URI uri = UriComponentsBuilder.fromHttpUrl("https://opensky-network.org/api/flights/arrival")
				.queryParam("airport", search.getAirport()).queryParam("begin", startDate).queryParam("end", endDate)
				.build().toUri();

		ResponseEntity<OpenSkyResponseArrivalDTO[]> response = rt.getForEntity(uri, OpenSkyResponseArrivalDTO[].class);
		OpenSkyResponseArrivalDTO[] flights = response.getBody();

		if (flights != null) {
			for (OpenSkyResponseArrivalDTO flight : flights) {
				OpenSkyResponseArrival arrival = new OpenSkyResponseArrival(flight.getIcao24(), flight.getFirstSeen(),
						flight.getEstDepartureAirport(), flight.getLastSeen(), flight.getEstArrivalAirport(),
						flight.getCallSign(), flight.getEstDepartureAirportHorizDistance(),
						flight.getEstDepartureAirportVertDistance(), flight.getEstArrivalAirportHorizDistance(),
						flight.getEstArrivalAirportVertDistance(), flight.getDepartureAirportCandidatesCount(),
						flight.getArrivalAirportCandidatesCount());

				arrivalRepository.save(arrival);
			}
		}
		
	}
	}
}
