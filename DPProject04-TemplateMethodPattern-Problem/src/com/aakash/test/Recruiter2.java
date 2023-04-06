package com.aakash.test;

import com.aakash.recruitment.HireDotNetFresher;
import com.aakash.recruitment.HireJavaFresher;

public class Recruiter2 {

	public static void main(String[] args) {
		HireDotNetFresher fresher=new HireDotNetFresher();
		boolean result= fresher.conductAptitudeTest();
		if(result)
			result=fresher.conductGDTest();
		if(result)
			result=fresher.conductDotNetWritternTest();
		if(result)
				result=fresher.conductDotNetTechnicalTest();
		if(result)
				result=fresher.conductHRTest();
		if(result)
			System.out.println("Result Pass Candidate is Recruited...");
		else
			System.out.println("Result Fail Candidate is not Recruited...?");

	}

}
