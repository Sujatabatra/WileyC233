package com.sujata.presentation;

import java.util.List;
import java.util.Scanner;

import com.sujata.entity.Course;
import com.sujata.entity.Employee;
import com.sujata.service.CourseEmployeeService;
import com.sujata.service.CourseEmployeeServiceImpl;
import com.sujata.service.CourseService;
import com.sujata.service.CourseServiceImpl;

public class CourseEmployeePresentationImpl implements CourseEmployeePresentation {

	private CourseEmployeeService courseEmployeeService=new CourseEmployeeServiceImpl();
	private CourseService courseService=new CourseServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("1. List of Employees Enrolled in any Course");
		System.out.println("2. Register Employee for Course");
		System.out.println("3. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		int courseId=0;
		int employeeId=0;
		switch (choice) {
		case 1:
			System.out.println("Enter Course ID ");
			courseId=scanner.nextInt();
			List<Employee> employees= courseEmployeeService.getEmployeeByCourse(courseId);
			if(employees!=null) {
				for(Employee employee:employees) {
					System.out.println(employee);
				}
			}
			else
				System.out.println("No Employee Registered for this course or course doesnot exist");
			break;

		case 2:
			System.out.println("Enter Employee ID : ");
			employeeId=scanner.nextInt();
			List<Course> courses=courseService.getAllCourses();
			for(Course course:courses)
				System.out.println(course);
			System.out.println("Select one of the above course id to register for : ");
			courseId=scanner.nextInt();
			if(courseEmployeeService.registerEmployeeForCourse(employeeId, courseId))
				System.out.println("Employee Registered Successfully!");
			else
				System.out.println("Registration Not done ");
			break;
		case 3:
			System.out.println("Thanks for using Course Registration System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		
		}

	}

}
