package com.sujata.onedimension;

public class OneDStringArray {

	private String arr[];
	private int totalNoOfElements;
	
	public OneDStringArray(int totalNoOfElements) {
		super();
		this.totalNoOfElements = totalNoOfElements;
		arr=new String[totalNoOfElements];
	}

	public String[] getArr() {
		return arr;
	}

	
	public int getTotalNoOfElements() {
		return totalNoOfElements;
	}

	public void setElementAtLocation(String element,int index) {
		arr[index]=element;
	}
	
	public String getElementFromLocation(int index) {
		return arr[index];
	}
	
}
