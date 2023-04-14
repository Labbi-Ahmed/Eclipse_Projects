package com.maxis.test_mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.maxis.test_mongo.Entity.Customer;
import com.maxis.test_mongo.repository.CustomerRepo;

public class CustomerServiceImp implements CustomerService {

	
	@Autowired
	CustomerRepo repo;
	
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Customer findByCustomerName(String name) {
		// TODO Auto-generated method stub
		return repo.findByFirstName(name);
	}

}
