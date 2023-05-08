package com.adt.model;

import lombok.Data;

@Data
public class Employee {
	private Integer empno;
	private String empname;
	private String empaddrs;
	private Float salary;
	private Float grossSalary;
	private Float netSalary;
}
