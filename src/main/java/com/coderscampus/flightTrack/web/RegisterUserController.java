package com.coderscampus.flightTrack.web;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class RegisterUserController {

    @GetMapping("/")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public String helloUserController() {
        return "User access level";
    }

    // Other user-related methods
}
