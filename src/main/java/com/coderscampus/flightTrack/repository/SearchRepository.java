package com.coderscampus.flightTrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderscampus.flightTrack.domain.Search;

public interface SearchRepository extends JpaRepository<Search, Long>{

	
}
