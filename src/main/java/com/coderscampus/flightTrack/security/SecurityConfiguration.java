//package com.coderscampus.flightTrack.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//public class SecurityConfiguration extends WebSecurityConfiguration{
//	
//	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	protected void configure(AuthenticationManagerBuilder auth)throws Exception{
//		auth
//		   .inMemoryAuthentication()
//		   .passwordEncoder(passwordEncoder);
//		   
//	}
//	
//	protected void configuration(HttpSecurity http) throws Exception {
//		http
//		 .authorizeRequests()
//		 	.requestMatchers("/admin/**").hasAnyRole("ADMIN")
//		 	.anyRequest().hasAnyRole("USER").and()
//		 .formLogin()
//		    .loginPage("/login")
//		    .defaultSuccessUrl("/dashboard")
//		    .permitAll();
//		  
//				 
//	}
//}
