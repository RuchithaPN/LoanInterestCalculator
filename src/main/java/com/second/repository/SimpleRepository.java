package com.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.second.entity.SimpleInterest;

@Repository
public interface SimpleRepository extends JpaRepository<SimpleInterest, Long> {

	SimpleInterest findById(int id);}
