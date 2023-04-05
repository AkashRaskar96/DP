package com.aakash.sdp;

public class Printer2 {
	//Eager Instantiation
	private static Printer2 INSTANCE=new Printer2();
	
	//Constructor
	private Printer2() {
		System.out.println("0 Param Constructor Printer2()");
	}
	
	//static Factory Method 
	public static Printer2 getInstance() {
		return INSTANCE;
	}

}
