package com.home.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldModelObjectController {
	
	/*@RequestMapping(value = "/")
	public String welcomePage(Model model) {
		model.addAttribute("welcomeMessage", "Welcome in Spring MVC!!!");
		model.addAttribute("headerMessage", "Welcome in Spring MVC header!!!");
		return "welcomePage";
	}*/
	
	/*@RequestMapping(value = "/")
	public String welcomePage(Map<String,String> map) {
		map.put("welcomeMessage", "Welcome in Spring MVC!!!");
		map.put("headerMessage", "Welcome in Spring MVC header!!!");
		return "welcomePage";
	}*/
	
	@RequestMapping(value = "/welcome")
	public String welcomePage() {
		return "welcomePage";
	}
	
	@ModelAttribute
	public void modelData(Model model) {
		model.addAttribute("welcomeMessage", "Welcome in Spring MVC!!!");
		model.addAttribute("headerMessage", "Welcome in Spring MVC header!!!");
	}

}
