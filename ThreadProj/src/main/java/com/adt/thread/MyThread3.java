package com.adt.thread;

import com.adt.model.Sleeping;

public class MyThread3 extends Thread {
	Sleeping o;
	String name;
	public MyThread3(Sleeping o, String name){
		this.o=o;
		this.name=name;
	}
	@Override
	public void run() {
		o.happy(name);
	}
}
