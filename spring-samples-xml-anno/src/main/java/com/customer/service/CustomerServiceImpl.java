package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.model.Customer;
import com.customer.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	 @Autowired //member autowired
	CustomerRepository repository;

	@Autowired //constructor autowired
	public CustomerServiceImpl(CustomerRepository repository) {
		super();
		System.out.println("Autowired in Constructor");
		this.repository = repository;
	}

	 @Autowired //setter autowired
	public void setRepository(CustomerRepository repository) {
		System.out.println("Autowired in Setter");
		this.repository = repository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.customer.service.CustomerService#findAll()
	 */
	public List<Customer> findAll() {

		return repository.findAll();

	}
}
