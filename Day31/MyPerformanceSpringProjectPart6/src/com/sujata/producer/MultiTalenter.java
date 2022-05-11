package com.sujata.producer;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.BeanNameAware;

public class MultiTalenter implements Performer, BeanNameAware {

	private Map<String, String> songsDanceStyles;
	private String name;

	public MultiTalenter(Map<String, String> songsDanceStyles) {
		super();
		this.songsDanceStyles = songsDanceStyles;
	}

	@Override
	public void perform() {
		System.out.println(name+" is ");
		Set<String> songs=songsDanceStyles.keySet();
		for(String song:songs) {
			System.out.println("Singing "+song+" and dancing in "+songsDanceStyles.get(song)+" style!");
		}
		System.out.println("============================");
	}

	@Override
	public void setBeanName(String name) {
		this.name=name;

	}

}
