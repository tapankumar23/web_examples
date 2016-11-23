package com.ims.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.backend.dao.UserDao;
import com.ims.backend.model.SecUser;
import com.ims.backend.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	public SecUser save (SecUser user) {
		return userDao.save(user); 
	}
}
