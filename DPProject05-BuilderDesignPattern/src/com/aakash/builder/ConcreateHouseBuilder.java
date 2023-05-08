package com.aakash.builder;

import com.aakash.product.ConcreateBasement;
import com.aakash.product.ConcreateInterior;
import com.aakash.product.ConcreateRoofing;
import com.aakash.product.ConcreateStructure;
import com.aakash.product.GlassInterior;
import com.aakash.product.House;

public class ConcreateHouseBuilder implements HouseBuilder {

	private House house;
	
	public ConcreateHouseBuilder() {
		System.out.println("ConcreateHouseBuilder :: 0 Paran Constructor");
		house=new House();
	}
	
	@Override
	public void buildBasement() {
		System.out.println("ConcreateHouseBuilder.buildBasement()");
		house.setBasement(new ConcreateBasement());
	}

	@Override
	public void buildRoofing() {
		System.out.println("ConcreateHouseBuilder.buildRoofing()");
		house.setRoofing(new ConcreateRoofing());
	}

	@Override
	public void buildStructure() {
		System.out.println("ConcreateHouseBuilder.buildStructure()");
		house.setStructure(new ConcreateStructure());
	}

	@Override
	public void buildInterior() {
		System.out.println("ConcreateHouseBuilder.buildInterior()");
		house.setInterior(new GlassInterior	());
	}

	@Override
	public House createHouse() {
		System.out.println("ConcreateHouseBuilder.createHouse()");
		return house;
	}

}
