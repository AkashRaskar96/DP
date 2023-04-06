package com.aakash.recruitment;

public class HireDotNetFresher extends HireFresher {

	@Override
	public boolean conductTechnicalWritternTest() {
		System.out.println("HireDotNetFresher.conductTechnicalWritternTest()");
		return true;
	}

	@Override
	public boolean conductTechnicalInterviewTest() {
		System.out.println("HireDotNetFresher.conductTechnicalInterviewTest()");
		return true;
	}
		
}
