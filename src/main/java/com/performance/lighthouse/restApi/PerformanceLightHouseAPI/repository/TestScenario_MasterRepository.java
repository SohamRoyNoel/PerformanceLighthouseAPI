package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;


import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.TestScenario_Master;

@EnableJpaRepositories
public interface TestScenario_MasterRepository extends JpaRepository<TestScenario_Master, Integer> {

	@Query(value = "select * from TestScenario_Master where TS_ID_FLAG=:tsnm", nativeQuery=true) 
	List<TestScenario_Master> findActiveTs(@Param("tsnm") int tsnm);
	
	@Query(value ="select * from TestScenario_Master where TS_ID_FLAG=1 and TS_Name=:tsname and Ts_Application_Id=:apid", nativeQuery=true) 
	TestScenario_Master findAllActiveTestScenariosByName(@Param("tsname") String tsname, @Param("apid") int apid);
	
	@Query(value ="update TestScenario_Master set TS_Reg_UserID=:uid, TS_CreationTime=GETDATE() where TS_Name=:tsnm", nativeQuery=true) 
	TestScenario_Master updateTestScenariosByName(@Param("uid") int uid,@Param("tsnm") String tsname );
}
