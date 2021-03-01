package com.bankingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bankingservice.entity.BankQueue;

@Repository
public interface BankQueueRepository extends JpaRepository<BankQueue, String> {
	
	@Query("SELECT t from BankQueue t where t.serviceName=:serviceName")
	public BankQueue getToken(@Param("serviceName") String serviceName);

}
