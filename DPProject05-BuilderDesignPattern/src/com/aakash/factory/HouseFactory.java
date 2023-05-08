package com.aakash.factory;

import com.aakash.builder.ConcreateHouseBuilder;
import com.aakash.builder.HouseBuilder;
import com.aakash.builder.IglooHouseBuilder;
import com.aakash.builder.WoodenHouseBuilder;
import com.aakash.director.CivilEngineer;
import com.aakash.product.House;

public class HouseFactory {

	 //factory pattern
	public static House getInstance(String type) {
		House house=null;
		HouseBuilder builder=null;
		if(type.equalsIgnoreCase("concrete"))
			builder=new ConcreateHouseBuilder();
		else if(type.equalsIgnoreCase("wooden"))
			builder=new WoodenHouseBuilder();
		else if(type.equalsIgnoreCase("igloo"))
			builder=new IglooHouseBuilder();
		else 
			throw new IllegalArgumentException("Invalid House Type....?");
		
		//Create Director Object
		CivilEngineer engineer=new CivilEngineer(builder);
		
		//Construct House (Product)
		engineer.constructHouse();
		
		//Get House (Product)
		house=engineer.getHouse();
		
		return house; 
		
	}
}
