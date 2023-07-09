package com.mrodrigochaves.swiftcash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrodrigochaves.swiftcash.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {
    
}
