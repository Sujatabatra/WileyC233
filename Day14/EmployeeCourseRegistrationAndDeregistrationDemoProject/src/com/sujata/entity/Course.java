package com.sujata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Course {
	private int courseId;
	private String courseName;
	private int courseFee;
	private String courseDeliveryType;
	private String courseType;
}
