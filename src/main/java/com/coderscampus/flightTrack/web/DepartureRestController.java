package com.coderscampus.flightTrack.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.flightTrack.domain.OpenSkyResponseDeparture;
import com.coderscampus.flightTrack.dto.OpenSkyResponseDepartureDTO;
import com.coderscampus.flightTrack.repository.AirportOfFlightDeparturesRepository;

@RestController
@RequestMapping("/api/departures")
public class DepartureRestController {

	
	private final AirportOfFlightDeparturesRepository departureRepository;

    @Autowired
    public DepartureRestController(AirportOfFlightDeparturesRepository departureRepository) {
        this.departureRepository = departureRepository;
    }
	
	
    @GetMapping
    public List<OpenSkyResponseDepartureDTO> getDepartures() {
        // Simulating retrieval of departures from a data source
        List<OpenSkyResponseDepartureDTO> departures = new ArrayList<>();

       


        // Save departures to JPA repository
        List<OpenSkyResponseDeparture> departureEntities = new ArrayList<>();
        for (OpenSkyResponseDepartureDTO departureDTO : departures) {
            OpenSkyResponseDeparture departureEntity = mapDTOtoEntity(departureDTO);
            departureEntities.add(departureEntity);
        }
        departureRepository.saveAll(departureEntities);
        
        // Convert departureEntities back to DTOs
        List<OpenSkyResponseDepartureDTO> savedDepartures = new ArrayList<>();
        for (OpenSkyResponseDeparture departureEntity : departureEntities) {
            OpenSkyResponseDepartureDTO departureDTO = mapEntityToDTO(departureEntity);
            savedDepartures.add(departureDTO);
        }

        return departures;
    }
    private OpenSkyResponseDeparture mapDTOtoEntity(OpenSkyResponseDepartureDTO departureDTO) {
    	OpenSkyResponseDeparture departureEntity = new OpenSkyResponseDeparture();
        departureEntity.setIcao24(departureDTO.getIcao24());
        departureEntity.setFirstSeen(departureDTO.getFirstSeen());
        departureEntity.setEstDepartureAirport(departureDTO.getEstDepartureAirport());
        departureEntity.setLastSeen(departureDTO.getLastSeen());
        departureEntity.setEstArrivalAirport(departureDTO.getEstArrivalAirport());
        departureEntity.setCallSign(departureDTO.getCallSign());
        departureEntity.setEstDepartureAirportHorizDistance(departureDTO.getEstDepartureAirportHorizDistance());
        departureEntity.setEstDepartureAirportVertDistance(departureDTO.getEstDepartureAirportVertDistance());
        departureEntity.setEstArrivalAirportHorizDistance(departureDTO.getEstArrivalAirportHorizDistance());
        departureEntity.setEstArrivalAirportVertDistance(departureDTO.getEstArrivalAirportVertDistance());
        departureEntity.setDepartureAirportCandidatesCount(departureDTO.getDepartureAirportCandidatesCount());
        departureEntity.setArrivalAirportCandidatesCount(departureDTO.getArrivalAirportCandidatesCount());

        return departureEntity;
    }
    private OpenSkyResponseDepartureDTO mapEntityToDTO(OpenSkyResponseDeparture departureEntity) {
        OpenSkyResponseDepartureDTO departureDTO = new OpenSkyResponseDepartureDTO();
        departureDTO.setIcao24(departureEntity.getIcao24());
        departureDTO.setFirstSeen(departureEntity.getFirstSeen());
        departureDTO.setEstDepartureAirport(departureEntity.getEstDepartureAirport());
        departureDTO.setLastSeen(departureEntity.getLastSeen());
        departureDTO.setEstArrivalAirport(departureEntity.getEstArrivalAirport());
        departureDTO.setCallSign(departureEntity.getCallSign());
        departureDTO.setEstDepartureAirportHorizDistance(departureEntity.getEstDepartureAirportHorizDistance());
        departureDTO.setEstDepartureAirportVertDistance(departureEntity.getEstDepartureAirportVertDistance());
        departureDTO.setEstArrivalAirportHorizDistance(departureEntity.getEstArrivalAirportHorizDistance());
        departureDTO.setEstArrivalAirportVertDistance(departureEntity.getEstArrivalAirportVertDistance());
        departureDTO.setDepartureAirportCandidatesCount(departureEntity.getDepartureAirportCandidatesCount());
        departureDTO.setArrivalAirportCandidatesCount(departureEntity.getArrivalAirportCandidatesCount());

        return departureDTO;
    }
}