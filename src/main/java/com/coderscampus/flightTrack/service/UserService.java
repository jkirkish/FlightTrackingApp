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
		return userOpt.orElse(new User());
	}
	
	public List<User> findAllUsers() {
		return userRepo.findAll();
	}

	public User createUser() {
		User user = new User();
		return userRepo.save(user);
	}
	
	public User update(User user) {
			return null;
		}

	
	public void delete(Long userId) {
		userRepo.deleteById(userId);
	}
	
}
