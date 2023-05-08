package com.nt;



public class SlideingWindow2 {
	
	
	
	public static void main(String[] args) {
		int arr[]= {2,15,1,41,3,6,5};
//		int arr[]= {2,15,1,41,3,6,51};
//		int arr[]= {2,5,10,3,8,19,2};
		
		int k=3;
		int max=0;
		int l=arr.length;
		
		for (int i=0;i<l;i++) {
			int sum=0;
			for(int j=i, count=0; count<k && ( i==0 || i >=l-k); j=(j+1)%l, count++) {
					sum+=arr[j];
			}
			if(max<sum)
				max=sum;
		}
		System.out.println(max);
		
	}
	
}

