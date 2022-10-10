package com.buczek.budgetmanager.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ExpenseType {

    FOOD("food"), EDUCATION("education"), HEALTH("health"), ENTERTAINMENT("entertainment"), OTHER("other");

    private final String name;
}
