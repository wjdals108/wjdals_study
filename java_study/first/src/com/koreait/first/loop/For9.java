package com.koreait.first.loop;

//import java.util.Scanner;

public class For9 {
	
	public static void main(String[] args) {

		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		int dan = scan.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d X %d = %d \n", dan, i, dan*i);
		}
		*/
		
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.printf("%d X %d = %d	", j, i, j*i);
			}
			System.out.println();
		}
	}
}