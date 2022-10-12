package com.buczek.budgetmanager.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "expense_type")
    private ExpenseType expenseType;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "description")
    private String description;

}
