package com.customer.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.customer.model.Customer;

@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.kandu.repository.Repository#findAll()
	 */
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();

		Customer customer = new Customer();
		customer.setFirstName("Kandasamy");
		customer.setLastName("Thangavelu");

		customers.add(customer);

		return customers;

	}

}
