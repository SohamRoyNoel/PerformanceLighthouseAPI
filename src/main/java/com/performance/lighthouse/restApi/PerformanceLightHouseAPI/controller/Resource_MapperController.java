package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Page_Master;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Resource_Mapper;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Resource_MapperService;

@RestController
@RequestMapping("/api/resMap")
@EnableAsync
public class Resource_MapperController {

	private Resource_MapperService resource_MapperService;
	List<Resource_Mapper> rs = new ArrayList<Resource_Mapper>();
	
	
	@Autowired
	public Resource_MapperController(Resource_MapperService resource_MapperService) {
		this.resource_MapperService = resource_MapperService;
	}

	@GetMapping("/getResources")
	public List<Resource_Mapper> getResources() {
		
		return resource_MapperService.findAllResources();
	}

	@PostMapping("/setResource")
	public void setResourceMapper(@RequestBody Resource_Mapper rsMapper) {
		
		rsMapper.setRS_Map_ID(0);
		System.err.println("Response : " + rsMapper.getRS_Map_ID());
		//rs.add(rsMapper);
		resource_MapperService.saveResourceMapper(rsMapper);
		System.err.println("New : " + rs.size());
		//return rsMapper;
	}
	
	@DeleteMapping("/delResource/{resId}")
	public String delResourceMapper(@PathVariable("resId") int id) {
		
		return resource_MapperService.deleteresourceMapperElement(id);
		
	}
	
	/*public void postResourceMapper() {
				
		rsMapper.setRS_Map_ID(0);
		System.err.println("Response : " + rsMapper.getRS_Map_ID());
		rs.add(rsMapper);
		resource_MapperService.saveResourceMapper(rsMapper);
		System.err.println("New : " + rs.size());
		//return rsMapper;
	}*/
}
