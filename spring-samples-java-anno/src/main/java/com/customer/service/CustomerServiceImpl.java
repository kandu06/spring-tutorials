package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.customer.model.Customer;
import com.customer.repository.CustomerRepository;

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository repository;
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.customer.service.CustomerService#findAll()
	 */
	public List<Customer> findAll() {

		return repository.findAll();

	}
}
