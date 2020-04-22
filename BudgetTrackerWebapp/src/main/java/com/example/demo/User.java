package com.example.demo;

import java.util.List;

public class User {
		private String user_name;
		private List<Budget> budgets;

		public String getUser_name() {
			return user_name;
		}

		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}

		public List<Budget> getBudgets() {
			return budgets;
		}

		public void setBudgets(List<Budget> budgets) {
			this.budgets = budgets;
		}

	
}
