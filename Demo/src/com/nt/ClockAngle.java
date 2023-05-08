package com.nt;

import java.util.Scanner;

public class ClockAngle {

	public static void main(String[] args) {
		double hr,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Hrs<=12 and min<=59");
		hr=sc.nextDouble();
		min=sc.nextDouble();
		if(hr==12)
			hr=0;
			
		if(min==60)
				hr++;
		System.out.println(Math.abs((hr-(min/5))*30));
	}

}
