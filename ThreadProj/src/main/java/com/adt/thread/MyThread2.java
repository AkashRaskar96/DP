package com.adt.thread;

import com.adt.model.Sleeping;

public class MyThread2 extends Thread {
	Sleeping o;
	String name;
	public MyThread2(Sleeping o, String name){
		this.o=o;
		this.name=name;
	}
	@Override
	public void run() {
		o.sleep2(name);
	}
}
