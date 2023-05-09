package com.coderscampus.flightTrack.web;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

    @PostMapping("/register")
    public String register(@RequestParam String username,
                           @RequestParam String password,
                           @RequestParam String firstname,
                           @RequestParam String lastname,
                           @RequestParam String email,
                           @RequestParam String phone,
                           @RequestParam("registrationDate") LocalDate registrationDate,
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

        // Add a success message to the model to be displayed on the registration confirmation page
        model.addAttribute("message", "Registration successful!");

        // Redirect to the registration confirmation page
        return "registrationConfirmation";
    }
}