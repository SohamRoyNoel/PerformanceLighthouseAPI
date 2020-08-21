package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Application_Master;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository.Application_MasterRepository;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Application_MasterService;

@Service
public class Application_MasterServiceImpl implements Application_MasterService {

	private Application_MasterRepository application_MasterRepo;
	
	
	@Autowired
	public Application_MasterServiceImpl(Application_MasterRepository application_Master) {
		super();
		this.application_MasterRepo = application_Master;
	}



	@Override
	public Application_Master getActiveApplication(String appname) {
		
		return application_MasterRepo.findAllAppByActiveId(appname);
	}

}
