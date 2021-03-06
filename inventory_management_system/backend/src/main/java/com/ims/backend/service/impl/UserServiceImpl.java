package com.ims.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.backend.dao.UserDao;
import com.ims.backend.model.User;
import com.ims.backend.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired private UserDao userDao;
	
	@Override
	public User save (User user) { return userDao.save(user); }

	@Override
	public List<User> findAllUsers() { return userDao.findAll(); }

	@Override
	public User findByUserName(String userName) { return userDao.findByUserName(userName); }
}
