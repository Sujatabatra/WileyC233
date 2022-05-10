package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class StagePerformance {

	public static void main(String[] args) {
		
		/*
		 * IOC : Inversion of Control 
		 * ioc: separating the business logic from dependency logic
		 * 
		 */
		
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		
		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(com.sujata.consumer.PerformanceConfig.class);
		Performer performer1=(Performer)springContainer.getBean("ManiDeep");
		
		performer1.perform();
		
		Performer performer2=(Performer)springContainer.getBean("Hemalatha");
		performer2.perform();
		
		
		Performer performer4=(Performer)springContainer.getBean("Himanshu");
		performer4.perform();
	}

}
