package com.koreait.first.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListTest_1 {
	
		
	public static void main(String[] args) {
		
		
																	//int형으로 짠 버전    (종료를 0으로 받아서 0을 저장을 못함)
		int[] intArr = new int[0];
		Scanner scan = new Scanner(System.in);
		
		
		for(int i=0; ; i++) {
			System.out.println("배열에 추가 할 정수를 입력하세요 : (종료:0)");
			int inputNumber = scan.nextInt();
			if(inputNumber == 0) {
				break;
			}
			int[] temp = new int[intArr.length + 1];
			for(int j=0; j<intArr.length; j++) {
				temp[j] = intArr[j];
			}
			temp[i] = inputNumber;
			intArr = temp;
			
		}
		
		System.out.println(Arrays.toString(intArr));
	}
		
}