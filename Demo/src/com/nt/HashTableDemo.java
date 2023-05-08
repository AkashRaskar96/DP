package com.nt;

import java.util.Hashtable;

class HashStud{
	int roll;
	String name;
	@Override
	public String toString() {
		return roll+"--"+name;
	}
}
public class HashTableDemo {

	public static void main(String[] args) {
		HashStud s1=new HashStud();
		s1.roll=101;
		s1.name="A";
		
		HashStud s2=new HashStud();
		s2.roll=102;
		s2.name="B";
		HashStud s3=new HashStud();
		s3.roll=101;
		s3.name="C";
		Hashtable<Integer, HashStud> obj=new Hashtable<>();
		obj.put(1, s1);
		obj.put(2, s2);
		obj.put(3, s3);
	
		System.out.println(obj);
		
		
	}

}
