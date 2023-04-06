package com.aakash.test;

import com.aakash.factory.HireFresherFactory;
import com.aakash.recruitment.HireFresher;
import com.aakash.recruitment.HireJavaFresher;

public class Recruiter1 {

	public static void main(String[] args) {
		HireFresher fresher=HireFresherFactory.getInstance("java");
		boolean result=fresher.freshersRecruitmentDrive();
		if(result)
			System.out.println("Result Pass Candidate is Recruited....");
		else
			System.out.println("Result Fail Candidate is not Recruited....");
	}

}
