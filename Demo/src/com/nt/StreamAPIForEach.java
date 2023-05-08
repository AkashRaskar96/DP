package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StreamAPIForEach {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Annand","Ankit","Ajay");
		list.forEach(System.out::println);
	}

}
