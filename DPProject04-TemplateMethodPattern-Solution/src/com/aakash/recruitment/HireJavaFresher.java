package com.aakash.recruitment;

public class HireJavaFresher extends HireFresher {

	@Override
	public boolean conductTechnicalWritternTest() {
		System.out.println("HireJavaFresher.conductTechnicalWritternTest()");
		return true;
	}

	@Override
	public boolean conductTechnicalInterviewTest() {
		System.out.println("HireJavaFresher.conductTechnicalInterviewTest()");
		return true;
	}
		
}
