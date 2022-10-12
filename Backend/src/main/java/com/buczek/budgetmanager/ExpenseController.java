package com.buczek.budgetmanager;

import com.buczek.budgetmanager.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping
    public List<Expense> getAllExpenses() {
        return this.expenseService.getAllExpenses();
    }

    @GetMapping(params = "id")
    public Expense getExpenseById(Long id) {
        return this.expenseService.getExpenseById(id);
    }

    @PostMapping
    public void addExpense(@RequestBody Expense newExpense) {
        this.expenseService.addNewExpense(newExpense);
    }

    @DeleteMapping
    public void deleteExpense(Long id) {
        this.expenseService.deleteExpenseById(id);
    }

    //TODO: Updating expenses
}
