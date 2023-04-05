package com.aakash.test;


import com.aakash.sdp.Prog01_Singleton2;

public class Prog01ThreadClass implements Runnable {
	@Override
	public void run() {
		System.out.println("Prog01ThreadClass.run()");;
		Prog01_Singleton2 ob1=Prog01_Singleton2.getInstance();
		System.out.println(ob1.hashCode());
		
	}
}
