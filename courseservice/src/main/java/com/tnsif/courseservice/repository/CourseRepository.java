package com.tnsif.courseservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.courseservice.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
