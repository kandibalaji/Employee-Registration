package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.Serviceinterface;

@RestController
@CrossOrigin(origins= {"http://localhost:4200"})
public class Mycontroller {
	
	@Autowired
	private Serviceinterface servs;
	
	@GetMapping("/get")
	public List<Employee> getEmp()
	{
		return servs.getEmployees();
	}
	
	@PostMapping("/add")
	public Employee saveEmployee(@RequestBody Employee emp)
	{
		return servs.createEmp(emp);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id)
	{
		servs.deleteEmployee(id);
		return new ResponseEntity<String>("Employee Deleted Successfully",HttpStatus.OK);
	}
	

}
