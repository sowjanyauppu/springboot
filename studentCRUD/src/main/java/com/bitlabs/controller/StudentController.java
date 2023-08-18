package com.bitlabs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bitlabs.entity.Student;
import com.bitlabs.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping("/insert")
	public Student insertStudent(@RequestBody Student student)
	{
		System.out.println("insert record successfully");
		return studentService.createStudent(student);
	}
	
	@GetMapping("/show")
	public List<Student> display()
	{
		return studentService.getStudent();
	}
	@GetMapping("/students/{id}")
	public Optional<Student> displayById(@PathVariable int id)
	{
		return studentService.getStudentById(id);
	}
	
	@PutMapping("/update/{id}")
	
	public Student update(@PathVariable int id,@RequestBody Student updateStudent)
	{
		return studentService.updateStudent(id,updateStudent);
	}
	
	@DeleteMapping("/remove/{rollno}")
	public String delete(@PathVariable int rollno)
	{
		studentService.removeStudent(rollno);
		return "successfully delted";
	}
	
}
