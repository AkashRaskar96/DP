package com.adt.threadtest;

import com.adt.model.Sleeping;
import com.adt.thread.MyThread;
import com.adt.thread.MyThread2;
import com.adt.thread.MyThread3;
import com.adt.thread.MyThread4;

public class ThreadTestDemo {

	public static void main(String[] args) {
		Sleeping s=new Sleeping();
		MyThread t1=new MyThread(s,"Ankit");
//		MyThread t2=new MyThread(s,"Ajay");
		t1.start();
//		t2.start();
//
		MyThread2 t21=new MyThread2(s, "Ashish");
		t21.start();
		
		
//		Sleeping s1=new Sleeping();
//		MyThread3 t1=new MyThread3(s1,"Ankit");
//		MyThread4 t2=new MyThread4(s1,"Ajay");
//		t1.start();
//		t2.start();
	}

}
