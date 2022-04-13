package com.ltts.ticketapp.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.ticketapp.bo.TicketBo;
import com.ltts.ticketapp.model.Ticket;

@RestController
public class TicketController {
	
	@Autowired
	TicketBo tb;
	
@RequestMapping("")
public ModelAndView m1()
{
	return new ModelAndView("index");
}

@RequestMapping("bookticket")
public ModelAndView m2()
{
	return new ModelAndView("bookticket");
}

@RequestMapping(value="insert-booking", method=RequestMethod.POST)
public ModelAndView m3(HttpServletRequest req, Model model)
{
	ModelAndView mv=null;
	//String moviename="KGF 2";
	String mobile=req.getParameter("mobile");
	int nooftic = Integer.parseInt(req.getParameter("nooftickets"));
	LocalDate showDate = LocalDate.parse(req.getParameter("showdate"));
	LocalTime showTime=LocalTime.parse(req.getParameter("showtime"));
	String ttype=req.getParameter("tickettype");
	int totalamount=0;
	
	if(ttype.equals("Economy")) {
		totalamount=nooftic*150;
	}
	else if(ttype.equals("Platinum")){
		totalamount=nooftic*250;
	}
	else {
		
	}
	
	Ticket t1 = new Ticket(0,mobile,"KGF 2", nooftic, LocalDate.now(),showDate,showTime,ttype,totalamount);
	
	
	List<Ticket> li = tb.findAll();
	int bookedSeat=0;
	
	for(Ticket t2:li) {
		if(t2.getShowdate().equals(t1.getShowdate())) {
			if(t2.getShowtime().equals(t1.getShowtime())) {
				bookedSeat=bookedSeat+t2.getNooftickets();
			}
		}
	}
	System.out.println("Total seat: "+bookedSeat);
	
	int totalSeat=bookedSeat+nooftic;
	if(totalSeat>500) {
		mv=new ModelAndView("max");
	}
	else {
		tb.save(t1);
		mv = new ModelAndView("success");
	}
	
	//tb.save(t1);
	return mv;
	}	
	
@RequestMapping("viewticket")
public ModelAndView m5(Model m) {
	java.util.List<Ticket> li =tb.findAll();
	m.addAttribute("ticket",li);
	return new ModelAndView("viewticket");
}

@RequestMapping("deleteticket")
public ModelAndView m7(HttpServletRequest req) {
	
	int num = Integer.parseInt(req.getParameter("id"));
	tb.deleteById(num);
	return new ModelAndView("deleteticket");
}
@RequestMapping("updateticket")
public ModelAndView m9(HttpServletRequest req,Model model) {
	int no=Integer.parseInt(req.getParameter("id"));
	System.out.println(no);
	
	Ticket t1=tb.getById(no);
	model.addAttribute("ticket", t1);
	return new ModelAndView("updateticket");
}

@RequestMapping(value="updateticket",method=RequestMethod.POST)
public ModelAndView m6(HttpServletRequest req) {
	ModelAndView mv=null;
	int noo=Integer.parseInt(req.getParameter("pid"));
	String mobile=req.getParameter("mobile");
	int nooftic = Integer.parseInt(req.getParameter("nooftickets"));
	LocalDate showDate = LocalDate.parse(req.getParameter("showdate"));
	LocalTime showTime=LocalTime.parse(req.getParameter("showtime"));
	String ttype=req.getParameter("tickettype");
	int totalamount=0;
	
	if(ttype.equals("Economy")) {
		totalamount=nooftic*150;
	}
	else if(ttype.equals("Platinum")){
		totalamount=nooftic*250;
	}
	
	
	Ticket t1 = new Ticket(noo,mobile,"KGF 2", nooftic, LocalDate.now(),showDate,showTime,ttype,totalamount);
	
	List<Ticket> li = tb.findAll();
	int bookedSeat=0;
	
	for(Ticket t2:li) {
		if(t2.getShowdate().equals(t1.getShowdate())) {
			if(t2.getShowtime().equals(t1.getShowtime())) {
				bookedSeat=bookedSeat+t2.getNooftickets();
			}
		}
	}
	System.out.println("Total seat: "+bookedSeat);
	
	int totalSeat=bookedSeat+nooftic;
	if(totalSeat>500) {
		mv=new ModelAndView("max");
	}
	else {
		tb.save(t1);
		mv = new ModelAndView("success");
	}
	
	//tb.save(t1);
	return mv;
	}	
}
