package com.Garege.AutoCare.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Garege.AutoCare.dao.CustomerRepository;
import com.Garege.AutoCare.entity.Customer;

@Service 
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public Customer createCustomer(Customer cust) {
		
		return customerRepository.save(cust) ;
System.out.println("hiii kiran");
		
	}
	public Optional<Customer> findCustomerById(Long id) {
		return customerRepository.findById(id);
	}

/*	public Customer getCustomer(Customer customer , Long id) {
		return customerRepository.save(customer);
	}*/
	
	public Customer updateCustomer(Customer customer , Long id ) {
		
		Optional<Customer> opCust=customerRepository.findById(id);
		
		Customer  cust=opCust.get();
		
		cust.setAddress(customer.getAddress());
		cust.setName(customer.getName());
		cust.setEmail(customer.getEmail());
		
		return customerRepository.save(cust) ;
		
	}
}
