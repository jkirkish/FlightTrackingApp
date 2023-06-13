package com.coderscampus.flightTrack.web;

import com.coderscampus.flightTrack.domain.OpenSkyResponseArrival;
import com.coderscampus.flightTrack.dto.OpenSkyResponseArrivalDTO;
import com.coderscampus.flightTrack.repository.AirportOfFlightArrivalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/arrivals")
public class ArrivalRestController {

    private final AirportOfFlightArrivalsRepository arrivalRepository;

    @Autowired
    public ArrivalRestController(AirportOfFlightArrivalsRepository arrivalRepository) {
        this.arrivalRepository = arrivalRepository;
    }

    @GetMapping
    public List<OpenSkyResponseArrivalDTO> getArrivals() {
        // Simulating retrieval of arrivals from a data source
        List<OpenSkyResponseArrivalDTO> arrivals = new ArrayList<>();


        // Save arrivals to JPA repository
        List<OpenSkyResponseArrival> arrivalEntities = new ArrayList<>();
        for (OpenSkyResponseArrivalDTO arrivalDTO : arrivals) {
            OpenSkyResponseArrival arrivalEntity = mapDTOtoEntity(arrivalDTO);
            arrivalEntities.add(arrivalEntity);
        }
        arrivalRepository.saveAll(arrivalEntities);

        // Convert arrivalEntities back to DTOs
        List<OpenSkyResponseArrivalDTO> savedArrivals = new ArrayList<>();
        for (OpenSkyResponseArrival arrivalEntity : arrivalEntities) {
            OpenSkyResponseArrivalDTO arrivalDTO = mapEntityToDTO(arrivalEntity);
            savedArrivals.add(arrivalDTO);
        }

        return savedArrivals;
    }

    private OpenSkyResponseArrival mapDTOtoEntity(OpenSkyResponseArrivalDTO arrivalDTO) {
        OpenSkyResponseArrival arrivalEntity = new OpenSkyResponseArrival();
        arrivalEntity.setIcao24(arrivalDTO.getIcao24());
        arrivalEntity.setFirstSeen(arrivalDTO.getFirstSeen());
        arrivalEntity.setEstDepartureAirport(arrivalDTO.getEstDepartureAirport());
        arrivalEntity.setLastSeen(arrivalDTO.getLastSeen());
        arrivalEntity.setEstArrivalAirport(arrivalDTO.getEstArrivalAirport());
        arrivalEntity.setCallSign(arrivalDTO.getCallSign());
        arrivalEntity.setEstDepartureAirportHorizDistance(arrivalDTO.getEstDepartureAirportHorizDistance());
        arrivalEntity.setEstDepartureAirportVertDistance(arrivalDTO.getEstDepartureAirportVertDistance());
        arrivalEntity.setEstArrivalAirportHorizDistance(arrivalDTO.getEstArrivalAirportHorizDistance());
        arrivalEntity.setEstArrivalAirportVertDistance(arrivalDTO.getEstArrivalAirportVertDistance());
        arrivalEntity.setDepartureAirportCandidatesCount(arrivalDTO.getDepartureAirportCandidatesCount());
        arrivalEntity.setArrivalAirportCandidatesCount(arrivalDTO.getArrivalAirportCandidatesCount());

        return arrivalEntity;
    }

    private OpenSkyResponseArrivalDTO mapEntityToDTO(OpenSkyResponseArrival arrivalEntity) {
        OpenSkyResponseArrivalDTO arrivalDTO = new OpenSkyResponseArrivalDTO();
        arrivalDTO.setIcao24(arrivalEntity.getIcao24());
        arrivalDTO.setFirstSeen(arrivalEntity.getFirstSeen());
        arrivalDTO.setEstDepartureAirport(arrivalEntity.getEstDepartureAirport());
        arrivalDTO.setLastSeen(arrivalEntity.getLastSeen());
        arrivalDTO.setEstArrivalAirport(arrivalEntity.getEstArrivalAirport());
        arrivalDTO.setCallSign(arrivalEntity.getCallSign());
        arrivalDTO.setEstDepartureAirportHorizDistance(arrivalEntity.getEstDepartureAirportHorizDistance());
        arrivalDTO.setEstDepartureAirportVertDistance(arrivalEntity.getEstDepartureAirportVertDistance());
        arrivalDTO.setEstArrivalAirportHorizDistance(arrivalEntity.getEstArrivalAirportHorizDistance());
        arrivalDTO.setEstArrivalAirportVertDistance(arrivalEntity.getEstArrivalAirportVertDistance());
        arrivalDTO.setDepartureAirportCandidatesCount(arrivalEntity.getDepartureAirportCandidatesCount());
        arrivalDTO.setArrivalAirportCandidatesCount(arrivalEntity.getArrivalAirportCandidatesCount());

        return arrivalDTO;
    }
}
