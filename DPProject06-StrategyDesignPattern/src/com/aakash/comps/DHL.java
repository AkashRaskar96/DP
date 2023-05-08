package com.aakash.comps;

public class DHL implements Courier {

	@Override
	public String deliverOrder(int oid) {
		return oid+" order id order products are delivered by DHL Courier Service";
	}

}
