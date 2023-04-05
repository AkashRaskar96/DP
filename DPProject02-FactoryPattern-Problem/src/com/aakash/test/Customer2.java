package com.aakash.test;

import com.aakash.comps.Car;
import com.aakash.comps.SportsCar;

public class Customer2 {

	public static void main(String[] args) {
		Car sCar=new SportsCar();
		sCar.assemble();
		sCar.roadTest();

	}

}
