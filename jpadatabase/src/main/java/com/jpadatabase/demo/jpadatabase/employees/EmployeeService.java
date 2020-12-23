package com.jpadatabase.demo.jpadatabase.employees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeerepo;
	
public List<Employee> getAllEmployees()
{
	List<Employee> employees=new ArrayList<>();
	employeerepo.findAll().forEach(employees::add);
	return employees;
}

public Optional<Employee> getEmployee(int id) {                //Why Optional
	return employeerepo.findById(id);

}

public void addEmployee(Employee employee) {
employeerepo.save(employee);
}

public void updateEmployee(int id, Employee employee) {
	employeerepo.save(employee);
}
public void deleteEmployee(int id) {
	
employeerepo.deleteById(id);

}

}