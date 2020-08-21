package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Resource_Master;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository.Resource_MasterRepository;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Resource_MasterService;

@Service
public class Resource_MasterServiceImpl implements Resource_MasterService {
	
	private Resource_MasterRepository resource_MasterRepository;
	
	@Autowired
	public Resource_MasterServiceImpl(Resource_MasterRepository resource_MasterRepository) {
		this.resource_MasterRepository = resource_MasterRepository;
	}

	@Override
	public Resource_Master saveResource(Resource_Master resource_Master) {
		
		return resource_MasterRepository.save(resource_Master);
	}

	@Override
	public Resource_Master getSpecific(String resname) {
		
		return resource_MasterRepository.findResourceByName(resname);
	}

//	@Override
//	public Resource_Master getIdbyName(Resource_Master resource_Master) {
//		return resource_MasterRepository.findResourceByName(resource_Master.getRes_Name());
//	}
	
	

}
