package com.second.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.second.entity.HomeInterest;
import com.second.entity.SimpleInterest;
import com.second.repository.SimpleRepository;



@Service
public class SimpleService {
    @Autowired
    private SimpleRepository repository;

    public SimpleInterest calculateInterest(SimpleInterest calculation) {
        double interest = calculation.getPrincipal() * calculation.getRate() * calculation.getTime() / 100;
        double total = calculation.getPrincipal() + interest;
        calculation.setInterest(interest);
        calculation.setTotal(total);
        return repository.save(calculation);
    }
    
    public SimpleInterest findLoanById(int id) {
        return repository.findById(id);
    }

    public List<SimpleInterest> getAllCalculations() {
        return repository.findAll();
    }
}