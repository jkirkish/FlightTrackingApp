package com.coderscampus.flightTrack.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.flightTrack.domain.OpenSkyResponseArrival;
import com.coderscampus.flightTrack.domain.Search;
import com.coderscampus.flightTrack.domain.User;
import com.coderscampus.flightTrack.dto.OpenSkyResponseArrivalDTO;
import com.coderscampus.flightTrack.repository.AirportOfFlightArrivalsRepository;
import com.coderscampus.flightTrack.repository.SearchRepository;
import com.coderscampus.flightTrack.util.EpochConverter;
import com.fasterxml.jackson.databind.ObjectMapper;

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
}
