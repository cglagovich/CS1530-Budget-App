package com.cs1530.demo;

import java.util.LinkedList;
import java.util.List;

public class User {
	private String user_name;
	private List<Budget> budgets;
	private List<Expense> expences;
	private List<Goal> goals;
	public List<Category> categories;

	public void user_create(String user_name, Budget new_budget, Expense new_expense, Goal new_goal)
	{
		this.user_name = user_name;
		budgets.add(new_budget);
		expences.add(new_expense);
		goals.add(new_goal);
	}
	
	public void create_categories() {
		categories = new LinkedList<Category>();
		// invite user to give names to the categories they want to set up
	}
	
	public void put_to_categories() {
		// enter the name of the expense/budget/goal they want to put into that category
		// look into the list to see which index it is and add that index into the specified indexs[]
	}
	
	public boolean user_add(String user, Budget new_budget, Expense new_expense, Goal new_goal)
	{
		if(!user.contentEquals(user_name))
		{
			System.out.println("This is not you");
			return false;
		}
		budgets.add(new_budget);
		expences.add(new_expense);
		goals.add(new_goal);
		return true;
	}
	
	public boolean user_delete(String user, Budget new_budget, Expense new_expense, Goal new_goal)
	{
		if(!user.contentEquals(user_name))
		{
			System.out.println("This is not you");
			return false;
		}
		budgets.remove(new_budget);
		expences.remove(new_expense);
		goals.remove(new_goal);
		return true;
	}
	
	public void login() {
	}
	
	public boolean over_budget() {
		for(int i = 0; i< budgets.size(); i++)
		{
			if(budgets.get(i).getBudget_amount() - expences.get(i).getAmount() < 0)
			{
				System.out.println("Over the budget!!");
				return true;
			}
		}
		return false;
	}
	
	public boolean reach_goal() {
		for(int i = 0; i< goals.size();i++)
		{
			if(budgets.get(i).getBudget_amount() - goals.get(i).getAmount() > 0)
				return false;
		}
		System.out.println("You've reached the goal!!");
		return true;
	}
	
	public void user_profile() {
		System.out.println("User name: "+ user_name);
	}
}
