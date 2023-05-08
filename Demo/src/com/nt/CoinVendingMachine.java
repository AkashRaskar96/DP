package com.nt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CoinVendingMachine {
	 static Map<String, Integer> map=new HashMap<String, Integer>();
	
	public static void main(String[] args) {
		map.put("Cent", 2000);
		map.put("Nickle", 2000);
		map.put("Dime", 2000);
		map.put("Quarter", 2000);
		map.put("Doller", 2000);
		

		String ch=null;
	
		do {
			System.out.println("Enter Value :");
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			Double no=Double.parseDouble(str);
			Iterator<String> it = map.keySet().iterator();       //keyset is a method  
			
			Integer Avalableblance=0;
			while(it.hasNext())  
			{  
				String key=it.next();  
				if(key.equals("Doller"))
					Avalableblance=Avalableblance+map.get(key);
				else if(key.equals("Quarter"))
					Avalableblance=Avalableblance+map.get(key)/4;
				if(key.equals("Dime"))
					Avalableblance=Avalableblance+map.get(key)/10;
				if(key.equals("Nickle"))
					Avalableblance=Avalableblance+map.get(key)/20;
				if(key.equals("Cent"))
					Avalableblance=Avalableblance+map.get(key)/100;
					
			}  
			System.out.println(Avalableblance);
			if(Avalableblance>=no)
			{			
				int len=str.substring(str.indexOf(".")).length()-1;
				int postVal=(int) (no*(long)Math.pow(10, len)%(int)Math.pow(10, len));
				String s2=str.substring(0,str.indexOf("."));
				int preVal=Integer.parseInt(s2);
				
				preVal=processFirst("Doller",preVal);
				preVal=processFirst("Quarter",preVal);
				preVal=processFirst("Dime",preVal);
				preVal=processFirst("Nickle",preVal);
				preVal=processFirst("Cent",preVal);
				System.out.println("after Floting point");
				postVal=processFirst("Quarter",postVal/25);
				postVal=processFirst("Dime",postVal/10);
				postVal=processFirst("Nickle",postVal/5);
				postVal=processFirst("Cent",postVal/1);
				//
				//postVal=processFirst("Quarter",postVal);
				//postVal=processFirst("Dime",postVal);
				//postVal=processFirst("Nickle",postVal);
				//postVal=processFirst("Cent",postVal);
				//
				//System.out.println(map);

			}else {
				System.out.println("Unsufficient Balance....?");
			}
			System.out.println("Want to withdrow again enter Yes/No :");
			ch=sc.next();
		}while(ch.equalsIgnoreCase("yes"));
	
	
	
	}
	static int processFirst(String key,int preVal) {
		while(preVal>0 && map.get(key)!=0) {
			preVal=isaval(key,preVal);
		}
		return preVal;
	
	}
	static int isaval(String key,int pre) {
		int aval=map.get(key);
		int remain=0;
		if(pre<aval){
			remain=aval-pre;
			map.put(key,remain );
			System.out.println(key+" :: "+pre);
			return remain;
		}else if(pre>aval && aval!=0){
			remain=pre-aval;
			map.put(key, 0);
			System.out.println(key+" :: "+aval);
		
		}	
		return remain;
	}


}



//Double n=156.75;
////Double n=125.45;
////Double n=3987.75;
//String s=n.toString();
//int len=s.substring(s.indexOf(".")).length()-1;
//int postVal=(int) (n*(long)Math.pow(10, len)%(int)Math.pow(10, len));
//String s2=s.substring(0,s.indexOf("."));
//
//int preVal=Integer.parseInt(s2);





//preVal=processFirst("Doller",preVal);
//preVal=processFirst("Quarter",preVal);
//preVal=processFirst("Dime",preVal);
//preVal=processFirst("Nickle",preVal);
//preVal=processFirst("Cent",preVal);
//System.out.println("after Floting point");
//postVal=processFirst("Quarter",postVal/25);
//postVal=processFirst("Dime",postVal/10);
//postVal=processFirst("Nickle",postVal/5);
//postVal=processFirst("Cent",postVal/1);
////
////postVal=processFirst("Quarter",postVal);
////postVal=processFirst("Dime",postVal);
////postVal=processFirst("Nickle",postVal);
////postVal=processFirst("Cent",postVal);
////
//System.out.println(map);

//}
//static int processFirst(String key,int preVal) {
//while(preVal>0 && map.get(key)!=0) {
//	preVal=isaval(key,preVal);
//}
//return preVal;
//
//}
//static int isaval(String key,int pre) {
//int aval=map.get(key);
//int remain=0;
//if(pre<aval){
//remain=aval-pre;
//map.put(key,remain );
//System.out.println(key+" :: "+pre);
//return remain;
//}else if(pre>aval && aval!=0){
//remain=pre-aval;
//map.put(key, 0);
//System.out.println(key+" :: "+aval);
//
//}	
//return remain;
//}


