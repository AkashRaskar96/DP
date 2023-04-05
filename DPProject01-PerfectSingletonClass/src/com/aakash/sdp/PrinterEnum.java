package com.aakash.sdp;

public enum PrinterEnum {
	
	INSTANCE;  
	public  static   PrinterEnum  getInstance() {
		 return INSTANCE;
	}
	
	
	//b.method
	public  void print(String msg) {
		System.out.println("printing "+msg+"......");
	}
}

