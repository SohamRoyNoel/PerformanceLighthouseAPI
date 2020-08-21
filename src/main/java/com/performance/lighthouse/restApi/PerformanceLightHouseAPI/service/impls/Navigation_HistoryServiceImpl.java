package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Navigation_Master_History;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository.Navigation_HistoryRepository;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Navigation_HistoryService;

@Service
public class Navigation_HistoryServiceImpl implements Navigation_HistoryService {

	private Navigation_HistoryRepository navigation_HistoryRepository;

	@Autowired	
	public Navigation_HistoryServiceImpl(Navigation_HistoryRepository navigation_HistoryRepository) {
		this.navigation_HistoryRepository = navigation_HistoryRepository;
	}

	@Override
	public Navigation_Master_History saveNavigations(Navigation_Master_History navs) {

		return navigation_HistoryRepository.save(navs);
	}
	
	

}
