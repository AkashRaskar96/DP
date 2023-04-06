package com.aakash.factory;

import com.aakash.recruitment.HireDotNetFresher;
import com.aakash.recruitment.HireFresher;
import com.aakash.recruitment.HireJavaFresher;

public class HireFresherFactory {

	  //static factory method  -- Factory Pattern
	static public HireFresher getInstance(String type) {
		HireFresher fresher=null;
		if(type.equalsIgnoreCase("java"))
			fresher=new HireJavaFresher();
		else if(type.equalsIgnoreCase("DotNet"))
			fresher=new HireDotNetFresher();
		else
			throw new IllegalArgumentException("Invalid Argu...?");
		return fresher;
	}
}
