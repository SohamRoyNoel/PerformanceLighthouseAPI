package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Navigation_Master;

@EnableJpaRepositories
public interface Navigation_MasterReposity extends JpaRepository<Navigation_Master, Integer> {

	@Query(value="select top 1 * from Navigation_Master p where p.Nav_TS_ID=:tcid and p.Nav_Application_ID=:apid and p.Nav_Page_ID=:pgid and p.Nav_Reg_ID=:uid order by p.Nav_ID desc", nativeQuery=true) 
    List<Navigation_Master> findNavByParam(@Param("tcid") int tcid,
							    		@Param("apid") int apid,
							    		@Param("pgid") int pgid,
							    		@Param("uid") int uid);
  
}
