package com.capg.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.Employee;
import com.capg.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
  
	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}
	

}
