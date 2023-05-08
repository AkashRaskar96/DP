package com.nt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class TestSplitString {
//	static Map<String, Boolean> map=new HashMap();
		static List<String> vildCardsList=new ArrayList<>();
		static {
	//		map.put("LOGGEDIN_USER_ID", true);
			vildCardsList.add("LOGGEDIN_USER_ID");
		}
	public static void main(String[] args) {
		String url="/payroll/timeSheet/empAttendence?fromDate=2023-04-01&toDate=2023-04-27&empId=59";
//		String url="/payroll/slip?empId={LOGGED_USER_ID}&month=undefined&year=undefined&adhoc=undefined";
//		String url="/payroll/timeSheet/checkStatus/{LOGGED_USER_ID}";
//		String url="/hrms/employee/getAllEmp";
//		String url="/expenseManagement/createExpenses";
//		String url="/payroll/timeSheet/checkStatus/59";
//		String url="/payroll/timeSheet/empAttendence?fromDate={*}&toDate={*}&empId={LOGGEDIN_USER_ID}";
		List<String> list1=tokenize(url);
		for(String ss:list1) {
			System.out.println(ss);
		}
		String url2="/payroll/timeSheet/empAttendence?fromDate={*}&toDate={*}&empId={LOGGEDIN_USER_ID}";
		List<String> list2=tokenize(url2);
		for(String ss:list2) {
			System.out.println(ss);
		}
		System.out.println(compare(list1, list2));
	}
	static List<String> tokenize(String url) {
		String[] tokens=url.split("/");
		String[] tokens2=new String[10];
		String[] tokens3=new String[10];
		List<String> list=new ArrayList<>();
		boolean flag=true;
		System.out.println(url);
		for(String s: tokens) {
			if(s.contains("?")) {
				flag=false;
				int index=s.indexOf('?');
				tokens2[0]=s.substring(0, index);
				tokens2[1]=s.substring(index,index+1);
				tokens2[2]=s.substring(index+1);
				list.add("/");
				list.add(tokens2[0]);
				list.add(tokens2[1]);
				String []slt=tokens2[2].split("&");
				boolean f=false;
				for(String ss:slt) {
					String arr[]=ss.split("=");
					if(f) 
						list.add("&");		
					f=true;
					list.add(arr[0]);
					list.add("=");
					list.add(arr[1]);
				}
			}
			if(flag & !s.isEmpty()) {
				list.add("/");
				list.add(s);
				flag=true;
			}
		}
		return list;
	}
	static boolean compare(List<String> list1, List<String> list2) {
		if(list1.size()==list2.size()) {
			
			for(int i=0;i<list1.size();i++) {
				if(!list1.get(i).equals(list2.get(i)) ) {
					if(isVaildCard(list2.get(i))) {
						String s=getValue(list2.get(i));
						if(!s.equals("*")) {
//							if(map.containsKey(s))
							if(vildCardsList.contains(s))
								return true;
							return false;
						}
						continue;
					}
					return false;
				}
			}
		}
		return false;

	}
	static boolean isVaildCard(String s) {
		if(s.charAt(0)=='{') 
			return true;
		return false;
	}
	static String getValue(String s) {
		return s.substring(1,s.length()-1);
	}

}
