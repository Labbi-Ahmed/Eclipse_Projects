package com.maxis.test_mongo.service;

import java.util.List;

import com.maxis.test_mongo.Entity.Customer;

public interface CustomerService {
	
	List<Customer> findAll();
	Customer findByCustomerName(String name);

}
