package com.ims.backend.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ims.backend.model.Item;

@Repository
public interface ItemDao extends CrudRepository<Item, Long>{

	Item save(Item item);

	Item findByItemName(String itemName);
	
	List<Item> findAll();
}
