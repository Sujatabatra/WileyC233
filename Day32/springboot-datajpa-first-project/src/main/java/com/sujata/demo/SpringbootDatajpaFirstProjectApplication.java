package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import com.sujata.entity.EmployeeJPA;
import com.sujata.persistence.EmployeeDao;

@SpringBootApplication
@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class SpringbootDatajpaFirstProjectApplication {

	
	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(SpringbootDatajpaFirstProjectApplication.class, args);
	
		EmployeeDao empDao=(EmployeeDao)springContainer.getBean("employeeDao");
		
		EmployeeJPA emp1=new EmployeeJPA(1, "AAAA", "Sales", "Executive", 25000);
		EmployeeJPA emp2=new EmployeeJPA(2, "BBBB", "IT", "Sr. Executive", 35000);
		EmployeeJPA emp3=new EmployeeJPA(3, "CCCC", "HR", "Manager", 145000);
		EmployeeJPA emp4=new EmployeeJPA(4, "DDDD", "Sales", "Jr. Executive", 15000);
		EmployeeJPA emp5=new EmployeeJPA(5, "EEEE", "Sales", "Associate", 45000);
		
		empDao.save(emp1);
		empDao.save(emp2);
		empDao.save(emp3);
		empDao.save(emp4);
		empDao.save(emp5);
	}

}
