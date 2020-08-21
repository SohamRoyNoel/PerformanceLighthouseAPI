package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Page_Master;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Page_MasterService;

@RestController
@RequestMapping("/api/pageMaster")
@EnableAsync
public class Page_MasterController {
	
	private Page_MasterService pageMasterService;
		
	@Autowired
	public Page_MasterController(Page_MasterService pageMasterService) {
		super();
		this.pageMasterService = pageMasterService;
	}

	@GetMapping("/getPages")
	public List<Page_Master> getPages() {
		
		return null;
	}
	
	@PostMapping("/getIdPages")
	public Page_Master findPageByName(@RequestBody Page_Master page) {
		return pageMasterService.getPageByName(page.getPage_Name());
	}
	
	@PostMapping("/setPages")
	public Page_Master addEmployee(@RequestBody Page_Master page) {
				
		page.setPage_ID(0);
		
		pageMasterService.savePage(page);
		
		return page;
	}

}
