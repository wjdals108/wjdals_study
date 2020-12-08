package com.koreait.first.method;

import java.util.Scanner;

public class MethodGugudan_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 단 부터 출력할까요? : ");
		int a = scan.nextInt();
		System.out.println("몇 단 까지 출력할까요? : ");
		int b = scan.nextInt();
		
		gugudan(a,b);
		
		scan.close();
	}
	
	public static void gugudan(int n1, int n2) {
		for(int i=n1; i<=n2; i++) {
			gugudan(i);
			System.out.println("-----------------");
		}
	}
	
	public static void gugudan(int n1) {
		for(int i=1; i<10; i++) {
			System.out.printf("%d X %d = %d\n", n1,i,n1*i);
		}
	}
}