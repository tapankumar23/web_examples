package com.ims.backend.service;

import java.util.List;

import com.ims.backend.model.User;

public interface UserService {
	User save(User user);

	List<User> findAllUsers();

	User findByUserName(String userName);
}
