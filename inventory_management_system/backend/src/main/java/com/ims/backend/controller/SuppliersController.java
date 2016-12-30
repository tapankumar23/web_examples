package com.ims.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ims.backend.service.SupplierService;

@RestController
@RequestMapping ("/suppliers")
public class SuppliersController {

	@Autowired private SupplierService suppliersService;
	
	@RequestMapping(value="/allSuppliers", method=RequestMethod.GET)
	public String getAllSuppliers() { 
		suppliersService.getAllSuppliers();
		return null;
	}
}
