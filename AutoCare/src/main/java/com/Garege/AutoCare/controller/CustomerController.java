package com.Garege.AutoCare.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Garege.AutoCare.entity.Customer;
import com.Garege.AutoCare.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customer")     //path
	public Customer createCustomer(@RequestBody Customer customer) { 
		
		return customerService.createCustomer(customer);
		
	}
	
	@GetMapping("/customer/{id}")
	public Optional<Customer>  findCustomerById(@PathVariable Long id) {
		return customerService.findCustomerById(id);
	}
	
	@PutMapping
	
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer , @RequestParam Long id) {
		
		return customerService.updateCustomer(customer, id);
	}
}