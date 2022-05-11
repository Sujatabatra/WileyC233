package com.sujata.producer;

import java.util.List;

import org.springframework.beans.factory.BeanNameAware;

public class Dancer implements Performer,BeanNameAware {

	private List<String> danceStyles;
	private String dancerName;
	
	public void setDanceStyles(List<String> danceStyles) {
		this.danceStyles = danceStyles;
	}

	@Override
	public void perform() {
		System.out.print(dancerName+" is dancing in ");
		for(String danceStyle:danceStyles) {
			System.out.print(danceStyle+"   ");
		}
		System.out.println("Styles");
		System.out.println("=====================");

	}

	@Override
	public void setBeanName(String name) {
		dancerName=name;
		
	}

}
