package com.coderscampus.flightTrack.web;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coderscampus.flightTrack.domain.User;
import com.coderscampus.flightTrack.service.RegistrationService;
import com.coderscampus.flightTrack.service.UserService;

@Controller
public class RegistrationController {
	
	
	@Autowired
	private RegistrationService userRegisterService;
	
    @Autowired
    private UserService userService;
	
        @GetMapping("/register")
        public String getRegisteredUser(ModelMap model) {
        	
        	model.put("user", new User());
            model.addAttribute("message", "Registration successful!");       
            return "register";
       }
        
        @PostMapping("/register")
    	public String addUser(@RequestParam("username") String username,
    						  @RequestParam("password") String password,
    						  @RequestParam("firstName") String firstName,
    						  @RequestParam("lastName") String lastName,
    						  @RequestParam("email") String email,
    						  @RequestParam("phone") String phone,
    						  @RequestParam("registrationDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate registrationDate,
    						  Model model) {
    		
    		User user = new User(username, password, firstName, lastName, email, phone, registrationDate);
    		userRegisterService.saveUser(user);
    		
    		List<User> users = userService.getAllUsers();
    		model.addAttribute("users", users);
    		
    		return "register";
    	}  
        
        
}