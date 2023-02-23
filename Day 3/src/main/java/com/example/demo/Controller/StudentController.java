package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studserv;
	
	@GetMapping("/show")
	public List<Student> showStudents(){
		return studserv.getStudents();
	}
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student obj){
		return studserv.addData(obj);
	}
	
	@GetMapping("/get/{id}")
	public Student getStudent(@PathVariable("id") Long id){
		return studserv.getData(id);
	}
	
	@DeleteMapping("/del/{id}")
	public void delStudent(@PathVariable("id") Long id){
		studserv.delData(id);
		
	}
	
	
	
}
