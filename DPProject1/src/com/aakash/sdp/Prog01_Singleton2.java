//Singleton Java Class With Minimum Standards
package com.aakash.sdp;

public class Prog01_Singleton2 {
	//private static instance member to refer refrence of obj
	private static Prog01_Singleton2 INSTANCE;
	//private Constructor
	private Prog01_Singleton2() {
		System.out.println("0 Param Constructor");
	}

	/*//public static method(static factory synchronized method)
	public synchronized static Prog01_Singleton2 getInstance() {
		if(INSTANCE==null) 
			INSTANCE=new Prog01_Singleton2();
		return INSTANCE;
	}
	 */

	//public static factory method(synchronized Block)
		public static Prog01_Singleton2 getInstance() {
			//Synchronized Block
			synchronized(Prog01_Singleton2.class) {
				if(INSTANCE==null) {
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					INSTANCE=new Prog01_Singleton2();
				 }
			}
			return INSTANCE;
			
		}
}
