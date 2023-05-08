package com.aakash.test;

import com.aakash.comps.ButterScotchIceCream;
import com.aakash.comps.DryFruitButterScotchIceCream;
import com.aakash.comps.HoneyDryFruitVanilaIceCream;
import com.aakash.comps.VanilaIceCream;

public class TestDecoratorDP {

	public static void main(String[] args) {
		VanilaIceCream vIce=new VanilaIceCream();
		vIce.prepare();
		ButterScotchIceCream bIce=new ButterScotchIceCream();
		bIce.prepare();
		DryFruitButterScotchIceCream dfbIce=new DryFruitButterScotchIceCream();
		dfbIce.prepare();
		HoneyDryFruitVanilaIceCream hIce=new HoneyDryFruitVanilaIceCream();
		hIce.prepare();
	}

}
