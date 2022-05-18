package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.entity.User;
import com.sujata.persistence.UserDao;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class EmployeeSpringWebAppProjectApplication/* implements CommandLineRunner*/ {

//	@Autowired
//	private UserDao userDao;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeSpringWebAppProjectApplication.class, args);
	}
//	
//	@Override
//	public void run(String... args) throws Exception {
//		userDao.save(new User("Sujata","Batra"));
//		userDao.save(new User("Neha","Avula"));
//		userDao.save(new User("Sandesh","Tiwari"));
//		userDao.save(new User("user1","user123"));
//		
//	}

}
