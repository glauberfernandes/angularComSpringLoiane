package com.gftecnologia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gftecnologia.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
