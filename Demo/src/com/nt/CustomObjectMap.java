package com.nt;

import java.util.HashMap;
import java.util.Map;

class Custom{
	int roll;
	String name;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Custom(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "roll=" + roll + ", name=" + name ;
	}
	@Override
	public int hashCode() {
		return this.roll;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) 
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Custom newObj=(Custom) obj;
		if(this.roll!=newObj.roll)
			return false;
		return true;
	}
	
}
public class CustomObjectMap {

	public static void main(String[] args) {
		Map<Custom, String> map=new HashMap();
		Custom c1=new Custom(101, "A");
		Custom c2=new Custom(102, "B");
		Custom c3=new Custom(103, "C");
		map.put(c1, "A");
		map.put(c2, "B");
		map.put(c3, "B");
		for(Map.Entry<Custom, String> m:map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue()+" "+m.hashCode());

		c3.setRoll(11);
		for(Map.Entry<Custom, String> m:map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue()+" "+m.hashCode());
	}

}
