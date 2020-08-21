package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Navigation_Master")
public class Navigation_Master {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Nav_ID")
	private int Nav_ID;
	
	@Column(name="Nav_TS_ID")
	private int Nav_TS_ID;
	@Column(name="Nav_Application_ID")
	private int Nav_Application_ID;
	@Column(name="Nav_Page_ID")
	private int Nav_Page_ID;
	@Column(name="Nav_Reg_ID")
	private int Nav_Reg_ID;
	@Column(name="Nav_UnloadEvent")
	private String Nav_UnloadEvent;
	@Column(name="Nav_RedirectEvent")
	private String Nav_RedirectEvent;
	@Column(name="Nav_AppCache")
	private String Nav_AppCache;
	@Column(name="Nav_TTFB")
	private String Nav_TTFB;
	@Column(name="Nav_Processing")
	private String Nav_Processing;
	@Column(name="Nav_DomInteractive")
	private String Nav_DomInteractive;
	@Column(name="Nav_DomComplete")
	private String Nav_DomComplete;
	@Column(name="Nav_ContentLoad")
	private String Nav_ContentLoad;
	@Column(name="Nav_PageLoad")
	private String Nav_PageLoad;
	@Column(name="Nav_EntrySyetemTimes")
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private Timestamp Nav_EntrySyetemTimes;
	
	
	
	public Navigation_Master() {
		
	}

	
	
//	public Navigation_Master(int nav_ID, int nav_TS_ID, int nav_Application_ID, int nav_Page_ID, int nav_Reg_ID,
//			String nav_UnloadEvent, String nav_RedirectEvent, String nav_AppCache, String nav_TTFB,
//			String nav_Processing, String nav_DomInteractive, String nav_DomComplete, String nav_ContentLoad,
//			String nav_PageLoad, Timestamp nav_EntrySyetemTimes) {
//		
//		Nav_ID = nav_ID;
//		Nav_TS_ID = nav_TS_ID;
//		Nav_Application_ID = nav_Application_ID;
//		Nav_Page_ID = nav_Page_ID;
//		Nav_Reg_ID = nav_Reg_ID;
//		Nav_UnloadEvent = nav_UnloadEvent;
//		Nav_RedirectEvent = nav_RedirectEvent;
//		Nav_AppCache = nav_AppCache;
//		Nav_TTFB = nav_TTFB;
//		Nav_Processing = nav_Processing;
//		Nav_DomInteractive = nav_DomInteractive;
//		Nav_DomComplete = nav_DomComplete;
//		Nav_ContentLoad = nav_ContentLoad;
//		Nav_PageLoad = nav_PageLoad;
//		Nav_EntrySyetemTimes = nav_EntrySyetemTimes;
//	}



	public int getNav_ID() {
		return Nav_ID;
	}

	public void setNav_ID(int nav_ID) {
		Nav_ID = nav_ID;
	}

	public int getNav_TS_ID() {
		return Nav_TS_ID;
	}

	public void setNav_TS_ID(int nav_TS_ID) {
		Nav_TS_ID = nav_TS_ID;
	}

	public int getNav_Application_ID() {
		return Nav_Application_ID;
	}

	public void setNav_Application_ID(int nav_Application_ID) {
		Nav_Application_ID = nav_Application_ID;
	}

	public int getNav_Page_ID() {
		return Nav_Page_ID;
	}

	public void setNav_Page_ID(int nav_Page_ID) {
		Nav_Page_ID = nav_Page_ID;
	}

	public int getNav_Reg_ID() {
		return Nav_Reg_ID;
	}

	public void setNav_Reg_ID(int nav_Reg_ID) {
		Nav_Reg_ID = nav_Reg_ID;
	}

	public String getNav_UnloadEvent() {
		return Nav_UnloadEvent;
	}

	public void setNav_UnloadEvent(String nav_UnloadEvent) {
		Nav_UnloadEvent = nav_UnloadEvent;
	}

	public String getNav_RedirectEvent() {
		return Nav_RedirectEvent;
	}

	public void setNav_RedirectEvent(String nav_RedirectEvent) {
		Nav_RedirectEvent = nav_RedirectEvent;
	}

	public String getNav_AppCache() {
		return Nav_AppCache;
	}

	public void setNav_AppCache(String nav_AppCache) {
		Nav_AppCache = nav_AppCache;
	}

	public String getNav_TTFB() {
		return Nav_TTFB;
	}

	public void setNav_TTFB(String nav_TTFB) {
		Nav_TTFB = nav_TTFB;
	}

	public String getNav_Processing() {
		return Nav_Processing;
	}

	public void setNav_Processing(String nav_Processing) {
		Nav_Processing = nav_Processing;
	}

	public String getNav_DomInteractive() {
		return Nav_DomInteractive;
	}

	public void setNav_DomInteractive(String nav_DomInteractive) {
		Nav_DomInteractive = nav_DomInteractive;
	}

	public String getNav_DomComplete() {
		return Nav_DomComplete;
	}

	public void setNav_DomComplete(String nav_DomComplete) {
		Nav_DomComplete = nav_DomComplete;
	}

	public String getNav_ContentLoad() {
		return Nav_ContentLoad;
	}

	public void setNav_ContentLoad(String nav_ContentLoad) {
		Nav_ContentLoad = nav_ContentLoad;
	}

	public String getNav_PageLoad() {
		return Nav_PageLoad;
	}

	public void setNav_PageLoad(String nav_PageLoad) {
		Nav_PageLoad = nav_PageLoad;
	}

	public Timestamp getNav_EntrySyetemTimes() {
		return Nav_EntrySyetemTimes;
	}

	public void setNav_EntrySyetemTimes(Timestamp nav_EntrySyetemTimes) {
		Nav_EntrySyetemTimes = nav_EntrySyetemTimes;
	}
	
	
	
}
