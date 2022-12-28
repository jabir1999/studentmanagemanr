package com.faith.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.bean.Student;

import com.faith.service.IStudentService;



@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class StudentController {
	
	@Autowired
	private IStudentService studService;
	
	//get all students
	@GetMapping("/listStudents")
	public List<Student> getStudent(){
		return studService.getStudent();
		
	}
	
	//add students
	@PostMapping("/addStudents")
	public void addStudent(@RequestBody Student student) {
		studService.saveStudent(student);
	}
	
	// get students by ID
		@GetMapping("/students/{id}")
		public Optional<Student> getStudent(@PathVariable String id) {
			return studService.getStudent(id);
		}

		// update students
		@PutMapping("/students/{id}")
	
		public void updateEmployee(@RequestBody Student student) {
			studService.saveStudent(student);			
		}

		// delete students
		@DeleteMapping("/deleteStudents/{id}")
		public void deleteStudent(@PathVariable String id) {
			studService.deleteStudent(id);

		}
		
		
//		//custom method using JPQL
//		@GetMapping("/students/search/{name}")
//		public List<Student> getAllStudentByName(@PathVariable String name){
//			return studService.getStudentByName(name);
//			
//		}
	
}
