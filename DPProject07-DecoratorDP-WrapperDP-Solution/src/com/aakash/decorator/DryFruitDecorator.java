package com.aakash.decorator;

import com.aakash.comps.IceCream;

public class DryFruitDecorator extends IceCreamDecorator {

	public DryFruitDecorator(IceCream iceCream) {
		super(iceCream);
	}
	@Override
	public void prepare() {
		super.prepare();
		addDryFruit();
	}
	public void addDryFruit() {
		System.out.println("Adding DryFruits....");
	}
}
