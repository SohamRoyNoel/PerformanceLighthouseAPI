package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Page_Master")
public class Page_Master {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Page_ID")
	private int Page_ID;
	@Column(name="Page_Name")
	private String Page_Name;
		
	
	public Page_Master() {
		
	}

	public Page_Master(String page_Name) {
		Page_Name = page_Name;
	}
	
	public int getPage_ID() {
		return Page_ID;
	}

	public void setPage_ID(int page_ID) {
		Page_ID = page_ID;
	}

	public String getPage_Name() {
		return Page_Name;
	}

	public void setPage_Name(String page_Name) {
		Page_Name = page_Name;
	}
	
}
