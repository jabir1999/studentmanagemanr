package com.faith.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student1")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String stdId;
	private String stdName;
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private String admissionNumber;
	private String dateOfBirth;
	private String className;
	private String division;
	private String gender; 
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(String stdId, String stdName,  String dateOfBirth, String className,
			String division, String gender) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		//this.admissionNumber = admissionNumber;
		this.dateOfBirth = dateOfBirth;
		this.className = className;
		this.division = division;
		this.gender = gender;
	}



	public String getStdId() {
		return stdId;
	}



	public void setStdId(String stdId) {
		this.stdId = stdId;
	}



	public String getStdName() {
		return stdName;
	}



	public void setStdName(String stdName) {
		this.stdName = stdName;
	}



	//public String getAdmissionNumber() {
	//	return admissionNumber;
	//}



	//public void setAdmissionNumber(String admissionNumber) {
	//	this.admissionNumber = admissionNumber;
	//}



	public String getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getClassName() {
		return className;
	}



	public void setClassName(String className) {
		this.className = className;
	}



	public String getDivision() {
		return division;
	}



	public void setDivision(String division) {
		this.division = division;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", admissionNumber=" //+ admissionNumber
				+ ", dateOfBirth=" + dateOfBirth + ", className=" + className + ", division=" + division + ", gender="
				+ gender + "]";
	}
	
	
}
