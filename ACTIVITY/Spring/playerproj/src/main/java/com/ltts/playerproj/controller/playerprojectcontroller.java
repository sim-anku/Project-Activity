package com.ltts.playerproj.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.playerproj.bo.playerbo;
import com.ltts.playerproj.model.player;

@RestController 

public class playerprojectcontroller {
	
	@Autowired
	playerbo pb;
	
	
		@RequestMapping("/")
		public String m1() {
			return "Hello Welcome to Spring Mvc app";
		}
		
		@RequestMapping("index")
		public ModelAndView m2() {
			return new ModelAndView();
		}
		@RequestMapping("addplayer")
		public ModelAndView m3() {
			return new ModelAndView("insertplayer");
		}
		@RequestMapping(value="insert_the_player",method=RequestMethod.POST)
		public ModelAndView m4(HttpServletRequest req) {
			ModelAndView mv = new ModelAndView();
			int pno=Integer.parseInt(req.getParameter("pnum"));
			String pname=req.getParameter("pname");
			int runs=Integer.parseInt(req.getParameter("runs"));
			String skill=req.getParameter("skill");
			int teamid=Integer.parseInt(req.getParameter("teamid"));
			
			
			
			//Application context
			player p=new player(pno,pname,runs,skill, teamid);
			try {
				pb.save(p);
				mv= new ModelAndView("success");
			}
			catch(Exception e) {
				mv = new ModelAndView("error");
			}
			return mv;
		}
		
		@RequestMapping("viewplayer")
		public ModelAndView m5(Model m) {
			java.util.List<player> li =pb.findAll();
			m.addAttribute("player",li);
			return new ModelAndView("viewplayer");
		}
		@RequestMapping("updateplayer")
		public ModelAndView m6(HttpServletRequest req) {
			int no=Integer.parseInt(req.getParameter("id"));
			System.out.println(no);
			player p1=pb.getById(no);
			return new ModelAndView("updateplayer");
		}
	}

