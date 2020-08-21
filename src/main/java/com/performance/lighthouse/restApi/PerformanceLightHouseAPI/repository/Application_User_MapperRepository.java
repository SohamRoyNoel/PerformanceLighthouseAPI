package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository;

import java.util.List;

import org.aspectj.weaver.tools.Trace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Application_User_Mapper;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Page_Master;

@EnableJpaRepositories
public interface Application_User_MapperRepository extends JpaRepository<Application_User_Mapper, Integer> {

	@Query(value="select * from Application_User_Mapper where App_Map_ID_Flag = 1 and App_user_Reg_ID=:uid and App_Application_ID=:appid", nativeQuery=true) 
	Application_User_Mapper findUserByActivation(@Param("uid") int uid,
														@Param("appid") int appid);

}
