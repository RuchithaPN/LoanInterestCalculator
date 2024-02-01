package com.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.second.entity.HomeInterest;

@Repository
public interface HomeRepository extends JpaRepository<HomeInterest, Long> {

	HomeInterest findById(int id);}
