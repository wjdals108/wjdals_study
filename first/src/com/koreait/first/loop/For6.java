package com.koreait.first.loop;

public class For6 {

	public static void main(String[] args) {
		int star = 5;
				
		for(int i=0; i<star; i++) {
			
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}		
	}
}