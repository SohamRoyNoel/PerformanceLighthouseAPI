package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TestScenario_Master")
public class TestScenario_Master {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TS_ID")
	private int TS_ID;
	@Column(name="TS_Name")
	private String TS_Name;
	@Column(name="TS_Application_ID")
	private int TS_Application_ID;
	@Column(name="TS_Reg_UserID")
	private int TS_Reg_UserID;
	@Column(name="TS_CreationTime")
	private Timestamp TS_CreationTime;
	@Column(name="TS_ID_FLAG")
	private int TS_ID_FLAG;
	
	public TestScenario_Master() {
		
	}

	public int getTS_ID() {
		return TS_ID;
	}

	public void setTS_ID(int tS_ID) {
		TS_ID = tS_ID;
	}

	public String getTS_Name() {
		return TS_Name;
	}

	public void setTS_Name(String tS_Name) {
		TS_Name = tS_Name;
	}

	public int getTS_Application_ID() {
		return TS_Application_ID;
	}

	public void setTS_Application_ID(int tS_Application_ID) {
		TS_Application_ID = tS_Application_ID;
	}

	public int getTS_Reg_UserID() {
		return TS_Reg_UserID;
	}

	public void setTS_Reg_UserID(int tS_Reg_UserID) {
		TS_Reg_UserID = tS_Reg_UserID;
	}

	public Timestamp getTS_CreationTime() {
		return TS_CreationTime;
	}

	public void setTS_CreationTime(Timestamp tS_CreationTime) {
		TS_CreationTime = tS_CreationTime;
	}

	public int getTS_ID_FLAG() {
		return TS_ID_FLAG;
	}

	public void setTS_ID_FLAG(int tS_ID_FLAG) {
		TS_ID_FLAG = tS_ID_FLAG;
	}
	
	
	
}
