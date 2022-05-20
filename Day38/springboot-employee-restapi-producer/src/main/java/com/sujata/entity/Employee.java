package com.sujata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Employee {

	@Id 
	private Integer empId;
	
	
	private String empName;
	
	@Column(name = "department")
	private String empDepartment;
	
	@Column(name = "designation")
	private String empDesignation;
	
	@Column(name = "salary")
	private Double empSalary;
}
