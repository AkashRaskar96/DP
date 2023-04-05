package com.aakash.test;

import com.aakash.comps.Car;
import com.aakash.factory.CarFactory;

public class Customer1 {

	public static void main(String[] args) {
		Car bCar=CarFactory.createCar("BudgetCar");
		bCar.drive();

	}

}
