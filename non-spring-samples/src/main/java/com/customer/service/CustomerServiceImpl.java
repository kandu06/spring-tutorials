package com.customer.service;

import java.util.List;

import com.customer.model.Customer;
import com.customer.repository.CustomerRepository;
import com.customer.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	CustomerRepository repository = new CustomerRepositoryImpl();

	/* (non-Javadoc)
	 * @see com.customer.service.CustomerService#findAll()
	 */
	public List<Customer> findAll() {

		return repository.findAll();

	}
}
