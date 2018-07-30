package com.jersey.rest;

import java.io.Serializable;

public class Person implements Serializable {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	private String name;
	private  int age;
	private int salary;
	
	Person(String name,int age,int salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	

}
