package com.aakash.builder;

import com.aakash.product.House;
import com.aakash.product.POPInterior;
import com.aakash.product.WoodenBasement;
import com.aakash.product.WoodenInterior;
import com.aakash.product.WoodenRoofing;
import com.aakash.product.WoodenStructure;

public class WoodenHouseBuilder implements HouseBuilder {

	private House house;
	public WoodenHouseBuilder() {
		System.out.println("WoodenHouseBuilder :: 0 Param Constructor");
		house=new House();
	}
	@Override
	public void buildBasement() {
		System.out.println("WoodenHouseBuilder.buildBasement()");
		house.setBasement(new WoodenBasement());
	}

	@Override
	public void buildRoofing() {
		System.out.println("WoodenHouseBuilder.buildRoofing()");
		house.setRoofing(new WoodenRoofing());
	}

	@Override
	public void buildStructure() {
		System.out.println("WoodenHouseBuilder.buildStructure()");
		house.setStructure(new WoodenStructure());
	}

	@Override
	public void buildInterior() {
		System.out.println("WoodenHouseBuilder.buildInterior()");
		house.setInterior(new WoodenInterior());
	}

	@Override
	public House createHouse() {
		System.out.println("WoodenHouseBuilder.createHouse()");
		return house;
	}

}
