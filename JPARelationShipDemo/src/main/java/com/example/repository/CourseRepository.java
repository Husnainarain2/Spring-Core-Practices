package com.example.repository;

import org.springframework.stereotype.Repository;

import com.example.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {


}
