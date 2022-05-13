package com.sujata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "EmployeeJPA")
public class Employee {

	@Id // we are marking empId as primary key
	@Column(name = "id")
	private int empId;
	
	@Column(name = "name")
	private String empName;
	
	@Column(name = "department")
	private String empDepartment;
	
	@Column(name = "designation")
	private String empDesignation;
	
	private double empSalary;
}
