package com.tnsif.courseservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.courseservice.entity.Course;
import com.tnsif.courseservice.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	//save record
	public Course savecourse(Course course) {
		return courseRepository.save(course);
	}
	//to retrieve all records
	public List<Course> getAllCourses(){
		return courseRepository.findAll();
		}
	//ti get specific record
	public Course getCourseById(Long id) {
		return courseRepository.findById(id).orElse(null);
		
	}
	//to update record
	public Course updateCourse(Long id, Course course) {
		//to fetch existing record
		Course existingCourse = courseRepository.findById(id).orElse(null);
		
		//if course exists,update its files
		if(existingCourse !=null) {
			existingCourse.setName(course.getName());
			existingCourse.setDescription(course.getDescription());
			existingCourse.setInstructor(course.getInstructor());
			existingCourse.setPrice(course.getPrice());
			return courseRepository.save(existingCourse);
			
		}
		//if course didn't exist,return null
		return null;
	}
	public void deleteCourse(Long id) {
		courseRepository.deleteById(id);
	}
}
