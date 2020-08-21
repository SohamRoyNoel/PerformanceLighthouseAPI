package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Page_Master;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Resource_Mapper;

@EnableJpaRepositories
public interface Resource_MapperRepository extends JpaRepository<Resource_Mapper, Integer> {


	
}
