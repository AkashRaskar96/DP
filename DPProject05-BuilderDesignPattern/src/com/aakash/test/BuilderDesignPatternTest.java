package com.aakash.test;

import com.aakash.factory.HouseFactory;
import com.aakash.product.House;

public class BuilderDesignPatternTest {

	public static void main(String[] args) {

		// get Product/House using the factory
		/*House house=HouseFactory.getInstance("igloo");
		System.out.println(house);*/
		
		House house=HouseFactory.getInstance("Concrete");
		System.out.println(house);

	}

}
