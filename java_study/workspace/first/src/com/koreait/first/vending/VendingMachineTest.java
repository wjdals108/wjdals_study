package com.koreait.first.vending;

import java.util.Scanner;

public class VendingMachineTest {

	public static void main(String[] args) {
		
		final int coke = 500;
		final int sprite = 600;
		final int hwanta = 700;
		final int sol = 800;
		
		
		int sum = 0;
		
		for(;;) {
			System.out.println("메뉴선택(0:종료)");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if(choice == 1) {
				sum += coke;
			}
			if(choice == 2) {
				sum += sprite;
			}
			if(choice == 3) {
				sum += hwanta;
			}
			if(choice == 4) {
				sum += sol;
			}
			if(choice == 0) {
				break;
			}
			
		}
		System.out.println("총 구매금액 : " + sum);
			
	}

}
