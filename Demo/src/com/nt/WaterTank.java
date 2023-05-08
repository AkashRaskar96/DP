package com.nt;

public class WaterTank {

	public static void main(String[] args) {
//		int arr[]=new int[10];
		int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
//		int arr[]= {4,2,0,3,2,5};
//		int arr[]= {0,0,5,3,4};
		int n=arr.length;
		int left[]=new int[n];
		int right[]=new int[n];
		int max=0;
		int max2=0;
//		for(int i=0;i<n;i++) {
//			max=(max>arr[i]) ?max:arr[i];
//			left[i]=max;
//		}
//		max=0;
//		for(int i=n-1;i>=0;i--) {
//			max=(max>arr[i]) ?max:arr[i];
//			right[i]=max;
//		}
		for(int i=0, j=n-1;i<n;i++,j--) {
			max=(max>arr[i]) ?max:arr[i];
			left[i]=max;
			max2=(max2>arr[j]) ?max2:arr[j];
			right[j]=max2;
		}
		
		int amt=0;
		for(int i=0;i<n;i++) {
			int t=(left[i]<right[i])?left[i]:right[i];
			amt=amt+(t-arr[i]);
		}
		System.out.println(amt);
	}

}
