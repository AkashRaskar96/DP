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
		if(type.equalsIgnoreCase(CarType.MODEL_LUXURY))
			car=new LuxuryCar();
		else if(type.equalsIgnoreCase(CarType.MODEL_SPORTS))
			car=new SportsCar();
		else if(type.equalsIgnoreCase(CarType.MODEL_BUDGET))
			car=new BudgetCar();
		else 
			throw new IllegalArgumentException("Invalid Car Type........?");
		car.assemble();
		car.roadTest();
		return car;
	}
}
