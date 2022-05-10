package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class StagePerformance {

	public static void main(String[] args) {
		//beans get instantiated while launching ApplicationContext
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		
		Performer performer1=(Performer)springContainer.getBean("ManiDeep");
		
		Performer performer2=(Performer)springContainer.getBean("ManiDeep");
		
		System.out.println("performer 1 : "+performer1);
		
		System.out.println("performer 2 : "+performer2);
		
		//As singer is in lazy loading so now singer object will be instantiated,
//		with first call of getBean() to Singer object
		Performer performer3=(Performer)springContainer.getBean("Harshit");
		
		System.out.println("performer 3 : "+performer3);
		
		Performer performer4=(Performer)springContainer.getBean("Harshit");
		System.out.println("performer 4 : "+performer4);
		
		Performer performer5=(Performer)springContainer.getBean("Hemalatha");
		System.out.println("performer 5 : "+performer5);
		
		Performer performer6=(Performer)springContainer.getBean("Hemalatha");
		System.out.println("performer 6 : "+performer6);
	}

}
