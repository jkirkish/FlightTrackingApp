package com.coderscampus.flightTrack.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.coderscampus.flightTrack.domain.User;


@Controller
public class DashBoardController {
	
//	@Autowired
//	private AdminService adminService;
	
	@GetMapping("/dashboard")
	  public String getDashboard (User user, ModelMap model) {
		System.out.println(user);
		model.put("user", user);
		//List<User> allUserAccounts = adminService.getAllUserAccounts();
	    return "dashboard";
	  }

}
