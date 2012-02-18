package com.sample.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.sample.beans.Industry;

public class IndustryCustomerController extends MultiActionController{
	
	public ModelAndView testaddCustomer(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		System.out.println("In Add");
		return new ModelAndView("CustomerPage"/*Jsp Name*/, "msg"/*Bean Name*/,"add() method" /*Bean Object*/);
			
	}
	
	public ModelAndView testdeleteCustomer(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
			System.out.println("In Delete");
		return new ModelAndView("CustomerPage", "msg","delete() method");
				
	}
	
	public ModelAndView testupdateCustomer(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		System.out.println("In Update");
		return new ModelAndView("CustomerPage", "msg","update() method");
				
	}
	
	public ModelAndView testlistCustomer(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		PrintWriter out = response.getWriter();
		System.out.println("In List");	
		String industryName = request.getParameter("industryName");
		String currencyName = request.getParameter("currencyName");
		System.out.println(industryName+"%%%"+currencyName);
		out.write(industryName);
		Industry industry = new Industry();
		industry.setIndustryName(industryName);
		//ModelAndView modelView = new ModelAndView("constantsList", "industry",industry);
		//return modelView;
		return null;
					
	}
	
}