package com.sujata.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Dancer;
import com.sujata.producer.Drum;
import com.sujata.producer.Guitar;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;
import com.sujata.producer.Tabla;

@Configuration
public class PerformanceConfig {

	@Bean
	public Dancer ManiDeep() {
		Dancer dancer=new Dancer();
		dancer.setDanceStyle("Hip Hop");
		return dancer;
	}
	
	@Bean
	public Singer Harshit() {
		return new Singer("Khamoshiya");
	}
	
	@Bean
	public Juggler Hemalatha() {
		Juggler juggler=new Juggler();
		juggler.setBalls(3);
		return juggler;
	}
	
	@Bean
	public Guitar guitar() {
		return new Guitar();
	}
	
	@Bean
	public Drum drum() {
		return new Drum();
	}
	
	@Bean
	public Tabla tabla() {
		return new Tabla();
	}
	
	@Bean
	public Instrumentalist Himanshu() {
		return new Instrumentalist(guitar());
	}
}
