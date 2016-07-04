package com.babu.learning.spring.manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babu.learning.spring.dao.EmployeeDAOImpl;
import com.babu.learning.spring.models.Employee;

@Service
public class EmployeeManager {
	
	@Autowired
	private EmployeeDAOImpl employeeDAOImpl;
	public boolean addNewEmployee(Employee employee) {
		return employeeDAOImpl.addNewEmployee(employee);
	}
	
}
