package com.koreait.first.loop;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int sum = 0;
		System.out.println("숫자를 입력하세요 : 0을 누르면 종료됩니다.");
		int n1 = scan.nextInt();
		
		while(n1 != 0) {
			sum += n1;
			
			System.out.println("숫자를 입력하세요 : 0을 누르면 종료됩니다.");
			n1 = scan.nextInt();
		}
		
		System.out.println("합게 : " + sum);
		scan.close();
		
		
		
		
		/*								//내가짠거, while(true)랑 break 안써야하는데 안쓰고는 모르겠음
		int sum = 0;
		while(true) {
			System.out.println("숫자를 입력하세요 :  0을 누르면 종료됩니다. ");
			int n1 = scan.nextInt();
			
			sum += n1;
			
			if(n1 == 0) {
				System.out.printf("합계 : %d", sum);
				break;
			}
		}
		
		scan.close();
		*/
		
		
		
		
	}

}
