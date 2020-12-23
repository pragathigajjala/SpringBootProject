package com.jpadatabase.demo.jpadatabase.employees;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String designation;
	private String email;
	private String salary;
	
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, String designation, String email, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.email = email;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", email=" + email
				+ ", salary=" + salary + "]";
	}
	
	
	
}
