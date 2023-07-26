package com.mrodrigochaves.swiftcash.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.mrodrigochaves.swiftcash.model.Loan;
import com.mrodrigochaves.swiftcash.repository.LoanRepository;

class LoanControllerTest {

    @Mock
    private LoanRepository loanRepository;

    @InjectMocks
    private LoanController loanController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testList() {
      
        List<Loan> mockLoanList = new ArrayList<>();
        mockLoanList.add(new Loan(1L, "Nome1", "Sobrenome1", "email1@example.com", "1234567890", 30, 12345678901L, 1234567));
        mockLoanList.add(new Loan(2L, "Nome2", "Sobrenome2", "email2@example.com", "0987654321", 25, 98765432101L, 7654321));

       
        when(loanRepository.findAll()).thenReturn(mockLoanList);

  
        List<Loan> result = loanController.list();

      
        assertEquals(mockLoanList, result);
    }
}
