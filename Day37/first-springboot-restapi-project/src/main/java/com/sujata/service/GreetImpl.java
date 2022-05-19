package com.sujata.service;

import org.springframework.stereotype.Service;

@Service
public class GreetImpl implements Greet {

	@Override
	public String welcome() {
		return "Welcome to first Rest API";
	}

}
