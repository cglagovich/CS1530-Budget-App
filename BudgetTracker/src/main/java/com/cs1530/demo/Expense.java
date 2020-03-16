package com.cs1530.demo;

import java.text.DateFormat;

public class Expense {
	private double amount;
	private DateFormat date;
	public double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public DateFormat getDate() {
		return date;
	}
	public void setDate(DateFormat date) {
		this.date = date;
	}
	
	public double update_amount(double new_amount) {
		amount = new_amount;
		return amount;
	}
}
