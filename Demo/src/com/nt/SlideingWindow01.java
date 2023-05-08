package com.nt;



public class SlideingWindow01 {
	public static void main(String[] args) {
//		int arr[]= {2,15,1,41,3,6,5};
//		int arr[]= {2,15,1,41,3,6,51};
//		int k=2;
//		int max=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			int sum=0;
//			if(i>arr.length-k) {
//				int j=i;
//				int count=0;
//				while(j<(k+i) && j<arr.length && count<k) {
//					sum+=arr[j];
//					j=(j+1)%arr.length;
//					count++;
//				}
//				 
//			}else {
//				for(int j=i;j<k+i && j<arr.length;j++) {
//					sum+=arr[j];
//				}
//			}
//			if(max<sum)
//				max=sum;
//		}
//		System.out.println(max);
		
		
//		int arr[]= {2,15,1,41,3,6,5};
//		int arr[]= {2,15,1,41,3,6,51};
//		int arr[]= {2,5,10,3,8,19,2};
		int arr[]= {12,5,10,3,8,1,3,10};
		int k=3;
		int max=0;
		int l=arr.length;
//		for (int i=0;i<l;i++) {
//			int sum=0;
//			for(int j=i, count=0; j<k+i && j<l && count<k; j=(j+1)%l, count++) {
//					sum+=arr[j];
//			}
//			if(max<sum)
//				max=sum;
//		}
		for (int i=0;i<l;i++) {
			int sum=0;
			for(int j=i, count=0; count<k; j=(j+1)%l, count++) 
					sum+=arr[j];
			if(max<sum)
				max=sum;
		}
		System.out.println(max);
		
	}
	
}

