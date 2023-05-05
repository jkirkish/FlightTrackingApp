package com.coderscampus.flightTrack.web;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import com.coderscampus.flightTrack.domain.User;
import com.coderscampus.flightTrack.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public String getCreateUser(ModelMap model) {
		model.put("user", new User());
		return "register";
	}

	@GetMapping("/user")
	public String getAllUsers(ModelMap model) {
		List<User> users = userService.findAllUsers();
		model.put("user", users);
		if (users.size() == 1) {
			model.put("user", users.iterator().next());
		}
		return "user";
	}

}
