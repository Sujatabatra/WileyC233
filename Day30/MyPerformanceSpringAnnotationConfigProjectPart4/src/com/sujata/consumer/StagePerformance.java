package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class StagePerformance {

	public static void main(String[] args) {
		
		/*
		 * IOC : Inversion of Control 
		 * ioc: separating the business logic from dependency logic
		 * 
		 */
		
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("perform.xml");
		
		Performer performer1=(Performer)springContainer.getBean("ManiDeep");
		performer1.perform();
		
		Performer performer2=(Performer)springContainer.getBean("Hemalatha");
		performer2.perform();
		
		Performer performer3=(Performer)springContainer.getBean("Harshit");
		performer3.perform();
	}

}
