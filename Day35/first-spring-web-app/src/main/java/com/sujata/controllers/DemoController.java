package com.sujata.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@RequestMapping("/first")
	public ModelAndView myFirstController() {
		ModelAndView modelAndView=new ModelAndView();
		String data="Welcome to the world of Spring Web MVC!";
		
		modelAndView.addObject("message", data);
		modelAndView.setViewName("first");
		
		return modelAndView;
	}
	
	@RequestMapping("/second")
	public ModelAndView mySecondController() {
		ModelAndView modelAndView=new ModelAndView();
		String data="Welcome Once Again to the world of Spring Web MVC!";
		
		modelAndView.addObject("message", data);
		modelAndView.setViewName("first");
		
		return modelAndView;
	}
}
