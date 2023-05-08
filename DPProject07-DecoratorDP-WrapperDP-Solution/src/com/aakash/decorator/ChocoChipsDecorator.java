package com.aakash.decorator;

import com.aakash.comps.IceCream;

public class ChocoChipsDecorator extends IceCreamDecorator {

	public ChocoChipsDecorator(IceCream iceCream) {
		super(iceCream);
	}
	@Override
	public void prepare() {
		super.prepare();
		addChocoChips();
	}
	
	public void addChocoChips() {
		System.out.println("Adding Chocochips....");
	}

}
