package com.bankingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bankingservice.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	
	@Query("SELECT t FROM Customer t WHERE t.customerId=:customerId")
	public Customer getCustomerById(@Param("customerId")int customerId);
	

}
