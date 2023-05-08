package com.adt.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.adt.model.Employee;
@Component
public class EmployeeItemProcessor implements ItemProcessor<Employee, Employee> {
	
	@Override
	public Employee process(Employee emp) throws Exception {
		if(emp.getSalary()>=40000) {
			return emp;
		}
		return null;
	}
}
