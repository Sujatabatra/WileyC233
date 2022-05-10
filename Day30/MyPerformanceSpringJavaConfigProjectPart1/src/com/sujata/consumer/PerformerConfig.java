package com.sujata.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Dancer;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;

@Configuration
public class PerformerConfig {

	@Bean
	public Dancer ManiDeep() {
		return new Dancer();
	}
	
	@Bean(name = "Harshit")
	public Singer getSinger() {
		return new Singer();
	}
	
	@Bean(name = "Hemalatha")
	public Juggler getJuggler() {
		return new Juggler();
	}
}
