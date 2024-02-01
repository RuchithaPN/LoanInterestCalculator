package com.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.second.entity.PersonalInterest;


@Repository
public interface PersonalRepository extends JpaRepository<PersonalInterest, Long> {

	PersonalInterest findById(int id);}

