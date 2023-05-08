package com.nt;

class Test{
	public Test() {
		System.out.println("Test 0 Param Constructor");
	}
	public void m1() {
		System.out.println("Test: m1() method");
	}
}
public class InstanceBlockTest {

	public static void main(String[] args) {
		System.out.println("Normal Obj Creation");
		Test t1=new Test();
		t1.m1();
		System.out.println(t1.getClass()+" --- "+t1.getClass().getSuperclass());
		
		
		
		
		
		
		
		
		
		
		
		
		//Anynomous sub Class is created for Test class & that
		//class obj is refered by its super class Test class reference variable
		System.out.println("Anonmaus Sub  Class Obj Creation");
		Test t2=new Test() {
			
		};
		t2.m1();
		System.out.println(t2.getClass()+" --- "+t2.getClass().getSuperclass());
		
		
		
		
		
		
		System.out.println("Anonmaus Sub Class Obj Creation");
		Test t3=new Test() {
			//Constructor can not be used here bcoz no name of class
			{
				m1();
			}
		};
		
		System.out.println(t3.getClass()+" --- "+t3.getClass().getSuperclass());
	}

}
