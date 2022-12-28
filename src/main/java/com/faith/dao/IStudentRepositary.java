package com.faith.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.faith.bean.Student;



@Repository
public interface IStudentRepositary  extends MongoRepository<Student,String>{

	
//	// custom method for search by name
//		@Query("from Student where stdName like %?1%")
//		public List<Student> findByStudentName(String name);
//
//	
}
