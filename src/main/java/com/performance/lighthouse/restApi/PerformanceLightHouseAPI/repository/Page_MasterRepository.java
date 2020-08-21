package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Page_Master;

@EnableJpaRepositories
public interface Page_MasterRepository extends JpaRepository<Page_Master, Integer> {

	@Query(value="select * from Page_Master where Page_Name = :pgnm", nativeQuery=true) 
    Page_Master findPageByName(@Param("pgnm") String page);
	
}
