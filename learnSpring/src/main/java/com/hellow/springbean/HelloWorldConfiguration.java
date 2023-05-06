package com.hellow.springbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};
record Address (String street, String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Labib";
	}
	
	@Bean
	public int age() {
		return 30;
	}
	
	@Bean
	public Person person() {
		
		return new Person("Labbi Ahmed", 27, new Address("Dhaka","Dhaka"));
	}
	
	@Bean
	public Person person2MethodCall() {
		
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address myAddress2) {
		
		return new Person(name, age, myAddress2);
	}
	
	@Primary  
	@Bean("myAddress")
	public Address address() {
		return new Address("Dhaka", "bangladesh");
	}
	
	@Bean("myAddress2")
	public Address address2() {
		return new Address("Dhaka", "kushtia");
	}
}
