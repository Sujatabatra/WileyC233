package com.sujata.database;

import java.util.HashMap;
import java.util.Map;

import com.sujata.entity.Course;


public class CourseDatabase {
	static private Map<Integer, Course> courseList = new HashMap<>();
	
	static {
		courseList.put(1, new Course(1, "Java", 1000, "classroom", "full time"));
		courseList.put(2, new Course(2, "Python", 800, "online", "full time"));
		courseList.put(3, new Course(3, "Aptitude", 500, "online", "part time"));
		courseList.put(4, new Course(4, "Soft SKills", 700, "classroom", "part time"));
		courseList.put(5, new Course(5, "AI ML", 1500, "online", "full time"));
	}

	public static Map<Integer, Course> getCourseList() {
		return courseList;
	}

	public static void setCourseList(Map<Integer, Course> courseList) {
		CourseDatabase.courseList = courseList;
	}
}
