package com.nt;

public class DpProgram {
	static int arr[]= {2,3,1,1,4};
	//	static int arr[]= {0,1,2,0,6,0,0,0,0,0,0,0};
//static int arr[]= {1,1,1,2 ,1,0};
//	static int arr[]= {1,3,2,3,2,4,1,8};
//	static int arr[]= {2,1,0,1};
	static boolean findWay(int index) {
		if(index==arr.length-1) 
			return true;
		if(index<arr.length && arr[index]!=0 ) {
			index=index+arr[index];
			return findWay(index);
		}
		return false;
	}
	public static void main(String[] args) {	
		System.out.println(findWay(0));
	}

}
