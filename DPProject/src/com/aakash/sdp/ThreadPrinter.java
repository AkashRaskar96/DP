package com.aakash.sdp;

public class ThreadPrinter implements Runnable {
	@Override
	public void run() {
		System.out.println("ThreadPrinter.run()");
		Printer printer=Printer.getInstance();
		System.out.println(printer.hashCode());
		
	}
}
