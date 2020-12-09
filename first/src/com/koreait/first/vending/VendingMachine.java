package com.koreait.first.vending;

import java.util.Scanner;

public class VendingMachine {
	private Can[] canArr;
	private int sum;
	private Scanner scan;

	public VendingMachine() {
		init();
	}
	
	private void init() {
		String[] nmArr = {"콜라", "사이다", "환타", "솔의눈", "데자와"};
		int[] priceArr = {500, 600, 700, 800, 900};
		
		scan = new Scanner(System.in);
		canArr = new Can[nmArr.length];
		
		for(int i=0; i<canArr.length; i++) {
			canArr[i] = new Can(nmArr[i], priceArr[i]);
		}
		
	}
	
	void showMenus() {
		System.out.println("-- 메뉴 --");
		for(int i=0; i<canArr.length; i++) {
			System.out.printf("%d. %s - %d원\n",i+1,canArr[i].getName(), canArr[i].getPrice());
		}
	}
	
	void purchase() {
		
		for(;;) {
			System.out.print("메뉴선택 (0:종료) > ");
			int choiceNo = scan.nextInt();
			if(choiceNo==0) {
				break;
			}
			else if(choiceNo>canArr.length || choiceNo<0) {
				System.out.println("잘 못 입력하셨습니다.");
				continue;	
			}
			
			sum+=canArr[choiceNo-1].getPrice();
			
		}
		scan.close();
	}
	
	void showSum() {
		System.out.printf("총 구매금액 : %,d원\n", sum);
	}
	
}
