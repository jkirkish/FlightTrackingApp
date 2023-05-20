package com.coderscampus.flightTrack.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.flightTrack.domain.User;
import com.coderscampus.flightTrack.repository.UserRepository;



@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	
	public List<User> findByUsername(String username){
		return userRepo.findByUsername(username);
	}
	public List<User> findByPassword(String password){
		return userRepo.findByPassword(password);
	}
	public List<User> findByEmail(String email){
		return userRepo.findByemail(email);
	}
	public List<User> findByPhone(String phone){
		return userRepo.findByphone(phone);
	}
	public List<User> firstNameAndUsername(String firstName, String username){
		return userRepo.findByfirstNameAndUsername(firstName, username);
	}
	public List<User> firstNameAndLastname(String lastName, String username){
		return userRepo.findByfirstNameAndUsername(lastName, username);
	}
	public User findById(Long userId) {
		Optional<User>userOpt = userRepo.findById(userId);
		return userOpt.orElse(new User());
	}
	
	public List<User> findAll() {
        return userRepo.findAll();
    }
	public User findBydId(Long id) {
		Optional<User> userOpt = userRepo.findById(id);
		return userOpt.orElse(new User());
	}
	public void saveUser(User user) {
		userRepo.save(user);
		
	}
	public void delete(Long userId) {
		userRepo.deleteById(userId);
		
	}
	
	
	
}
