package com.second.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.second.entity.HomeInterest;
import com.second.entity.PersonalInterest;
import com.second.repository.PersonalRepository;

@Service
public class PersonalService {
    @Autowired
    private PersonalRepository repository;

    public PersonalInterest calculateInterest(PersonalInterest calculation) {
        double interest = calculation.getPrincipal() * 11 * calculation.getTime() / 100;
        double total = calculation.getPrincipal() + interest;
        calculation.setInterest(interest);
        calculation.setTotal(total);
        return repository.save(calculation);
    }
    
    public PersonalInterest findLoanById(int id) {
        return repository.findById(id);
    }

    public List<PersonalInterest> getAllCalculations() {
        return repository.findAll();
    }
}

