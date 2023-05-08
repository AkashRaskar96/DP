package com.nt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DPStocksProfit {

	public static void main(String[] args) {
		int arr[]= {3,3,5,0,0,3,1,4}; //6
		List<Integer> arr2=new ArrayList<>();
		Map<Integer, Integer> map=new LinkedHashMap<>();// HashMap<>();
		for(int i=0;i<arr.length-1;i++) {
			int bay=arr[i];
			int max=0;
			int index=-1;
			boolean f=false;
			for(int j=i+1;j<arr.length;j++) {
				int profit=arr[j]-bay;
				if(profit>max) {
					max=profit;
					map.put(i+1, max);
					index=j;
					f=true;
				}
			}
			if(f)
				arr2.add(index+1);
			
			
		}
//		Map<Integer,Integer> res=new HashMap<>();
//		for(Map.Entry<Integer,Integer> entery: map.entrySet()) {
//			if(!arr2.contains(entery.getKey())){
//				res.put(entery.getKey(), entery.getValue());
//				int i=arr2.indexOf(entery.getKey());
//				if(i>=0)
//					arr2.remove(i);
//			}
//		}
		
		
		
		int i=0;
		int sum=0;
		int end=0;
		for(Map.Entry<Integer, Integer> entery:map.entrySet()) {
			System.out.println(entery.getKey()+" -> "+arr2.get(i)+" -> "+entery.getValue());
			i++;
		}
//		System.out.println();
//		i=0;
//		for(Map.Entry<Integer, Integer> entery:res.entrySet()) {
//			System.out.println(entery.getKey()+"->"+entery.getValue()+" -> "+arr2.get(i));
//			i++;
//		}

	}
	
}
