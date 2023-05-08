package com.nt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee1{
	int id;
	String name;
	String desig;
	public Employee1(int id, String name, String desig) {
		super();
		this.id = id;
		this.name = name;
		this.desig = desig;
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
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", desig=" + desig + "]";
	}
	
}

class Department{
	int id;
	String name;
	Employee1 emp;
	public Department(int id, String name, Employee1 emp) {
		super();
		this.id = id;
		this.name = name;
		this.emp = emp;
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


	public Employee1 getEmp() {
		return emp;
	}


	public void setEmp(Employee1 emp) {
		this.emp = emp;
	}


	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", emp=" + emp + "]";
	}	
	
}

class Company{
	int id;
	String name;
	Department department;
	boolean ispublic;
	public Company(int id, String name, Department department, boolean ispublic) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.ispublic = ispublic;
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public boolean isIspublic() {
		return ispublic;
	}
	public void setIspublic(boolean ispublic) {
		this.ispublic = ispublic;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", department=" + department + ", ispublic=" + ispublic + "]";
	}
		
}


public class ComplexExampleUsingStreamAPI {
	public static void main(String[] args) {
		List<Company> list=new ArrayList<>();
		list.add(new Company(1, "ADT", new Department(11,"Prodection", new Employee1(11, "Ajit", "Sr.Java Devloper")),true));
		list.add(new Company(1, "ADT", new Department(11,"Prodection", new Employee1(11, "Ajay", "Sr.Java Devloper")),true));
		list.add(new Company(1, "ADT", new Department(11,"Prodection", new Employee1(11, "Ashish", "Jr.Java Devloper")),false));
		list.add(new Company(1, "ADT", new Department(11,"Prodection", new Employee1(11, "Ankush", "Jr.Java Devloper")),false));
//		Company company=new Company(1, "ADT", new Department(11,"Prodection", new Employee1(11, "Ajit", "Sr.Java Devloper")),true);
//		Company company=new Company(1, "ADT", new Department(11,"Prodection", new Employee1(11, "Ajay", "Sr.Java Devloper")),true);
//		Company company=new Company(1, "ADT", new Department(11,"Prodection", new Employee1(11, "Ajit", "Jr.Java Devloper")),false);
//		Company company=new Company(1, "ADT", new Department(11,"Prodection", new Employee1(11, "Ajit", "Jr.Java Devloper")),false);
	
		
//		list.stream().filter(c->c.getDepartment().getEmp().getDesig().equalsIgnoreCase("Sr.Java Devloper"))
//				.filter(c->c.isIspublic()).collect(Collectors.toList()).forEach(System.out::println);;
		
		list.stream().filter(c->c.getDepartment().getEmp().getDesig().equalsIgnoreCase("Sr.Java Devloper"))
		.filter(c->c.isIspublic()).forEach(System.out::println);
	}
}
/*
 * COMPany
id,name,department,ispublic

Department
id,name,employees


Employee
id,name,desig

all the employees where  desig = sr.java developer, ispublic=true
getAllEmployees(List companyList){

List filt_list = companyList.stream().filter(c->c.getDeprtment().getEmployee().getDesig().equalIgnoreCases("sr. Java developer "))
.filter(c->c.isPublic()).collect(Collectors.toList()));


25 columns,10 columns having an index*/
