package com.nt;

import java.util.HashMap;
import java.util.Map;

public class Temp1 {
	public static void main(String[] a) {
		String str = "The first color that is uppermost color in the flag which is the saffron color, stands for purity. The second color i.e. the middle color in the flag is the white color and it stands for peace. The third color that is the lowest color in the flag is the green color and it stands for fertility. The white color has an Ashoka Chakra of blue color on it. Ashoka Chakra contains twenty-four spokes which are equally divided. India has 29 states and 7 union territories.";
		String words[]=str.split(" ");
		
		
//		for(int i=0;i<words.length;i++) {
//			int count=1;
//			for(int j=i+1;j<words.length;j++) {
//				if(words[i]==words[j]) {
//					count++;
//					words[j]="0";
//				}
//			}
//		}
//		
		Map<String, Integer> map= new HashMap<>();
		for(int i=0;i<words.length;i++) {
			if(map.containsKey(words[i])) {
				map.put(words[i], (map.get(words[i])+1));
			}
			else {
				map.put(words[i], 1);
			}
		}
		//System.out.println(map);
//		for(Map.Entry<String, Integer> m :  map.entrySet()) {
//			if(m.getValue()!=1) {
//			
//				//map.remove(m.getKey());
//				//System.out.println(m.getKey()+"--->"+m.getValue());
//			}
//		}
		for(int i=0;i<map.size();i++)
		{
		//	map.containsValue( );
		}
		
		System.out.println(map);
		
	}
	

}
