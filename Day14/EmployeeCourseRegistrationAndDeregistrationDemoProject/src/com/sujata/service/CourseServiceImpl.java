package com.sujata.service;

import java.util.List;

import com.sujata.entity.Course;
import com.sujata.persistence.CourseDao;
import com.sujata.persistence.CourseDaoImpl;

public class CourseServiceImpl implements CourseService {

	private CourseDao courseDao=new CourseDaoImpl();
	
	@Override
	public List<Course> getAllCourses() {
		return courseDao.getAllCourses();
	}

}
