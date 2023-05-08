package com.nt;

import java.util.Optional;

public class OptionalExample {

	public static Optional<Integer> add(int a, int b) {
		Integer r=null;
		Optional<Integer> o=Optional.ofNullable(a +b);
//		Optional<Integer> o=Optional.ofNullable(r);
		return o;
		
	}
	public static void main(String[] args) {
		Optional<Integer> result =add(1,2);
		if(!result.isPresent())
			System.out.println("empty list");
		else 
			System.out.println(result.get());
		
		
		

	}

	
}
