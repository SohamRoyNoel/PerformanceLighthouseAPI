package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service;

import java.util.List;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Application_Master;

public interface Application_MasterService {

	Application_Master getActiveApplication(String appname);
	
}
