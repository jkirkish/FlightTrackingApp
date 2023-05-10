package com.coderscampus.flightTrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coderscampus.flightTrack.domain.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

	
}
