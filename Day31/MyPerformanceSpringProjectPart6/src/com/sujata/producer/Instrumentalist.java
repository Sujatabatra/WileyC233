package com.sujata.producer;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.BeanNameAware;

public class Instrumentalist implements Performer,BeanNameAware {

	private Map<String, Instrument> songsInstruments;
	private String instrumentalistName;

	public Instrumentalist(Map<String, Instrument> songsInstruments) {
		super();
		this.songsInstruments = songsInstruments;
	}

	@Override
	public void perform() {
		System.out.print(instrumentalistName+" is ");
		Set<String> songs=songsInstruments.keySet();
		
		for(String song:songs) {
			System.out.print("Singing "+song+" and playing ");
			songsInstruments.get(song).play();
		}
		System.out.println("==========================");

	}

	@Override
	public void setBeanName(String name) {
		instrumentalistName=name;
		
	}

}
