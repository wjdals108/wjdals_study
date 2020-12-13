package com.koreait.first.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListTest {

	
	public static void main(String[] args) {
		
		int[] intArr = new int[0];
		ArrayList al = new ArrayList();				//배열의 크기를 선언해주지 않는다. 
		  
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
	}
	
	
	
}