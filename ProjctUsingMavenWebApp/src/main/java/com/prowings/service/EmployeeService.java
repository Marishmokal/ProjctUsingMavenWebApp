package com.prowings.service;

import com.prowings.model.Employee;

public interface EmployeeService {

	public void createEmployee(Employee employee);

	public void deleteEmployee(int id);

	public void updateEmployee(Employee employee);

	public Employee retriveEmployee(int id);

	
	

}
