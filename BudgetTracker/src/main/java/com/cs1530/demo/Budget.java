package com.cs1530.demo;

public class Budget {
	private double amount;
	private String budget_name;

	public double getBudget_amount() {
		return amount;
	}

	public void setBudget_amount(double budget_amount) {
		amount = budget_amount;
	}

	public String getBudget_name() {
		return budget_name;
	}

	public void setBudget_name(String budget_name) {
		this.budget_name = budget_name;
	}
}
