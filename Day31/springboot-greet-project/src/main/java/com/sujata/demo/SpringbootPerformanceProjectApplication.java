package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sujata.producer.GoodMorining;
import com.sujata.producer.Greet;

//@SpringBootApplication = @Configuration + @ComponentScan
@SpringBootApplication(scanBasePackages = "com.sujata")
public class SpringbootPerformanceProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(SpringbootPerformanceProjectApplication.class, args);
		Greet greet1=(Greet)springContainer.getBean("eve");
		greet1.wish();
		
		Greet greet2=(Greet)springContainer.getBean("mrng");
		greet2.wish();
	}

	
//	@Bean
//	public GoodMorining mrng() {
//		return new GoodMorining("Kavya");
//	}
}
