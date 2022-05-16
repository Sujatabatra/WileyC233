package com.sujata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="EmpTab")
public class Employee {

	@Id
	private int empId;
	private String empName;
	private String designation;
	private double salary;
	@ManyToOne
	private Project project;
	
}
