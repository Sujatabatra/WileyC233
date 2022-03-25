package com.sujata.demo;

public class Sports extends Student {

	private String sportName;

	
	public Sports(int rollNo, String name, String sportName) {
		super(rollNo, name);
		this.sportName = sportName;
	}

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
	
	public void displayStudentDetailsWithSports() {
		displayStudent();
		System.out.println("Sports Name : "+sportName);
	}
}
