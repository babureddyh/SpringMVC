package com.babu.learning.spring.dao;

import org.springframework.stereotype.Repository;

import com.babu.learning.spring.models.Employee;
// @Repository, because I access db through this class.

@Repository
public class EmployeeDAOImpl extends DAOImpl {
	

	public String getPassword(String userName) {
		return jdbcTemplate.queryForObject("select password from employee where user_name=?", String.class, userName);
	}

	public boolean addNewEmployee(Employee employee) {
		return jdbcTemplate.update(
				"insert into employee(first_name, last_name, designation, base_location, salary, user_name, password) values (?,?,?,?,?,?,?)",
				employee.getFirstName(), employee.getLastName(), employee.getDesignation(), employee.getBaseLocaiton(),
				employee.getSalary(), employee.getUserName(), employee.getPassword()) == 1;
	}
}
