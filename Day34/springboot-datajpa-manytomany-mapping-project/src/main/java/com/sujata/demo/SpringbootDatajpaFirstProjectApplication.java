package com.sujata.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.entity.Employee;
import com.sujata.entity.Project;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.ProjectDao;

@SpringBootApplication
@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class SpringbootDatajpaFirstProjectApplication implements CommandLineRunner{

	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private ProjectDao projectDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDatajpaFirstProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Project p1=new Project("P001", "Projeect 1");
		Project p2=new Project("P002", "Projeect 2");
		
		Employee e1=new Employee(1, "AAAA", "Associate", 45000);
		Employee e2=new Employee(2, "BBBB", "Manager", 45000);
		Employee e3=new Employee(3, "CCCC", "Sr. Associate", 45000);
		Employee e4=new Employee(4, "DDDD", "Sr. Associate", 45000);
		Employee e5=new Employee(5, "EEEE", "Associate", 45000);
		Employee e6=new Employee(6, "FFFF", "Associate", 45000);
		Employee e7=new Employee(7, "GGGG", "Manager", 45000);
		Employee e8=new Employee(8, "HHHH", "Associate", 45000);
		
		p1.getEmployees().add(e1);
		p1.getEmployees().add(e3);
		p1.getEmployees().add(e4);
		p1.getEmployees().add(e7);
		p1.getEmployees().add(e8);
		
		p2.getEmployees().add(e2);
		p2.getEmployees().add(e5);
		p2.getEmployees().add(e6);
		
		
		employeeDao.save(e1);
		employeeDao.save(e2);
		employeeDao.save(e3);
		employeeDao.save(e4);
		employeeDao.save(e5);
		employeeDao.save(e6);
		employeeDao.save(e7);
		employeeDao.save(e8);
		
		projectDao.save(p1);
		projectDao.save(p2);
		
		
	
	}

}
