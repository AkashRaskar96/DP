package com.aakash.sdp;

public class Printer {
	
	private static Printer INSTANCE;
	
	private Printer() {
		System.out.println("0 Param Constructor Printer()");
	}
	
	public static Printer getInstance() {
		if(INSTANCE==null) {
			System.out.println("OutSide Synch Block Printer.getInstance()");
			synchronized(Printer.class) {
				System.out.println("Inside Synch Block Printer.getInstance()");
				if(INSTANCE==null) {
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					INSTANCE=new Printer();
				}
			}
		}
		return INSTANCE;
	}

}
