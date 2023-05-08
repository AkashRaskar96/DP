package com.aakash.decorator;

import com.aakash.comps.IceCream;

public class HoneyDecoretor extends IceCreamDecorator {

	public HoneyDecoretor(IceCream iceCream) {
		super(iceCream);
	}
	@Override
	public void prepare() {
		super.prepare();
		addHoney();
	}
	public void addHoney() {
		System.out.println("Adding Honey...");
	}

}
