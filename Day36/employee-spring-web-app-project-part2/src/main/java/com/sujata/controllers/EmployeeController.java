package com.sujata.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.entity.Employee;
import com.sujata.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
//	@RequestMapping("/")
//	public ModelAndView welcomePageController() {
//		ModelAndView modelAndView=new ModelAndView();
//		modelAndView.setViewName("index");
//		return modelAndView;
//	}
	
	@RequestMapping("/")
	public String welcomePageController() {
		return "index";
	}
	
	@RequestMapping("/search")
	public String searchEmployeePageController() {
		return "searchEmp";
	}
	
	@RequestMapping("/searchEmp")
	public ModelAndView searchEmployeeController(@RequestParam("empId") int id) {
		ModelAndView modelAndView=new ModelAndView();
//		String id=request.getParameter("empId");
		Optional<Employee> optionalEmployee=employeeService.searchEmployeeById(id);
		if(optionalEmployee.isPresent()) {
			modelAndView.addObject("employee", optionalEmployee.get());
			modelAndView.setViewName("showEmployee");
		}
		else {
			modelAndView.addObject("message","Employee with ID "+id+"does not exist!");
			modelAndView.setViewName("output");
		}
			return modelAndView;
	}
	
//	@RequestMapping("/searchEmp")
//	public ModelAndView searchEmployeeController(HttpServletRequest request) {
//		ModelAndView modelAndView=new ModelAndView();
//		String id=request.getParameter("empId");
//		Optional<Employee> optionalEmployee=employeeService.searchEmployeeById(Integer.parseInt(id));
//		if(optionalEmployee.isPresent()) {
//			modelAndView.addObject("employee", optionalEmployee.get());
//			modelAndView.setViewName("showEmployee");
//		}
//		else {
//			modelAndView.addObject("message","Employee with ID "+id+"does not exist!");
//			modelAndView.setViewName("output");
//		}
//			return modelAndView;
//	}
	
	@RequestMapping("/delete")
	public String deleteEmployeePage() {
		return "deleteEmp";
	}
	
	@RequestMapping("/deleteEmp")
	public ModelAndView deleteEmployee(@RequestParam("empId") int eId) {
		ModelAndView modelAndView=new ModelAndView();
		String message=null;
		if(employeeService.deleteEmployeeById(eId))
			message="Employee with ID "+eId+" deleted !";
		else
			message="Employee with ID "+eId+" does not exist !";
		
		modelAndView.addObject("message", message);
		modelAndView.setViewName("output");
		return modelAndView;
	}
	
	@RequestMapping("/allEmps")
	public ModelAndView getAllEmployeesController() {
		ModelAndView modelAndView=new ModelAndView();
		
		List<Employee> employees=employeeService.getAllEmployees();
		modelAndView.addObject("employees", employees);
		modelAndView.setViewName("showAllEmployees");
		return modelAndView;
	}
	
	@RequestMapping("/insertEmp")
	public ModelAndView insertEmpPageController() {
		return new ModelAndView("inputEmployeeDetails", "command", new Employee());
	}
	
	@RequestMapping("/saveEmployee")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		ModelAndView modelAndView=new ModelAndView();
		String message="";
		if(employeeService.addEmployee(employee))
			message="Employee Addedd!";
		else
			message="Employee Not Added!";
		
		modelAndView.addObject("message", message);
		modelAndView.setViewName("output");
		
		return modelAndView;
	}
}
