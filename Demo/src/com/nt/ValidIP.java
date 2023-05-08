package com.nt;

import java.util.ArrayList;
import java.util.List;

public class ValidIP {

	public static void main(String[] args) {
		String s="25525511135";
//		s="25525513";
//		s="112020255";
//		s="101023";
//		s="49909999";
//		s="255255111255";
//		s="1234j8j";
		s="1310101111";
		
		
		/*[13.10.101.111, 
		 13.101.01.111, 
		 13.101.011.11, 
		 131.0.101.111, 
		 131.01.01.111, 
		 131.01.011.11, 
		 131.010.1.111, 
		 131.010.11.11, 
		 131.010.111.1]
		 */
//		s="0000";
		List<String> list=new ArrayList<>();
		int  n=s.length();
		for(int i=0;i<n;i++) {
			if(!spel(s.charAt(i))) {
				System.out.println("Wrong String");
				return;
			}	
		}
		if(n == 4) {
			String str=s.substring(0, 1)+"."+s.substring(1,2)+"."+s.substring(2, 3)+"."+s.substring(3,4);
			list.add(str);
		}
		else
			list=getList(s);
//		System.out.println(list);
		list.stream().forEach(System.out::println);
	}
	static List<String> getList(String s){
		List<String> list=new ArrayList<>();
		int n=s.length();
		for(int i=1;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					String s1=s.substring(0,i);
					String s2=s.substring(i,j);
					String s3=s.substring(j,k);
					String s4=s.substring(k,n);
//					System.out.println(s1+"."+s2+"."+s3+"."+s4);
					int n1=Integer.parseInt(s1);
					int n2=Integer.parseInt(s2);
					int n3=Integer.parseInt(s3);
					int n4=Integer.parseInt(s4);
					if((s1.charAt(0)!='0' ||s1.length()==1) && (s2.charAt(0)!='0' ||s2.length()==1) && (s3.charAt(0)!='0' ||s3.length()==1) && (s4.charAt(0)!='0' ||s4.length()==1))
						if(n1<256 && n2<256 && n3<256 && n4<256) {
//							System.out.println(s1+"."+s2+"."+s3+"."+s4);
							String str=s1+"."+s2+"."+s3+"."+s4;
							list.add(str);	
						}
				}
			}
		}
		return list;
	}
	public static boolean spel(char ch) {
		if(ch<47 || ch>58)
			return false;
		return true;
	}
	
	
	
	
	
	
//	static Object fun(String s, int k) {
//		List<Integer> list=new ArrayList<Integer>();
//		if(s.length()<4) {
//			return "invalid String";
//		}
//		int i=0;
//		while(i<(s.length()-3)) {
//			int n1=Integer.parseInt(s.substring(i,i+3));
//			if(n1<256) {
//				list.add(n1);
//				i=i+3;
//			}
//			else {
//				n1=Integer.parseInt(s.substring(i,i+k));
//				list.add(n1);
//				i=i+2;
//			}
//		}
//		int n1=Integer.parseInt(s.substring(i,s.length()));
//		list.add(n1);
//		//System.out.println(list);
//		return list;
//	}

}
