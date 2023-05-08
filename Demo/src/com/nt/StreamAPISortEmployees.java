package com.nt;


import java.util.Arrays;
import java.util.List;
class Employee{
	int empId;
	String name;
	Integer salary;
	public int getEmpId() {
		return empId;
	}
	public void setRoll(int empid) {
		this.empId = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Employee(int empId,String name,Integer salary) {
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class StreamAPISortEmployees {

	public static void main(String[] args) {
			
		List<Employee> list=Arrays.asList(
									new Employee(101, "A", 100),
									new Employee(101, "A", 200),
									new Employee(101, "A", 99),
									new Employee(101, "A", 1001)
									);

		list.stream().sorted((e1,e2)->e1.getSalary().compareTo(e2.getSalary())).forEach(System.out::println);

	}

}
