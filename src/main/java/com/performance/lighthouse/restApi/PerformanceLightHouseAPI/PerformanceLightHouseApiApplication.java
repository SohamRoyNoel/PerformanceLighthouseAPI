/*
 * 
 * Developer: Soham Roy (Cognizant)
 * Technology: Spring Boot 2.3.1 & swagger 3
 * 
 * API : performance lighthouse tool
 * DB: Azure PaaS 
 * Server: azsqljhkanad02.database.windows.net,14445
 * DB Name: plhDashboardb 
 * 
 * 
 * */
package com.performance.lighthouse.restApi.PerformanceLightHouseAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PerformanceLightHouseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerformanceLightHouseApiApplication.class, args);
	}

}
