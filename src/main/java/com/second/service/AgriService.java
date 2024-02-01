package com.second.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.second.entity.AgriInterest;
import com.second.exception.LoanNotFoundException;
import com.second.repository.AgriRepository;

@Service
public class AgriService {
    @Autowired
    private AgriRepository repository;

    public AgriInterest calculateInterest(AgriInterest calculation) {
        BigDecimal principal = new BigDecimal(calculation.getPrincipal());
        BigDecimal time = new BigDecimal(calculation.getTime());
        BigDecimal interest = principal.multiply(new BigDecimal("7")).multiply(time).divide(new BigDecimal("100"));
        BigDecimal total = principal.add(interest);

        // set interest and total with 2 decimal places
        calculation.setInterest(interest.setScale(2, RoundingMode.HALF_UP).doubleValue());
        calculation.setTotal(total.setScale(2, RoundingMode.HALF_UP).doubleValue());

        return repository.save(calculation);
    }


    public AgriInterest findLoanById(int id) throws LoanNotFoundException  {
        return repository.findById(id);
}
    
    public List<AgriInterest> getAllCalculations() {
        return repository.findAll();
    }

}

