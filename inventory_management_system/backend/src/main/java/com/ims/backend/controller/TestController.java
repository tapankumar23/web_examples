package com.ims.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/ims")
public class TestController {

	@RequestMapping(method=RequestMethod.GET) 
	public String testing() { return "Welcome ims application works @@@@@@@ !!!"; }
}

