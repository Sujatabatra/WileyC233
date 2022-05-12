package com.sujata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class EmployeeJPA {

	@Id // we are marking empId as primary key
	private int empId;
	private String empName;
	private String empDepartment;
	private String empDesignation;
	private double empSalary;
}
