package com.tnsif.studentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.studentservice.entity.Student;
import com.tnsif.studentservice.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	// Save student record
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	// Retrieve all students
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	// Retrieve a specific student by ID
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).orElse(null);
	}

	// Update student record
	public Student updateStudent(Long id, Student student) {
		// Fetch existing student record
		Student existingStudent = studentRepository.findById(id).orElse(null);

		// If student exists, update its fields
		if (existingStudent != null) {
			existingStudent.setName(student.getName());
			existingStudent.setDepartment(student.getDepartment());
			existingStudent.setRegisternumber(student.getRegisternumber());
			existingStudent.setContactnumber(student.getContactnumber());
			existingStudent.setArrear(student.getArrear());
			existingStudent.setFees(student.getFees());
			return studentRepository.save(existingStudent);
		}

		// If student doesn't exist, return null
		return null;
	}

	// Delete student by ID
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
}
