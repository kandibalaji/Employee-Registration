package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Employee;

public interface Serviceinterface {
	
	public List<Employee> getEmployees();
	
	public Employee createEmp(Employee emp);
	
	public void deleteEmployee(int id);

}
