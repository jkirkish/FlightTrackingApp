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
	private UserService userService;

    @PostMapping("/register")
    public String register(@RequestParam String username,
                           @RequestParam String password,
                           @RequestParam String firstname,
                           @RequestParam String lastname,
                           @RequestParam String email,
                           @RequestParam String phone,
                           @RequestParam("registrationDate") LocalDate registrationDate,
                           @RequestParam String addressLine1,
                           @RequestParam String addressLine2,
                           @RequestParam String city,
                           @RequestParam String state,
                           @RequestParam String zipCode,
                           @RequestParam String country,
                           Model model) {

        // Your code to process the registration data would go here.
        // For this example, we'll just print the values to the console.
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Registration Date: " + registrationDate);
        System.out.println("AddressLine1: " + addressLine1);
        System.out.println("AddressLine2: " + addressLine2);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("ZipCode: " + zipCode);
        System.out.println("Country: " + country);
        // Add a success message to the model to be displayed on the registration confirmation page
        model.addAttribute("message", "Registration successful!");

        // Redirect to the registration confirmation page
        return "registrationConfirmation";
    }
    @GetMapping("/register")
	public String getCreateUser(ModelMap model) {
		model.put("user", new User());
		return "register";
	}
}