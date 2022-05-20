package com.sujata.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeeList;
import com.sujata.service.EmployeeService;

@RestController
public class EmployeeResource {

	@Autowired
	private EmployeeService employeeService;
	
//	@RequestMapping(path = "/employees",method = RequestMethod.GET,produces =MediaType.APPLICATION_JSON_VALUE)
	@GetMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeList getAllEmployeeDetailsResource(){
		return new EmployeeList(employeeService.getAllEmployees());
	}
	
	@GetMapping(path = "/employees/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeByIdResource(@PathVariable("id") int empId){
		Optional<Employee> optionalEmp=employeeService.getEmployeeById(empId);
		if(optionalEmp.isPresent())
			return optionalEmp.get();
		return null;
	}
	
	@DeleteMapping(path = "/employees/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee deleteEmployeeResource(@PathVariable("id") int empId) {
		return employeeService.deleteEmployee(empId);
	}
	
	@PostMapping(path="/employees",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee insertEmployeeResource(@RequestBody Employee employee) {
		return employeeService.insertEmployee(employee);
	}
	
	@PutMapping(path="/employees/{id}/{inc}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee incrementSalaryResource(@PathVariable("id") int id,@PathVariable("inc") double increment) {
		return employeeService.incrementSalary(id, increment);
	}
	
}
