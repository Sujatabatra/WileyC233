package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class StagePerformance {

	public static void main(String[] args) {
		//beans get instantiated while launching ApplicationContext
		AbstractApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		
		springContainer.registerShutdownHook();
		
		Performer performer1=(Performer)springContainer.getBean("Neha");
		performer1.perform();
		
	}

}
