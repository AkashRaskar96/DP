package com.aakash.comps;

public class DryFruitVanilaIceCream extends VanilaIceCream {
	@Override
	public void prepare() {
		super.prepare();
		addDryFruits();
	}
	public void addDryFruits() {
		System.out.println("Adding DryFruits....");
	}
}
