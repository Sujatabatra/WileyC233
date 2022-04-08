package com.sujata.persistence;

import java.util.List;
import java.util.Optional;

import com.sujata.entity.Course;

public interface CourseDao {

	Optional<Course> getCourseById(int id);
	List<Course> getAllCourses();
}
