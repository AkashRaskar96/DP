package com.nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamAPIStringLengthIsMoreThen4 {

	public static void main(String[] args) {
			
		List<String> list=Arrays.asList("Hello","Hi","Good","Morning","How","Are","You    ");
		System.out.println(list.stream().filter(s->s.length()<4).count());
		
		list.stream().filter(s->s.length()>4).forEach(System.out::println);
		System.out.println("-------------------------------------");
		list.stream().filter(s->s.length()<4).forEach(System.out::println);
	}

}
