package com.sujata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {

	private Integer empId;

	private String empName;

	private String empDepartment;

	private String empDesignation;

	private Double empSalary;
}
