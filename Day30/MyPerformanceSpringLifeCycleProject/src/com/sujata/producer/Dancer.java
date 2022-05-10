package com.sujata.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Dancer implements 
Performer, BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean {

	private String danceStyle;
	private String dancerName;

	public Dancer() {
		System.out.println("1. Hi I am Dance class Constructor");
	}

	public void setDanceStyle(String danceStyle) {
		System.out.println("2. Setter");
		this.danceStyle = danceStyle;
	}

	@Override
	public void perform() {
		System.out.println(dancerName+" is dancing in "+danceStyle);

	}

	@Override
	public void setBeanName(String name) {
		System.out.println("3. setBeanName from BeanNameAware");
		dancerName=name;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4. setBeanFactory method from BeanFactoryAware");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("5. setApplicationContext method from ApplicationContextAware");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("7. afterPropertiesSet method from InitializingBean for "+dancerName);
		
	}
	
	public void customInit() {
		System.out.println("8. Custom Init for "+dancerName);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("1. Distruction with destroy from DisposableBean");
		
	}
	
	public void customDestroy() {
		System.out.println("2. distruction using custom destroy");
	}

}
