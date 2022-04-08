package com.sujata.persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.sujata.database.CourseDatabase;
import com.sujata.entity.Course;

public class CourseDaoImpl implements CourseDao {

	@Override
	public Optional<Course> getCourseById(int id) {
		
		return Optional.ofNullable(CourseDatabase.getCourseList().get(id));
	}

	@Override
	public List<Course> getAllCourses() {
		
		return new ArrayList<Course>(CourseDatabase.getCourseList().values());
	}

}
