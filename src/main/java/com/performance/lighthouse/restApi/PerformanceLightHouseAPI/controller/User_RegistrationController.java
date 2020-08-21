package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.User_Registration;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.User_RegistrationService;

@RestController
@RequestMapping("/api/userAuth")
@EnableAsync
public class User_RegistrationController {

	private User_RegistrationService user_RegistrationService;

	@Autowired
	public User_RegistrationController(User_RegistrationService user_RegistrationService) {
		
		this.user_RegistrationService = user_RegistrationService;
	}
	
	@GetMapping("/getNavs/{apiKey}")
	public User_Registration getTheUserDetails(@PathVariable("apiKey") String apiKey) {
		
		return user_RegistrationService.getAnUser(apiKey);
	}
	
}
