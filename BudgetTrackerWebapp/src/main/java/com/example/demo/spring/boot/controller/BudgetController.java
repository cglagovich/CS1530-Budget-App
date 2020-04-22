package com.example.demo.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Budget;
import com.example.demo.BudgetRepo;

@Controller
public class BudgetController {
	
	@Autowired
	BudgetRepo repo;
	
	@RequestMapping("EnterBudget")
	public ModelAndView add_Budget(Budget budget)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",budget);
		mv.setViewName("EnterBudget");
		return mv;
	}
	
	@RequestMapping("/addBudget")
	public String addBudget(Budget budget)
	{
		repo.save(budget);
		return "EnterBudget";
	}
	
	@RequestMapping("/getBudget")
	public ModelAndView getBudget(String name)
	{
		ModelAndView mv = new ModelAndView("showBudget");
		return mv;
	}
}
