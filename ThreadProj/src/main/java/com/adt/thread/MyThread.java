package com.adt.thread;

import com.adt.model.Sleeping;

public class MyThread extends Thread {
	Sleeping o;
	String name;
	public MyThread(Sleeping o, String name){
		this.o=o;
		this.name=name;
	}
	@Override
	public void run() {
		o.sleep(name);
	}
}
