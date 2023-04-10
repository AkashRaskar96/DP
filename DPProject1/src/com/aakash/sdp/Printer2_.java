package com.aakash.sdp;

public class Printer2_ {
	//from Outer class it is Lazy Instantiation
	
	//Static Inner class
	private static class   Printer2_Inner{
		private static Printer2_ INSTANCE=new Printer2_(); //Inner class based eager Instantiation
	}
	
	private Printer2_() {
		System.out.println("0 Param Constructor Printer2_()");
	}
	
	public static Printer2_ getInstance() {
		return Printer2_Inner.INSTANCE;
	}

}
