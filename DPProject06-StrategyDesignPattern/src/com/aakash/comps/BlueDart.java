package com.aakash.comps;

public class BlueDart implements Courier {

	@Override
	public String deliverOrder(int oid) {
		return oid+" order id order products are delivered by BlueDart Courier Service";
	}

}
