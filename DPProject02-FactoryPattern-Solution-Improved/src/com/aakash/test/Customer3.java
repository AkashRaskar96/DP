package com.aakash.test;

import com.aakash.comps.Car;
import com.aakash.comps.LuxuryCar;
import com.aakash.factory.CarFactory;
import com.aakash.factory.CarType;

public class Customer3 {

	public static void main(String[] args) {
		Car lCar=CarFactory.createCar(CarType.MODEL_LUXURY);
		lCar.drive();

	}

}
