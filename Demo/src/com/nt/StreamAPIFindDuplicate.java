package com.nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamAPIFindDuplicate {

	public static void main(String[] args) {
			
		List<Integer> list=Arrays.asList(11,22,33,24,15,22,36,47,558,11,19,199,33);
	
		Set< Integer> set=new HashSet<>();
		list.stream().filter(i->!set.add(i)).forEach(System.out::println);
		
		System.out.println("Removed Duplicate");
		list.stream().collect(Collectors.toSet()).forEach(System.out::println);
		
		//Converted Set to list
		List<Integer> l=list.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
		l.forEach(System.out::println);
	}

}
