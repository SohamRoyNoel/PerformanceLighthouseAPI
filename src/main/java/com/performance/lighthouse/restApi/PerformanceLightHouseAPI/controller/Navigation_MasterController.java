package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Navigation_Master;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Navigation_MasterService;

@RestController
@RequestMapping("/api/navMaster")
@EnableAsync
public class Navigation_MasterController {

	private Navigation_MasterService navigation_MasterService;

	@Autowired
	public Navigation_MasterController(Navigation_MasterService navigation_MasterService) {
		this.navigation_MasterService = navigation_MasterService;
	}

	@GetMapping("/getNavs/{tcId}/{appid}/{pageId}/{uId}")
	public List<Navigation_Master> findPageByName(@PathVariable("appid") String appid, @PathVariable("pageId") String pageId, @PathVariable("tcId") String tcId,
			@PathVariable("uId") String uId) {
		return navigation_MasterService.getTopOneNavigation(tcId, appid, pageId, uId);
	}

	@PostMapping("/setNavs")
	public Navigation_Master addEmployee(@RequestBody Navigation_Master theNavBody) {

		theNavBody.setNav_ID(0);

		navigation_MasterService.saveNavigations(theNavBody);
		
		return theNavBody;
	}
}
