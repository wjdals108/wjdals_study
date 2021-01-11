package com.koreait.first.card;

public class CardMain {

	public static void main(String[] args) {
		
		final String[] shapeArr = {"spade", "heart", "clover", "diamond"};
		final String[] valueArr = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		Card[] objArr = new Card[shapeArr.length * valueArr.length];
		
		int objNum = 0;
		for(int i=0; i<shapeArr.length; i++) {
			for(int j=0; j<valueArr.length; j++) {
				objArr[objNum] = new Card(shapeArr[i], valueArr[j]);
				objNum++;
			}
		}
		
		for(int i=0; i<objArr.length; i++) {
			System.out.println(objArr[i]);
		}
		
	}

}
