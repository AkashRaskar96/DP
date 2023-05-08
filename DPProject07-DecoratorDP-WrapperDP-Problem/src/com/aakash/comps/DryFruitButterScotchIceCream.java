package com.aakash.comps;

public class DryFruitButterScotchIceCream extends DryFruitVanilaIceCream {
	@Override
	public void prepare() {
		super.prepare();
		addDryFruits();
	}
	public void addDryFruits() {
		System.out.println("Adding DryFruits....");
	}
}
