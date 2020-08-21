package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service;

import java.util.List;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.TestScenario_Master;

public interface TestScenario_MasterService {

	List<TestScenario_Master> findAllActiveTestScenarios(int id);
	
	TestScenario_Master findAllActiveTestScenariosByName(String tsName, int apid);
	
	TestScenario_Master updateTsNameByTsNm_WRT_Uid(String tsname, int uid);

	TestScenario_Master saveTs(TestScenario_Master ts);


}
