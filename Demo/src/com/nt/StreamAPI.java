package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		//Filter
		List<Integer> l1=list.stream().filter(i->i%2==1).collect(Collectors.toList());
		
		l1.forEach(System.out::println);
		
		//Map
		List< Integer> l2=list.stream().map(i->i+10).collect(Collectors.toList());
		l2.forEach(System.out::println);
		
		List<Integer> li1=list.stream().filter(i->i%2==1).map(i->i+10).collect(Collectors.toList());
	}

}
