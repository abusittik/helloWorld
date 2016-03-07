package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

	@RequestMapping("helloworld")
	public String helloWorld(){
		return "Hello World";
	}
	
}
