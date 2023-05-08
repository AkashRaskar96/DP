package com.aakash.comps;

public class HoneyDryFruitVanilaIceCream extends DryFruitVanilaIceCream {
	@Override
	public void prepare() {
		super.prepare();
		addHoney();
	}
	public void addHoney() {
		System.out.println("Adding Honey....");
	}
}
