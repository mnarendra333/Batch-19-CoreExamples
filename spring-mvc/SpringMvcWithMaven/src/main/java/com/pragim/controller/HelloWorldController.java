package com.pragim.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	
	
	
	@RequestMapping("/welcome")
	public ModelAndView welcomePage(){
		String message = "Welcome to spring-MVC";
		return new ModelAndView("success", "msg", message);
	}
	
	@RequestMapping("/print")
	public ModelAndView printNumbers(){
		
		List<String> numList = new ArrayList<String>();
		numList.add("one");
		numList.add("two");
		numList.add("three");
		numList.add("four");
		
		return new ModelAndView("success", "list", numList);
		
	}
	
	
	

}
