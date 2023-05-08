package com.nt;

public class SantanceFormation {
	public static void main(String[] a) {

		
//		String s="Hello world";
//		String s="a bcd e";
		String s="Hello my name in Aakash";
		int cursor=0;
		int col=8;
		int row=2;
		char[] charArr=s.toCharArray();
		int len=charArr.length;
		for(int i=0;i<row;i++) {
			int c=0;
			boolean f=true;
			while((charArr[cursor%len] != ' ' || c<8) && f) {
				cursor++;
				c++;
				if(c==col)
					f=false;
			}
			while(charArr[(cursor-1)%len] == ' ' && (cursor%len)>0) {
				cursor--;
			}
			
		}
		System.out.println((cursor/len));
//		
	}
//	static public int print(String[] charArr, int rows, int cols) {
//		 int i = 0;
//		    int cnt = 0;
//		 
//		    int k = 0;  //kth word
//		    int colLen =cols;
//		
//		 
//		    while (i < rows) {
//		        String sen = charArr[k++];
//		        if (sen.length() > cols) {
//		            return 0;
//		        }
//		 
//		        if (colLen >= sen.length()) {
//		            colLen = colLen - sen.length() - 1;
//		        } else {
//		            i++;
//		            colLen = cols;
//		            colLen = colLen - sen.length() - 1;
//		        }
//		 
//		        if (i >= rows) {
//		            return cnt;
//		        }
//		 
//		        if (k == charArr.length) {
//		            cnt++;
//		            k = 0;
//		        }
//		    }
//		return cnt;
		
//	}
}
