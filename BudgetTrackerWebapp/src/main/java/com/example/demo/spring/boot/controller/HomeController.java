package com.example.demo.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.User;

@Controller
public class HomeController 
{
	@RequestMapping("home")
	public ModelAndView home(User user)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",user);
		mv.setViewName("home");
		return mv;
	}
}
