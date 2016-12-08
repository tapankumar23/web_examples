package com.ims.backend.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ims.backend.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Long>{
	
	User save(User user);

	User findByUserName(String userName);
	
	List<User> findAll();
}
