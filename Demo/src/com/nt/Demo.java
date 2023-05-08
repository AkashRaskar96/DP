package com.nt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class A{
	int id;
	String name;
	String add;
	A(int id, String name, String add){
		this.id=id;this.name=name;this.add=add;
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hiiii");
		Map<String, String> map=new HashMap();
//		A a1=new A(101,"A","a");
//		A a2=new A(102,"B","b");
//		A a3=new A(103,"C","c");
		map.put("roll", "101");
		map.put("name", "A");
		map.put("add", "Indore");

		Map<String, String> map2=new HashMap();
		map2.put("roll", "102");
		map2.put("name", "B");
		map2.put("add", "Pune");

		Map<String, String> map3=new HashMap();
		map3.put("roll", "103");
		map3.put("name", "C");
		map3.put("add", "Nashik");
		
		List<Map<String, String>> list=new ArrayList<>();
		list.add(map);
		list.add(map2);
		list.add(map3);
		
//		list.stream().map(m->m.);

	}

}
