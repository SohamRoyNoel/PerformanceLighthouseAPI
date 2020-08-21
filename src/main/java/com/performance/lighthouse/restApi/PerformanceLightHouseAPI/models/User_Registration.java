package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Registration")
public class User_Registration {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Reg_UserID")
	private int Reg_UserID;
	@Column(name="Reg_F_Name")
	private String Reg_F_Name;
	@Column(name="Reg_L_Name")
	private String Reg_L_Name;
	@Column(name="Reg_UserName")
	private String Reg_UserName;
	@Column(name="Reg_Email")
	private String Reg_Email;
	@Column(name="Reg_Password")
	private String Reg_Password;
	@Column(name="Reg_API_KEY")
	private String Reg_API_KEY;
	@Column(name="Reg_Security_Qus_ID")
	private int Reg_Security_Qus_ID;
	@Column(name="Reg_Security_Qus_Ans")
	private String Reg_Security_Qus_Ans;
	@Column(name="Reg_User_Type")
	private String Reg_User_Type;
	
	public User_Registration() {
		super();
	}

	public int getReg_UserID() {
		return Reg_UserID;
	}

	public void setReg_UserID(int reg_UserID) {
		Reg_UserID = reg_UserID;
	}

	public String getReg_F_Name() {
		return Reg_F_Name;
	}

	public void setReg_F_Name(String reg_F_Name) {
		Reg_F_Name = reg_F_Name;
	}

	public String getReg_L_Name() {
		return Reg_L_Name;
	}

	public void setReg_L_Name(String reg_L_Name) {
		Reg_L_Name = reg_L_Name;
	}

	public String getReg_UserName() {
		return Reg_UserName;
	}

	public void setReg_UserName(String reg_UserName) {
		Reg_UserName = reg_UserName;
	}

	public String getReg_Email() {
		return Reg_Email;
	}

	public void setReg_Email(String reg_Email) {
		Reg_Email = reg_Email;
	}

	public String getReg_Password() {
		return Reg_Password;
	}

	public void setReg_Password(String reg_Password) {
		Reg_Password = reg_Password;
	}

	public String getReg_API_KEY() {
		return Reg_API_KEY;
	}

	public void setReg_API_KEY(String reg_API_KEY) {
		Reg_API_KEY = reg_API_KEY;
	}

	public int getReg_Security_Qus_ID() {
		return Reg_Security_Qus_ID;
	}

	public void setReg_Security_Qus_ID(int reg_Security_Qus_ID) {
		Reg_Security_Qus_ID = reg_Security_Qus_ID;
	}

	public String getReg_Security_Qus_Ans() {
		return Reg_Security_Qus_Ans;
	}

	public void setReg_Security_Qus_Ans(String reg_Security_Qus_Ans) {
		Reg_Security_Qus_Ans = reg_Security_Qus_Ans;
	}

	public String getReg_User_Type() {
		return Reg_User_Type;
	}

	public void setReg_User_Type(String reg_User_Type) {
		Reg_User_Type = reg_User_Type;
	}
	
	
	
}
