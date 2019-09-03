package com.kh.model.vo;

public class Mentor extends User implements java.io.Serializable{

	
	

	private String SchoolName;
	private String CompanyName;
	private int WorkingYear;
	private String field_Mentoring;
	


	@Override
	public String toString() {
		return super.toString() + "Mentor [SchoolName=" + SchoolName + ", CompanyName=" + CompanyName + ", WorkingYear=" + WorkingYear
				+ ", field_Mentoring=" + field_Mentoring + "]";
	}

	public Mentor() {}

	public Mentor(int UserNo, String id, String pw, String pwCheck, String Name, String email, String Mentor_or_Mentee, String schoolName, String companyName, int workingYear, String field_Mentoring) {
		super(UserNo,id,pw,pwCheck,Name,email,Mentor_or_Mentee);
		
		this.SchoolName = schoolName;
		this.CompanyName = companyName;
		this.WorkingYear = workingYear;
		this.field_Mentoring = field_Mentoring;
	}

	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public int getWorkingYear() {
		return WorkingYear;
	}

	public void setWorkingYear(int workingYear) {
		WorkingYear = workingYear;
	}

	public String getField_Mentoring() {
		return field_Mentoring;
	}

	public void setField_Mentoring(String field_Mentoring) {
		this.field_Mentoring = field_Mentoring;
	}
	
	
	
}
