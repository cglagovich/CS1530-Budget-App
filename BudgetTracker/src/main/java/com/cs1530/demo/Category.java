package com.cs1530.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Category {
	private String category_name;
	public ArrayList<Integer> indexes;
	
	public Category(String category_name) {
		this.category_name = category_name;
		indexes = new ArrayList<Integer>();
	}
	
	public String getCategory_name() {
		return category_name;
	}
	
	public boolean add_to_category(String category, int index) {
		if(!category.equals(category_name))
		{
			System.out.println("The category name doesn't match.");
			return false;
		}
		indexes.add(index);
		return true;
	}
	public boolean remove_from_category(String category, int index) {
		if(!category.equals(category_name))
		{
			System.out.println("The category name doesn't match.");
			return false;
		}
		indexes.remove(index);
		return true;
	}
}
