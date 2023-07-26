package com.mrodrigochaves.swiftcash.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LoanTest {

    @Test
    void testLoanConstructorAndGettersSetters() {
        
        Loan loan = new Loan();
        loan.setId(1L);
        loan.setName("John");
        loan.setLastName("Doe");
        loan.setEmail("john.doe@example.com");
        loan.setPhone("1234567890");
        loan.setAge(30);
        loan.setCpf(12345678901L);
        loan.setRg(1234567);

       
        assertEquals(1L, loan.getId());
        assertEquals("John", loan.getName());
        assertEquals("Doe", loan.getLastName());
        assertEquals("john.doe@example.com", loan.getEmail());
        assertEquals("1234567890", loan.getPhone());
        assertEquals(30, loan.getAge());
        assertEquals(12345678901L, loan.getCpf());
        assertEquals(1234567, loan.getRg());

       
        Loan anotherLoan = new Loan(2L, "Jane", "Smith", "jane.smith@example.com", "0987654321", 25, 98765432101L, 7654321);

      
        assertEquals(2L, anotherLoan.getId());
        assertEquals("Jane", anotherLoan.getName());
        assertEquals("Smith", anotherLoan.getLastName());
        assertEquals("jane.smith@example.com", anotherLoan.getEmail());
        assertEquals("0987654321", anotherLoan.getPhone());
        assertEquals(25, anotherLoan.getAge());
        assertEquals(98765432101L, anotherLoan.getCpf());
        assertEquals(7654321, anotherLoan.getRg());
    }
}
