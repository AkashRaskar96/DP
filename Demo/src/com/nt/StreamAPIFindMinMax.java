package com.nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamAPIFindMinMax {

	public static void main(String[] args) {
			
		List<Integer> list=Arrays.asList(11,22,33,24,15,22,36,47,558,11,19,199,33);
		int s=list.get(0);
		System.out.println("Min :: "+list.stream().min(Integer::compare).get());
		System.out.println("Max :: "+list.stream().max(Integer::compare).get());
		
		/*OR*/
		System.out.println("Min :: "+list.stream().min(Comparator.comparing(Integer::valueOf)).get());
		System.out.println("Max :: "+list.stream().max(Comparator.comparing(Integer::valueOf)).get());
	}

}
