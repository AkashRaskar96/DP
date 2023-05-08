package com.aakash.test;

import com.aakash.product.Employee;
//Builder Pattern Giveing Values for only those we want to Give 
public class BuilderDesignPatternTest {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		
		emp1.setId(1).setName("Ajay").setAdderss("Pune").setSalary(100000000);
		emp2.setId(2).setName("Ashish");
		System.out.println(emp1);
		System.out.println(emp2);
		
	}

}
