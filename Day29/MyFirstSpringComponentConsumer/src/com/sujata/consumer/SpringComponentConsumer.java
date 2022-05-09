package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.GoodMorning;
import com.sujata.producer.Greet;

public class SpringComponentConsumer {

	public static void main(String args[]) {
//		Greet greet=new GoodMorning();
		/*
		 * Spring Container will read xml file and will run life cycle(creation of Object) of all the
		 * beans mentioned in bean configuration xml file
		 * 
		 */
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("greet.xml");

		Greet greet = (Greet) springContainer.getBean("eve");
		
		greet.wish("SriHari");
		
	}
}
