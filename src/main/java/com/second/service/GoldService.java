package com.second.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.second.entity.GoldInterest;
import com.second.repository.GoldRepository;

@Service
public class GoldService {
    @Autowired
    private GoldRepository repository;

    public GoldInterest calculateInterest(GoldInterest calculation) {
        double interest = calculation.getPrincipal() * 7.30 * calculation.getTime() / 100;
        double total = calculation.getPrincipal() + interest;
        calculation.setInterest(interest);
        calculation.setTotal(total);
        return repository.save(calculation);
    }
    
    public GoldInterest findLoanById(int id) {
        return repository.findById(id);
    }
    public List<GoldInterest> getAllCalculations() {
        return repository.findAll();
    }
}


