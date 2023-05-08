package com.nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamAPICntElement {

	public static void main(String[] args) {
			
		List<Integer> list=Arrays.asList(11,22,33,24,15,22,36,47,558,11,19,199,33);
	
		
		System.out.println(list.stream().count());
	}

}
