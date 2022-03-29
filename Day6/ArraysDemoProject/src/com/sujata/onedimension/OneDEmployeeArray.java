package com.sujata.onedimension;

import com.sujata.entity.Employee;

public class OneDEmployeeArray {

	private Employee arr[];
	private int totalNoOfElements;
	
	public OneDEmployeeArray(int totalNoOfElements) {
		super();
		this.totalNoOfElements = totalNoOfElements;
		arr=new Employee[totalNoOfElements];
	}

	public Employee[] getArr() {
		return arr;
	}

	
	public int getTotalNoOfElements() {
		return totalNoOfElements;
	}

	public void setElementAtLocation(Employee element,int index) {
		arr[index]=element;
	}
	
	public Employee getElementFromLocation(int index) {
		return arr[index];
	}
	
}
