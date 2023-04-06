package com.aakash.recruitment;

public abstract class HireFresher {

	public boolean conductAptitudeTest() {
		System.out.println("HireFresher.conductAptitudeTest()");
		return true;
	}
	public boolean conductGDTest() {
		System.out.println("HireFresher.conductGDTest()");
		return true;
	}
	
	public abstract boolean conductTechnicalWritternTest();
	public abstract boolean conductTechnicalInterviewTest();
	
	public boolean conductHRTest() {
		System.out.println("HireFresher.conductHRTest()");
		return true;
	}
	
	//Template method DP  defining the alogrithm/skelton to complete the task
	public boolean freshersRecruitmentDrive() {
		boolean result=conductAptitudeTest();
		if(result)
			result=conductGDTest();
		if(result)
			result=conductTechnicalWritternTest();
		if(result)
			result=conductTechnicalInterviewTest();
		if(result)
			result=conductHRTest();
		
		
		return result;
	}
}
