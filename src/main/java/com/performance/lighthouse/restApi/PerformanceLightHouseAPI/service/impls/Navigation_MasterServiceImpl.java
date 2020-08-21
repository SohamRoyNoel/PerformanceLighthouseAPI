package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Navigation_Master;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository.Navigation_MasterReposity;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.Navigation_MasterService;

@Service
public class Navigation_MasterServiceImpl implements Navigation_MasterService {
	
	private Navigation_MasterReposity navigation_MasterReposity;

	@Autowired
	public Navigation_MasterServiceImpl(Navigation_MasterReposity navigation_MasterReposity) {

		this.navigation_MasterReposity = navigation_MasterReposity;
	}

	@Override
	public List<Navigation_Master> getTopOneNavigation(String appid, String pageId, String tcId, String uId) {
		System.out.println(appid+" " + pageId + " "+ tcId + uId);
		return navigation_MasterReposity.findNavByParam(Integer.parseInt(appid), Integer.parseInt(pageId), Integer.parseInt(tcId), Integer.parseInt(uId));
	}

	@Override
	public Navigation_Master saveNavigations(Navigation_Master navigation_master) {
		
		return navigation_MasterReposity.save(navigation_master);
	}

}
