package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Application_Master;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Page_Master;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Application_MasterService;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Page_MasterService;

@RestController
@RequestMapping("/api/appMaster")
@EnableAsync
public class Application_MasterController {

	private Application_MasterService application_MasterService;


	@Autowired
	public Application_MasterController(Application_MasterService appMasterService) {

		this.application_MasterService = appMasterService;
	}

	@GetMapping("/getApps/{appname}")
	public Application_Master findPageByName(@PathVariable("appname") String appname) {

		
		return application_MasterService.getActiveApplication(appname);
	}

}
