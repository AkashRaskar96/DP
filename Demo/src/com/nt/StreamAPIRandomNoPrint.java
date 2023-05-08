package com.nt;

import java.util.Random;

public class StreamAPIRandomNoPrint {

	public static void main(String[] args) {
		Random rd=new Random();
		rd.ints().limit(10).forEach(System.out::println);
//		rd.ints().limit(10).forEach(System.out::println);
		

	}

}
