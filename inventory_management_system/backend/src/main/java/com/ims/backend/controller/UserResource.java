package com.ims.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ims.backend.model.User;
import com.ims.backend.service.UserService;

@RestController
@RequestMapping("/rest")
public class UserResource {

	@Autowired private UserService userService;
	
	@RequestMapping(value="/user/users")
	public String loginSuccess() { return "LogIn Successful !!!"; }
	
	@RequestMapping(value="/user/userName",method = RequestMethod.POST)
	public User findByUserName(@RequestBody String userName) {
		System.out.println(userName);
		System.out.println(userService.findByUserName(userName));
		return userService.findByUserName(userName);
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET) 
	public String testing() { return "Welcome ims application works !!!"; }
}
