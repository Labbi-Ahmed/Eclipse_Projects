package com.maxis.test_mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.maxis.test_mongo.Entity.Customer;
import com.maxis.test_mongo.repository.CustomerRepo;
import com.maxis.test_mongo.service.CustomerServiceImp;

@SpringBootApplication
public class TestMongodbApplication implements CommandLineRunner {

	@Autowired
	CustomerRepo cstrepo;
	
	public static void main(String[] args) {
		SpringApplication.run(TestMongodbApplication.class, args);
	}
	
	@Bean
	public CustomerServiceImp cstSerImp(){
		return new CustomerServiceImp();
	}
	
	@Override
	public
	void run(String...strings) {
		cstrepo.deleteAll();
		
		// save new data on mongos
		cstrepo.save(new Customer("labib","ahmed"));
		cstrepo.save(new Customer("Robi","hossian"));
		
		// fatch all data from db
		System.out.println("Print all data: \n .............................................................");
		for(Customer customer: cstrepo.findAll()) {
			System.out.println(customer);
		}
		System.out.println();
		
		// fatch by using first name  data from db
		System.out.println("Print wich first ame labib data: \n .............................................................");
		System.out.println(cstrepo.findByFirstName("labib"));
		System.out.println();
		
//				// fatch by using first name  data from db
//				System.out.println("Print wich first ame labib data: \n .............................................................");
//				System.out.println(cstrepo.findByLastName("labib"));
//				System.out.println();
//		
		//return "ok its work";
		
	
	}
	
	

}
