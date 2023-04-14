package com.maxis.test_mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.maxis.test_mongo.Entity.Customer;

public interface CustomerRepo extends MongoRepository<Customer, Integer> {

	
	public Customer findByFirstName(String firstName);
	//public List<Customer> findByLastName(String lastName);
}
