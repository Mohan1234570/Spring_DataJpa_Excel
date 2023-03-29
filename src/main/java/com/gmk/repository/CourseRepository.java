package com.gmk.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmk.course.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable>{
	

}
