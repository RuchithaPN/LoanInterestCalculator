package com.second.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.second.entity.AgriInterest;
import com.second.entity.GoldInterest;
import com.second.entity.HomeInterest;
import com.second.entity.PersonalInterest;
import com.second.entity.SimpleInterest;
import com.second.exception.LoanNotFoundException;
import com.second.service.AgriService;
import com.second.service.GoldService;
import com.second.service.HomeService;
import com.second.service.PersonalService;
import com.second.service.SimpleService;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/interest")
public class InterestController {
    @Autowired
    private AgriService service;
    @Autowired
    private GoldService gservice;
    @Autowired
    private PersonalService pservice;
    @Autowired
    private HomeService hservice;
    @Autowired
    private SimpleService siservice;
    
    @PostMapping("agri/calculate")
    public AgriInterest calculateInterest(@RequestBody AgriInterest calculation) {
        return service.calculateInterest(calculation);
    }
    
    @GetMapping("/agri/{id}")
    public AgriInterest getLoan(@PathVariable int id) throws LoanNotFoundException  {
        return service.findLoanById(id);
    }

    @GetMapping("agri/history")
    public List<AgriInterest> getAllCalculations() {
        return service.getAllCalculations();
    }
    @PostMapping("gold/calculate")
    public GoldInterest calculateInterest(@RequestBody GoldInterest calculation) {
        return gservice.calculateInterest(calculation);
    }
    
    @GetMapping("/gold/{id}")
    public GoldInterest getGLoan(@PathVariable int id) {
        return gservice.findLoanById(id);
    }

    @GetMapping("gold/history")
    public List<GoldInterest> getAllCalculations1() {
        return gservice.getAllCalculations();
    }
    @PostMapping("personal/calculate")
    public PersonalInterest calculateInterest(@RequestBody PersonalInterest calculation) {
        return pservice.calculateInterest(calculation);
    }
    
    @GetMapping("/personal/{id}")
    public PersonalInterest getPLoan(@PathVariable int id) {
        return pservice.findLoanById(id);
    }

    @GetMapping("personal/history")
    public List<PersonalInterest> getAllCalculations2() {
        return pservice.getAllCalculations();
    }
    @PostMapping("home/calculate")
    public HomeInterest calculateInterest(@RequestBody HomeInterest calculation) {
        return hservice.calculateInterest(calculation);
    }
    
    @GetMapping("/home/{id}")
    public HomeInterest getHLoan(@PathVariable int id) {
        return hservice.findLoanById(id);
    }

    @GetMapping("home/history")
    public List<HomeInterest> getAllCalculations3() {
        return hservice.getAllCalculations();
    }
    @PostMapping("simple/calculate")
    public SimpleInterest calculateInterest(@RequestBody SimpleInterest calculation) {
        return siservice.calculateInterest(calculation);
    }
    
    @GetMapping("/simple/{id}")
    public SimpleInterest getSLoan(@PathVariable int id) {
        return siservice.findLoanById(id);
    }

    @GetMapping("simple/history")
    public List<SimpleInterest> getAllCalculations4() {
        return siservice.getAllCalculations();
    }
}

