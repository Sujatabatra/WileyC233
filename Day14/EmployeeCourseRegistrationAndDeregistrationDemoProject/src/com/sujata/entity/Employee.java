package com.sujata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Employee {
	private int empId;
	private String empName;
	private String empDesignation;
	private String empDepartment;
}
