package com.gftecnologia.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gftecnologia.model.Course;
import com.gftecnologia.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
	
	private CourseRepository courseRepository;
	
	public CourseController(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@GetMapping
	public List<Course> list(){
		return courseRepository.findAll();
	}

}
