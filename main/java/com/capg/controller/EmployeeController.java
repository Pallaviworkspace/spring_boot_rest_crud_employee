package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.Employee;
import com.capg.service.EmployeeService;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {
	
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return  employeeService.addEmployee(employee);
	}
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee() 
	{
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{
		return employeeService.getEmployeeById(id);
	}
}
