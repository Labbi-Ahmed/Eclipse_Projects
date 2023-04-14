package com.maxis.customer.controller;

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
import org.springframework.web.client.RestTemplate;

import com.maxis.customer.Entity.Customer;
import com.maxis.customer.Entity.Product;
import com.maxis.customer.Response.CustomerResponse;
import com.maxis.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService csrv;
	
	@Autowired
	private RestTemplate restTamplate;

	
//	@Autowired
//	CustomerRepo rp;
	
	@GetMapping("/customer/{id}")
	CustomerResponse getCustomersDetails(@PathVariable("id")int id){
		Product product = restTamplate.getForObject("http://localhost:8889/product/1", Product.class);
		System.out.println(product.getName());
		
		Customer cst = new Customer();
		cst = csrv.getCustomerWithId(id);
		
		CustomerResponse res  = new CustomerResponse(cst.getId(),cst.getName(),cst.getEmail(),cst.getPhone(),cst.getCity(),product.getId(),product.getName());

		
		return  res;//product;//
	}
	
	@GetMapping("/customers")
	List<Customer> getAllCustomer(){
		return csrv.getAllCustomer();
	}
	
	@PostMapping("/customer")
	Customer postData(@RequestBody Customer customer) {
		return 	csrv.saveOrUpdate_one(customer);
	
	}
	
	@PutMapping("/customer")
	private ResponseEntity<List<Customer>> UpdateEmployee(@RequestBody List<Customer> cst) {
		csrv.saveOrUpdate(cst);
		return ResponseEntity.status(HttpStatus.CREATED).body(cst);
	}
	

}
