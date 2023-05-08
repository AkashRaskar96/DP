package com.aakash.test;

import com.aakash.comps.ECommerceStore;
import com.aakash.factory.EcommerceStoreFactory;

public class StrategyDPTest {
	public static void main(String[] args) {
		//Get Target Class Object
		ECommerceStore store=EcommerceStoreFactory.getInstance("BlueDart");
		
		String msg=store.shopping(new String[] {"Shirt", "Pant"}, 
								  new double[] {2000, 3000});
		
		System.out.println(msg);
	}
}
