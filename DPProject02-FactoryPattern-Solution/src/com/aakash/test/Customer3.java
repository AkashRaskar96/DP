package com.aakash.test;

import com.aakash.comps.Car;
import com.aakash.comps.LuxuryCar;
import com.aakash.factory.CarFactory;

public class Customer3 {

	public static void main(String[] args) {
		Car lCar=CarFactory.createCar("LuxuryCar");
		lCar.drive();

	}

}
