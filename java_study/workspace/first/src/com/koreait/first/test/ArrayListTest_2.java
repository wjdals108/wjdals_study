package com.koreait.first.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListTest_2 {
	
	public static void main(String[] args) {
		
																		//String으로 짠 버전
		String[] intArr = new String[0];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; ; i++) {
			System.out.println("배열에 추가 할 정수를 입력하세요 : (종료:끝)");
			String inputNumber = scan.next();
			if(!(isStringNum(inputNumber))) {
				if(inputNumber.equals("끝")) {
					break;
				}
				else {
					System.out.println("잘못 입력하셨습니다.");
					i--;
					continue;
				}
			}
			String[] temp = new String[intArr.length + 1];
			for(int j=0; j<intArr.length; j++) {
				temp[j] = intArr[j];
			}
			temp[i] = inputNumber;
			intArr = temp;
			
		}
		
		System.out.println(Arrays.toString(intArr));
	}
		
	
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
	
	
}