package com.nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Emp{
	String name;
	String gender;
	Double sal;
	public Emp(String name, String gender, Double sal) {
		this.name=name;
		this.gender=gender;
		this.sal=sal;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+gender+" "+sal;
	}
}
public class StreamAPI2 {

	public static void main(String[] args) {
		Emp e1=new Emp("Ankit", "M", 10000.5);
		Emp e2=new Emp("Ankita", "F", 10000.5);
		Emp e3=new Emp("Anjali", "F", 11000.5);
		List<Emp> list=new ArrayList<>();
		list.add(e1); list.add(e2); list.add(e3);
		
		System.out.println(list.stream().filter(e->e.gender.equalsIgnoreCase("F")).mapToDouble(e->e.sal).average());
//		list.forEach(e->System.out.println(e.toString()));
			
	}

}
