package com.maxis.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxis.products.Entity.Product;
import com.maxis.products.Repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo repo;
	
	public List<Product> getAllCustomer() {
		// TODO Auto-generated method stub
		System.out.println("This is call");
		return repo.findAll();
	}

	public Product getCustomerWithId(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	public Product saveOrUpdate_one(Product customer) {
		return repo.save(customer);
	}

	public List<Product> saveOrUpdate(List<Product> cst) {
		// TODO Auto-generated method stub
		return repo.saveAll(cst);
		
	}


	


}
