package com.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.second.entity.AgriInterest;

@Repository
public interface AgriRepository extends JpaRepository<AgriInterest, Long> {

	AgriInterest findById(int id);
	
}
