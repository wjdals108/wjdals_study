package com.koreait.first.loop;

public class For5 {

	public static void main(String[] args) {
		int star = 5;
		
		for(int j=0; j<star; j++) {
			for(int i=0; i<star; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}