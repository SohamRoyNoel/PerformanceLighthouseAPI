package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models.Navigation_Master_History;

@EnableJpaRepositories
public interface Navigation_HistoryRepository extends JpaRepository<Navigation_Master_History, Integer> {

}
