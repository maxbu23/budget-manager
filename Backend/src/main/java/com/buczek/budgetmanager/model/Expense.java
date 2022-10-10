package com.buczek.budgetmanager.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Builder
public class Expense {

    @Id
    private Long id;
    private String name;
    private ExpenseType expenseType;
    private BigDecimal amount;
    private String description;

}
