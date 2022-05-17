package com.sujata.controllers;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public ModelAndView searchEmployeeController(HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		String id=request.getParameter("empId");
		Optional<Employee> optionalEmployee=employeeService.searchEmployeeById(Integer.parseInt(id));
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
}
