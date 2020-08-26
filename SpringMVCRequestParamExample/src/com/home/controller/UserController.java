package com.home.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.home.model.User;

@Controller
public class UserController {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String registerPage() {
		return  "register";
	}
	
	/*@RequestMapping(value = "registerSuccess",method = RequestMethod.POST)
	public ModelAndView registerSuccess(@RequestParam("name") String name,
			@RequestParam(required = false,name="email") String email,
			@RequestParam(defaultValue ="25" ,name="age") Integer age,
			@RequestParam("country") String country) {
		User user=new User(name, email, age, country);
		ModelAndView modelAndView=new ModelAndView("registerSuccess");
		modelAndView.addObject("user",user);
		return modelAndView;
		}*/
	
	//Using Map
	/*@RequestMapping(value = "registerSuccess",method = RequestMethod.POST)
	public ModelAndView registerSuccess(@RequestParam Map<String,String> mapData) {
		String name=mapData.get("name");
		String email=mapData.get("email");
		Integer age=Integer.parseInt(mapData.get("age"));
		String country=mapData.get("country");
		User user=new User(name, email, age, country);
		ModelAndView modelAndView=new ModelAndView("registerSuccess");
		modelAndView.addObject("user",user);
		return modelAndView;
		}*/
	
	//Use Http servler request and response
	@RequestMapping(value = "registerSuccess",method = RequestMethod.POST)
	public ModelAndView registerSuccess(HttpServletRequest request,HttpServletResponse response) {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		Integer age=Integer.parseInt(request.getParameter("age"));
		String country=request.getParameter("country");
		User user=new User(name, email, age, country);
		ModelAndView modelAndView=new ModelAndView("registerSuccess");
		modelAndView.addObject("user",user);
		return modelAndView;
		}
}
