package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Resource_Mapper_History;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository.Resource_Mapper_HistoryRepository;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Resource_Mapper_HistoryService;

@Service
public class Resource_Mapper_HistoryServiceImpl implements Resource_Mapper_HistoryService {
	
	private Resource_Mapper_HistoryRepository resource_Mapper_HistoryRepository;
	
	
	@Autowired
	public Resource_Mapper_HistoryServiceImpl(Resource_Mapper_HistoryRepository resource_Mapper_HistoryService) {
		
		this.resource_Mapper_HistoryRepository = resource_Mapper_HistoryService;
	}



	@Override
	public void addToResource() {
		resource_Mapper_HistoryRepository.copyToResourceMapperHistoryFromResources();
	}



	@Override
	public void deleteresourceMapperElement() {
		resource_Mapper_HistoryRepository.deleteresourceMapperTableData();
		
	}

}
