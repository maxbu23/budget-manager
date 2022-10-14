import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Expense } from '../model/expense';

@Injectable({
  providedIn: 'root'
})
export class ExpenseService {

  constructor(private httpClient: HttpClient) { }

  addExpense(expense: Expense): Observable<Expense> {
    console.log("ExpenseService: " + expense.name);
    return this.httpClient.post<Expense>("http://localhost:8080/expenses", expense);
  }

  getAllExpenses(): Observable<Array<Expense>> {
    return this.httpClient.get<Array<Expense>>("http://localhost:8080/expenses");
  }
}
