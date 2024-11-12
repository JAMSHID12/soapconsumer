package com.tanjer.CountrySoapConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tanjer.CountrySoapConsumer.service.CalculatorService;

@RestController
public class CalculatorController {

	@Autowired
    private CalculatorService calculatorService;

    @GetMapping("/add")
    public int add(@RequestParam int intA, @RequestParam int intB) {
        return calculatorService.add(intA, intB);
    }
    
    
}
