package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Resource_Mapper_History;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Resource_Mapper_HistoryService;

@RestController
@RequestMapping("/api/resourceMapHist")
@EnableAsync
public class Resource_Mapper_HistoryController {

	private Resource_Mapper_HistoryService resMapper_HistoryService;

	@Autowired
	public Resource_Mapper_HistoryController(Resource_Mapper_HistoryService resMapper_HistoryService) {
		
		this.resMapper_HistoryService = resMapper_HistoryService;
	}
	
	@PostMapping("/copyNow")
	public void getResourceMapper(){
		 resMapper_HistoryService.addToResource();
		 
		 //return "Rows Moved";
	}
	
	@DeleteMapping("/delNow")
	public void delResourceMapper() {
		
		resMapper_HistoryService.deleteresourceMapperElement();
		
	}
}
