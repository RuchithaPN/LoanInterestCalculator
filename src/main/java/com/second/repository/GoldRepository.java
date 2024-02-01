package com.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.second.entity.GoldInterest;

@Repository
public interface GoldRepository extends JpaRepository<GoldInterest, Long> {

	GoldInterest findById(int id);}
