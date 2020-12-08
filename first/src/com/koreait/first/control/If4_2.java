package com.koreait.first.control;

import java.util.Scanner;
public class If4_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력해 주세요(남/여)");
		String gender = scan.next();
		
		System.out.println("키를 입력해 주세요 : ");
		int height = scan.nextInt();
		
		
		
		int avgHeight = 0;
		
		if("남".equals(gender) || "남자".equals(gender) || "man".equals(gender)) {
			avgHeight = 166;
			
		}
		else if("여".equals(gender) || "여자".equals(gender) || "woman".equals(gender)) {
			avgHeight = 157;
			
		}
		
		if(height > avgHeight) {
			System.out.println("당신은 평균 초과 입니다.");
		}
		else if(height == avgHeight) {
			System.out.println("당신은 평균입니다.");
		}
		else {
			System.out.println("당신은 평균 미만입니다.");
		}
		
		scan.close();

	}
}
