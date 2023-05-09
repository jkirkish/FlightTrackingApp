package com.coderscampus.flightTrack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.flightTrack.domain.User;
import com.coderscampus.flightTrack.repository.UserRepository;



@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public User findById(Long userId) {
		Optional<User>userOpt = userRepo.findById(userId);
		return userOpt.orElse(new User(null, null, null, null, null, null, null));
	}
	
	public List<User> findAllUsers() {
		return userRepo.findAll();
	}

	public User createUser() {
		User user = new User(null, null, null, null, null, null, null);
		return userRepo.save(user);
	}
	
	
}
