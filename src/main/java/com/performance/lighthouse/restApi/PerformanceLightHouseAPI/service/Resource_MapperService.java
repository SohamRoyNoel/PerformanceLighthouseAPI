package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service;

import java.util.List;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Resource_Mapper;

public interface Resource_MapperService {
	
	List<Resource_Mapper> findAllResources();

	Resource_Mapper saveResourceMapper(Resource_Mapper resMap);
	
//	List<Resource_Mapper> saveResourceMapper(List<Resource_Mapper> resMap);
	
	String deleteresourceMapperElement(int id);
	
}
