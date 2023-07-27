package com.coderscampus.flightTrack;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
//Localhost:8080/h2-console
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.coderscampus.flightTrack.domain.Role;
import com.coderscampus.flightTrack.domain.User;
import com.coderscampus.flightTrack.repository.RoleRepository;
import com.coderscampus.flightTrack.repository.UserRepository;

@SpringBootApplication
public class FlightTrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightTrackApplication.class, args);
	}
	@Bean
	CommandLineRunner run(RoleRepository roleRepository, UserRepository userRepository, PasswordEncoder passwordEncode){
		return args ->{
			if(roleRepository.findByAuthority("ADMIN").isPresent()) return;
			Role adminRole = roleRepository.save(new Role("ADMIN"));
			roleRepository.save(new Role("USER"));

			Set<Role> roles = new HashSet<>();
			roles.add(adminRole);

			User admin = new User(1L,"admin", passwordEncode.encode("password"), null, null, null, null, null, null, roles);
              
			userRepository.save(admin);
		};
	}
}
