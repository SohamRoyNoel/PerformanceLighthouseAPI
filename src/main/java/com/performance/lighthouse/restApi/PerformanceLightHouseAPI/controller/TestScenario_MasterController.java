package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.TestScenario_Master;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.service.TestScenario_MasterService;

@RestController
@RequestMapping("/api/testMaster/")
@EnableAsync
public class TestScenario_MasterController {
	
	private TestScenario_MasterService testScenario_Master;
	
	@Autowired
	public TestScenario_MasterController(TestScenario_MasterService testScenario_Master) {
		this.testScenario_Master = testScenario_Master;
	}

	@GetMapping("/getTestCase/{tcActiveId}")
	public List<TestScenario_Master> findPageByName(@PathVariable("tcActiveId") int tcActiveId) {
		
		return testScenario_Master.findAllActiveTestScenarios(tcActiveId);
	}
	
	@GetMapping("/getTestCases/{tsname}/{apid}")
	public TestScenario_Master getAllActiveTestScenariosByName(@PathVariable("tsname") String tsname, @PathVariable("apid") String apid) {
		
		return testScenario_Master.findAllActiveTestScenariosByName(tsname, Integer.parseInt(apid));
	}
	
	@PutMapping("/putTestCases/{tsname}/{uid}")
	public TestScenario_Master updateTestScenariosByName(@PathVariable("tsname") String tsname, @PathVariable("uid") String uid) {
		int uids = Integer.parseInt(uid);
		return testScenario_Master.updateTsNameByTsNm_WRT_Uid(tsname, uids);
	}
	
	@PostMapping("/setTestCases")
	public TestScenario_Master addEmployee(@RequestBody TestScenario_Master theTs) {

		theTs.setTS_ID(0);

		testScenario_Master.saveTs(theTs);

		return theTs;
	}
}
