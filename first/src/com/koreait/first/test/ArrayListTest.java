package com.koreait.first.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();				//배열의 크기를 선언해주지 않는다.
		
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
		
		/*
		al.add(1);
		int[] temp = new int[intArr.length + 1];
		temp[0] = 1;
		intArr = temp;
		
		al.add(2);
		int[] temp2 = new int[intArr.length + 1];
		for(int i=0; i<intArr.length; i++) {
			temp2[i] = intArr[i];
		}
		temp2[intArr.length] = 2;
		intArr = temp2;
		
		al.add(3);
		int[] temp3 = new int[intArr.length + 1];
		for(int i=0; i<intArr.length; i++) {
			temp3[i] = intArr[i];
		}
		temp3[intArr.length] = 3;
		intArr = temp3;
		
		System.out.println("al - 0 : " + al.get(0));
		System.out.println("intArr - 0 : " + intArr[0]);
		System.out.println("al - 0 : " + al.get(1));
		System.out.println("intArr - 0 : " + intArr[1]);
		System.out.println("al - 0 : " + al.get(2));
		System.out.println("intArr - 0 : " + intArr[2]);
		*/
		
		
		
		
		
	}

}