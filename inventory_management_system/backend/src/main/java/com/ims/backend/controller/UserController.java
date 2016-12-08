package com.ims.backend.controller;

import java.util.Date;
import java.util.Map;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ims.backend.model.User;
import com.ims.backend.service.UserService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping ("/user")
public class UserController {
	
	@Autowired private UserService userService;

	@RequestMapping(value="/register", method=RequestMethod.POST)
	public User registerUser(@RequestBody User user) { 
		return userService.save(user); 
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestBody Map<String,String> json) throws ServletException { 
		String userName = json.get("username");
		String password = json.get("password");
		
		if(userName == null && password == null) throw new ServletException("please fill in username and password");
		
		User user = userService.findByUserName(userName);
		
		if(user == null) throw new ServletException("User not found exception !!!");
		
		String pwd = user.getPassword();
		
		if(!password.equals(pwd)) throw new ServletException("Invalid login. Please check username and password.");
		
		return Jwts.builder().setSubject(userName).claim("roles", "user").setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256, "secretkey").compact();
	}
}
