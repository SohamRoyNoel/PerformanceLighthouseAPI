package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Resource_Master;

@EnableJpaRepositories
public interface Resource_MasterRepository extends JpaRepository<Resource_Master, Integer> {

	@Query(value="select * from Resource_Master  where Res_Name=:rsNme", nativeQuery=true) 
    Resource_Master findResourceByName(@Param("rsNme") String rsNm);
	
}
