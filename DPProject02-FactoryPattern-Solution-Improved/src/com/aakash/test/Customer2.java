package com.aakash.test;

import com.aakash.comps.Car;
import com.aakash.comps.SportsCar;
import com.aakash.factory.CarFactory;
import com.aakash.factory.CarType;

public class Customer2 {

	public static void main(String[] args) {
		Car sCar=CarFactory.createCar(CarType.MODEL_SPORTS);
		sCar.drive();

	}

}
