package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.sujata.persistence.EmployeeDaoImpl;
import com.sujata.presentation.EmployeePresentationImpl;
import com.sujata.service.EmployeeServiceImpl;

@Configuration
public class EmployeeConfig {

	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://127.0.0.1:3306/wileyc233");
		ds.setUsername("root");
		ds.setPassword("sujata");
		return ds;
	}
	
	@Bean
	public EmployeeDaoImpl empDao() {
		EmployeeDaoImpl empDao=new EmployeeDaoImpl();
		empDao.setDataSource(dataSource());
		return empDao;
	}
	
	@Bean
	public EmployeeServiceImpl empService() {
		EmployeeServiceImpl empService=new EmployeeServiceImpl();
		empService.setEmployeeDao(empDao());
		return empService;
	}
	
	@Bean
	public EmployeePresentationImpl empPresentation() {
		return new EmployeePresentationImpl(empService());
	}
}
