package com.ims.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ims.backend.model.Item;
import com.ims.backend.service.ItemService;

@RestController
@RequestMapping("/rest")
public class ItemResources {

	@Autowired private ItemService itemService;
	
	@RequestMapping(value="/item/allItems", method=RequestMethod.GET)
	public List<Item> getAllItems() { 
		return itemService.getAllItems(); 
	}
	
	@RequestMapping(value="/item/itemName", method=RequestMethod.POST)
	public Item findByItemName(@RequestBody String itemName) { 
		return itemService.findByItemName(itemName); 
	}
	
	@RequestMapping(value="/item/update", method=RequestMethod.POST)
	public Item updateItem(@RequestBody Item item) { 
		return itemService.save(item); 
	}
}
