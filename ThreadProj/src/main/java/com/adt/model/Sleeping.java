package com.adt.model;

public class Sleeping {
	public synchronized void sleep(String name) {
		
		for(int i=0;i<5;i++) {
			System.out.print("Hey I'm Sleeping Now :: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
	public synchronized void sleep2(String name) {
		
		for(int i=0;i<5;i++) {
			System.out.print("Hey I'm Sleeping2 Now :: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
	
	public static synchronized void happy(String name) {
		
		for(int i=0;i<5;i++) {
			System.out.print("Hey I'm Happy Now :: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
	public static synchronized void notHappy(String name) {
		
		for(int i=0;i<5;i++) {
			System.out.print("Hey I'm Not-Happy Now :: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
	public void normal() {
		System.out.println("Hello I'm in Normal Method");
	}
}
