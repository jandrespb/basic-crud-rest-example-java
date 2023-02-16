package com.myjacode.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myjacode.springdemo.entity.Customer;
import com.myjacode.springdemo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	// Autowired the CustomerService
	@Autowired
	private CustomerService customerService;
	
	// add mapping for Get / customers
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		
		return customerService.getCustomers();
	}
}
