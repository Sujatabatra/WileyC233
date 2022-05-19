package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.service.Greet;

@RestController
public class GreetResource {

	@Autowired
	private Greet greet;
	
	@RequestMapping(path = "/welcome",method = RequestMethod.GET)
	public String welcomeResource() {
		return greet.welcome();
	}
}
