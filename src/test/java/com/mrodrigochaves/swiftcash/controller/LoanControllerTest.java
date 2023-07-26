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
        mockLoanList.add(new Loan());
        mockLoanList.add(new Loan());

       
        when(loanRepository.findAll()).thenReturn(mockLoanList);

  
        List<Loan> result = loanController.list();

      
        assertEquals(mockLoanList, result);
    }
}
