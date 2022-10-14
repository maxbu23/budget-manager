import { ExpenseService } from './services/expense.service';
import { Component } from '@angular/core';
import { Expense } from './model/expense';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  name: string = '';
  expenseType: string = '';
  amount: number = 0;
  description: string = '';

  allExpenses: Array<Expense> = [];

  constructor(private expenseService: ExpenseService) {}

  add() {
    const newExpense: Expense = {
      name: this.name,
      expenseType: this.expenseType.toUpperCase(),
      amount: this.amount,
      description: this.description
    };
    console.log(newExpense);
    this.expenseService.addExpense(newExpense).subscribe();
  }

  getAll() {
    this.expenseService.getAllExpenses().subscribe(expenses  => {
      this.allExpenses = expenses;
    });
  }

}
