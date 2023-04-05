package com.aakash.sdp;

import java.io.Serializable;

import com.aakash.commons.CommonsUtils;

public class Printer extends CommonsUtils {
	//Referring current Object
	private static Printer INSTANCE;
	//Restricting from Reflection API In Constructor 
	private static boolean isInstantiated=false;
	//private Constructor preventing from outside the class
	private Printer() {
		if(isInstantiated)
			throw new RuntimeException("Object is already Created...?");
		isInstantiated=true;
	}
	//Double Null Check Method Restrict Through static factory Method
	public static Printer getInstance() {
		if(INSTANCE==null) {
			synchronized (Printer.class) {
				if(INSTANCE==null)
					INSTANCE=new Printer();
			}
		}
		return INSTANCE;
	}
	//Restricting from Cloning
	@Override
	public Object clone() throws CloneNotSupportedException {
		return  new CloneNotSupportedException("Cloning Is Not Possible");
	}
	//Restricting while JVM creates new Object DeSerializing the Object
	//internaly when Object read the object and creats the obj
	//and readResolve() method return the object referance 
	//so we overriden bellow method
	//which returns alreday created Object only
	////(Protection from DeSerilization)
	public Object readResolve() {
		return INSTANCE;
	}
	
	
}
