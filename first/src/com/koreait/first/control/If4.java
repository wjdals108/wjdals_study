package com.koreait.first.control;

import java.util.Scanner;
public class If4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력해 주세요(남/여)");
		String gender = scan.next();
		System.out.println("키를 입력해 주세요 : ");
		int height = scan.nextInt();
				
		//String g1 = new String("남");
		//String g2 = new String("여");
		
		if("남".equals(gender)) {
			int avgHeight = 166;
			if(height > avgHeight) {
				System.out.println("당신은 평균 초과 입니다.");
			}
			else if(height == avgHeight) {
				System.out.println("당신은 평균입니다.");
			}
			else {
				System.out.println("당신은 평균 미만입니다.");
			}
		}
		else if("여".equals(gender)) {
			int avgHeight = 157;								//변수는 한번만 선언해야하는데, 다른 블록 { } 이므로 상관없음
			if(height > avgHeight) {
				System.out.println("당신은 평균 초과 입니다.");
			}
			else if(height == avgHeight) {
				System.out.println("당신은 평균입니다.");
			}
			else {
				System.out.println("당신은 평균 미만입니다.");
			}
		}
		else {
			System.out.println("성별을 남 또는 여 라고 입력해 주세요");
			}
	}
}
