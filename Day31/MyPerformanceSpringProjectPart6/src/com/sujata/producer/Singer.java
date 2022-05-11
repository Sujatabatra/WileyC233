package com.sujata.producer;

import java.util.Set;

import org.springframework.beans.factory.BeanNameAware;

public class Singer implements Performer ,BeanNameAware{

	private Set<String> songs;
	private String singerName;

	public Singer(Set<String> songs) {
		super();
		this.songs = songs;
	}

	@Override
	public void perform() {
		System.out.println(singerName+" is singing " );
		for(String song:songs) {
			System.out.println(song);
		}
		System.out.println("=================");

	}

	@Override
	public void setBeanName(String name) {
		singerName=name;
		
	}

}
