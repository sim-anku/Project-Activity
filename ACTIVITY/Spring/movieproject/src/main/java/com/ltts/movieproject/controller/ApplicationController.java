  package com.ltts.movieproject.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.movieproject.bo.MovieBo;
import com.ltts.movieproject.model.Movie;

@RestController
public class ApplicationController {
	@Autowired
	MovieBo pb;
	@RequestMapping("/")
	public String m1()
	{
		return "Hello Welcome to spring mvc app";
	}
	@RequestMapping("index")
	public ModelAndView m2()
	{
		System.out.println("I am inside the controller");
	 return new ModelAndView("index");	
	}
	@RequestMapping("addmovie")
	public ModelAndView m3()
	{
		return new ModelAndView("insertmovie");
	}
	@RequestMapping(value="insert_the_player",method=RequestMethod.POST)
	public ModelAndView m4(HttpServletRequest req)
	{
		int pnum=Integer.parseInt(req.getParameter("num"));
		String pname=req.getParameter("pname");
		
		Movie m=new Movie();
		try
		{
			//m.save();
		}
		catch(Exception e)
		{
			
		}
		return new ModelAndView("success");
	}
	@RequestMapping("viewmovie")
	public ModelAndView m5()
	{
		List<Movie> li=pb.findAll();
		System.out.println(li);
		return new ModelAndView("viewdetails");
		}
	
}
