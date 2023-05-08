package com.nt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
class StockMarket3{
	private int bayday;
	private int sellday;
	private int profit;
	public int getBayday() {
		return bayday;
	}
	public void setBayday(int bayday) {
		this.bayday = bayday;
	}
	public int getSellday() {
		return sellday;
	}
	public void setSellday(int sellday) {
		this.sellday = sellday;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	@Override
	public String toString() {
		return "StockMarket [bayday=" + bayday + ", sellday=" + sellday + ", profit=" + profit + "]";
	}
	
	
}
public class DPStocksProfit3 {

	public static void main(String[] args) {
//		int arr[]= {3,3,5,0,0,3,1,4}; //6
//		int arr[]= {1,2,3,4,5}; //4
//		int arr[]= {3,3,5,9,0,3,1,4}; //10
//		int arr[]= {2,2,6,5,0,6}; //10
//		int arr[]= {5,0,6,2,2,6}; //10
//		int arr[]= {6,5,3,1}; //10
//		int arr[]= {105,99,102,11,48,60}; //
//		int arr[]= {1,1,1,1}; //10
		int arr[]= {7,8,4,3,40};
//		int arr[]= {40,3,4,8,7};
//		int arr[]= {3,2,4,8,10};
		List<List<StockMarket3>> list=new ArrayList<>();

        for (int i = 0; i < arr.length; i++)  {
            list.add(new ArrayList<>());
        }
 
		for(int i=0;i<arr.length-1;i++) {
			int bay=arr[i];
			int max=0;
			int index=-1;
			boolean f=false;
			StockMarket3 obj=new StockMarket3();
			for(int j=i+1;j<arr.length;j++) {
				int profit=arr[j]-bay;
				if(profit>max) {
					max=profit;		
					obj.setBayday(i+1);
					obj.setProfit(max);
					index=j;
					f=true;
					obj.setSellday(index+1);
					list.get(i).add(obj);
				}
			}
//			if(f)
//				obj.setSellday(index+1);
//			
//			list.add(obj);
		}
		list.stream().forEach(System.out::println);
		
		int max=0;
		int funalmax=0;
		for(int i=0;i<list.size();i++ ) {
			
			List<StockMarket3> l=list.get(i);
			for(int j=0;j<l.size();i++) {
				StockMarket3 obj1=l.get(j);
				for(int k=0;k<l.size();i++) {
//				StockMarket3 s= list.get(i);
//				int max=s.getProfit();
//				for(int j=s.getSellday();j<list.size();j++) {
//					max=Math.max(s.getProfit()+list.get(j).getProfit(),max);
//				}
//				funalmax=Math.max(funalmax, max);
//			}
			}
		}}
		System.out.println(funalmax);

		
		
		
//		int max=0;
//		int funalmax=0;
//		for(int i=0;i<list.size();i++) {
//			StockMarket3 s= list.get(i);
//			int max=s.getProfit();
//			for(int j=s.getSellday();j<list.size();j++) {
//				max=Math.max(s.getProfit()+list.get(j).getProfit(),max);
//			}
//			funalmax=Math.max(funalmax, max);
//		}
//		System.out.println(funalmax);
	}
	
}
