package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Resource_Mapper")
public class Resource_Mapper {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RS_Map_ID")
	private int RS_Map_ID;
	@Column(name="RS_Res_ID")
	private int RS_Res_ID;
	@Column(name="RS_Nav_ID")
	private int RS_Nav_ID;
	@Column(name="RS_Res_Duration")
	private String RS_Res_Duration;
	@Column(name="RS_Res_StartTimes")
	private Timestamp RS_Res_StartTimes;
	@Column(name="RS_Res_EndTimes")
	private Timestamp RS_Res_EndTimes;
	@Column(name="RS_Res_EntrySyetemTimes")
	private Timestamp RS_Res_EntrySyetemTimes;
	
	public Resource_Mapper() {
		
	}

	public int getRS_Map_ID() {
		return RS_Map_ID;
	}

	public void setRS_Map_ID(int rS_Map_ID) {
		RS_Map_ID = rS_Map_ID;
	}

	public int getRS_Res_ID() {
		return RS_Res_ID;
	}

	public void setRS_Res_ID(int rS_Res_ID) {
		RS_Res_ID = rS_Res_ID;
	}

	public int getRS_Nav_ID() {
		return RS_Nav_ID;
	}

	public void setRS_Nav_ID(int rS_Nav_ID) {
		RS_Nav_ID = rS_Nav_ID;
	}

	public String getRS_Res_Duration() {
		return RS_Res_Duration;
	}

	public void setRS_Res_Duration(String rS_Res_Duration) {
		RS_Res_Duration = rS_Res_Duration;
	}

	public Timestamp getRS_Res_StartTimes() {
		return RS_Res_StartTimes;
	}

	public void setRS_Res_StartTimes(Timestamp rS_Res_StartTimes) {
		RS_Res_StartTimes = rS_Res_StartTimes;
	}

	public Timestamp getRS_Res_EndTimes() {
		return RS_Res_EndTimes;
	}

	public void setRS_Res_EndTimes(Timestamp rS_Res_EndTimes) {
		RS_Res_EndTimes = rS_Res_EndTimes;
	}

	public Timestamp getRS_Res_EntrySyetemTimes() {
		return RS_Res_EntrySyetemTimes;
	}

	public void setRS_Res_EntrySyetemTimes(Timestamp rS_Res_EntrySyetemTimes) {
		RS_Res_EntrySyetemTimes = rS_Res_EntrySyetemTimes;
	}
	
	
	
}
