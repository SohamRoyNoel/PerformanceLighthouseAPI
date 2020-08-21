package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service;

import java.util.List;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Application_User_Mapper;

public interface Application_User_MapperService {

	public Application_User_Mapper getAllActiveUser(int uid, int appid);
	
}
