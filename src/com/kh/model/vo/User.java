package com.kh.model.vo;

public class User implements java.io.Serializable{

	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", pwCheck=" + pwCheck + ", Name=" + Name + ", email=" + email
				+ ", Mentor_or_Mentee=" + Mentor_or_Mentee + "]";
	}

	private int UserNo;
	
	public int getUserNo() {
		return UserNo;
	}

	public void setUserNo(int userNo) {
		UserNo = userNo;
	}

	private String id;
	private String pw;
	private String pwCheck;
	private String Name;
	private String email;
	private String Mentor_or_Mentee;
	
	public String getMentor_or_Mentee() {
		return Mentor_or_Mentee;
	}

	public void setMentor_or_Mentee(String mentor_or_Mentee) {
		Mentor_or_Mentee = mentor_or_Mentee;
	}

	public User() {

	}

	public User(int UserNo, String id, String pw, String pwCheck, String name, String email, String Mentor_or_Mentee) {
		super();
		this.UserNo = UserNo;
		this.id = id;
		this.pw = pw;
		this.pwCheck = pwCheck;
		this.Name = name;
		this.email = email;
		this.Mentor_or_Mentee = Mentor_or_Mentee;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPwCheck() {
		return pwCheck;
	}

	public void setPwCheck(String pwCheck) {
		this.pwCheck = pwCheck;
	}

	public String getName() {
		return Name;
	}

	

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
