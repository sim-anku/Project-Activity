package com.ltts.movieticket.movieticket.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ApplicationController {
	
	@RequestMapping("/")
	public String Welcome() {
		return "Hello World!!!";
	}
	
	@RequestMapping("index")
	public ModelAndView indexPage() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("register")
	public ModelAndView Register() {
		return new ModelAndView("register");
	}
	
	@RequestMapping(value="register_details", method=RequestMethod.POST)
	public ModelAndView RegisterDetails(HttpServletRequest req) {
		String name = req.getParameter("pname");
		int num = Integer.parseInt(req.getParameter("pnum"));
		String address = req.getParameter("address");
		
		return new ModelAndView("book");
	}
	
	@RequestMapping("login")
	public ModelAndView LogIn() {
		return new ModelAndView("login");
	}

}
