package com.customer.repository;

import java.util.List;

import com.customer.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}