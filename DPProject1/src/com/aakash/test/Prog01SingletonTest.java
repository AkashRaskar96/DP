package com.aakash.test;

import com.aakash.sdp.Prog01_Singleton;
import com.aakash.sdp.ThreadPrinter;
import com.aakash.sdp.ThreadPrinter2;

public class Prog01SingletonTest {
	public static void main(String[] args) {
//		Prog01_Singleton ob1=Prog01_Singleton.getInstance();
//		Prog01_Singleton ob2=Prog01_Singleton.getInstance();
//		
//		System.out.println(ob1.hashCode()+" :: "+ob2.hashCode());
//		System.out.println("ob1==ob2 ? "+(ob1==ob2));
	
	
	//  Test 2
//		Prog01ThreadClass obj1=new Prog01ThreadClass();
//		Thread t1=new Thread(obj1);
//		Thread t2=new Thread(obj1);
//		Thread t3=new Thread(obj1);
//		
//		t1.start();
//		t2.start();
//		t3.start();
	
		
		//Test 2 Printer
//		ThreadPrinter threadPrinter=new ThreadPrinter();
//		Thread tp1=new Thread(threadPrinter);
//		Thread tp2=new Thread(threadPrinter);
//		Thread tp3=new Thread(threadPrinter);
//		
//		tp1.start();
//		tp2.start();
//		try {
//			Thread.sleep(30000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		tp3.start();
		
		//Test 2 Printer
				ThreadPrinter2 threadPrinter=new ThreadPrinter2();
				Thread tp1=new Thread(threadPrinter);
				Thread tp2=new Thread(threadPrinter);
				Thread tp3=new Thread(threadPrinter);
				
				tp1.start();
				tp2.start();
				try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				tp3.start();
	}

}
