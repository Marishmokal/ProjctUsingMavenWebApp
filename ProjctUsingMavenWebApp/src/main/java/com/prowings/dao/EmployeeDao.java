package com.prowings.dao;

import com.prowings.model.Employee;

public interface EmployeeDao {

	public void createEmployee(Employee employee);

	public void deleteEmployee(int id);

	public void updateEmployee(Employee employee);

	public Employee retriveEmployee(int id);



}
