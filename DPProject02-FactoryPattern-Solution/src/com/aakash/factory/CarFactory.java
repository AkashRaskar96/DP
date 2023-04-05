package com.aakash.factory;

import com.aakash.comps.BudgetCar;
import com.aakash.comps.Car;
import com.aakash.comps.LuxuryCar;
import com.aakash.comps.SportsCar;

public class CarFactory {

	//Static Factory Method
	//It is providing abstraction on Object Quality
	public static Car createCar(String type) {
		Car car=null;
		if(type.equalsIgnoreCase("LuxuryCar"))
			car=new LuxuryCar();
		else if(type.equalsIgnoreCase("SportsCar"))
			car=new SportsCar();
		else if(type.equalsIgnoreCase("BudgetCar"))
			car=new BudgetCar();
		else 
			throw new IllegalArgumentException();
		car.assemble();
		car.roadTest();
		return car;
	}
}
