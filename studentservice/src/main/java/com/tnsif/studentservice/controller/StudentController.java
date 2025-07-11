package com.tnsif.studentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.studentservice.entity.Student;
import com.tnsif.studentservice.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	// Create a new student
	@PostMapping("/Student")
	public Student createStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	// Retrieve all students
	@GetMapping("/Student")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	// Retrieve student by ID
	@GetMapping("/Student/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}

	// Update student
	@PutMapping("/Student/{id}")
	public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}

	// Delete student
	@DeleteMapping("/Student/{id}")
	public void deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
	}
}

