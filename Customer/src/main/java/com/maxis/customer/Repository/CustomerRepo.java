package com.maxis.customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxis.customer.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
