package com.sujata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Employee {

	@Id
	private int empId;
	private String empName;
	@Column(name = "designation")
	private String empDesignation;
	@Column(name ="department")
	private String empDepartment;
	@Column(name = "salary")
	private double empSalary;
	
	
}
