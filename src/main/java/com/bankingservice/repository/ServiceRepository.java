package com.bankingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bankingservice.entity.Services;

@Repository
public interface ServiceRepository extends JpaRepository<Services, Integer> {
	
	@Query("SELECT t from Services t WHERE t.serviceName=(:serviceName)")
	public Services findByserviceName(@Param("serviceName") String serviceName);

}
