package com.coderscampus.flightTrack.web;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coderscampus.flightTrack.domain.User;
import com.coderscampus.flightTrack.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	

	@GetMapping("/users")
	public String getAllUsers(ModelMap model) {
		List<User> users = userService.findAllUsers();
		model.put("user", users);
		if (users.size() == 1) {
			model.put("user", users.iterator().next());
		}
		return "users";
	}

	@GetMapping("/users/{userId}")
	public String getOneUser (ModelMap model, @PathVariable Long userId) {
		User user = userService.findById(userId);
		//User user = userService.findExactlyOneUserByRegistrationDate(null);
		model.put("users", Arrays.asList(user));
		return "users";
	}
	 @GetMapping("/registration/{registrationDate}")
	    public User getUsersByRegistrationDate(@PathVariable("registrationDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate registrationDate) {
	        return userService.findExactlyOneUserByRegistrationDate(registrationDate);
	    }
	@PostMapping("/users/{userId}")
	public String postOneUser(@PathVariable Long userId, User user) {
		userService.saveUser(user);
		return "redirect:/users/" + user.getId();
		
	}
	@PostMapping("/users/{userId}/delete")
	public String deleteOneUser(@PathVariable Long userId) {
		userService.delete(userId);
		return "redirect:/users";
	}
}
