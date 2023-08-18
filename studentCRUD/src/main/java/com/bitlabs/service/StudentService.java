package com.bitlabs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlabs.Repository.StudentRepository;
import com.bitlabs.entity.Student;
@Service
public class StudentService {
@Autowired
	private StudentRepository studentRepository;
public Student createStudent(Student student)
{
		return studentRepository.save(student);
	
}
public List<Student> getStudent()
{
	return studentRepository.findAll();
}

public Optional<Student> getStudentById(int id)
{
	return studentRepository.findById(id);
}

public Student updateStudent(int id, Student student) {
    Optional<Student> existingStudentOptional = studentRepository.findById(id);

    if (existingStudentOptional.isPresent()) {
        Student existingStudent = existingStudentOptional.get();

        // Update the fields of the existing student with the data from the incoming student
        existingStudent.setName(student.getName());
        existingStudent.setAddress(student.getAddress());
        // Update other fields as needed

        return studentRepository.save(existingStudent);
    }

    return null; // Handle case where student is not found
}

public void removeStudent(int rollno)
{
	studentRepository.deleteById(rollno);
}


}
