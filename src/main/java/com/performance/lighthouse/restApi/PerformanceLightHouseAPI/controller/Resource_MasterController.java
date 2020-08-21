package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Resource_Master;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Resource_MasterService;

@RestController
@RequestMapping("/api/resMaster")
@EnableAsync
public class Resource_MasterController {

	private Resource_MasterService resource_MasterService;

	@Autowired
	public Resource_MasterController(Resource_MasterService resource_MasterService) {
		
		this.resource_MasterService = resource_MasterService;
	}
	
	@PostMapping("/setResource")
	public Resource_Master setResourceMasterBody(@RequestBody Resource_Master resMaster){
		
		resMaster.setRes_ID(0);
		
		System.out.println("################# : " + resMaster.getRes_Name());
		System.out.println("################# : " + resMaster.getRes_Reg_ID());
		
		resource_MasterService.saveResource(resMaster);
		
		return resMaster;
	}
	
	@PostMapping("/getJsonResource")
	public Resource_Master getJsonResource(@RequestBody Resource_Master resMaster) {
		
		return resource_MasterService.getSpecific(resMaster.getRes_Name());
	}
}
/*
 * System.err.println("******** " + rsNm);
		String x = rsNm.replace(" ", "%20");
		String y = x.replace(";", "%3B");
		String z1 = x.replace("/", "%2f");
		String z = z1.replace("?", "%3F");
		String m3 = z.replace(":", "%3A");
		String m1 = m3.replace("=", "%3D");
		String m2 = m1.replace("@", "%40");
		return resource_MasterService.getSpecific(m2.replace("&", "%26"));
 * 
 */