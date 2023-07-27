package com.coderscampus.flightTrack.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.flightTrack.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class RegisterUserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/")
    public String helloUserController() {
        return "User access level";	
    }
}