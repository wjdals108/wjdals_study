package com.koreait.first.loop;

import java.util.Scanner;

public class For7 {
	
	public static void main(String[] args) {
		int star = 5;
		
		/*											//if문 안쓰고 한거
		for(int i=0; i<star; i++) {
			for(int k=star; k>i+1; k--) {
				System.out.print("-");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
				}
			System.out.println();
		}
		*/										
		
													//if문 verson1
		for(int i=star; i>0; i--) {
			for(int j=0; j<star; j++) {
				if(i>j+1) {
					System.out.print("-");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
		/*											//if문 version2
		for(int i=0; i<star; i++) {
			for(int j=star; j>0; j--) {
				if(j>i+1) {
					System.out.print("-");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		*/
	}
}