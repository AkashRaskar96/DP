package com.aakash.comps;

public class BudgetCar extends Car {
	
	private String fuelefficiency;
	private double prise;
	public BudgetCar() {
		System.out.println("BudgetCar:: 0 PAram Constructor");
	}
	@Override
	public void assemble() {
		System.out.println("BudgetCar.assemble()");
	}

	@Override
	public void roadTest() {
		System.out.println("BudgetCar.roadTest()");
	}

	@Override
	public void drive() {
		System.out.println("BudgetCar.drive()");
	}

}
