package com.nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamAPIStartingWith1 {

	public static void main(String[] args) {
			
		List<Integer> list=Arrays.asList(11,22,33,24,15,36,47,558,19,199);
//		System.out.println("Even No");
	
//		System.out.println(list.stream().filter(i->i>9 && i<20 || i>99 && i<200).collect(Collectors.toList()));
		
		System.out.println(list.stream().map(n-> n +"").filter(s->s.startsWith("1")).collect(Collectors.toList()));
	}

}
