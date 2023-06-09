package com.coderscampus.flightTrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderscampus.flightTrack.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
