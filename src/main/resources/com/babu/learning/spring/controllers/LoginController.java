package com.babu.learning.spring.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.babu.learning.spring.dao.EmployeeDAOImpl;

@Controller
public class LoginController {
	
	@RequestMapping("/loginpage")
	public ModelAndView loginPage(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().setAttribute("redirectURL", request.getRequestURL());
		return new ModelAndView("loginpage","something",null);
	}
	
	@RequestMapping("/loginaction")
	public ModelAndView loginAction(HttpServletRequest request, HttpServletResponse response) {
		
		String redirectPage = "loginHome";
		if(!request.getAttribute("password").equals(new EmployeeDAOImpl().getPassword((String)request.getAttribute("userName")))) {
			redirectPage = "Error";
			
		}
		
		return new ModelAndView(redirectPage, "message", null);
	}
}
