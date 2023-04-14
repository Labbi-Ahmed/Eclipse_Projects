package com.maxis.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maxis.products.Entity.Product;
import com.maxis.products.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService csrv;
//	@Autowired
//	CustomerRepo rp;
	
	@GetMapping("/product/{id}")
	Product getCustomersDetails(@PathVariable("id")int id){
		return csrv.getCustomerWithId(id);
	}
	
	@GetMapping("/products")
	List<Product> getAllCustomer(){
		return csrv.getAllCustomer();
	}
	
	@PostMapping("/product")
	Product postData(@RequestBody Product customer) {
		return 	csrv.saveOrUpdate_one(customer);
	
	}
	
	@PutMapping("/product")
	private ResponseEntity<List<Product>> UpdateEmployee(@RequestBody List<Product> cst) {
		csrv.saveOrUpdate(cst);
		return ResponseEntity.status(HttpStatus.CREATED).body(cst);
	}
	

}
