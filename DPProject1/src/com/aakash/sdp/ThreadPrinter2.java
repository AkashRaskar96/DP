package com.aakash.sdp;

public class ThreadPrinter2 implements Runnable {
	@Override
	public void run() {
		System.out.println("ThreadPrinter.run()");
//		Printer2 printer=Printer2.getInstance();
//		System.out.println(printer.hashCode());

		/*OR*/
		Printer2_ printer=Printer2_.getInstance();
		System.out.println(printer.hashCode());

	}
}
