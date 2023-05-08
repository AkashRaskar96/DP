package com.nt;

public class MinPath1DArray {

	public static void main(String[] args) {
		int arr[]= {2,3,3,1,4};
		int s=0;
		int d=3;
		int i=s;
		int sum1=0;
		while(i!=d) {
			sum1+=arr[i];
			i=(i+1)%arr.length;
		}
		i=s;
		int sum2=0;
		while(i!=d) {
			if(i==-1)
				i=arr.length-1;
			sum2+=arr[i];
			i--;
		}
		int result=sum1<sum2?sum1:sum2;
		System.out.println(result);

	}

}
