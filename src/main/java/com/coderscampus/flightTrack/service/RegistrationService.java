package com.coderscampus.flightTrack.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.coderscampus.flightTrack.domain.User;

@Service
public class RegistrationService {

    private List<User> users = new ArrayList<>();

    public boolean isUsernameAvailable(String username) {
        Optional<User> user = users.stream().filter(u -> u.getUsername().equals(username)).findFirst();
        return !user.isPresent();
    }

    public void registerUser(String username, String password, String firstname, String lastname, String email, String phone, LocalDate registrationDate) throws RegistrationException {
        if (!isUsernameAvailable(username)) {
            throw new RegistrationException("Username already exists");
        }

        // Do additional validation here, such as checking if the email address is valid

        User user = new User();
        users.add(user);
    }
}