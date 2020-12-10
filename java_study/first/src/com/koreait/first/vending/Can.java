package com.koreait.first.vending;

public class Can {
	private final String name;
	private final int price;
	
	public Can(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
}
