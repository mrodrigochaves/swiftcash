package com.mrodrigochaves.swiftcash;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mrodrigochaves.swiftcash.model.Loan;
import com.mrodrigochaves.swiftcash.repository.LoanRepository;

@SpringBootApplication
public class SwiftcashApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwiftcashApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase( LoanRepository loanRepository){
		return args -> {
			loanRepository.deleteAll();

			Loan loan = new Loan();

			loan.setName("Matheus");
			loan.setLastName("Soares");
			loan.setEmail("email@email.com");
			loan.setPhone("22997544769");
			loan.setAge(10);
			loan.setCpf(123456789);
			loan.setRg(12345678);
			

			loanRepository.save(new Loan());
		};
	}


}
