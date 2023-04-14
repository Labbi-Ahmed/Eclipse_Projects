package com.maxis.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxis.customer.Entity.Customer;
import com.maxis.customer.Repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo repo;
	
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		System.out.println("This is call");
		return repo.findAll();
	}

	public Customer getCustomerWithId(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	public Customer saveOrUpdate_one(Customer customer) {
		return repo.save(customer);
	}

	public List<Customer> saveOrUpdate(List<Customer> cst) {
		// TODO Auto-generated method stub
		return repo.saveAll(cst);
		
	}


	


}
