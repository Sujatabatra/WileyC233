package com.sujata.service;

import java.util.List;
import java.util.Optional;

import com.sujata.entity.Course;
import com.sujata.entity.Employee;
import com.sujata.persistence.CourseDao;
import com.sujata.persistence.CourseDaoImpl;
import com.sujata.persistence.CourseEmployeeDao;
import com.sujata.persistence.CourseEmployeeImpl;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class CourseEmployeeServiceImpl implements CourseEmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	private CourseDao courseDao=new CourseDaoImpl();
	private CourseEmployeeDao courseEmployeeDao=new CourseEmployeeImpl();
	
	@Override
	public boolean registerEmployeeForCourse(int employeeId, int courseId) {
		Optional<Employee> optionalEmployee=employeeDao.getEmployeeById(employeeId);
		Optional<Course> optionalCourse=courseDao.getCourseById(courseId);
		if(!optionalCourse.isPresent() || !optionalEmployee.isPresent())
			return false;
		
		return courseEmployeeDao.addEmployeeToSpecificCourse(optionalCourse.get(), optionalEmployee.get());
		
	}

	@Override
	public List<Employee> getEmployeeByCourse(int id) {
		Optional<Course> optionalCourse=courseDao.getCourseById(id);
		if(optionalCourse.isPresent())
			return courseEmployeeDao.getEmployeeListRegisteredForSpecificCourse(optionalCourse.get());
		return null;
	}

}
