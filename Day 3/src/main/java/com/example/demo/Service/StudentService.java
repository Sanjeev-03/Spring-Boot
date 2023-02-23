package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;	
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studserv;
	
	public List<Student> getStudents(){
		List<Student> arr = new ArrayList<>();
		arr = (List<Student>) studserv.findAll();
		return arr;
	}

	public Student addData(Student obj) {
		
		return studserv.save(obj);
	}

	public Student getData(Long id) {
		Student stud = studserv.findById(id).get();
		
		return stud;
	}

	public void delData(Long id) {
		studserv.deleteById(id);
		
	}



	
}
