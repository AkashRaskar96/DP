package com.nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamAPIEvenNo {

	public static void main(String[] args) {
			
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("Even No");
		System.out.println(list.stream().filter(i->i%2==0).collect(Collectors.toList()));
		System.out.println("Odd No");
		System.out.println(list.stream().filter(i->i%2==1).collect(Collectors.toList()));
	}

}
