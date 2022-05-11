package com.sujata.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.GoodMorining;

@Configuration
public class GreetConfig {

	@Bean
	public GoodMorining mrng() {
		return new GoodMorining("Kavya");
	}
}
