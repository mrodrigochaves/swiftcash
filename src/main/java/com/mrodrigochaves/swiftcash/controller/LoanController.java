package com.mrodrigochaves.swiftcash.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrodrigochaves.swiftcash.model.Loan;
import com.mrodrigochaves.swiftcash.repository.LoanRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/loan")
@AllArgsConstructor
public class LoanController {

    private final LoanRepository loanRepository;

    @GetMapping
    public List<Loan> list() {
        return loanRepository.findAll();
    }
}
