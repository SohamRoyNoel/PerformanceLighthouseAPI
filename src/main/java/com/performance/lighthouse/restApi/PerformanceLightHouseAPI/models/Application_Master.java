package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Application_Master")
@JsonIgnoreProperties(value = { "Application_CreationTime" })
public class Application_Master {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Application_ID")
	private int Application_ID;
	@Column(name="Application_Name")
	private String Application_Name;
	@Column(name="Application_Reg_Admin_UserID")
	private int Application_Reg_Admin_UserID;
	@Column(name="Application_CreationTime")
	private Timestamp Application_CreationTime;
	@Column(name="Application_ID_Flag")
	private int Application_ID_Flag;
		
	
	public Application_Master() {
		
	}


	public int getApplication_ID() {
		return Application_ID;
	}


	public void setApplication_ID(int application_ID) {
		Application_ID = application_ID;
	}


	public String getApplication_Name() {
		return Application_Name;
	}


	public void setApplication_Name(String application_Name) {
		Application_Name = application_Name;
	}


	public int getApplication_Reg_Admin_UserID() {
		return Application_Reg_Admin_UserID;
	}


	public void setApplication_Reg_Admin_UserID(int application_Reg_Admin_UserID) {
		Application_Reg_Admin_UserID = application_Reg_Admin_UserID;
	}


	public Timestamp getApplication_CreationTime() {
		return Application_CreationTime;
	}


	public void setApplication_CreationTime(Timestamp application_CreationTime) {
		Application_CreationTime = application_CreationTime;
	}


	public int getApplication_ID_Flag() {
		return Application_ID_Flag;
	}


	public void setApplication_ID_Flag(int application_ID_Flag) {
		Application_ID_Flag = application_ID_Flag;
	}

	
	
	
	
}
