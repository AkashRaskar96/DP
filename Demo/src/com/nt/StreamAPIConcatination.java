package com.nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamAPIConcatination {

	public static void main(String[] args) {
			
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		List<Integer> list2=Arrays.asList(6,7,8,9,10);
	
		
		Stream<Integer> l=Stream.concat(list1.stream(), list2.stream());
		l.forEach(System.out::println);
		
		Stream.concat(list1.stream(), list2.stream()).forEach(System.out::println);
		
	}

}
