package com.faith.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.bean.Student;
import com.faith.dao.IStudentRepositary;

@Service
public class StudentService implements IStudentService{

	@Autowired
	private IStudentRepositary studRepo;
	
	public List<Student> getStudent() {
		
		return (List<Student>) studRepo.findAll();
	}

	public void saveStudent(Student student) {
		
		studRepo.save(student);
	}

	@Override
	public Optional<Student> getStudent(String id) {
		
		return studRepo.findById(id);
	}

	@Override
	public void deleteStudent(String id) {
		studRepo.deleteById(id);
		
	}

//	@Override
//	public List<Student> getStudentByName(String name) {
//		
//		return studRepo.findByStudentName(name);
//	}
	


}
