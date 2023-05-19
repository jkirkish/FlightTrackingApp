package com.coderscampus.flightTrack.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.coderscampus.flightTrack.domain.User;
import com.coderscampus.flightTrack.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/index")
	public String getHomePage() {
		return "index";
	}
	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}

	@GetMapping("/users")
    public String getUsers(ModelMap model) {
		
        List<User> users = userService.findAll();
        model.put("users", users);
		return "users";
	}
	
	
	
	@GetMapping("/users/{id}")
	public String getOneUser (ModelMap model, @PathVariable Long id) {
		User user = userService.findById(id);
		model.put("user", user);
		return "user";
	}
	
	
   
}
