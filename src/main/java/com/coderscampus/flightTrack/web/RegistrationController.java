package com.coderscampus.flightTrack.web;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coderscampus.flightTrack.domain.User;
import com.coderscampus.flightTrack.service.UserService;

@Controller
public class RegistrationController {
	
	
	@Autowired
	private UserService userRegisterService;

	
        @GetMapping("/register")
        public String getRegisteredUser(ModelMap model) {
        	
        	model.put("user", new User());
            model.addAttribute("message", "Registration successful!");       
            return "register";
       }
        
        @PostMapping("/register")
        public String postUserToRegister(User user) {
        	System.out.println(user);
        	userRegisterService.saveUser(user);
        	return "redirect:/register";
        }
        
        
}