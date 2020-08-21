package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.User_Registration;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository.User_RegistrationRepository;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.User_RegistrationService;

@Service
public class User_RegistrationServiceImpl implements User_RegistrationService {
	
	private User_RegistrationRepository user_RegistrationRepository;
	
	@Autowired
	public User_RegistrationServiceImpl(User_RegistrationRepository user_RegistrationRepository) {
		this.user_RegistrationRepository = user_RegistrationRepository;
	}

	@Override
	public User_Registration getAnUser(String apiKey) {
		
		return user_RegistrationRepository.findUserByApiKey(apiKey);
	}

}
