package com.aakash.product;

public class Employee {
	private int id;
	private String name;
	private String adderss;
	private double salary;
	public Employee() {}
	
	public Employee(int id, String name, String adderss, double salary) {
		this.id=id;
		this.name=name;
		this.adderss=adderss;
		this.salary=salary;
	}
	//Setter method that return current object refference
	public Employee setId(int id) {
		this.id=id;
		return this;
	}
	public Employee setName(String name) {
		this.name=name;
		return this;
	}
	public Employee setAdderss(String adderss) {
		this.adderss=adderss;
		return this;
	}
	public Employee setSalary(double salary) {
		this.salary=salary;
		return this;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adderss=" + adderss + ", salary=" + salary + "]";
	}

}
