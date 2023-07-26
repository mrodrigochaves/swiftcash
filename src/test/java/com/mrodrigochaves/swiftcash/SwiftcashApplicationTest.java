package com.mrodrigochaves.swiftcash;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.mrodrigochaves.swiftcash.model.Loan;
import com.mrodrigochaves.swiftcash.repository.LoanRepository;

class SwiftcashApplicationTest {

    @Mock
    private LoanRepository loanRepository;

    @InjectMocks
    private SwiftcashApplication swiftcashApplication;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testInitDataBase() {
       
        Loan mockLoan = new Loan();
        mockLoan.setName("Matheus");
        mockLoan.setLastName("Soares");
        mockLoan.setEmail("email@email.com");
        mockLoan.setPhone("22997544769");
        mockLoan.setAge(10);
        mockLoan.setCpf(123456789);
        mockLoan.setRg(12345678);

       
        doNothing().when(loanRepository).deleteAll();

       
        try {
            swiftcashApplication.initDataBase(loanRepository).run();
        } catch (Exception e) {
            
        }

        
        verify(loanRepository).deleteAll();
    }
}
