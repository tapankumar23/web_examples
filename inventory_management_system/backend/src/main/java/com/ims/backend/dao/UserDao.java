package com.ims.backend.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ims.backend.model.SecUser;

@Repository
public interface UserDao extends CrudRepository<SecUser, Long>{
	SecUser save(SecUser user);
}
