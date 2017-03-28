package com.customer.service;

import java.util.List;

import com.customer.model.Customer;
import com.customer.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	CustomerRepository customerRepository;
	
	public CustomerServiceImpl(){
		
	}
	
	public CustomerServiceImpl(CustomerRepository repository){
		this.customerRepository=repository;
	}

	/* (non-Javadoc)
	 * @see com.customer.service.CustomerService#findAll()
	 */
	public List<Customer> findAll() {

		return customerRepository.findAll();

	}

	public void setCustomerRepository(CustomerRepository repository) {
		this.customerRepository = repository;
	}
}
