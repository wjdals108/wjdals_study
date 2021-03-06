package com.koreait.first.test;

import java.util.Arrays;

public class ArrayListTest_3 {
	
	public static int[] add(int inputNumber, int[] intArr) {
		
		int[] temp = new int[intArr.length+1];
		for(int i=0;i<intArr.length;i++) {
			temp[i] = intArr[i];
		}
		temp[intArr.length] = inputNumber;
		return temp;
	}
	
	public static void main(String[] args) {
		
		int[] intArr = new int[0];
		
		intArr = add(10,intArr);
		intArr = add(20,intArr);
		intArr = add(30,intArr);
		intArr = add(40,intArr);
		
		System.out.println(Arrays.toString(intArr));

	}
	
}