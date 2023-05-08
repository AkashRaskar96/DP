package com.nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamAPIMultiplyBy3 {

	public static void main(String[] args) {
			
		List<Integer> list=Arrays.asList(1,2,3,4,5);
	
		
		list.stream().map(n->n*3).forEach(System.out::println);
		System.out.println("---------------");
		System.out.println(list.stream().map(n->n*3).collect(Collectors.toList()));
	}

}
