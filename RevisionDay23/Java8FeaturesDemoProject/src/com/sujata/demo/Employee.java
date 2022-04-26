package com.sujata.demo;

public class Employee {

	private int empId;
	private String empName;
	private String designation;
	private String department;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(int empId, String empName, String designation, String department, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", department="
				+ department + ", salary=" + salary + "]";
	}
	
}
