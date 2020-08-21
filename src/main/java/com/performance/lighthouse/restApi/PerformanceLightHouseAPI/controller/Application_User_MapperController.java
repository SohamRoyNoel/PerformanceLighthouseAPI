package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Application_User_Mapper;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Application_User_MapperService;

@RestController
@RequestMapping("/api/appUserMap")
@EnableAsync
public class Application_User_MapperController {

	private Application_User_MapperService application_User_MapperService;

	@Autowired
	public Application_User_MapperController(Application_User_MapperService application_User_MapperService) {
		this.application_User_MapperService = application_User_MapperService;
	}
	
	@GetMapping("/getActive/{uid}/{appid}")
	public Application_User_Mapper getAllActiveUsers(@PathVariable("uid") String uid, @PathVariable("appid") String appid){
		int u = Integer.parseInt(uid);
		int a = Integer.parseInt(appid);
		return application_User_MapperService.getAllActiveUser(u, a);
	}
	
}
