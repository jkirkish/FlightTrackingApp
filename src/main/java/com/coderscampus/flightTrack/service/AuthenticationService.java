package com.coderscampus.flightTrack.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.coderscampus.flightTrack.domain.Role;
import com.coderscampus.flightTrack.domain.User;
import com.coderscampus.flightTrack.dto.LoginResponseDTO;
import com.coderscampus.flightTrack.repository.RoleRepository;
import com.coderscampus.flightTrack.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AuthenticationService {

	@Autowired
    private UserRepository userRepo;

    @Autowired
    private RoleRepository roleRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

	public User registerUser(String username, String password) {
		String encodedPassword = passwordEncoder.encode(password);
		Role userRole = roleRepo.findByAuthority("USER").get();
		
		Set<Role> authorities = new HashSet<>();
		authorities.add(userRole);
		return userRepo.save(new User(0L,username, encodedPassword, null, null, null, null, null, null, authorities));
		
	}
	public LoginResponseDTO loginUser(String username, String password){

        try{
            Authentication auth = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, password)
            );

            String token = tokenService.generateJwt(auth);

            return new LoginResponseDTO(userRepo.findByUsername(username).get(), token);

        } catch(AuthenticationException e){
            return new LoginResponseDTO(null, "");
        }
    }
}
