package com.second.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.second.entity.HomeInterest;
import com.second.repository.HomeRepository;

@Service
public class HomeService {
    @Autowired
    private HomeRepository repository;

    public HomeInterest calculateInterest(HomeInterest calculation) {
        double interest = calculation.getPrincipal() * 9.5 * calculation.getTime() / 100;
        double total = calculation.getPrincipal() + interest;
        calculation.setInterest(interest);
        calculation.setTotal(total);
        return repository.save(calculation);
    }
    
    public HomeInterest findLoanById(int id) {
        return repository.findById(id);
    }

    public List<HomeInterest> getAllCalculations() {
        return repository.findAll();
    }
}

