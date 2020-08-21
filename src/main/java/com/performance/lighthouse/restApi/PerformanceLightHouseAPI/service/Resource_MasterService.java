package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service;


import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Resource_Master;

public interface Resource_MasterService {

	Resource_Master saveResource(Resource_Master resource_Master); 
	
	Resource_Master getSpecific(String resname);
	
//	Resource_Master getIdbyName(Resource_Master resource_Master);
	
}
