package com.gl.empmgmt.samir.service;

import java.util.List;

import com.gl.empmgmt.samir.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	
	public Employee getEmployee(int id);
	
	public Employee updateEmployee(Employee employee);
	
	public Employee saveEmployee(Employee employee);
	
	public void  deleteEmployee(int id);

	
	

}
