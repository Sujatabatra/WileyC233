package com.sujata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@ToString
@Data
public class Employee {
	private int empId;
	private String empName;
	private String empDesignation;
	private String empDepartment;
	private double empSalary;
	
	
}
