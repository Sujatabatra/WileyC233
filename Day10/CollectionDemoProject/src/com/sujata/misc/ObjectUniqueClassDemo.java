package com.sujata.misc;

import java.util.Objects;

class Employee{
	private int eId;
	private String name;
	private String deptt;
	private String desig;
	private String salary;
	
	public Employee() {
		
	}
	public Employee(int eId, String name, String deptt, String desig, String salary) {
		super();
		this.eId = eId;
		this.name = name;
		this.deptt = deptt;
		this.desig = desig;
		this.salary = salary;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptt() {
		return deptt;
	}

	public void setDeptt(String deptt) {
		this.deptt = deptt;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(deptt, desig, eId, name, salary);
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
		return Objects.equals(deptt, other.deptt) && Objects.equals(desig, other.desig) && eId == other.eId
				&& Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}
	
	
}
public class ObjectUniqueClassDemo {

	public static void main(String[] args) {
		int i=10;
		int j=10;
		if(i==j)
			System.out.println("Both are equal");
		else
			System.out.println("Both are different");
		
		Employee e1=new Employee(111, "AAA", "Sales", "Executive", "12345");
		Employee e2=new Employee(111, "AAA", "Sales", "Executive", "12345");

		if(e1==e2)
			System.out.println("Both are equal");
		else
			System.out.println("Both are different");
		
		if(e1.equals(e2))
			System.out.println("Both are equal");
		else
			System.out.println("Both are different");
		
		System.out.println(" e1 : "+e1);
		System.out.println(" e2 : "+e2);
	}

}
