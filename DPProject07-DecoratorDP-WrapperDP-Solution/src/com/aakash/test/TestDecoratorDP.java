package com.aakash.test;

import com.aakash.comps.ButterScotchIceCream;
import com.aakash.comps.IceCream;
import com.aakash.comps.VanilaIceCream;
import com.aakash.decorator.ChocoChipsDecorator;
import com.aakash.decorator.DryFruitDecorator;
import com.aakash.decorator.HoneyDecoretor;


public class TestDecoratorDP {

	public static void main(String[] args) {
		System.out.println("****Eating Plain ButterScotch IceCream");
		IceCream cream=new ButterScotchIceCream();
		cream.prepare();
		
		System.out.println("****Eating ButterScotch IceCream with Honey");
		IceCream cream2=new HoneyDecoretor(cream);
		cream2.prepare();
		
		System.out.println("****Eating Vanila IceCream with Drfruit Honey Chocochips");
		IceCream cream3=new ChocoChipsDecorator(new DryFruitDecorator(new HoneyDecoretor(new VanilaIceCream())));
		cream3.prepare();
		

	}

}
