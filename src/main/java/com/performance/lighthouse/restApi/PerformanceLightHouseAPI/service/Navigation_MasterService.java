package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service;

import java.util.List;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Navigation_Master;

public interface Navigation_MasterService {

	List<Navigation_Master> getTopOneNavigation(String appid, String pageId, String tcId, String uId);

	Navigation_Master saveNavigations(Navigation_Master navs);

}
