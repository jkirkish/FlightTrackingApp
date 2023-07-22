package com.coderscampus.flightTrack.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.flightTrack.domain.User;
import com.coderscampus.flightTrack.dto.LoginResponseDTO;
import com.coderscampus.flightTrack.dto.RegistrationDTO;
import com.coderscampus.flightTrack.service.AuthenticationService;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {

	@Autowired
	private AuthenticationService authenticationService;
	
	@PostMapping("/register")
	public User register(@RequestBody RegistrationDTO body) {
		return authenticationService.registerUser(body.getUsername(), body.getPassword());
	}
	 @PostMapping("/login")
	    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO body){
	        return authenticationService.loginUser(body.getUsername(), body.getPassword());
	    }
	
}
