package com.springboot.first.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	//http;//localhost:8080/student 
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Chetan","Kumar");
	}
	
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> students =new ArrayList<>();
		students.add(new Student("Chetan","Kumar"));
		students.add(new Student("Harsh","Patil"));
		students.add(new Student("Mayank","Vishwakarma"));
		students.add(new Student("Sneha","Yadav"));
		students.add(new Student("Lionel","Messi"));
		return students;
		
		
	}

	
	//http:localhost:8080/student/chetan or 3 as path variable
	//http:localhost:8080/student/chetan/kumar
	//@PathVariable annotation
	
	
	@GetMapping("{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
		return new Student(firstName,lastName);
	}
	
	//REST API to handle query parameters
	//http:localhost:8080/student?firstName=Chetan&lastName=Kumar
	
	@GetMapping("/studentquery")
	public Student studentQueryParam(@RequestParam(name ="firstName") String firstName,@RequestParam(name ="lastName") String lastName) {
		return new Student(firstName,lastName);
	}
	
	
	
	
	
	
	
	
}
	

