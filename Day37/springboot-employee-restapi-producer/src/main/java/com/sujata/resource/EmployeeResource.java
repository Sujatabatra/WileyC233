package com.sujata.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.entity.Employee;
import com.sujata.service.EmployeeService;

@RestController
public class EmployeeResource {

	@Autowired
	private EmployeeService employeeService;
	
//	@RequestMapping(path = "/employees",method = RequestMethod.GET,produces =MediaType.APPLICATION_JSON_VALUE)
	@GetMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployeeDetailsResource(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping(path = "/employees/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeByIdResource(@PathVariable("id") int empId){
		return employeeService.getEmployeeById(empId).get();
	}
}
