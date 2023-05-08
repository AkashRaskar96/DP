package com.aakash.product;

public class House {
	private Basement basement;
	private Interior interior;
	private Roofing roofing;
	private Structure structure;
	public Basement getBasement() {
		return basement;
	}
	public void setBasement(Basement basement) {
		this.basement = basement;
	}
	public Interior getInterior() {
		return interior;
	}
	public void setInterior(Interior interior) {
		this.interior = interior;
	}
	public Roofing getRoofing() {
		return roofing;
	}
	public void setRoofing(Roofing roofing) {
		this.roofing = roofing;
	}
	public Structure getStructure() {
		return structure;
	}
	public void setStructure(Structure structure) {
		this.structure = structure;
	}
	@Override
	public String toString() {
		return "House [basement=" + basement + ", interior=" + interior + ", roofing=" + roofing + ", structure="
				+ structure + "]";
	}
	
	
}
