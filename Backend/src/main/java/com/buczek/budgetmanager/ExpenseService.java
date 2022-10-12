package com.buczek.budgetmanager;

import com.buczek.budgetmanager.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> getAllExpenses() {
        return this.expenseRepository.findAll();
    }

    public Expense getExpenseById(Long id) {
        return this.expenseRepository.findById(id).get();
    }

    public void addNewExpense(Expense newExpense) {
        this.expenseRepository.save(newExpense);
    }

    public void deleteExpenseById(Long id) {
        this.expenseRepository.deleteById(id);
    }
}
