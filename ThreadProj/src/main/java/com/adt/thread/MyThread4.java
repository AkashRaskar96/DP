package com.adt.thread;

import com.adt.model.Sleeping;

public class MyThread4 extends Thread {
	Sleeping o;
	String name;
	public MyThread4(Sleeping o, String name){
		this.o=o;
		this.name=name;
	}
	@Override
	public void run() {
		o.notHappy(name);
	}
}
