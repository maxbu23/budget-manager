package com.buczek.budgetmanager;

import com.buczek.budgetmanager.model.Expense;
import com.buczek.budgetmanager.model.ExpenseType;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class BudgetManagerApplication {

	@Autowired
	private ExpenseRepository repo;
	public static void main(String[] args) {

		SpringApplication.run(BudgetManagerApplication.class, args);
	}

	@Bean
	InitializingBean sendDatabase() {
		return () -> {
			repo.save(Expense.builder()
					.name("Ksiazki")
					.expenseType(ExpenseType.EDUCATION)
					.amount(BigDecimal.TEN)
					.description("")
					.build());
			repo.save(Expense.builder()
					.name("Kino")
					.expenseType(ExpenseType.ENTERTAINMENT)
					.amount(BigDecimal.valueOf(25.))
					.description("")
					.build());
		};
	}

}
