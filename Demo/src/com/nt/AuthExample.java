package com.nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthExample {

	public static void main(String[] args) {
		
		if(isAccesable("url1","2")) {
			System.out.println("You can Access the Page.......!");
		}else {
			System.out.println("You can't Access the Page.......?");
		}
	}
	public static boolean isAccesable(String url,String roleId){
		List<Map<String , String>> list=getDBData();
		for(int index=0;index<list.size();index++) {
			String dbrole=getStringFromResult(list, index, "roleId");
			String dburl=getStringFromResult(list, index, "Url");
			if(dbrole.equals(roleId) && dburl.equals(url))
				return true;
		}
		return false; 
	}
	public static List<Map<String, String>> getDBData() {
		Map<String , String> m=new HashMap();
		m.put("roleId", "1");
		m.put("Url", "url1");
		
		List<Map<String, String>> list=new ArrayList<>();
		list.add(m);
		m=new HashMap();
		m.put("roleId", "2");
		m.put("Url", "url2");
		list.add(m);
		return list;
	}
	public static String getStringFromResult(
			final List<Map<String, String>> resultList, final int index,
			final String key) {
		
		String returnStr =null;
		if(resultList.get(index).get(key)!=null){
			returnStr = (String) resultList.get(index).get(key);
		}
		return returnStr;
	}

}
