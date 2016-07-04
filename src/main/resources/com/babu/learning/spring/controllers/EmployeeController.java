package com.babu.learning.spring.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.babu.learning.spring.manager.EmployeeManager;
import com.babu.learning.spring.models.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeManager employeeManager;
	
	@RequestMapping("/hello")
	public ModelAndView helloHandler() {
		return new ModelAndView("hello", "message", "Hello");
	}
	
	@RequestMapping("/addnewemployee")
	public ModelAndView addNewEmployee() {
		return new ModelAndView("addnewemployee");
	}
	
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee(HttpServletRequest request, HttpServletResponse response) {
		Employee newEmployee = new Employee();
		newEmployee.setBaseLocaiton((String)request.getParameter("baseLocation"));
		newEmployee.setDesignation((String)request.getParameter("designation"));
		newEmployee.setFirstName((String)request.getParameter("firstName"));
		newEmployee.setLastName((String)request.getParameter("lastName"));
		newEmployee.setUserName((String)request.getParameter("userName"));
		newEmployee.setPassword((String)request.getParameter("password"));
		newEmployee.setSalary(Integer.parseInt((String)request.getParameter("salary")));
		if(employeeManager.addNewEmployee(newEmployee))
			return new ModelAndView("listemployess","message", newEmployee.getFirstName()+" "+newEmployee.getLastName() +" Employee added successfully");
		return new ModelAndView("listemployees", "message", newEmployee.getFirstName()+" "+newEmployee.getLastName()+" cannot be added. Try again later.");
	}
}
