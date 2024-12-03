package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.Myrepository;

@Service
public class Serviceimpl implements Serviceinterface {
	
	@Autowired
	private Myrepository repo;

	@Override
	public List<Employee> getEmployees() {
		return repo.findAll();
	}

	@Override
	public Employee createEmp(Employee emp) {
		return repo.save(emp);
	}

	@Override
	public void deleteEmployee(int id) {
		repo.deleteById(id);
		
	}
	
	
}
