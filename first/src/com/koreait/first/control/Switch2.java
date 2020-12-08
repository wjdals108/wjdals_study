package com.koreait.first.control;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력해 주세요(남/여)");
		String gender = scan.next();
		
				
		int avgHeight = 0;
		
		
		switch(gender) {
		case "남":
		case "남자":
		case "man":
			avgHeight = 166;
			break;
		case "여":
		case "여자":
		case "woman":
			avgHeight = 157;
			break;
		default:
			System.out.println("다시 입력");
		}
		
		if(avgHeight != 0) {
			System.out.println("키를 입력해 주세요 : ");
			int height = scan.nextInt();
			
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
		scan.close();	
	}

}
