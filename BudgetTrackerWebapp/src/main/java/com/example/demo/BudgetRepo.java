package com.example.demo;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.Budget;

public interface BudgetRepo extends CrudRepository<Budget, Integer>
{

}
