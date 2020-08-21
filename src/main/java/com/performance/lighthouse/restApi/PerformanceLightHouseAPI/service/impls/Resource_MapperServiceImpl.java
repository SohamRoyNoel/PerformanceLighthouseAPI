package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Resource_Mapper;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository.Resource_MapperRepository;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Resource_MapperService;

@Service
public class Resource_MapperServiceImpl implements Resource_MapperService {
	
	private Resource_MapperRepository resource_MapperRepository;

	@Autowired
	public Resource_MapperServiceImpl(Resource_MapperRepository resourceRepository) {
		
		this.resource_MapperRepository = resourceRepository;
	}



	@Override
	public Resource_Mapper saveResourceMapper(Resource_Mapper resMap) {
		
		return resource_MapperRepository.save(resMap);
	}
	
//	@Override
//	public Resource_Mapper saveResourceMapper(Resource_Mapper resMap) {
//		
//		return resource_MapperRepository.save(resMap);
//	}



	@Override
	public List<Resource_Mapper> findAllResources() {
		
		return resource_MapperRepository.findAll();
	}



	@Override
	public String deleteresourceMapperElement(int id) {
		resource_MapperRepository.deleteById(id);
		return "Id "+ id + " is removed";
				
	}

	
	
}
