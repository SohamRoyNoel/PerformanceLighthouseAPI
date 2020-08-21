package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Application_Master;

@EnableJpaRepositories
public interface Application_MasterRepository extends JpaRepository<Application_Master, Integer> {

	@Query(value="select * from Application_Master where Application_Id_Flag=1 and Application_Name=:appname", nativeQuery=true) 
    Application_Master findAllAppByActiveId(@Param("appname") String appname);
	
}
