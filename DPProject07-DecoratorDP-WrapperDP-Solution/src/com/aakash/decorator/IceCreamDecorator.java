package com.aakash.decorator;

import com.aakash.comps.IceCream;

public abstract class IceCreamDecorator implements IceCream {

	//Has-A property
	private IceCream iceCream;
	
	public IceCreamDecorator(IceCream iceCream) {
		this.iceCream=iceCream;
	}
	@Override
	public void prepare() {
		this.iceCream.prepare();

	}

}
