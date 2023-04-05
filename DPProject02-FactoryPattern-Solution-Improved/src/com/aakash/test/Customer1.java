package com.aakash.test;

import com.aakash.comps.Car;
import com.aakash.factory.CarFactory;
import com.aakash.factory.CarType;

public class Customer1 {

	public static void main(String[] args) {
		Car bCar=CarFactory.createCar(CarType.MODEL_BUDGET);
		bCar.drive();

	}

}
