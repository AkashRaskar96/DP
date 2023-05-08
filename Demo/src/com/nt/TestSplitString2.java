package com.nt;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestSplitString2 {

	public static void main(String[] args) {
		
//		String url="/payroll/timeSheet/empAttendence?fromDate=2023-04-01&toDate=2023-04-27&empId=59";
//		String url="/payroll/slip?empId=59&month=undefined&year=undefined&adhoc=undefined";
//		String url="/payroll/timeSheet/checkStatus/59";
//		String url="/hrms/employee/getAllEmp";
//		String url="/expenseManagement/createExpenses";
//		String url="/payroll/timeSheet/checkStatus/59";
		String url="/payroll/timeSheet/empAttendence?fromDate={*}&toDate={*}&empId={LOGGEDIN_USER_ID}";
		

		List<String> list=new ArrayList<>();
	
		String regex = "^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?";
		Pattern pattern = Pattern.compile(regex);
//		var matcher = pattern.matcher("http://example.com:80/docs/books/tutorial/index.html?name=networking#DOWNLOADING");
//		Matcher matcher = pattern.matcher("/payroll/timeSheet/empAttendence?fromDate=2023-04-01&toDate=2023-04-27&empId=59");
//		Matcher matcher = pattern.matcher("/payroll/slip?empId=59&month=undefined&year=undefined&adhoc=undefined");
		Matcher matcher = pattern.matcher("/payroll/timeSheet/checkStatus/59");
//		System.out.println("/payroll/timeSheet/empAttendence?fromDate=2023-04-01&toDate=2023-04-27&empId=59");
//		System.out.println("/payroll/slip?empId=59&month=undefined&year=undefined&adhoc=undefined");
		System.out.println("/payroll/timeSheet/checkStatus/59");
		
		
		if (matcher.matches()) {
		  String path=matcher.group(5);
		  System.out.println(path);
		  String query=matcher.group(7);
		  if(path!=null)
		  {
			  String arr[]=path.split("/");
			  for(String s:arr) {
				  if(!s.trim().isEmpty()) {
					  list.add("/");
					  list.add(s);
					  
				  }
			  }
		  }
		  if(query!=null)
		  {
			  String arr[]=query.split("&");
			  boolean f=true;
			  for(String s:arr) {
				  if(f) {
					  f=false;
					  list.add("?");
				  }else {
					  list.add("&");
				  }
				  String[] arr2=s.split("=");
				  list.add(arr2[0]);
				  list.add("=");
				  list.add(arr2[1]);
			  }
		  }
		}
		for(String s:list) {
			System.out.println(s);
		}
	
	}

}
