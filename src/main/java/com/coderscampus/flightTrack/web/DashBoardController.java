package com.coderscampus.flightTrack.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.coderscampus.flightTrack.domain.User;
import com.coderscampus.flightTrack.service.AdminService;

@Controller
public class DashBoardController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/dashboard")
	  public String getDashboard (@AuthenticationPrincipal User user, ModelMap model) {
		System.out.println(user);
		model.put("user", user);
		List<User> allUserAccounts = adminService.getAllUserAccounts();
	    return "dashboard";
	  }

}
