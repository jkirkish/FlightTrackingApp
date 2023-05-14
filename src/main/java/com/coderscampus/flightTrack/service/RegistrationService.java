package com.coderscampus.flightTrack.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.flightTrack.domain.Address;
import com.coderscampus.flightTrack.domain.User;
import com.coderscampus.flightTrack.repository.UserRepository;

@Service
public class RegistrationService {

	@Autowired
	private UserRepository userRegisterRepo;
	
    private List<User> users = new ArrayList<>();
    
    
    public User saveUser(User user)
    {
    	if(user.getAddress() == null) {
    	   Address address = new Address();
    	   address.setAddressLine1("");
    	   address.setAddressLine2("");
    	   address.setCity("");
    	   address.setState("");
    	   address.setZip("");
    	   address.setCountry("");
    	   address.setUser(user);
    	   address.setUserId(user.getId());
    	   user.setAddress(address);
    	}else {
    		Address address = user.getAddress();
    		address.setUser(user);
    		address.setUserId(user.getId());
    		user.setAddress(user.getAddress());
    	}
    	return userRegisterRepo.save(user);
    }
    public boolean isUsernameAvailable(String username) {
        Optional<User> user = users.stream().filter(u -> u.getUsername().equals(username)).findFirst();
        return !user.isPresent();
    }
    
    public void registerUser(String username, String password, String firstname, String lastname, String email, String phone, LocalDate registrationDate) throws RegistrationException {
        if (!isUsernameAvailable(username)) {
            throw new RegistrationException("Username already exists");
        }

        User user = new User();
        users.add(user);
    }
    
}