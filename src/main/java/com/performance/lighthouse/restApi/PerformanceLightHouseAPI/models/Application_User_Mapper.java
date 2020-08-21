package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Application_User_Mapper")
public class Application_User_Mapper {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="App_Map_ID")
	private int App_Map_ID;
	@Column(name="App_Application_ID")
	private int App_Application_ID;
	@Column(name="App_user_Reg_ID")
	private int App_user_Reg_ID;
	@Column(name="App_Map_ID_FLAG")
	private int App_Map_ID_FLAG;
	
	public Application_User_Mapper() {
		
	}

	public int getApp_Map_ID() {
		return App_Map_ID;
	}

	public void setApp_Map_ID(int app_Map_ID) {
		App_Map_ID = app_Map_ID;
	}

	public int getApp_Application_ID() {
		return App_Application_ID;
	}

	public void setApp_Application_ID(int app_Application_ID) {
		App_Application_ID = app_Application_ID;
	}

	public int getApp_user_Reg_ID() {
		return App_user_Reg_ID;
	}

	public void setApp_user_Reg_ID(int app_user_Reg_ID) {
		App_user_Reg_ID = app_user_Reg_ID;
	}

	public int getApp_Map_ID_FLAG() {
		return App_Map_ID_FLAG;
	}

	public void setApp_Map_ID_FLAG(int app_Map_ID_FLAG) {
		App_Map_ID_FLAG = app_Map_ID_FLAG;
	}
	
	
}
