package com.cg.Services;

import java.util.List;

import com.cg.Entities.Employee;

public interface EmployeeService 
{
	public boolean AddEmployee(Employee e);
	public Employee updateEmployee(Employee e);
	public Employee GetEmployee(int ID);
	public List<Employee> GetEmployees();
	public boolean deleteEmployee(int ID);

}
