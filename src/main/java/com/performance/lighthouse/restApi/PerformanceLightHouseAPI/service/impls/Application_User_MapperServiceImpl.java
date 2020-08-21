package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Application_User_Mapper;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository.Application_User_MapperRepository;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Application_User_MapperService;

@Service
public class Application_User_MapperServiceImpl implements Application_User_MapperService {
	
	private Application_User_MapperRepository application_User_MapperRepository;
	
	
	@Autowired
	public Application_User_MapperServiceImpl(Application_User_MapperRepository application_User_MapperRepositorys) {
		
		this.application_User_MapperRepository = application_User_MapperRepositorys;
	}



	@Override
	public Application_User_Mapper getAllActiveUser(int uid, int apid) {
		
		return application_User_MapperRepository.findUserByActivation(uid, apid);
	}

}
