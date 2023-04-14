package com.maxis.test_mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxis.test_mongo.Entity.Customer;
import com.maxis.test_mongo.service.CustomerServiceImp;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
    private CustomerServiceImp s;

	 @GetMapping(value = "/{name}")
	    public Customer getStudentByStudentNumber(@PathVariable("name") String name) {
	        return s.findByCustomerName(name);
	    }
}
