package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Resource_Mapper_History;
import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.withoutPrimaryKey.Resource_Mapper_HistoryKey_Defination;

@EnableJpaRepositories
public interface Resource_Mapper_HistoryRepository extends JpaRepository<Resource_Mapper_History, Integer> {

	@Modifying
	@Transactional
	@Query(value="INSERT INTO Resource_Mapper_History(RS_Map_ID,RS_Res_ID,RS_Nav_ID,RS_Res_Duration,RS_Res_StartTimes,RS_Res_EndTimes,RS_Res_EntrySyetemTimes) SELECT * FROM Resource_Mapper;", nativeQuery=true) 
	void copyToResourceMapperHistoryFromResources();
	
	@Modifying
	@Transactional
	@Query(value="delete from Resource_Mapper", nativeQuery=true)
	void deleteresourceMapperTableData();

}
