package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.User_Registration;

@EnableJpaRepositories
public interface User_RegistrationRepository extends JpaRepository<User_Registration, Integer> {

	@Query(value="select * from User_Registration where Reg_API_KEY=:apiKey and Reg_UserID_Flag=1", nativeQuery=true) 
   User_Registration findUserByApiKey(@Param("apiKey") String apiKey);
	
}
