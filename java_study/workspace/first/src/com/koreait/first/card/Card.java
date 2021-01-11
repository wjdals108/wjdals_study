package com.koreait.first.card;

//모양shape (spade, heart, clover, diamond)
//번호value (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K)
public class Card {
	private final String SHAPE;
	private final String VALUE;
	
	public Card(String shape, String value) {
		SHAPE= shape;
		VALUE = value;
	}

	@Override
	public String toString() {
		String str = SHAPE + " (" + VALUE +")";
		
		return str;
	}
}
