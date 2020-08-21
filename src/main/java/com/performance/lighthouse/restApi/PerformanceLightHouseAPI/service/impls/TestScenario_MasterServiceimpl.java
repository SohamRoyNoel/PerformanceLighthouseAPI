package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.impls;

import java.util.List;

import org.springframework.stereotype.Service;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.TestScenario_Master;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository.TestScenario_MasterRepository;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.TestScenario_MasterService;

@Service
public class TestScenario_MasterServiceimpl implements TestScenario_MasterService {
	
	private TestScenario_MasterRepository testScenario_MasterRepo;

	public TestScenario_MasterServiceimpl(TestScenario_MasterRepository testScenario_MasterRepo) {
		this.testScenario_MasterRepo = testScenario_MasterRepo;
	}

	@Override
	public List<TestScenario_Master> findAllActiveTestScenarios(int id) {

		return testScenario_MasterRepo.findActiveTs(id);
	}

	@Override
	public TestScenario_Master findAllActiveTestScenariosByName(String tsName, int apid) {
		
		return testScenario_MasterRepo.findAllActiveTestScenariosByName(tsName, apid);
	}

	@Override
	public TestScenario_Master updateTsNameByTsNm_WRT_Uid(String tsname, int uid) {
		
		return testScenario_MasterRepo.updateTestScenariosByName(uid, tsname);
	}

	@Override
	public TestScenario_Master saveTs(TestScenario_Master ts) {
		
		return testScenario_MasterRepo.save(ts);
	}

}
