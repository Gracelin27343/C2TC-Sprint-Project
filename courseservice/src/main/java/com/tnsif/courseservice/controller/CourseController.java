package com.tnsif.courseservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.courseservice.entity.Course;
import com.tnsif.courseservice.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping("/Course")
	public Course createCourse(@RequestBody Course course) {
		return courseService.savecourse(course);
	}
	
	@GetMapping("/Course")
	public List<Course> getAllCourses(){
		return courseService.getAllCourses();
	}
	//retrieve
	@GetMapping("/Course/{id}")
	public Course getcourseById(@PathVariable Long id) {
		return courseService.getCourseById(id);
		}
	
	//update
	@PutMapping("/Course/{id}")
	public Course updateCourse(@PathVariable Long id, @RequestBody Course course) {
		return courseService.updateCourse(id, course);
		
	}
	@DeleteMapping("/Course/{id}")
	public void deleteCourse(@PathVariable Long id) {
		courseService.deleteCourse(id);
	}
}
