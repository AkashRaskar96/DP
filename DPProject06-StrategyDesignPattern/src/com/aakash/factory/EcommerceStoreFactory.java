package com.aakash.factory;

import com.aakash.comps.BlueDart;
import com.aakash.comps.Courier;
import com.aakash.comps.DHL;
import com.aakash.comps.ECommerceStore;

public class EcommerceStoreFactory {
	public static ECommerceStore getInstance(String courierType) {
		//Create Dependent class Obj
		Courier courier=null;
		if(courierType.equalsIgnoreCase("BlueDart"))
			courier=new BlueDart();
		else if(courierType.equalsIgnoreCase("DHL"))
			courier=new DHL();
		else
			throw new IllegalArgumentException("Invalid Courier Type");
		//Create target class Object
		ECommerceStore store=new ECommerceStore();
		//assign Dependent class to target class
		store.setCourier(courier);
		return store;
	}

}
