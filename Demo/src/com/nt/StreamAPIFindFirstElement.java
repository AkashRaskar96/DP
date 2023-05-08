package com.nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamAPIFindFirstElement {

	public static void main(String[] args) {
			
		List<Integer> list=Arrays.asList(11,22,33,24,15,36,47,558,19,199);

		Set< Integer> set=new HashSet<>();
		System.out.println(list.stream().findFirst().get());
//		list.stream().filter(i->!set.add(i)).forEach(System.out::println);

	}

}
