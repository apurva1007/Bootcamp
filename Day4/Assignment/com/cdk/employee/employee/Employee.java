package com.cdk.employee.employee;

public class Employee {
	int id;
	String name;
	Month month;
	int year;
	
	Employee (int id, String name, Month month, int year) {
		this.id = id;
		this.name = name;
		this.month = month;
		this.year = year;
	}
}