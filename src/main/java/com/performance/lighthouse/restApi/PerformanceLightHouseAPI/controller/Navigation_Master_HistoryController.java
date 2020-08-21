package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Navigation_Master;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Navigation_Master_History;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Navigation_HistoryService;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Navigation_MasterService;

@RestController
@RequestMapping("/api/navHistory")
@EnableAsync
public class Navigation_Master_HistoryController {
	
	private Navigation_HistoryService navigation_HistoryService;

	@Autowired
	public Navigation_Master_HistoryController(Navigation_HistoryService navigation_HistoryService) {
		this.navigation_HistoryService = navigation_HistoryService;
	}



	@PostMapping("/setNavHist")
	public Navigation_Master_History addEmployee(@RequestBody Navigation_Master_History navHist) {

		navHist.setNav_ID(0);

		navigation_HistoryService.saveNavigations(navHist);

		return navHist;
	}
	
}
