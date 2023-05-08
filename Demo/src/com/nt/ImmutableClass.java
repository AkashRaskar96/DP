package com.nt;

import java.util.HashMap;
import java.util.Map;

final class IStud{
	private final Integer i;
	private final String name;
	private final HashMap<String, String> doc;
	public Integer getI() {
		return i;
	}
	
	public String getName() {
		return name;
	}

	public HashMap<String, String> getDoc() {
 
		return (HashMap<String, String>) doc.clone();
	}

	public IStud(Integer i,String name, HashMap<String, String> doc) {
		this.i=i;
		this.name=name;
		this.doc = doc;
	}
}
public class ImmutableClass {
	public static void main(String[] args) {
		HashMap<String, String> m=new HashMap();
		m.put("Adhar","111");
		m.put("Pan","222");
		IStud s1=new IStud(101,"A",m);
		System.out.println(s1.getI());
		System.out.println(s1.getName());
		System.out.println(s1.getDoc());
		Integer i=s1.getI();
		i=102;
		String name=s1.getName();
		name="B";
		Map<String, String> map=s1.getDoc();
		map.put("VotterId", "333");
		System.out.println(s1.getI());
		System.out.println(s1.getName());
		System.out.println(s1.getDoc());
	}
}
