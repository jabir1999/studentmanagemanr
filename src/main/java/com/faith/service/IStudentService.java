package com.faith.service;

import java.util.List;
import java.util.Optional;

import com.faith.bean.Student;

public interface IStudentService {

	//list
	public List<Student> getStudent();
	
	//insert
	public void saveStudent(Student student);
	
	// update by id
	public Optional<Student> getStudent(String id);
	
	// delete
	public void deleteStudent(String id);
	
//	// search by name
//	public List<Student> getStudentByName(String name);
//	
	
	
}
