package com.koreait.first.loop;

import java.util.Scanner;

public class For7_1 {
	
	//입력받은 String 값이 정수인지 확인해서 true or false로 return하는 메소드
	public static Boolean isStringNum(String s) {
		try {
			int a = Integer.parseInt(s);
			return true;
			}
		catch(Exception e) {
			return false;
			}	
		}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String str = scan.next();
		
		if(isStringNum(str)) {
			int star = Integer.parseInt(str);
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
		}
		else {
			System.out.println("잘못 입력하셨습니다. 정수를 입력하세요");
		}
		
		
		
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
		
		/*											//if문 verson1
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
		*/
		
		
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
		
		scan.close();
	}
}