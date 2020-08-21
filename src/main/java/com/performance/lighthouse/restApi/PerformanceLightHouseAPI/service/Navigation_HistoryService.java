package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Navigation_Master;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Navigation_Master_History;

public interface Navigation_HistoryService {
	
	Navigation_Master_History saveNavigations(Navigation_Master_History navs);

}
