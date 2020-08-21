package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service;

import java.util.List;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Page_Master;

public interface Page_MasterService {

	List<Page_Master> findAllPages();
	
	Page_Master getPageByName(String pgName);
	
	Page_Master savePage(Page_Master page);
	
}
