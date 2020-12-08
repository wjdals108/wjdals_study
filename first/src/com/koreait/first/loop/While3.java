package com.koreait.first.loop;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int n1 = 0;
		
		do {
			System.out.println("숫자를 입력하세요 : 0을 누르면 종료됩니다.");
			n1 = scan.nextInt();
			sum += n1;
		}		
		while(n1 != 0);
		
		System.out.println("합게 : " + sum);
		scan.close();
	}
}