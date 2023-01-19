package com.prowings.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
	int id;
	int phone;
	String name;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, int phone, String name) {
		super();
		this.id = id;
		this.phone = phone;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", phone=" + phone + ", name=" + name + "]";
	}
	
	
}
