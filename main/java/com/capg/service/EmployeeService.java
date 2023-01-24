package com.capg.service;

import java.util.List; 
import com.capg.entity.Employee;
public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int id);
}
