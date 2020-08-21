package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Resource_Master")
public class Resource_Master {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Res_ID")
	private int Res_ID;
	@Column(name="Res_Name")
	private String Res_Name;
	@Column(name="Res_Reg_ID")
	private int Res_Reg_ID;
	
	public Resource_Master() {
		
	}

	public int getRes_ID() {
		return Res_ID;
	}

	public void setRes_ID(int res_ID) {
		Res_ID = res_ID;
	}

	public String getRes_Name() {
		return Res_Name;
	}

	public void setRes_Name(String res_Name) {
		Res_Name = res_Name;
	}

	public int getRes_Reg_ID() {
		return Res_Reg_ID;
	}

	public void setRes_Reg_ID(int res_Reg_ID) {
		Res_Reg_ID = res_Reg_ID;
	}
	
	
}
