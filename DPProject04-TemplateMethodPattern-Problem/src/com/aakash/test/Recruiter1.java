package com.aakash.test;

import com.aakash.recruitment.HireJavaFresher;
//client need to know all the methods and need to call
public class Recruiter1 {

	public static void main(String[] args) {
		HireJavaFresher fresher=new HireJavaFresher();
		boolean result= fresher.conductAptitudeTest();
		if(result)
			result=fresher.conductGDTest();
		if(result)
			result=fresher.conductJavaWritternTest();
		if(result)
				result=fresher.conductJavaTechnicalTest();
		if(result)
				result=fresher.conductHRTest();
		if(result)
			System.out.println("Result Pass Candidate is Recruited...");
		else
			System.out.println("Result Fail Candidate is not Recruited...?");

	}

}
