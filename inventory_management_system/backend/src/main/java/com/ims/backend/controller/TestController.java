package com.ims.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ims")
public class TestController {

	@RequestMapping(value="/test", method=RequestMethod.GET) 
	public String testing() {
		System.out.println("testing...........");
		return "Welcome ims application works !!!@@@######@@ "; 
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET) 
	public String welcome() {
		System.out.println("welcome...........");
		return "Welcome ims application works welcome method called !!!@@@######@@ "; 
	}
}

