package com.babu.learning.spring.models;

public class Employee {
	private int salary;
	private String firstName, lastName, baseLocaiton, designation, userName, password;
	
	public Employee(){
		super();
	}
	
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", firstName=" + firstName + ", lastName=" + lastName + ", baseLocaiton="
				+ baseLocaiton + ", designation=" + designation + ", userName=" + userName + ", password=" + password
				+ "]";
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBaseLocaiton() {
		return baseLocaiton;
	}
	public void setBaseLocaiton(String baseLocaiton) {
		this.baseLocaiton = baseLocaiton;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
