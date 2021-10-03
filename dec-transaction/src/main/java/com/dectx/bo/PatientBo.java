package com.dectx.bo;

import java.io.Serializable;

public class PatientBo implements Serializable {

	protected int patientNo;
	protected String patienName;
	protected String gender;
	protected int age;
	protected String disease;
	protected String contactNo;

	public int getPatientNo() {
		return patientNo;
	}

	public void setPatientNo(int patientNo) {
		this.patientNo = patientNo;
	}

	public String getPatienName() {
		return patienName;
	}

	public void setPatienName(String patienName) {
		this.patienName = patienName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "PatientBo [patientNo=" + patientNo + ", patienName=" + patienName + ", gender=" + gender + ", age="
				+ age + ", disease=" + disease + ", contactNo=" + contactNo + "]";
	}

}
