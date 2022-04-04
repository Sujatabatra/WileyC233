package com.sujata.setdemo;

import java.util.Objects;

public class Employee {

	private int eId;
	private String eName;
	private String designation;
	private String deptt;
	private int salary;
	
	public Employee() {
		
	}

	public Employee(int eId, String eName, String designation, String deptt, int salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.designation = designation;
		this.deptt = deptt;
		this.salary = salary;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDeptt() {
		return deptt;
	}

	public void setDeptt(String deptt) {
		this.deptt = deptt;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", designation=" + designation + ", deptt=" + deptt
				+ ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(deptt, designation, eId, eName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(deptt, other.deptt) && Objects.equals(designation, other.designation) && eId == other.eId
				&& Objects.equals(eName, other.eName) && salary == other.salary;
	}
	
}
