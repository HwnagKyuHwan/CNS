package com.kh.model.vo;

public class Mentee extends User implements java.io.Serializable{
	
	
	

	private String job;
	private String field_Mentee;
	
	
	
	@Override
	public String toString() {

		return "Mentee [job=" + 	super.toString() + "," +job + ", field_Mentee=" + field_Mentee + "]";
	}



	public Mentee() {}



	public Mentee(int UserNo, String id, String pw, String pwCheck, String Name, String email,String Mentor_or_Mentee, String job, String field_Mentee) {
		super(UserNo, id,pw,pwCheck,Name,email,Mentor_or_Mentee);
		this.job = job;
		this.field_Mentee = field_Mentee;
	}



	public String getJob() {
		return job;
	}



	public void setJob(String job) {
		this.job = job;
	}



	public String getField_Mentee() {
		return field_Mentee;
	}



	public void setField_Mentee(String field_Mentee) {
		this.field_Mentee = field_Mentee;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
