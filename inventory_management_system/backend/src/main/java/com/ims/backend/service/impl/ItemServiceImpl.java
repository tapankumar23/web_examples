package com.ims.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.backend.dao.ItemDao;
import com.ims.backend.model.Item;
import com.ims.backend.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired private ItemDao itemDAO;

	@Override
	public List<Item> getAllItems() {
		return itemDAO.findAll();
	}

	@Override
	public Item findByItemName(String itemName) {
		return itemDAO.findByItemName(itemName);
	}

	@Override
	public Item save(Item item) {
		return itemDAO.save(item);
	}
}
