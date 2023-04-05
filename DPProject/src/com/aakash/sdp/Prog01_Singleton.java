//Singleton Java Class With Minimum Standards
package com.aakash.sdp;

public class Prog01_Singleton {
	//private static instance member to refer refrence of obj
	private static Prog01_Singleton INSTANCE;
	//private Constructor
	private Prog01_Singleton() {
		System.out.println("0 Param Constructor");
	}
	//public static method(static factory method)
	public static Prog01_Singleton getInstance() {
		if(INSTANCE==null) 
			INSTANCE=new Prog01_Singleton();
		return INSTANCE;
	}

}
