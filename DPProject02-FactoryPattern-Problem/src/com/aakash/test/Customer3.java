package com.aakash.test;

import com.aakash.comps.Car;
import com.aakash.comps.LuxuryCar;

public class Customer3 {

	public static void main(String[] args) {
		Car lCar=new LuxuryCar();
		lCar.assemble();
		lCar.roadTest();
		lCar.drive();

	}

}
