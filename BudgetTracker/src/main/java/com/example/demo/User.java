package com.example.demo;

public class User {
	
	private String user_name;
	private Budget[] budgets;

	public void user_create(String user_name, Budget new_budget) {
		this.user_name = user_name;
		budgets[0] = new_budget;
	}
	
	public void login() {
	}
	
	public void user_profile() {
		System.out.println("User name: "+ user_name);
	}
}
