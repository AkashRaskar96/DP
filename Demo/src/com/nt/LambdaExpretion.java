package com.nt;
@FunctionalInterface
interface B{
	default void get() {
		System.out.println("get");
	}
	static void show() {
		System.out.println("show");
	}
	public int add(int a,int b);
}
public class LambdaExpretion {

//	public static int add(int a, int b) {
//		return a+b;
//	}
	public static void main(String[] args) {
//		int result =add(1,2);
//		System.out.println(result);
//		
		
		B a1=( a, b) ->a-b;
		System.out.println(a1.add(5,3));
		a1.get();
		B.show();
		

	}

	
}
