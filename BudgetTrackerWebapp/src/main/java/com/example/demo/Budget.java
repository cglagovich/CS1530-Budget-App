package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Budget {
	@Id
	private double amount;
	private String budget_name;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getBudget_name() {
		return budget_name;
	}
	public void setBudget_name(String budget_name) {
		this.budget_name = budget_name;
	}
@Override
	public String toString()
	{
		return "budget[amount: " + amount + "budget name: " + budget_name + " ]";
	}
}

